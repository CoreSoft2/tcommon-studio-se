// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.repository.localprovider.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.keyvalue.MultiKey;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.talend.commons.exception.BusinessException;
import org.talend.commons.exception.ExceptionHandler;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.utils.data.container.Container;
import org.talend.commons.utils.data.container.RootContainer;
import org.talend.commons.utils.workbench.resources.ResourceUtils;
import org.talend.core.context.RepositoryContext;
import org.talend.core.model.general.Project;
import org.talend.core.model.general.TalendNature;
import org.talend.core.model.general.User;
import org.talend.core.model.general.Version;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;
import org.talend.core.model.metadata.builder.connection.TableHelper;
import org.talend.core.model.properties.BusinessProcessItem;
import org.talend.core.model.properties.ByteArray;
import org.talend.core.model.properties.CSVFileConnectionItem;
import org.talend.core.model.properties.ConnectionItem;
import org.talend.core.model.properties.DatabaseConnectionItem;
import org.talend.core.model.properties.DelimitedFileConnectionItem;
import org.talend.core.model.properties.DocumentationItem;
import org.talend.core.model.properties.FileItem;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.properties.PositionalFileConnectionItem;
import org.talend.core.model.properties.ProcessItem;
import org.talend.core.model.properties.PropertiesFactory;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.core.model.properties.Property;
import org.talend.core.model.properties.RegExFileConnectionItem;
import org.talend.core.model.properties.RoutineItem;
import org.talend.core.model.properties.Status;
import org.talend.core.model.properties.XmlFileConnectionItem;
import org.talend.core.model.properties.util.PropertiesSwitch;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.ERepositoryType;
import org.talend.core.model.repository.Folder;
import org.talend.core.model.repository.IRepositoryObject;
import org.talend.core.model.repository.RepositoryObject;
import org.talend.core.model.temp.ECodeLanguage;
import org.talend.repository.localprovider.RepositoryLocalProviderPlugin;
import org.talend.repository.localprovider.exceptions.IncorrectFileException;
import org.talend.repository.model.FolderHelper;
import org.talend.repository.model.IRepositoryFactory;
import org.talend.repository.model.LocalLockHelper;
import org.talend.repository.model.RepositoryConstants;
import org.talend.repository.model.ResourceModelUtils;
import org.talend.repository.ui.views.RepositoryContentProvider.MetadataTableRepositoryObject;

/**
 * DOC smallet class global comment. Detailled comment <br/>
 * 
 * $Id$ $Id:
 * RepositoryFactory.java,v 1.55 2006/08/23 14:30:39 tguiu Exp $
 * 
 */
public class RepositoryFactory implements IRepositoryFactory {

    private static final QualifiedName FOLDER_ID_KEY = new QualifiedName(RepositoryLocalProviderPlugin.PLUGIN_ID, "folderId");

    private static final String BIN = "bin";

    private static Logger log = Logger.getLogger(RepositoryFactory.class);

    protected RepositoryContext repositoryContext;

    public void setRepositoryContext(RepositoryContext repositoryContext) {
        this.repositoryContext = repositoryContext;
    }

    /**
     * DOC smallet Comment method "getObjectFromFolder".
     * 
     * @param <T> - DOC smallet
     * @param project - the project to searched in
     * @param type - the type of object to search
     * @param theType - supp ??
     * @param onlyLastVersion specify <i>true</i> if only the last version of an object must be returned, false for all
     * version
     * @return a structure of all object of type in the project
     * @throws PersistenceException if project, folder or resource cannot be found
     */
    private <K, T> RootContainer<K, T> getObjectFromFolder(ERepositoryObjectType type, T theType, boolean onlyLastVersion)
            throws PersistenceException {
        long currentTime = System.currentTimeMillis();

        RootContainer<K, T> toReturn = new RootContainer<K, T>();

        IProject fsProject = ResourceModelUtils.getProject(repositoryContext.getProject());

        IFolder objectFolder = ResourceUtils.getFolder(fsProject, LocalResourceModelUtils.getFolderName(type), true);

        addFolderMembers(type, toReturn, objectFolder, onlyLastVersion);

        log.trace("Retrieving " + toReturn.absoluteSize() + " files in " + (System.currentTimeMillis() - currentTime) / 1000
                + " sec");

        return toReturn;
    }

    /**
     * 
     * DOC smallet Comment method "addFolderMembers".
     * 
     * @param <T> - DOC smallet
     * @param type - DOC smallet
     * @param toReturn - DOC smallet
     * @param objectFolder - DOC smallet
     * @param onlyLastVersion specify <i>true</i> if only the last version of an object must be returned, false for all
     * version
     * @throws PersistenceException - DOC smallet
     */
    private <K, T> void addFolderMembers(ERepositoryObjectType type, Container<K, T> toReturn, IFolder objectFolder,
            boolean onlyLastVersion) throws PersistenceException {
        for (IResource current : ResourceUtils.getMembers(objectFolder)) {
            if (current instanceof IFile) {
                try {
                    IRepositoryObject currentObject = null;

                    if (XmiResourceManager.isPropertyFile((IFile) current)) {
                        Property property = xmiResourceManager.loadProperty(current);
                        currentObject = new RepositoryObject(property);
                    }

                    if (currentObject != null) {
                        K key;
                        if (onlyLastVersion) {
                            key = (K) currentObject.getId();
                        } else {
                            key = (K) new MultiKey(currentObject.getId(), currentObject.getVersion());
                        }

                        try {
                            if (onlyLastVersion) {
                                // Version :
                                T old = toReturn.getMember(key);
                                if (old == null) {
                                    toReturn.addMember(key, (T) currentObject);
                                } else if (((IRepositoryObject) old).getVersion().compareTo(currentObject.getVersion()) < 0) {
                                    toReturn.addMember(key, (T) currentObject);
                                }
                            } else {
                                toReturn.addMember(key, (T) currentObject);
                            }
                        } catch (BusinessException e) {
                            throw new PersistenceException(e);
                        }
                    }
                } catch (IncorrectFileException e) {
                    ExceptionHandler.process(e);
                } catch (PersistenceException e) {
                    ExceptionHandler.process(e);
                }
            } else if (current instanceof IFolder) {
                if (!current.getName().equals(BIN)) {
                    Container<K, T> cont = toReturn.addSubContainer(current.getName());
                    FolderHelper folderHelper = FolderHelper.createInstance(repositoryContext.getProject());
                    String sId = folderHelper.getFolder(current.getProjectRelativePath()).getProperty().getId();
                    cont.setId(sId);
                    addFolderMembers(type, cont, (IFolder) current, onlyLastVersion);
                } else {
                    addFolderMembers(type, toReturn, (IFolder) current, onlyLastVersion);
                }
            }
        }
    }

