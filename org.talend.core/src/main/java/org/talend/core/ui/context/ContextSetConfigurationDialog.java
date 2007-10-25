// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2007 Talend - www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License.
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
package org.talend.core.ui.context;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.talend.commons.ui.image.ImageProvider;
import org.talend.core.i18n.Messages;
import org.talend.core.model.context.JobContext;
import org.talend.core.model.context.JobContextParameter;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IContextManager;
import org.talend.core.model.process.IContextParameter;
import org.talend.core.ui.images.ECoreImage;
import org.talend.repository.model.RepositoryConstants;

/**
 * A dialog that config the context value sets.
 * 
 */
public class ContextSetConfigurationDialog extends ObjectSelectionDialog<IContext> {

    private static String defaultMesage = "Configure Contexts for Job                                      ";

    IContextManager manager = null;

    /**
     * DOC bqian ContextSetConfigurationDialog class global comment. Detailled comment <br/>
     * 
     */
    public class ContextLabelProvider extends LabelProvider {

        public Image getImage(Object object) {
            return ImageProvider.getImage(ECoreImage.CONTEXT_ICON);
        }

        public String getText(Object object) {
            IContext context = (IContext) object;
            return context.getName();
        }
    }

    @SuppressWarnings("restriction")
    public ContextSetConfigurationDialog(Shell parentShell, IContextManager manager) {
        super(parentShell, "Configure Contexts", defaultMesage, null);
        this.manager = manager;
        setLabelProvider(getLabelProvider());
        List<IContext> list = new ArrayList<IContext>(manager.getListContext());
        setData(list);
        setShellStyle(getShellStyle() | SWT.RESIZE);
    }

    public List<IContext> getResultContexts() {
        return getData();
    }

    LabelProvider getLabelProvider() {
        return new ContextLabelProvider();
    }

    public void createElement() {
        InputDialog inputDial = new InputDialog(getShell(), Messages.getString("ContextProcessSection.6"), //$NON-NLS-1$
                Messages.getString("ContextProcessSection.7"), "", null); //$NON-NLS-1$ //$NON-NLS-2$

        inputDial.open();
        String returnValue = inputDial.getValue();
        if (returnValue == null) {
            return;
        }
        if (!validateContextName(returnValue)) {
            return;
        }
        createContext(returnValue);
        refreshViewer();
    }

    private boolean validateContextName(String name) {
        if (name.equals("") || !name.matches(RepositoryConstants.CODE_ITEM_PATTERN)) {
            MessageDialog.openWarning(new Shell(), Messages.getString(Messages.getString("ContextProcessSection.50")), Messages //$NON-NLS-1$
                    .getString(Messages.getString("ContextProcessSection.51"))); //$NON-NLS-1$
            return false;
        }

        return !isContextExisting(name);
    }

    public List<IContext> getAllContexts() {
        return (List<IContext>) getData();
    }

    private boolean isContextExisting(String name) {
        for (IContext context : getAllContexts()) {
            if (context.getName().equalsIgnoreCase(name)) {
                MessageBox mBox = new MessageBox(this.getShell(), SWT.ICON_ERROR);
                mBox.setText(Messages.getString("ContextProcessSection.29")); //$NON-NLS-1$
                mBox.setMessage(Messages.getString("ContextProcessSection.30")); //$NON-NLS-1$
                mBox.open();
                return true;
            }
        }
        return false;
    }

    private void createContext(final String name) {
        IContext context = manager.getDefaultContext();

        JobContext newContext = new JobContext(name);

        List<IContextParameter> newParamList = new ArrayList<IContextParameter>();
        newContext.setContextParameterList(newParamList);
        JobContextParameter param;
        for (int i = 0; i < context.getContextParameterList().size(); i++) {
            param = new JobContextParameter();
            param.setContext(newContext);
            param.setName(context.getContextParameterList().get(i).getName());
            param.setPrompt(context.getContextParameterList().get(i).getPrompt());
            param.setType(context.getContextParameterList().get(i).getType());
            param.setValue(context.getContextParameterList().get(i).getValue());
            param.setComment(context.getContextParameterList().get(i).getComment());
            param.setPromptNeeded(context.getContextParameterList().get(i).isPromptNeeded());
            newParamList.add(param);
        }
        getAllContexts().add(newContext);
    }

    protected void editSelectedElement() {
        IContext selectedContext = (IContext) (getSelection()).getFirstElement();
        String contextName = selectedContext.getName();
        InputDialog inputDial = new InputDialog(getShell(), Messages.getString("ContextProcessSection.12"), //$NON-NLS-1$
                Messages.getString("ContextProcessSection.13", contextName), "", null); //$NON-NLS-1$ //$NON-NLS-2$
        inputDial.open();
        String returnValue = inputDial.getValue();
        if (returnValue == null) {
            return;
        }
        if (!validateContextName(returnValue)) {
            return;
        }
        renameContext(selectedContext, returnValue);
        refreshViewer();
    }

    private void renameContext(IContext context, String newName) {
        context.setName(newName);
    }

    /**
     * Updates the modify buttons' enabled state based on the current seleciton.
     */
    protected void updateButtonAvailability() {
        super.updateButtonAvailability();

        boolean selectDefaultContext = false;
        for (Iterator iterator = getSelection().iterator(); iterator.hasNext();) {
            IContext context = (IContext) iterator.next();
            if (context == manager.getDefaultContext()) {
                selectDefaultContext = true;
                break;
            }

        }
        if (selectDefaultContext) {
            fRemoveButton.setEnabled(false);
            String contextNname = manager.getDefaultContext().getName();
            setDisplayMessage(Messages.getString("ContextProcessSection.RemoveInformation", contextNname));
        } else {
            setDisplayMessage(defaultMesage);
        }

    }
}
