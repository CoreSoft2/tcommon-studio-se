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
package org.talend.core.model.metadata.designerproperties;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.builder.connection.Concept;
import org.talend.core.model.metadata.builder.connection.ConceptTarget;
import org.talend.core.model.metadata.builder.connection.Connection;
import org.talend.core.model.metadata.builder.connection.MDMConnection;
import org.talend.core.model.metadata.types.JavaType;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.process.IElementParameter;

/**
 * DOC ycbai class global comment. Detailled comment
 */
public class RepositoryToComponentPropertyTest {

    /**
     * Test method for
     * {@link org.talend.core.model.metadata.designerproperties.RepositoryToComponentProperty#getTableXmlFileValue(org.talend.core.model.metadata.builder.connection.Connection, java.lang.String, org.talend.core.model.process.IElementParameter, java.util.List, org.talend.core.model.metadata.IMetadataTable)}
     * .
     */
    @Test
    public void testGetTableXmlFileValue() {
        List<Map<String, Object>> table = new ArrayList<Map<String, Object>>();
        Map<String, Object> map1 = new HashMap<String, Object>();
        Map<String, Object> map2 = new HashMap<String, Object>();
        map1.put("QUERY", "");
        map1.put("NODECHECK", false);
        map1.put("SCHEMA_COLUMN", "id");
        map2.put("QUERY", "");
        map2.put("NODECHECK", false);
        map2.put("SCHEMA_COLUMN", "element");
        table.add(map1);
        table.add(map2);

        IMetadataTable metadataTable = mockMetadataTable("testTable");
        List<IMetadataColumn> columns = new ArrayList<IMetadataColumn>();
        columns.add(mockColumn("id", false, true, JavaTypesManager.STRING, "varchar", 10, 0));
        columns.add(mockColumn("element", false, true, JavaTypesManager.STRING, "varchar", 100, 0));
        when(metadataTable.getListColumns()).thenReturn(columns);

        Concept concept1 = mockConcept(null);
        EList<ConceptTarget> targets1 = new BasicEList<ConceptTarget>();
        targets1.add(mockConceptTarget("id", "id"));
        targets1.add(mockConceptTarget("name", "name"));
        when(concept1.getConceptTargets()).thenReturn(targets1);

        Concept concept2 = mockConcept("testTable");
        EList<ConceptTarget> targets2 = new BasicEList<ConceptTarget>();
        targets2.add(mockConceptTarget("id", "id"));
        targets2.add(mockConceptTarget("element", "element"));
        when(concept2.getConceptTargets()).thenReturn(targets2);

        Concept concept3 = mockConcept("concept3");

        EList<Concept> schemas = new BasicEList<Concept>();
        schemas.add(concept1);
        schemas.add(concept2);
        schemas.add(concept3);

        Connection connection = mock(MDMConnection.class);
        MDMConnection mdmConnection = (MDMConnection) connection;
        when(mdmConnection.getSchemas()).thenReturn(schemas);

        IElementParameter parameter = mock(IElementParameter.class);
        when(parameter.getName()).thenReturn("MAPPING");
        when(parameter.getRepositoryValue()).thenReturn("XML_MAPPING");
        when(parameter.getValue()).thenReturn(table);
        when(parameter.getListRepositoryItems()).thenReturn(new String[] { "", "XML_QUERY", null });
        when(parameter.getListItemsDisplayCodeName()).thenReturn(new String[] { "SCHEMA_COLUMN", "QUERY", "NODECHECK" });

        RepositoryToComponentProperty.getTableXmlFileValue(connection, "XML_MAPPING", parameter, //$NON-NLS-1$
                table, metadataTable);

        assertEquals("\"id\"", table.get(0).get("QUERY"));
        assertEquals("\"element\"", table.get(1).get("QUERY"));
    }

    private IMetadataTable mockMetadataTable(String label) {
        IMetadataTable table = mock(IMetadataTable.class);
        when(table.getLabel()).thenReturn(label);

        List<IMetadataColumn> columns = new ArrayList<IMetadataColumn>();
        when(table.getListColumns()).thenReturn(columns);

        return table;
    }

    private IMetadataColumn mockColumn(String label, boolean isKey, boolean isNullable, JavaType talendType, String sourceType,
            int length, int precision) {
        IMetadataColumn column = mock(IMetadataColumn.class);

        when(column.getLabel()).thenReturn(label);
        when(column.isKey()).thenReturn(isKey);
        when(column.isNullable()).thenReturn(isNullable);
        when(column.getTalendType()).thenReturn(talendType.getId());
        when(column.getType()).thenReturn(sourceType);
        when(column.getLength()).thenReturn(length);
        when(column.getPrecision()).thenReturn(precision);

        return column;
    }

    private Concept mockConcept(String label) {
        Concept concept = mock(Concept.class);

        when(concept.getLabel()).thenReturn(label);
        EList<ConceptTarget> targets = new BasicEList<ConceptTarget>();
        when(concept.getConceptTargets()).thenReturn(targets);

        return concept;
    }

    private ConceptTarget mockConceptTarget(String targetName, String loopExpression) {
        ConceptTarget conceptTarget = mock(ConceptTarget.class);

        when(conceptTarget.getTargetName()).thenReturn(targetName);
        when(conceptTarget.getRelativeLoopExpression()).thenReturn(loopExpression);

        return conceptTarget;
    }

}