    public List<IRepositoryObject> getAll(ERepositoryObjectType type) throws PersistenceException {
        IFolder folder = LocalResourceModelUtils.getFolder(repositoryContext.getProject(), type);
        return convert(getSerializableFromFolder(folder, null, type, false, true));
    }

    // private AbstractSerializable getSerializableLastVersion(Project project, int id) throws PersistenceException {
    // List<AbstractSerializable> serializableAllVersion = getSerializableAllVersion(project, id);
    // if (!serializableAllVersion.isEmpty()) {
    // AbstractSerializable toReturn = serializableAllVersion.get(0);
    // if (serializableAllVersion.size() > 1) {
    // for (AbstractSerializable current : serializableAllVersion) {
    // if (current.getVersion().compareTo(toReturn.getVersion()) > 0) {
    // toReturn = current;
    // }
    // }
    // }
    // return toReturn;
    // } else {
    // return null;
    // }
    // }

    public List<IRepositoryObject> getAllVersion(String id) throws PersistenceException {
        List<IRepositoryObject> serializableAllVersion = getSerializable(repositoryContext.getProject(), id, true);
        return convert(serializableAllVersion);
    }

    public IRepositoryObject getLastVersion(String id) throws PersistenceException {
        List<IRepositoryObject> serializableAllVersion = getSerializable(repositoryContext.getProject(), id, false);

        if (serializableAllVersion.size() > 1) {
            throw new PersistenceException("Only one occurence must be found !!");
        } else if (serializableAllVersion.size() == 1) {
            return serializableAllVersion.get(0);
        } else {
            return null;
        }
    }

    /**
     * DOC smallet Comment method "convert".
     * 
     * @param toReturn
     * @param serializableAllVersion
     */
    private List<IRepositoryObject> convert(List<IRepositoryObject> serializableAllVersion) {
        List<IRepositoryObject> toReturn = new ArrayList<IRepositoryObject>();
        for (IRepositoryObject current : serializableAllVersion) {
            toReturn.add(current);
        }
        return toReturn;
    }

    private List<IRepositoryObject> getSerializable(Project project, String id, boolean allVersion) throws PersistenceException {
        IProject fsProject = ResourceModelUtils.getProject(project);

        List<IRepositoryObject> toReturn = new ArrayList<IRepositoryObject>();

        ERepositoryObjectType[] repositoryObjectTypeList = new ERepositoryObjectType[] { ERepositoryObjectType.BUSINESS_PROCESS,
                ERepositoryObjectType.DOCUMENTATION, ERepositoryObjectType.METADATA_CONNECTIONS,
                ERepositoryObjectType.METADATA_FILE_DELIMITED, ERepositoryObjectType.METADATA_FILE_POSITIONAL,
                ERepositoryObjectType.METADATA_FILE_REGEXP, ERepositoryObjectType.METADATA_FILE_XML,
                ERepositoryObjectType.PROCESS, ERepositoryObjectType.ROUTINES };
        for (ERepositoryObjectType repositoryObjectType : repositoryObjectTypeList) {
            IFolder folder = ResourceUtils
                    .getFolder(fsProject, LocalResourceModelUtils.getFolderName(repositoryObjectType), true);
            toReturn.addAll(getSerializableFromFolder(folder, id, repositoryObjectType, allVersion, true));
        }
        return toReturn;
    }

    /**
     * 
     * Get all object in a folder recursively.
     * 
     * @param folder - the folder to search in
     * @param id - the id of the object searched. Specify <code>null</code> to get all objects.
     * @param type - the type searched
     * @param allVersion - <code>true</code> if all version of each object must be return or <code>false</code> if
     * on ly the most recent version
     * @return a list (may be empty) of objects found
     * @throws PersistenceException
     */
    private List<IRepositoryObject> getSerializableFromFolder(IFolder folder, String id, ERepositoryObjectType type,
            boolean allVersion, boolean searchInChildren) throws PersistenceException {
        List<IRepositoryObject> toReturn = new VersionList(allVersion);

        for (IResource current : ResourceUtils.getMembers(folder)) {
            if (current instanceof IFile) {
                if (XmiResourceManager.isPropertyFile((IFile) current)) {
                    Property property = xmiResourceManager.loadProperty(current);
                    if (id == null || property.getId().equals(id)) {
                        toReturn.add(new RepositoryObject(property));
                    }
                }
            } else if (current instanceof IFolder) {
                if (searchInChildren) {
                    toReturn.addAll(getSerializableFromFolder((IFolder) current, id, type, allVersion, true));
                }
            }
        }
        return toReturn;
    }

    /**
     * DOC cantoine Comment method "deleteFile".
     * 
     * @param file
     * @throws PersistenceException
     */
    private void deleteFile(IFile file) throws PersistenceException {
        ResourceUtils.deleteFile(file);
    }

    /**
     * Generates the next id for serializable. If no serializable returns 0.
     * 
     * @param project the project to scan
     * 
     * @return the next id for the project
     * @throws PersistenceException
     * @throws PersistenceException if processes cannot be retrieved
     */
    public String getNextId() {
        return EcoreUtil.generateUUID();
    }

    /**
     * @see org.talend.core.model.repository.factories.IRepositoryFactory#createProject(java.lang.String,
     * java.lang.String, java.lang.String, org.talend.core.model.general.User)
     */
    private static List<ERepositoryObjectType> needsBinFolder = new ArrayList<ERepositoryObjectType>();

    static {
        // /PTODO tgu quick fix for registering the emf package. needed to make the extention point work
        ConnectionPackage.eINSTANCE.getClass();

        needsBinFolder.add(ERepositoryObjectType.BUSINESS_PROCESS);
        needsBinFolder.add(ERepositoryObjectType.DOCUMENTATION);
        needsBinFolder.add(ERepositoryObjectType.METADATA_CONNECTIONS);
        needsBinFolder.add(ERepositoryObjectType.METADATA_FILE_DELIMITED);
        needsBinFolder.add(ERepositoryObjectType.METADATA_FILE_POSITIONAL);
        needsBinFolder.add(ERepositoryObjectType.METADATA_FILE_REGEXP);
        needsBinFolder.add(ERepositoryObjectType.METADATA_FILE_XML);
        needsBinFolder.add(ERepositoryObjectType.PROCESS);
    }

