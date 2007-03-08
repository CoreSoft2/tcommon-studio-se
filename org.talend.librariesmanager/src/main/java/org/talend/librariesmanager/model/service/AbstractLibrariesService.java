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
package org.talend.librariesmanager.model.service;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.talend.commons.exception.BusinessException;
import org.talend.commons.utils.io.FilesUtils;
import org.talend.core.model.general.ILibrariesService;
import org.talend.core.model.process.Element;
import org.talend.core.model.process.INode;
import org.talend.core.model.process.Problem;
import org.talend.core.model.process.Problem.ProblemStatus;
import org.talend.designer.codegen.perlmodule.ModuleNeeded;
import org.talend.designer.codegen.perlmodule.ModuleNeeded.ELibraryInstallStatus;
import org.talend.librariesmanager.i18n.Messages;
import org.talend.librariesmanager.model.ModulesNeededProvider;

/**
 * DOC smallet class global comment. Detailled comment <br/>
 * 
 * $Id$
 * 
 */
public abstract class AbstractLibrariesService implements ILibrariesService {

    public abstract String getLibrariesPath();

    public abstract URL getRoutineTemplate();

    public ELibraryInstallStatus getLibraryStatus(String libName) throws BusinessException {
        for (ModuleNeeded current : ModulesNeededProvider.getModulesNeeded()) {
            if (current.getModuleName().equals(libName)) {
                return current.getStatus();
            }
        }
        throw new BusinessException(Messages.getString("ModulesNeededProvider.Module.Exception", libName)); //$NON-NLS-1$
    }

    public void deployLibrary(URL source) throws IOException {
        FilesUtils.copyFile(new File(source.getFile()), new File(getLibrariesPath()));
    }

    public List<Problem> getProblems(INode node, Element element) {
        List<Problem> toReturn = new ArrayList<Problem>();
        List<ModuleNeeded> list = node.getComponent().getModulesNeeded();
        for (ModuleNeeded current : list) {
            if (current.getStatus() == ELibraryInstallStatus.NOT_INSTALLED && current.isRequired()) {
                toReturn.add(new Problem(element, "Module " + current.getModuleName() + " required", //$NON-NLS-1$ //$NON-NLS-2$
                        ProblemStatus.ERROR));
            }
        }
        return toReturn;
    }
}
