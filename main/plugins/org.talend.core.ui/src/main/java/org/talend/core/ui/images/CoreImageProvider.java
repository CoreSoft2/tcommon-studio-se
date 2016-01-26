// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.core.ui.images;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.talend.commons.ui.runtime.image.ECoreImage;
import org.talend.commons.ui.runtime.image.IImage;
import org.talend.commons.ui.runtime.image.ImageProvider;
import org.talend.commons.ui.runtime.image.ImageUtils.ICON_SIZE;
import org.talend.core.GlobalServiceRegister;
import org.talend.core.hadoop.BigDataBasicUtil;
import org.talend.core.hadoop.HadoopConstants;
import org.talend.core.model.components.IComponent;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.ui.component.ComponentsFactoryProvider;
import org.talend.designer.core.IDesignerCoreService;

/**
 * amaumont class global comment. Detailled comment <br/>
 * 
 * $Id$
 * 
 */
public class CoreImageProvider {

    public static Image getImage(ERepositoryObjectType type) {
        return ImageProvider.getImage(getIcon(type));
    }

    public static ImageDescriptor getImageDesc(ERepositoryObjectType type) {
        return ImageProvider.getImageDesc(getIcon(type));
    }

    public static IImage getIcon(ERepositoryObjectType type) {
        return RepositoryImageProvider.getIcon(type);
    }

    public static IImage getIcon(Item item) {
        if (item == null) {
            return null;
        }
        ERepositoryObjectType itemType = ERepositoryObjectType.getItemType(item);
        if (itemType == null) {
            return null;
        }
        if (itemType == ERepositoryObjectType.PROCESS_MR || itemType == ERepositoryObjectType.PROCESS_STORM) {
            Object framework = BigDataBasicUtil.getFramework(item);
            if (HadoopConstants.FRAMEWORK_SPARK.equals(framework)) {
                return ECoreImage.PROCESS_BATCH_SPARK_ICON;
            } else if (HadoopConstants.FRAMEWORK_MAPREDUCE.equals(framework)) {
                return ECoreImage.PROCESS_BATCH_MR_ICON;
            } else if (HadoopConstants.FRAMEWORK_SPARKSTREAMING.equals(framework)) {
                return ECoreImage.PROCESS_STREAMING_SPARK_ICON;
            } else if (HadoopConstants.FRAMEWORK_STORM.equals(framework)) {
                return ECoreImage.PROCESS_STREAMING_STORM_ICON;
            }
            // the following statements are for the items exported from old studio versions since they have no framework
            // properties
            else if (itemType == ERepositoryObjectType.PROCESS_MR) {
                return ECoreImage.PROCESS_BATCH_MR_ICON;
            } else if (itemType == ERepositoryObjectType.PROCESS_STORM) {
                return ECoreImage.PROCESS_STREAMING_STORM_ICON;
            }
        }
        return getIcon(itemType);
    }

    private static Map<ImageDescriptor, Image> componentCachedImages = new HashMap<ImageDescriptor, Image>();

    public static Image getComponentImageFromDesc(ImageDescriptor imageDescriptor) {
        Image image = null;
        image = componentCachedImages.get(imageDescriptor);
        if (image == null || image.isDisposed()) {
            image = imageDescriptor.createImage();
            componentCachedImages.put(imageDescriptor, image);
        }
        return image;
    }

    public static Image getComponentIcon(IComponent component, ICON_SIZE iconSize) {
        if (component != null && iconSize != null) {
            if (iconSize == ICON_SIZE.ICON_32
                    && GlobalServiceRegister.getDefault().isServiceRegistered(IDesignerCoreService.class)) {
                IDesignerCoreService service = (IDesignerCoreService) GlobalServiceRegister.getDefault().getService(
                        IDesignerCoreService.class);
                if (service.isDummyComponent(component)) {
                    return getComponentImageFromDesc(component.getIcon32());
                }
            }

            ImageDescriptor icon = null;
            switch (iconSize) {
            case ICON_16:
                icon = component.getIcon16();
                break;
            case ICON_24:
                icon = component.getIcon24();
                break;
            case ICON_32:
            default:
                icon = component.getIcon32();
            }
            // default
            if (icon == null) {
                icon = component.getIcon32();
            }
            if (icon != null) {
                return getComponentImageFromDesc(icon);
            }
        }
        return null;
    }

    public static void removeComponentImage(String name) {
        if (name != null && !name.equals("")) { //$NON-NLS-1$
            for (IComponent component : ComponentsFactoryProvider.getInstance().getComponents()) {
                if (name.equals(component.getName())) {
                    Image image = componentCachedImages.get(component.getIcon16());
                    if (image != null && !image.isDisposed()) {
                        image.dispose();
                    }
                    componentCachedImages.remove(component.getIcon16());
                    image = componentCachedImages.get(component.getIcon24());
                    if (image != null && !image.isDisposed()) {
                        image.dispose();
                    }
                    componentCachedImages.remove(component.getIcon24());
                    image = componentCachedImages.get(component.getIcon32());
                    if (image != null && !image.isDisposed()) {
                        image.dispose();
                    }
                    componentCachedImages.remove(component.getIcon32());
                }
            }
        }
    }

    public static void clearComponentIconImages() {
        for (Image image : componentCachedImages.values()) {
            if (image != null && !image.isDisposed()) {
                image.dispose();
            }
        }
        componentCachedImages.clear();
    }
}