    public Project createProject(String label, String description, ECodeLanguage language, User author)
            throws PersistenceException {
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

        String technicalLabel = Project.createTechnicalName(label);
        IProject prj = root.getProject(technicalLabel);
        Project project = new Project();
        Resource projectResource = xmiResourceManager.createProjectResource(prj);
        projectResource.getContents().add(project.getEmfProject());

        final IWorkspace workspace = ResourcesPlugin.getWorkspace();
        final IProjectDescription desc = workspace.newProjectDescription(label);
        desc.setNatureIds(new String[] { TalendNature.ID });
        desc.setComment(description);

        try {
            prj.create(desc, null);
            prj.open(IResource.BACKGROUND_REFRESH, null);
        } catch (CoreException e) {
            throw new PersistenceException(e);
        }
        FolderHelper folderHelper = FolderHelper.createInstance(project.getEmfProject());
        // Folder creation :
        for (ERepositoryObjectType type : ERepositoryObjectType.values()) {
            try {
                String folderName = LocalResourceModelUtils.getFolderName(type);
                IFolder folder = ResourceUtils.getFolder(prj, folderName, false);
                ResourceUtils.createFolder(folder);
                folderHelper.createSystemFolder(new Path(folderName));
            } catch (IllegalArgumentException iae) {
                // Some repository object type doesn't need a folder
            }
        }

        // Special folders creation :
        // 1. Temp folder :
        IFolder folderTemp = ResourceUtils.getFolder(prj, RepositoryConstants.TEMP_DIRECTORY, false);
        ResourceUtils.createFolder(folderTemp);
        folderHelper.createSystemFolder(new Path(RepositoryConstants.TEMP_DIRECTORY));

        // 2. Img folder :
        IFolder folderImg = ResourceUtils.getFolder(prj, RepositoryConstants.IMG_DIRECTORY, false);
        ResourceUtils.createFolder(folderImg);
        folderHelper.createSystemFolder(new Path(RepositoryConstants.IMG_DIRECTORY));

        // 3. Bin folders :
        for (ERepositoryObjectType type : needsBinFolder) {
            String folderName = LocalResourceModelUtils.getFolderName(type);
            IFolder binFolder = ResourceUtils.getFolder(prj, folderName + IPath.SEPARATOR + BIN, false);
            ResourceUtils.createFolder(binFolder);
            folderHelper.createFolder(new Path(folderName).append(BIN));
        }

        // Fill project object
        project.setLabel(label);
        project.setDescription(description);
        project.setLanguage(language);
        project.setAuthor(author);
        project.setLocal(true);
        project.setTechnicalLabel(technicalLabel);

        projectResource.getContents().add(author.getEmfUser());
        xmiResourceManager.saveResource(projectResource);

        repositoryContext.setProject(project);

        // Sample Routines file
        URL url = Platform.getBundle(RepositoryLocalProviderPlugin.PLUGIN_ID).getEntry("routines/routines.pm");
        if (url != null) {
            InputStream stream = null;
            try {
                Property property = PropertiesFactory.eINSTANCE.createProperty();
                property.setId(getNextId());
                property.setLabel("Routines");

                ByteArray byteArray = PropertiesFactory.eINSTANCE.createByteArray();
                stream = url.openStream();
                byte[] innerContent = new byte[stream.available()];
                stream.read(innerContent);
                stream.close();
                byteArray.setInnerContent(innerContent);

                RoutineItem routineItem = PropertiesFactory.eINSTANCE.createRoutineItem();
                routineItem.setProperty(property);
                routineItem.setContent(byteArray);

                create(routineItem, new Path(""));
            } catch (IOException ioe) {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (IOException e) {
                        throw new PersistenceException(ioe);
                    }
                }
                throw new PersistenceException(ioe);
            }
        }

