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
package org.talend.core.model.metadata.connection.hive;

/**
 * Created by Marvin Wang on Mar 25, 2013.
 */
public enum HiveServerVersionInfo {

    HIVE_SERVER_1("HIVE", "HIVE_SERVER_1", "Hive Server1 -- jdbc:hive://"), //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$

    HIVE_SERVER_2("HIVE2", "HIVE_SERVER_2", "Hive Server2 -- jdbc:hive2://"); //$NON-NLS-1$//$NON-NLS-2$ //$NON-NLS-3$

    private String key;// The key is mapped to t*component.xml file.

    private String name;

    private String displayName; // That is used to display in UI.

    HiveServerVersionInfo(String key, String name, String displayName) {
        this.key = key;
        this.name = name;
        this.displayName = displayName;
    }

    /**
     * Getter for key.
     * 
     * @return the key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Sets the key.
     * 
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Getter for name.
     * 
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for displayName.
     * 
     * @return the displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Sets the displayName.
     * 
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