        return project;
    }

    /**
     * @see org.talend.core.model.repository.factories.IRepositoryFactory#readProject(java.lang.String,
     * java.lang.String, java.lang.String)
     */
    public Project[] readProject(String server, String port, User user) throws PersistenceException {
        IProject[] prjs = ResourceUtils.getProjetWithNature(TalendNature.ID);

        Project[] projects = new Project[prjs.length];
        for (int i = 0; i < prjs.length; i++) {
            IProject p = prjs[i];
            org.talend.core.model.properties.Project emfProject = xmiResourceManager.loadProject(p);
            synchronizeFolders(p, emfProject);
            projects[i] = new Project(emfProject);
        }
        return projects;
    }

    private void synchronizeFolders(final IProject project, final org.talend.core.model.properties.Project emfProject)
            throws PersistenceException {
        final FolderHelper helper = FolderHelper.createInstance(emfProject);
        final Set<IPath> listFolders = helper.listFolders();
        try {
            project.accept(new IResourceVisitor() {

                public boolean visit(IResource resource) throws CoreException {
                    if (resource.getType() == IResource.FOLDER) {
                        IPath path = resource.getProjectRelativePath();
                        if (!listFolders.remove(path)) {
                            helper.createFolder(path);
                        }
                    }
                    return true;
                }

            });
        } catch (CoreException e) {
            e.printStackTrace();
        }
        // delete remaining folders
        for (IPath path : listFolders) {
            helper.deleteFolder(path);
        }
        xmiResourceManager.saveResource(emfProject.eResource());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.designer.core.extension.IRepositoryFactory#createFolder(org.talend.core.model.temp.Project,
     * org.talend.core.model.repository.EObjectType, org.eclipse.core.runtime.IPath, java.lang.String)
     */
    public Folder createFolder(ERepositoryObjectType type, IPath path, String label) throws PersistenceException {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        if (path == null) {
            throw new IllegalArgumentException("Path cannot be null");
        }
        if (label == null || label.length() == 0) {
            throw new IllegalArgumentException("Label cannot be null nor empty");
        }

        IProject fsProject = ResourceModelUtils.getProject(repositoryContext.getProject());

        String completePath = LocalResourceModelUtils.getFolderName(type) + IPath.SEPARATOR + path.toString() + IPath.SEPARATOR
                + label;
        String id = FolderHelper.createInstance(repositoryContext.getProject()).createFolder(completePath);
        xmiResourceManager.saveResource(repositoryContext.getProject().getEmfProject().eResource());
        // Getting the folder :
        IFolder folder = ResourceUtils.getFolder(fsProject, completePath, false);
        ResourceUtils.createFolder(folder);

        return new Folder(id, label);
    }

    ERepositoryObjectType getItemType(Item item) {
        return (ERepositoryObjectType) new PropertiesSwitch() {

            public Object caseDocumentationItem(DocumentationItem object) {
                return ERepositoryObjectType.DOCUMENTATION;
            }

            public Object caseRoutineItem(RoutineItem object) {
                return ERepositoryObjectType.ROUTINES;
            }

            public Object caseProcessItem(ProcessItem object) {
                return ERepositoryObjectType.PROCESS;
            }

            public Object caseBusinessProcessItem(BusinessProcessItem object) {
                return ERepositoryObjectType.BUSINESS_PROCESS;
            }

            public Object caseCSVFileConnectionItem(CSVFileConnectionItem object) {
                throw new IllegalStateException("not implemented");
            }

            public Object caseDatabaseConnectionItem(DatabaseConnectionItem object) {
                return ERepositoryObjectType.METADATA_CONNECTIONS;
            }

            public Object caseDelimitedFileConnectionItem(DelimitedFileConnectionItem object) {
                return ERepositoryObjectType.METADATA_FILE_DELIMITED;
            }

            public Object casePositionalFileConnectionItem(PositionalFileConnectionItem object) {
                return ERepositoryObjectType.METADATA_FILE_POSITIONAL;
            }

            public Object caseRegExFileConnectionItem(RegExFileConnectionItem object) {
                return ERepositoryObjectType.METADATA_FILE_REGEXP;
            }

            public Object caseXmlFileConnectionItem(XmlFileConnectionItem object) {
                return ERepositoryObjectType.METADATA_FILE_XML;
            }

            public Object defaultCase(EObject object) {
                throw new IllegalStateException();
            }
        }.doSwitch(item);
    }

    public boolean isNameAvailable(Item item, String name) throws PersistenceException {
        if (name == null) {
            name = item.getProperty().getLabel();
        }
        ERepositoryObjectType type = getItemType(item);

        if (type == ERepositoryObjectType.METADATA_CON_TABLE) {
            return false;
        }
        List<IRepositoryObject> list = getAll(type);

        for (IRepositoryObject current : list) {
            if (name.equals(current.getProperty().getLabel()) && item.getProperty().getId() != current.getProperty().getId()) {
                return false;
            }
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#isValid(org.talend.core.model.general.Project,
     * org.talend.core.model.repository.ERepositoryObjectType, org.eclipse.core.runtime.IPath, java.lang.String)
     */
    public boolean isPathValid(ERepositoryObjectType type, IPath path, String label) throws PersistenceException {
        if (path == null) {
            return false;
        }

        if (label.equals(BIN)) {
            return false;
        } else {
            // TODO SML Delete this ?
            IProject fsProject = ResourceModelUtils.getProject(repositoryContext.getProject());
            String completePath = LocalResourceModelUtils.getFolderName(type) + IPath.SEPARATOR + path.toString()
                    + IPath.SEPARATOR + label;

            // Getting the folder :
            IFolder existingFolder = ResourceUtils.getFolder(fsProject, completePath, false);
            return !existingFolder.exists();
        }
    }

    public void deleteFolder(ERepositoryObjectType type, IPath path) throws PersistenceException {
        IProject fsProject = ResourceModelUtils.getProject(repositoryContext.getProject());

        String completePath = LocalResourceModelUtils.getFolderName(type) + IPath.SEPARATOR + path.toString();

        // Getting the folder :
        IFolder folder = ResourceUtils.getFolder(fsProject, completePath, true);
        FolderHelper.createInstance(repositoryContext.getProject()).deleteFolder(completePath);
        xmiResourceManager.saveResource(repositoryContext.getProject().getEmfProject().eResource());

        ResourceUtils.deleteFolder(folder);
    }

    public void moveFolder(ERepositoryObjectType type, IPath sourcePath, IPath targetPath) throws PersistenceException {
        IProject fsProject = ResourceModelUtils.getProject(repositoryContext.getProject());

        String completeOldPath = LocalResourceModelUtils.getFolderName(type) + IPath.SEPARATOR + sourcePath.toString();
        String completeNewPath = LocalResourceModelUtils.getFolderName(type) + IPath.SEPARATOR + targetPath.toString()
                + IPath.SEPARATOR + sourcePath.lastSegment();

        // Getting the folder :
        IFolder folder = ResourceUtils.getFolder(fsProject, completeOldPath, false);

        IFolder newFolder = ResourceUtils.getFolder(fsProject, completeNewPath, false);
        FolderHelper.createInstance(repositoryContext.getProject()).moveFolder(completeOldPath, completeNewPath);
        xmiResourceManager.saveResource(repositoryContext.getProject().getEmfProject().eResource());
        ResourceUtils.moveResource(folder, newFolder.getFullPath());
    }

    public void renameFolder(ERepositoryObjectType type, IPath path, String label) throws PersistenceException {
        IProject fsProject = ResourceModelUtils.getProject(repositoryContext.getProject());

        String completePath = LocalResourceModelUtils.getFolderName(type) + IPath.SEPARATOR + path.toString();
        // Getting the folder :
        IFolder folder = ResourceUtils.getFolder(fsProject, completePath, false);

        // IPath targetPath = new
        // Path(SystemFolderNameFactory.getFolderName(type)).append(path).removeLastSegments(1).append(label);
        IPath targetPath = new Path(label);
        FolderHelper.createInstance(repositoryContext.getProject()).renameFolder(completePath, label);
        xmiResourceManager.saveResource(repositoryContext.getProject().getEmfProject().eResource());

        ResourceUtils.moveResource(folder, targetPath);
    }

    /**
     * 
     * DOC smallet Comment method "getProcessFromFolder".
     * 
     * @param project - DOC smallet
     * @return - DOC smallet
     * @throws PersistenceException - DOC smallet
     */
    private RootContainer<String, IRepositoryObject> getProcessFromFolder() throws PersistenceException {
        return getObjectFromFolder(ERepositoryObjectType.PROCESS, null, true);
    }

    /**
     * Returns all processes of a given project.
     * 
     * @param project - DOC smallet
     * @return - DOC smallet
     * @throws PersistenceException - DOC smallet
     */
    public RootContainer<String, IRepositoryObject> getProcess() throws PersistenceException {
        return getProcessFromFolder();
    }

    /**
     * 
     * DOC smallet Comment method "getMetadataConnectionFromFolder".
     * 
     * @param project - DOC smallet
     * @return - DOC smallet
     * @throws PersistenceException - DOC smallet
     */
    private RootContainer<String, IRepositoryObject> getMetadataConnectionFromFolder() throws PersistenceException {
        return getObjectFromFolder(ERepositoryObjectType.METADATA_CONNECTIONS, null, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.designer.core.model.metadata.IMetadataFactory#getMetadataConnection(org.talend.core.model.temp.Project)
     */
    public RootContainer<String, IRepositoryObject> getMetadataConnection() throws PersistenceException {
        return getMetadataConnectionFromFolder();
    }

    private RootContainer<String, IRepositoryObject> getMetadataFileDelimitedFromFolder() throws PersistenceException {
        return getObjectFromFolder(ERepositoryObjectType.METADATA_FILE_DELIMITED, null, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.designer.core.model.metadata.IMetadataFactory#getMetadataConnection(org.talend.core.model.temp.Project)
     */
    public RootContainer<String, IRepositoryObject> getMetadataFileDelimited() throws PersistenceException {
        return getMetadataFileDelimitedFromFolder();
    }

    private void collect(RootContainer<String, IRepositoryObject> rootContainer, List<ConnectionItem> result)
            throws PersistenceException {
        for (IRepositoryObject repositoryObject : rootContainer.getAbsoluteMembers().objects()) {
            ConnectionItem connectionItem = (ConnectionItem) repositoryObject.getProperty().getItem();
            if (!isDeleted(repositoryObject)) {
                result.add(connectionItem);
            }
        }
    }

    // gather all the metadata connections (file / db / etc ...)
    public List<ConnectionItem> getMetadataConnectionsItem() throws PersistenceException {
        // PTODO tgu implementation a revoir
        List<ConnectionItem> result = new ArrayList<ConnectionItem>();

        collect(getMetadataFileDelimited(), result);
        collect(getMetadataFilePositional(), result);
        collect(getMetadataFileRegexp(), result);
        collect(getMetadataFileXml(), result);
        collect(getMetadataConnection(), result);

        return result;
    }

    private RootContainer<String, IRepositoryObject> getBusinessProcessFromFolder() throws PersistenceException {
        return getObjectFromFolder(ERepositoryObjectType.BUSINESS_PROCESS, null, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.repository.factories.IBusinessProcessFactory#getBusinessProcess(org.talend.core.model.temp.Project)
     */
    public RootContainer<String, IRepositoryObject> getBusinessProcess() throws PersistenceException {
        return getBusinessProcessFromFolder();
    }

    private RootContainer<String, IRepositoryObject> getDocumentationFromFolder() throws PersistenceException {
        return getObjectFromFolder(ERepositoryObjectType.DOCUMENTATION, null, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.repository.factories.IDocumentationFactory#getRoutines(org.talend.core.model.temp.Project)
     */
    public RootContainer<String, IRepositoryObject> getDocumentation() throws PersistenceException {
        return getDocumentationFromFolder();
    }

    private RootContainer<String, IRepositoryObject> getRoutineFromFolder() throws PersistenceException {
        return getObjectFromFolder(ERepositoryObjectType.ROUTINES, null, true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.core.model.repository.factories.IRoutineFactory#getRoutine(org.talend.core.model.temp.Project)
     */
    public RootContainer<String, IRepositoryObject> getRoutine() throws PersistenceException {
        return getRoutineFromFolder();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#deleteObject(org.talend.core.model.general.Project,
     * org.talend.core.model.repository.IRepositoryObject)
     */
    public void deleteObjectLogical(IRepositoryObject objToDelete) throws PersistenceException {
        IProject fsProject = ResourceModelUtils.getProject(repositoryContext.getProject());

        IFolder bin = ResourceUtils.getFolder(fsProject, LocalResourceModelUtils.getFolderName(objToDelete.getType())
                + IPath.SEPARATOR + BIN, true);

        List<IRepositoryObject> allVersionToDelete = getSerializable(repositoryContext.getProject(), objToDelete.getId(), true);
        for (IRepositoryObject currentVersion : allVersionToDelete) {
            ItemState state = objToDelete.getProperty().getItem().getState();
            state.setDeleted(true);
            xmiResourceManager.saveResource(state.eResource());

            List<Resource> affectedResources = xmiResourceManager.getAffectedResources(currentVersion.getProperty());
            for (Resource resource : affectedResources) {
                IPath path = URIHelper.convert(resource.getURI());
                IPath newPath = bin.getFullPath().append(path.lastSegment());
                xmiResourceManager.moveResource(resource, newPath);
            }
            for (Resource resource : affectedResources) {
                xmiResourceManager.saveResource(resource);
            }
        }
    }

    public void deleteObjectPhysical(IRepositoryObject objToDelete) throws PersistenceException {
        List<IRepositoryObject> allVersionToDelete = getSerializable(repositoryContext.getProject(), objToDelete.getId(), true);
        for (IRepositoryObject currentVersion : allVersionToDelete) {
            List<Resource> affectedResources = xmiResourceManager.getAffectedResources(currentVersion.getProperty());
            for (Resource resource : affectedResources) {
                xmiResourceManager.deleteResource(resource);
            }
        }
    }

    public void restoreObject(IRepositoryObject objToRestore, IPath path) throws PersistenceException {
        IProject fsProject = ResourceModelUtils.getProject(repositoryContext.getProject());
        IFolder typeRootFolder = ResourceUtils.getFolder(fsProject,
                LocalResourceModelUtils.getFolderName(objToRestore.getType()), true);
        // IPath thePath = (path == null ? typeRootFolder.getFullPath() : typeRootFolder.getFullPath().append(path));
        org.talend.core.model.properties.Project project = xmiResourceManager.loadProject(getProject());

        List<IRepositoryObject> allVersionToDelete = getSerializable(repositoryContext.getProject(), objToRestore.getId(), true);
        for (IRepositoryObject currentVersion : allVersionToDelete) {
            ItemState itemState = currentVersion.getProperty().getItem().getState();
            itemState.setDeleted(false);
            xmiResourceManager.saveResource(itemState.eResource());

            List<Resource> affectedResources = xmiResourceManager.getAffectedResources(currentVersion.getProperty());
            for (Resource resource : affectedResources) {
                IPath originalPath = URIHelper.convert(resource.getURI());
                String path2 = itemState.getPath();
                IPath finalPath = typeRootFolder.getFullPath().append(path).append(originalPath.lastSegment());
                xmiResourceManager.moveResource(resource, finalPath);
            }
            for (Resource resource : affectedResources) {
                xmiResourceManager.saveResource(resource);
            }
        }

        xmiResourceManager.saveResource(project.eResource());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#isDeleted(org.talend.core.model.general.Project,
     * org.talend.core.model.repository.IRepositoryObject)
     */
    public boolean isDeleted(IRepositoryObject obj) throws PersistenceException {
        boolean deleted = false;
        if (obj instanceof MetadataTableRepositoryObject) {
            MetadataTableRepositoryObject metadataTableRepositoryObject = (MetadataTableRepositoryObject) obj;
            deleted = TableHelper.isDeleted(metadataTableRepositoryObject.getTable());
        }
        Item item = obj.getProperty().getItem();
        return deleted || isDeleted(item);
    }

    public boolean isDeleted(Item item) throws PersistenceException {
        return item.getState().isDeleted();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#getOldPath(org.talend.core.model.general.Project,
     * org.talend.core.model.repository.IRepositoryObject)
     */
    public String getOldPath(IRepositoryObject obj) throws PersistenceException {
        return obj.getProperty().getItem().getState().getPath();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#moveObject(org.talend.core.model.general.Project,
     * org.talend.core.model.repository.IRepositoryObject, org.eclipse.core.runtime.IPath)
     */
    public void moveObject(IRepositoryObject objToMove, IPath newPath) throws PersistenceException {
        IProject fsProject = ResourceModelUtils.getProject(repositoryContext.getProject());
        String folderName = LocalResourceModelUtils.getFolderName(objToMove.getType()) + IPath.SEPARATOR + newPath;
        IFolder folder = ResourceUtils.getFolder(fsProject, folderName, true);

        List<IRepositoryObject> allVersionToMove = getSerializable(repositoryContext.getProject(), objToMove.getId(), true);
        for (IRepositoryObject obj : allVersionToMove) {
            ItemState state = obj.getProperty().getItem().getState();
            state.setPath(newPath.toString());
            xmiResourceManager.saveResource(state.eResource());

            List<Resource> affectedResources = xmiResourceManager.getAffectedResources(obj.getProperty());
            for (Resource resource : affectedResources) {
                IPath path = folder.getFullPath().append(resource.getURI().lastSegment());
                xmiResourceManager.moveResource(resource, path);
            }
            for (Resource resource : affectedResources) {
                xmiResourceManager.saveResource(resource);
            }
        }
    }

    private RootContainer<String, IRepositoryObject> getMetadataFilePositionalFromFolder() throws PersistenceException {
        return getObjectFromFolder(ERepositoryObjectType.METADATA_FILE_POSITIONAL, null, true);
    }

    public RootContainer<String, IRepositoryObject> getMetadataFilePositional() throws PersistenceException {
        return getMetadataFilePositionalFromFolder();
    }

    // REGEXP FILE
    private RootContainer<String, IRepositoryObject> getMetadataFileRegexpFromFolder() throws PersistenceException {
        return getObjectFromFolder(ERepositoryObjectType.METADATA_FILE_REGEXP, null, true);
    }

    public RootContainer<String, IRepositoryObject> getMetadataFileRegexp() throws PersistenceException {
        return getMetadataFileRegexpFromFolder();
    }

    // XML FILE
    private RootContainer<String, IRepositoryObject> getMetadataFileXmlFromFolder() throws PersistenceException {
        return getObjectFromFolder(ERepositoryObjectType.METADATA_FILE_XML, null, true);
    }

    public RootContainer<String, IRepositoryObject> getMetadataFileXml() throws PersistenceException {
        return getMetadataFileXmlFromFolder();
    }

    /**
     * 
     * DOC smallet RepositoryFactory class global comment. Detailled comment <br/>
     * 
     * $Id$
     * 
     */
    private class LockedObject {

        private Date lockDate;

        private User locker;

        /**
         * DOC smallet LockedObject constructor comment.
         * 
         * @param object
         * @param lockDate
         * @param locker
         */
        public LockedObject(Date lockDate, User locker) {
            super();
            this.lockDate = lockDate;
            this.locker = locker;
        }

        /**
         * Getter for lockDate.
         * 
         * @return the lockDate
         */
        public Date getLockDate() {
            return this.lockDate;
        }

        /**
         * Getter for locker.
         * 
         * @return the locker
         */
        public User getLocker() {
            return this.locker;
        }

    }

    private static Map<String, LockedObject> lockedObject = new Hashtable<String, LockedObject>();

    private XmiResourceManager xmiResourceManager = new XmiResourceManager();;

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#getLockDate(org.talend.core.model.general.Project,
     * org.talend.core.model.repository.IRepositoryObject)
     */
    public Date getLockDate(IRepositoryObject obj) throws PersistenceException {
        if (isLocked(obj)) {
            return lockedObject.get(obj.getId()).getLockDate();
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#getLocker(org.talend.core.model.general.Project,
     * org.talend.core.model.repository.IRepositoryObject)
     */
    public User getLocker(IRepositoryObject obj) throws PersistenceException {
        if (isLocked(obj)) {
            return lockedObject.get(obj.getId()).getLocker();
        }
        return null;
    }

    /**
     * All lock system id manage by static variable in this local implementation. Project is not use.
     */
    public boolean isLocked(IRepositoryObject obj) throws PersistenceException {
        return isLocked(obj.getId());
    }

    public boolean isLocked(Item item) throws PersistenceException {
        return isLocked(item.getProperty().getId());
    }

    private boolean isLocked(String id) {
        return lockedObject.containsKey(id);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#lock(org.talend.core.model.general.Project,
     * org.talend.core.model.repository.IRepositoryObject)
     */
    public void lock(IRepositoryObject obj) throws PersistenceException {
        if (!isLocked(obj)) {
            lockedObject.put(obj.getId(), new LockedObject(new Date(), repositoryContext.getUser()));
            LocalLockHelper.fireLockEvent(obj.getId());
        }
    }

    public void lock(Item item) throws PersistenceException {
        if (!isLocked(item)) {
            lockedObject.put(item.getProperty().getId(), new LockedObject(new Date(), repositoryContext.getUser()));
            LocalLockHelper.fireLockEvent(item.getProperty().getId());
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#unlock(org.talend.core.model.general.Project,
     * org.talend.core.model.repository.IRepositoryObject)
     */
    public void unlock(IRepositoryObject obj) throws PersistenceException {
        if (isLocked(obj)) {
            lockedObject.remove(obj.getId());
            LocalLockHelper.fireUnlockEvent(obj.getId());
        }
    }

    public void unlock(Item obj) throws PersistenceException {
        if (isLocked(obj)) {
            lockedObject.remove(obj.getProperty().getId());
            LocalLockHelper.fireUnlockEvent(obj.getProperty().getId());
        }
    }

    public List<Status> getDocumentationStatus() throws PersistenceException {
        org.talend.core.model.properties.Project loadProject = xmiResourceManager.loadProject(getProject());
        return copyList(loadProject.getDocumentationStatus());
    }

    public List<Status> getTechnicalStatus() throws PersistenceException {
        org.talend.core.model.properties.Project loadProject = xmiResourceManager.loadProject(getProject());
        return copyList(loadProject.getTechnicalStatus());
    }

    private List<Status> copyList(List listOfStatus) {
        List<Status> result = new ArrayList<Status>();
        for (Object obj : listOfStatus) {
            result.add((Status) obj);
        }
        return result;
    }

    public void setDocumentationStatus(List<Status> list) throws PersistenceException {
        org.talend.core.model.properties.Project loadProject = xmiResourceManager.loadProject(getProject());
        loadProject.getDocumentationStatus().clear();
        loadProject.getDocumentationStatus().addAll(list);
        xmiResourceManager.saveResource(loadProject.eResource());
    }

    public void setTechnicalStatus(List<Status> list) throws PersistenceException {
        org.talend.core.model.properties.Project loadProject = xmiResourceManager.loadProject(getProject());
        loadProject.getTechnicalStatus().clear();
        loadProject.getTechnicalStatus().addAll(list);
        xmiResourceManager.saveResource(loadProject.eResource());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#getType()
     */
    public ERepositoryType getType() {
        return ERepositoryType.LOCAL;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.repository.model.IRepositoryFactory#isServerValid(java.lang.String, java.lang.String, int)
     */
    public String isServerValid() {
        return "";
    }

    private Resource create(BusinessProcessItem item, IPath path) throws PersistenceException {
        Resource itemResource = xmiResourceManager.createItemResource(getProject(), item, path,
                ERepositoryObjectType.BUSINESS_PROCESS, false);
        // notation depends on semantic ...
        // in case of new(=empty) diagram, we don't care about order
        // in other cases, the ordered addition references between notaion and semantic will be updated
        itemResource.getContents().add(item.getSemantic());
        itemResource.getContents().add(item.getNotationHolder());
        item.computeNotationHolder();

        return itemResource;
    }

    private Resource create(ConnectionItem item, ERepositoryObjectType type, IPath path) throws PersistenceException {
        Resource itemResource = xmiResourceManager.createItemResource(getProject(), item, path, type, false);

        itemResource.getContents().add(item.getConnection());

        return itemResource;
    }

    private Resource save(BusinessProcessItem item) throws PersistenceException {
        Resource itemResource = xmiResourceManager.getItemResource(item);
        itemResource.getContents().clear();
        // itemResource.getContents().add(item.getNotation());
        itemResource.getContents().add(item.getSemantic());
        itemResource.getContents().add(item.getNotationHolder());
        item.computeNotationHolder();

        return itemResource;
    }

    private Resource save(ConnectionItem item) throws PersistenceException {
        Resource itemResource = xmiResourceManager.getItemResource(item);
        itemResource.getContents().clear();
        itemResource.getContents().add(item.getConnection());

        return itemResource;
    }

    private Resource create(FileItem item, IPath path, ERepositoryObjectType type) throws PersistenceException {
        Resource itemResource = xmiResourceManager.createItemResource(getProject(), item, path, type, true);

        itemResource.getContents().add(item.getContent());

        return itemResource;
    }

    private Resource save(FileItem item) throws PersistenceException {
        Resource itemResource = xmiResourceManager.getItemResource(item);

        ByteArray content = item.getContent();
        itemResource.getContents().clear();
        itemResource.getContents().add(content);

        return itemResource;
    }

    private Resource create(ProcessItem item, IPath path) throws PersistenceException {
        Resource itemResource = xmiResourceManager.createItemResource(getProject(), item, path, ERepositoryObjectType.PROCESS,
                false);
        itemResource.getContents().add(item.getProcess());

        return itemResource;
    }

    private Resource save(ProcessItem item) throws PersistenceException {
        Resource itemResource = xmiResourceManager.getItemResource(item);

        itemResource.getContents().clear();
        itemResource.getContents().add(item.getProcess());

        return itemResource;
    }

    public void save(Item item) throws PersistenceException {
        item.getProperty().setModificationDate(new Date());

        Resource itemResource;
        EClass eClass = item.eClass();
        if (eClass.eContainer() == PropertiesPackage.eINSTANCE) {
            switch (eClass.getClassifierID()) {
            case PropertiesPackage.BUSINESS_PROCESS_ITEM:
                itemResource = save((BusinessProcessItem) item);
                break;
            case PropertiesPackage.POSITIONAL_FILE_CONNECTION_ITEM:
            case PropertiesPackage.DELIMITED_FILE_CONNECTION_ITEM:
            case PropertiesPackage.DATABASE_CONNECTION_ITEM:
            case PropertiesPackage.REG_EX_FILE_CONNECTION_ITEM:
            case PropertiesPackage.XML_FILE_CONNECTION_ITEM:
                // not really usefull for ConnectionItem : it's not copied to another resource for edition
                itemResource = save((ConnectionItem) item);
                break;
            case PropertiesPackage.DOCUMENTATION_ITEM:
            case PropertiesPackage.ROUTINE_ITEM:
                itemResource = save((FileItem) item);
                break;
            case PropertiesPackage.PROCESS_ITEM:
                itemResource = save((ProcessItem) item);
                break;
            default:
                throw new UnsupportedOperationException();
            }
        } else {
            throw new UnsupportedOperationException();
        }

        propagateFileName(item.getProperty());

        xmiResourceManager.saveResource(item.eResource());
        xmiResourceManager.saveResource(itemResource);
    }

    public void save(Property property) throws PersistenceException {
        propagateFileName(property);

        property.setModificationDate(new Date());
        Resource propertyResource = property.eResource();
        if (propertyResource != null) {
            xmiResourceManager.saveResource(propertyResource);
        }
    }

    public Item copy(Item originalItem, IPath path) throws PersistenceException {
        Resource resource = originalItem.eResource();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            resource.save(out, null);
            Resource createResource = new ResourceSetImpl().createResource(resource.getURI());
            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
            createResource.load(in, null);
            Item newItem = (Item) EcoreUtil.getObjectByType(createResource.getContents(), PropertiesPackage.eINSTANCE.getItem());
            Property property = newItem.getProperty();
            property.setId(getNextId());
            setPropNewName(property);
            EcoreUtil.resolveAll(createResource);
            create(newItem, path);
            return newItem;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private void propagateFileName(Property property) throws PersistenceException {
        List<IRepositoryObject> allVersionToMove = getSerializable(repositoryContext.getProject(), property.getId(), true);
        for (IRepositoryObject object : allVersionToMove) {
            xmiResourceManager.propagateFileName(property, object.getProperty());
        }
    }

    /**
     * DOC smallet Comment method "getCopiedLabel".
     * 
     * @param copiedProperty
     * @return
     * @throws PersistenceException
     */
    private void setPropNewName(Property copiedProperty) throws PersistenceException {
        String originalLabel = copiedProperty.getLabel();
        String add1 = "Copy of ";
        String initialTry = add1 + originalLabel;
        copiedProperty.setLabel(initialTry);
        if (isNameAvailable(copiedProperty.getItem(), null)) {
            return;
        } else {
            int i = 2;
            while (!isNameAvailable(copiedProperty.getItem(), null)) {
                String nextTry = initialTry + " (" + (i++) + ")";
                copiedProperty.setLabel(nextTry);
            }
        }
    }

    public void create(Item item, IPath path) throws PersistenceException {
        if (item.getProperty().getVersion() == null) {
            item.getProperty().setVersion(new Version().toString());
        }
        if (item.getProperty().getAuthor() == null) {
            item.getProperty().setAuthor(repositoryContext.getUser().getEmfUser());
        }
        item.getProperty().setCreationDate(new Date());

        ItemState itemState = PropertiesFactory.eINSTANCE.createItemState();
        itemState.setDeleted(false);
        itemState.setPath(path.toString());

        item.setState(itemState);

        Resource itemResource;
        EClass eClass = item.eClass();
        if (eClass.eContainer() == PropertiesPackage.eINSTANCE) {
            switch (eClass.getClassifierID()) {
            case PropertiesPackage.BUSINESS_PROCESS_ITEM:
                itemResource = create((BusinessProcessItem) item, path);
                break;
            case PropertiesPackage.DATABASE_CONNECTION_ITEM:
                itemResource = create((ConnectionItem) item, ERepositoryObjectType.METADATA_CONNECTIONS, path);
                break;
            case PropertiesPackage.DELIMITED_FILE_CONNECTION_ITEM:
                itemResource = create((ConnectionItem) item, ERepositoryObjectType.METADATA_FILE_DELIMITED, path);
                break;
            case PropertiesPackage.POSITIONAL_FILE_CONNECTION_ITEM:
                itemResource = create((ConnectionItem) item, ERepositoryObjectType.METADATA_FILE_POSITIONAL, path);
                break;
            case PropertiesPackage.REG_EX_FILE_CONNECTION_ITEM:
                itemResource = create((ConnectionItem) item, ERepositoryObjectType.METADATA_FILE_REGEXP, path);
                break;
            case PropertiesPackage.XML_FILE_CONNECTION_ITEM:
                itemResource = create((ConnectionItem) item, ERepositoryObjectType.METADATA_FILE_XML, path);
                break;
            case PropertiesPackage.DOCUMENTATION_ITEM:
                itemResource = create((FileItem) item, path, ERepositoryObjectType.DOCUMENTATION);
                break;
            case PropertiesPackage.ROUTINE_ITEM:
                itemResource = create((FileItem) item, path, ERepositoryObjectType.ROUTINES);
                break;
            case PropertiesPackage.PROCESS_ITEM:
                itemResource = create((ProcessItem) item, path);
                break;
            default:
                throw new UnsupportedOperationException();
            }
        } else {
            throw new UnsupportedOperationException();
        }

        Resource propertyResource = xmiResourceManager.createPropertyResource(itemResource);
        propertyResource.getContents().add(item.getProperty());
        propertyResource.getContents().add(item.getState());
        propertyResource.getContents().add(item);

        xmiResourceManager.saveResource(itemResource);
        xmiResourceManager.saveResource(propertyResource);
    }

    private IProject getProject() throws PersistenceException {
        return ResourceModelUtils.getProject(repositoryContext.getProject());
    }

    public void reload(Property property) {
        List<Resource> affectedResources = xmiResourceManager.getAffectedResources(property);
        for (Resource resource : affectedResources) {
            resource.unload();
        }
    }

    public boolean findUser(Project project, RepositoryContext repositoryContext) throws PersistenceException {
        IProject iProject = ResourceModelUtils.getProject(project);
        org.talend.core.model.properties.Project emfProject = xmiResourceManager.loadProject(iProject);
        Resource projectResource = emfProject.eResource();

        Collection users = EcoreUtil.getObjectsByType(projectResource.getContents(), PropertiesPackage.eINSTANCE.getUser());
        boolean found = false;
        for (Iterator iter = users.iterator(); iter.hasNext();) {
            org.talend.core.model.properties.User emfUser = (org.talend.core.model.properties.User) iter.next();
            if (emfUser.getLogin().equals(repositoryContext.getUser().getEmfUser().getLogin())) {
                repositoryContext.setUser(new User(emfUser));
                return true;
            }
        }

        return false;
    }

    public void createUser(Project project, RepositoryContext repositoryContext) throws PersistenceException {
        IProject iProject = ResourceModelUtils.getProject(project);
        org.talend.core.model.properties.Project emfProject = xmiResourceManager.loadProject(iProject);
        Resource projectResource = emfProject.eResource();

        projectResource.getContents().add(repositoryContext.getUser().getEmfUser());
        xmiResourceManager.saveResource(projectResource);
    }

    public void initialize() {
        // unused in local mode
    }
}
