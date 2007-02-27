/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.designer.business.model.business;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.designer.business.model.business.BusinessFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessPackage extends EPackage {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String copyright = ""; //$NON-NLS-1$

    /**
     * The package name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "business"; //$NON-NLS-1$

    /**
     * The package namespace URI.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "business"; //$NON-NLS-1$

    /**
     * The package namespace name.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "business"; //$NON-NLS-1$

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    BusinessPackage eINSTANCE = org.talend.designer.business.model.business.impl.BusinessPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.RepositoryImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getRepository()
     * @generated
     */
    int REPOSITORY = 0;

    /**
     * The feature id for the '<em><b>Talenditems</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY__TALENDITEMS = 0;

    /**
     * The number of structural features of the '<em>Repository</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int REPOSITORY_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.TalendItemImpl <em>Talend Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.TalendItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTalendItem()
     * @generated
     */
    int TALEND_ITEM = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__ID = 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__LABEL = 1;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__AUTHOR = 2;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__VERSION = 3;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__COMMENT = 4;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__ASSIGNMENTS = 5;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM__REPOSITORY = 6;

    /**
     * The number of structural features of the '<em>Talend Item</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TALEND_ITEM_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BusinessProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BusinessProcessImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessProcess()
     * @generated
     */
    int BUSINESS_PROCESS = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The feature id for the '<em><b>Business Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__BUSINESS_ITEMS = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Local Repository Copy</b></em>' containment reference.
     * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY = TALEND_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Process</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int BUSINESS_PROCESS_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.ProcessImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getProcess()
     * @generated
     */
    int PROCESS = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Process</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int PROCESS_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.RoutineImpl <em>Routine</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.RoutineImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getRoutine()
     * @generated
     */
    int ROUTINE = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ROUTINE__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Routine</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int ROUTINE_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DocumentationImpl <em>Documentation</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DocumentationImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDocumentation()
     * @generated
     */
    int DOCUMENTATION = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Documentation</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DatabaseMetadataImpl <em>Database Metadata</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DatabaseMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDatabaseMetadata()
     * @generated
     */
    int DATABASE_METADATA = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Database Metadata</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.TableMetadataImpl <em>Table Metadata</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.TableMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTableMetadata()
     * @generated
     */
    int TABLE_METADATA = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>Table Metadata</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FileDelimitedMetadataImpl <em>File Delimited Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FileDelimitedMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileDelimitedMetadata()
     * @generated
     */
    int FILE_DELIMITED_METADATA = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Delimited Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_DELIMITED_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FilePositionalMetadataImpl <em>File Positional Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FilePositionalMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFilePositionalMetadata()
     * @generated
     */
    int FILE_POSITIONAL_METADATA = 9;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Positional Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_POSITIONAL_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BusinessAssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BusinessAssignmentImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessAssignment()
     * @generated
     */
    int BUSINESS_ASSIGNMENT = 10;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BusinessItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItem()
     * @generated
     */
    int BUSINESS_ITEM = 11;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BusinessItemRelationshipImpl <em>Item Relationship</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BusinessItemRelationshipImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItemRelationship()
     * @generated
     */
    int BUSINESS_ITEM_RELATIONSHIP = 12;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.BusinessItemShapeImpl <em>Item Shape</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.BusinessItemShapeImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItemShape()
     * @generated
     */
    int BUSINESS_ITEM_SHAPE = 13;

    /**
     * The feature id for the '<em><b>Business Item</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ASSIGNMENT__BUSINESS_ITEM = 0;

    /**
     * The feature id for the '<em><b>Talend Item</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     * @ordered
     */
    int BUSINESS_ASSIGNMENT__TALEND_ITEM = 1;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ASSIGNMENT__COMMENT = 2;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ASSIGNMENT_FEATURE_COUNT = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__NAME = 0;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__BUSINESS_PROCESS = 1;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM__ASSIGNMENTS = 2;

    /**
     * The number of structural features of the '<em>Item</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_FEATURE_COUNT = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__NAME = BUSINESS_ITEM__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__BUSINESS_PROCESS = BUSINESS_ITEM__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__ASSIGNMENTS = BUSINESS_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__SOURCE = BUSINESS_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP__TARGET = BUSINESS_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Item Relationship</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_RELATIONSHIP_FEATURE_COUNT = BUSINESS_ITEM_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__NAME = BUSINESS_ITEM__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS = BUSINESS_ITEM__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__ASSIGNMENTS = BUSINESS_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Item Shape</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int BUSINESS_ITEM_SHAPE_FEATURE_COUNT = BUSINESS_ITEM_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DecisionBusinessItemImpl <em>Decision Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DecisionBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDecisionBusinessItem()
     * @generated
     */
    int DECISION_BUSINESS_ITEM = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Decision Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DECISION_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.ActionBusinessItemImpl <em>Action Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.ActionBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getActionBusinessItem()
     * @generated
     */
    int ACTION_BUSINESS_ITEM = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Action Business Item</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.TerminalBusinessItemImpl <em>Terminal Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.TerminalBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTerminalBusinessItem()
     * @generated
     */
    int TERMINAL_BUSINESS_ITEM = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Terminal Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DataBusinessItemImpl <em>Data Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DataBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDataBusinessItem()
     * @generated
     */
    int DATA_BUSINESS_ITEM = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Data Business Item</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DocumentBusinessItemImpl <em>Document Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DocumentBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDocumentBusinessItem()
     * @generated
     */
    int DOCUMENT_BUSINESS_ITEM = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Document Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.InputBusinessItemImpl <em>Input Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.InputBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getInputBusinessItem()
     * @generated
     */
    int INPUT_BUSINESS_ITEM = 19;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Input Business Item</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.ListBusinessItemImpl <em>List Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.ListBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getListBusinessItem()
     * @generated
     */
    int LIST_BUSINESS_ITEM = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>List Business Item</em>' class.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.DatabaseBusinessItemImpl <em>Database Business Item</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.DatabaseBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDatabaseBusinessItem()
     * @generated
     */
    int DATABASE_BUSINESS_ITEM = 21;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Database Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FileRegexpMetadataImpl <em>File Regexp Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FileRegexpMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileRegexpMetadata()
     * @generated
     */
    int FILE_REGEXP_METADATA = 25;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.ActorBusinessItemImpl <em>Actor Business Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.ActorBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getActorBusinessItem()
     * @generated
     */
    int ACTOR_BUSINESS_ITEM = 22;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Actor Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTOR_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.EllipseBusinessItemImpl <em>Ellipse Business Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.EllipseBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getEllipseBusinessItem()
     * @generated
     */
    int ELLIPSE_BUSINESS_ITEM = 23;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Ellipse Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELLIPSE_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.GearBusinessItemImpl <em>Gear Business Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.GearBusinessItemImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getGearBusinessItem()
     * @generated
     */
    int GEAR_BUSINESS_ITEM = 24;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__NAME = BUSINESS_ITEM_SHAPE__NAME;

    /**
     * The feature id for the '<em><b>Business Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__BUSINESS_PROCESS = BUSINESS_ITEM_SHAPE__BUSINESS_PROCESS;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__ASSIGNMENTS = BUSINESS_ITEM_SHAPE__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Incoming Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__INCOMING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS;

    /**
     * The feature id for the '<em><b>Outgoing Relationships</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM__OUTGOING_RELATIONSHIPS = BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS;

    /**
     * The number of structural features of the '<em>Gear Business Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GEAR_BUSINESS_ITEM_FEATURE_COUNT = BUSINESS_ITEM_SHAPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Regexp Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_REGEXP_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;


    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FileXmlMetadataImpl <em>File Xml Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FileXmlMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileXmlMetadata()
     * @generated
     */
    int FILE_XML_METADATA = 26;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Xml Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_XML_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.designer.business.model.business.impl.FileLdifMetadataImpl <em>File Ldif Metadata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.designer.business.model.business.impl.FileLdifMetadataImpl
     * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileLdifMetadata()
     * @generated
     */
    int FILE_LDIF_METADATA = 27;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__ID = TALEND_ITEM__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__LABEL = TALEND_ITEM__LABEL;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__AUTHOR = TALEND_ITEM__AUTHOR;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__VERSION = TALEND_ITEM__VERSION;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__COMMENT = TALEND_ITEM__COMMENT;

    /**
     * The feature id for the '<em><b>Assignments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__ASSIGNMENTS = TALEND_ITEM__ASSIGNMENTS;

    /**
     * The feature id for the '<em><b>Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA__REPOSITORY = TALEND_ITEM__REPOSITORY;

    /**
     * The number of structural features of the '<em>File Ldif Metadata</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_LDIF_METADATA_FEATURE_COUNT = TALEND_ITEM_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Repository <em>Repository</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Repository</em>'.
     * @see org.talend.designer.business.model.business.Repository
     * @generated
     */
    EClass getRepository();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.business.model.business.Repository#getTalenditems <em>Talenditems</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Talenditems</em>'.
     * @see org.talend.designer.business.model.business.Repository#getTalenditems()
     * @see #getRepository()
     * @generated
     */
    EReference getRepository_Talenditems();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.TalendItem <em>Talend Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Talend Item</em>'.
     * @see org.talend.designer.business.model.business.TalendItem
     * @generated
     */
    EClass getTalendItem();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.TalendItem#getId <em>Id</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getId()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Id();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.TalendItem#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getLabel()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Label();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.TalendItem#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getAuthor()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Author();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.TalendItem#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getVersion()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Version();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.TalendItem#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getComment()
     * @see #getTalendItem()
     * @generated
     */
    EAttribute getTalendItem_Comment();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.business.model.business.TalendItem#getAssignments <em>Assignments</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Assignments</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getAssignments()
     * @see #getTalendItem()
     * @generated
     */
    EReference getTalendItem_Assignments();

    /**
     * Returns the meta object for the container reference '{@link org.talend.designer.business.model.business.TalendItem#getRepository <em>Repository</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Repository</em>'.
     * @see org.talend.designer.business.model.business.TalendItem#getRepository()
     * @see #getTalendItem()
     * @generated
     */
    EReference getTalendItem_Repository();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BusinessProcess <em>Process</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see org.talend.designer.business.model.business.BusinessProcess
     * @generated
     */
    EClass getBusinessProcess();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.business.model.business.BusinessProcess#getBusinessItems <em>Business Items</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Business Items</em>'.
     * @see org.talend.designer.business.model.business.BusinessProcess#getBusinessItems()
     * @see #getBusinessProcess()
     * @generated
     */
    EReference getBusinessProcess_BusinessItems();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.designer.business.model.business.BusinessProcess#getLocalRepositoryCopy <em>Local Repository Copy</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Local Repository Copy</em>'.
     * @see org.talend.designer.business.model.business.BusinessProcess#getLocalRepositoryCopy()
     * @see #getBusinessProcess()
     * @generated
     */
    EReference getBusinessProcess_LocalRepositoryCopy();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Process <em>Process</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see org.talend.designer.business.model.business.Process
     * @generated
     */
    EClass getProcess();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Routine <em>Routine</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Routine</em>'.
     * @see org.talend.designer.business.model.business.Routine
     * @generated
     */
    EClass getRoutine();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Documentation</em>'.
     * @see org.talend.designer.business.model.business.Documentation
     * @generated
     */
    EClass getDocumentation();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DatabaseMetadata <em>Database Metadata</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Database Metadata</em>'.
     * @see org.talend.designer.business.model.business.DatabaseMetadata
     * @generated
     */
    EClass getDatabaseMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.TableMetadata <em>Table Metadata</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Table Metadata</em>'.
     * @see org.talend.designer.business.model.business.TableMetadata
     * @generated
     */
    EClass getTableMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FileDelimitedMetadata <em>File Delimited Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Delimited Metadata</em>'.
     * @see org.talend.designer.business.model.business.FileDelimitedMetadata
     * @generated
     */
    EClass getFileDelimitedMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FilePositionalMetadata <em>File Positional Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Positional Metadata</em>'.
     * @see org.talend.designer.business.model.business.FilePositionalMetadata
     * @generated
     */
    EClass getFilePositionalMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BusinessAssignment <em>Assignment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see org.talend.designer.business.model.business.BusinessAssignment
     * @generated
     */
    EClass getBusinessAssignment();

    /**
     * Returns the meta object for the container reference '{@link org.talend.designer.business.model.business.BusinessAssignment#getBusinessItem <em>Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Business Item</em>'.
     * @see org.talend.designer.business.model.business.BusinessAssignment#getBusinessItem()
     * @see #getBusinessAssignment()
     * @generated
     */
    EReference getBusinessAssignment_BusinessItem();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.business.model.business.BusinessAssignment#getTalendItem <em>Talend Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Talend Item</em>'.
     * @see org.talend.designer.business.model.business.BusinessAssignment#getTalendItem()
     * @see #getBusinessAssignment()
     * @generated
     */
    EReference getBusinessAssignment_TalendItem();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.BusinessAssignment#getComment <em>Comment</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comment</em>'.
     * @see org.talend.designer.business.model.business.BusinessAssignment#getComment()
     * @see #getBusinessAssignment()
     * @generated
     */
    EAttribute getBusinessAssignment_Comment();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BusinessItem <em>Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Item</em>'.
     * @see org.talend.designer.business.model.business.BusinessItem
     * @generated
     */
    EClass getBusinessItem();

    /**
     * Returns the meta object for the container reference '{@link org.talend.designer.business.model.business.BusinessItem#getBusinessProcess <em>Business Process</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Business Process</em>'.
     * @see org.talend.designer.business.model.business.BusinessItem#getBusinessProcess()
     * @see #getBusinessItem()
     * @generated
     */
    EReference getBusinessItem_BusinessProcess();

    /**
     * Returns the meta object for the attribute '{@link org.talend.designer.business.model.business.BusinessItem#getName <em>Name</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.designer.business.model.business.BusinessItem#getName()
     * @see #getBusinessItem()
     * @generated
     */
    EAttribute getBusinessItem_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.designer.business.model.business.BusinessItem#getAssignments <em>Assignments</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assignments</em>'.
     * @see org.talend.designer.business.model.business.BusinessItem#getAssignments()
     * @see #getBusinessItem()
     * @generated
     */
    EReference getBusinessItem_Assignments();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BusinessItemRelationship <em>Item Relationship</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Relationship</em>'.
     * @see org.talend.designer.business.model.business.BusinessItemRelationship
     * @generated
     */
    EClass getBusinessItemRelationship();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.business.model.business.BusinessItemRelationship#getSource <em>Source</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see org.talend.designer.business.model.business.BusinessItemRelationship#getSource()
     * @see #getBusinessItemRelationship()
     * @generated
     */
    EReference getBusinessItemRelationship_Source();

    /**
     * Returns the meta object for the reference '{@link org.talend.designer.business.model.business.BusinessItemRelationship#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.talend.designer.business.model.business.BusinessItemRelationship#getTarget()
     * @see #getBusinessItemRelationship()
     * @generated
     */
    EReference getBusinessItemRelationship_Target();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.BusinessItemShape <em>Item Shape</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Item Shape</em>'.
     * @see org.talend.designer.business.model.business.BusinessItemShape
     * @generated
     */
    EClass getBusinessItemShape();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.business.model.business.BusinessItemShape#getIncomingRelationships <em>Incoming Relationships</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Relationships</em>'.
     * @see org.talend.designer.business.model.business.BusinessItemShape#getIncomingRelationships()
     * @see #getBusinessItemShape()
     * @generated
     */
    EReference getBusinessItemShape_IncomingRelationships();

    /**
     * Returns the meta object for the reference list '{@link org.talend.designer.business.model.business.BusinessItemShape#getOutgoingRelationships <em>Outgoing Relationships</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing Relationships</em>'.
     * @see org.talend.designer.business.model.business.BusinessItemShape#getOutgoingRelationships()
     * @see #getBusinessItemShape()
     * @generated
     */
    EReference getBusinessItemShape_OutgoingRelationships();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DecisionBusinessItem <em>Decision Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Decision Business Item</em>'.
     * @see org.talend.designer.business.model.business.DecisionBusinessItem
     * @generated
     */
    EClass getDecisionBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.ActionBusinessItem <em>Action Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Business Item</em>'.
     * @see org.talend.designer.business.model.business.ActionBusinessItem
     * @generated
     */
    EClass getActionBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.TerminalBusinessItem <em>Terminal Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Terminal Business Item</em>'.
     * @see org.talend.designer.business.model.business.TerminalBusinessItem
     * @generated
     */
    EClass getTerminalBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DataBusinessItem <em>Data Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Business Item</em>'.
     * @see org.talend.designer.business.model.business.DataBusinessItem
     * @generated
     */
    EClass getDataBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DocumentBusinessItem <em>Document Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Business Item</em>'.
     * @see org.talend.designer.business.model.business.DocumentBusinessItem
     * @generated
     */
    EClass getDocumentBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.InputBusinessItem <em>Input Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Business Item</em>'.
     * @see org.talend.designer.business.model.business.InputBusinessItem
     * @generated
     */
    EClass getInputBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.ListBusinessItem <em>List Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>List Business Item</em>'.
     * @see org.talend.designer.business.model.business.ListBusinessItem
     * @generated
     */
    EClass getListBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.DatabaseBusinessItem <em>Database Business Item</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the meta object for class '<em>Database Business Item</em>'.
     * @see org.talend.designer.business.model.business.DatabaseBusinessItem
     * @generated
     */
    EClass getDatabaseBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FileRegexpMetadata <em>File Regexp Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Regexp Metadata</em>'.
     * @see org.talend.designer.business.model.business.FileRegexpMetadata
     * @generated
     */
    EClass getFileRegexpMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.ActorBusinessItem <em>Actor Business Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Actor Business Item</em>'.
     * @see org.talend.designer.business.model.business.ActorBusinessItem
     * @generated
     */
    EClass getActorBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.EllipseBusinessItem <em>Ellipse Business Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ellipse Business Item</em>'.
     * @see org.talend.designer.business.model.business.EllipseBusinessItem
     * @generated
     */
    EClass getEllipseBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.GearBusinessItem <em>Gear Business Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gear Business Item</em>'.
     * @see org.talend.designer.business.model.business.GearBusinessItem
     * @generated
     */
    EClass getGearBusinessItem();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FileXmlMetadata <em>File Xml Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Xml Metadata</em>'.
     * @see org.talend.designer.business.model.business.FileXmlMetadata
     * @generated
     */
    EClass getFileXmlMetadata();

    /**
     * Returns the meta object for class '{@link org.talend.designer.business.model.business.FileLdifMetadata <em>File Ldif Metadata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Ldif Metadata</em>'.
     * @see org.talend.designer.business.model.business.FileLdifMetadata
     * @generated
     */
    EClass getFileLdifMetadata();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    BusinessFactory getBusinessFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals  {

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.RepositoryImpl <em>Repository</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.RepositoryImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getRepository()
         * @generated
         */
        EClass REPOSITORY = eINSTANCE.getRepository();

        /**
         * The meta object literal for the '<em><b>Talenditems</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference REPOSITORY__TALENDITEMS = eINSTANCE.getRepository_Talenditems();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.TalendItemImpl <em>Talend Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.TalendItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTalendItem()
         * @generated
         */
        EClass TALEND_ITEM = eINSTANCE.getTalendItem();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__ID = eINSTANCE.getTalendItem_Id();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__LABEL = eINSTANCE.getTalendItem_Label();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__AUTHOR = eINSTANCE.getTalendItem_Author();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__VERSION = eINSTANCE.getTalendItem_Version();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TALEND_ITEM__COMMENT = eINSTANCE.getTalendItem_Comment();

        /**
         * The meta object literal for the '<em><b>Assignments</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference TALEND_ITEM__ASSIGNMENTS = eINSTANCE.getTalendItem_Assignments();

        /**
         * The meta object literal for the '<em><b>Repository</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference TALEND_ITEM__REPOSITORY = eINSTANCE.getTalendItem_Repository();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BusinessProcessImpl <em>Process</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BusinessProcessImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessProcess()
         * @generated
         */
        EClass BUSINESS_PROCESS = eINSTANCE.getBusinessProcess();

        /**
         * The meta object literal for the '<em><b>Business Items</b></em>' containment reference list feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_PROCESS__BUSINESS_ITEMS = eINSTANCE.getBusinessProcess_BusinessItems();

        /**
         * The meta object literal for the '<em><b>Local Repository Copy</b></em>' containment reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_PROCESS__LOCAL_REPOSITORY_COPY = eINSTANCE.getBusinessProcess_LocalRepositoryCopy();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.ProcessImpl <em>Process</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.ProcessImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getProcess()
         * @generated
         */
        EClass PROCESS = eINSTANCE.getProcess();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.RoutineImpl <em>Routine</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.RoutineImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getRoutine()
         * @generated
         */
        EClass ROUTINE = eINSTANCE.getRoutine();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DocumentationImpl <em>Documentation</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DocumentationImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDocumentation()
         * @generated
         */
        EClass DOCUMENTATION = eINSTANCE.getDocumentation();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DatabaseMetadataImpl <em>Database Metadata</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DatabaseMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDatabaseMetadata()
         * @generated
         */
        EClass DATABASE_METADATA = eINSTANCE.getDatabaseMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.TableMetadataImpl <em>Table Metadata</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.TableMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTableMetadata()
         * @generated
         */
        EClass TABLE_METADATA = eINSTANCE.getTableMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FileDelimitedMetadataImpl <em>File Delimited Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FileDelimitedMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileDelimitedMetadata()
         * @generated
         */
        EClass FILE_DELIMITED_METADATA = eINSTANCE.getFileDelimitedMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FilePositionalMetadataImpl <em>File Positional Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FilePositionalMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFilePositionalMetadata()
         * @generated
         */
        EClass FILE_POSITIONAL_METADATA = eINSTANCE.getFilePositionalMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BusinessAssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BusinessAssignmentImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessAssignment()
         * @generated
         */
        EClass BUSINESS_ASSIGNMENT = eINSTANCE.getBusinessAssignment();

        /**
         * The meta object literal for the '<em><b>Business Item</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BUSINESS_ASSIGNMENT__BUSINESS_ITEM = eINSTANCE.getBusinessAssignment_BusinessItem();

        /**
         * The meta object literal for the '<em><b>Talend Item</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ASSIGNMENT__TALEND_ITEM = eINSTANCE.getBusinessAssignment_TalendItem();

        /**
         * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_ASSIGNMENT__COMMENT = eINSTANCE.getBusinessAssignment_Comment();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BusinessItemImpl <em>Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItem()
         * @generated
         */
        EClass BUSINESS_ITEM = eINSTANCE.getBusinessItem();

        /**
         * The meta object literal for the '<em><b>Business Process</b></em>' container reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BUSINESS_ITEM__BUSINESS_PROCESS = eINSTANCE.getBusinessItem_BusinessProcess();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EAttribute BUSINESS_ITEM__NAME = eINSTANCE.getBusinessItem_Name();

        /**
         * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BUSINESS_ITEM__ASSIGNMENTS = eINSTANCE.getBusinessItem_Assignments();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BusinessItemRelationshipImpl <em>Item Relationship</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BusinessItemRelationshipImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItemRelationship()
         * @generated
         */
        EClass BUSINESS_ITEM_RELATIONSHIP = eINSTANCE.getBusinessItemRelationship();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_RELATIONSHIP__SOURCE = eINSTANCE.getBusinessItemRelationship_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * @generated
         */
        EReference BUSINESS_ITEM_RELATIONSHIP__TARGET = eINSTANCE.getBusinessItemRelationship_Target();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.BusinessItemShapeImpl <em>Item Shape</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.BusinessItemShapeImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getBusinessItemShape()
         * @generated
         */
        EClass BUSINESS_ITEM_SHAPE = eINSTANCE.getBusinessItemShape();

        /**
         * The meta object literal for the '<em><b>Incoming Relationships</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BUSINESS_ITEM_SHAPE__INCOMING_RELATIONSHIPS = eINSTANCE.getBusinessItemShape_IncomingRelationships();

        /**
         * The meta object literal for the '<em><b>Outgoing Relationships</b></em>' reference list feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference BUSINESS_ITEM_SHAPE__OUTGOING_RELATIONSHIPS = eINSTANCE.getBusinessItemShape_OutgoingRelationships();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DecisionBusinessItemImpl <em>Decision Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DecisionBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDecisionBusinessItem()
         * @generated
         */
        EClass DECISION_BUSINESS_ITEM = eINSTANCE.getDecisionBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.ActionBusinessItemImpl <em>Action Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.ActionBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getActionBusinessItem()
         * @generated
         */
        EClass ACTION_BUSINESS_ITEM = eINSTANCE.getActionBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.TerminalBusinessItemImpl <em>Terminal Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.TerminalBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getTerminalBusinessItem()
         * @generated
         */
        EClass TERMINAL_BUSINESS_ITEM = eINSTANCE.getTerminalBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DataBusinessItemImpl <em>Data Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DataBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDataBusinessItem()
         * @generated
         */
        EClass DATA_BUSINESS_ITEM = eINSTANCE.getDataBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DocumentBusinessItemImpl <em>Document Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DocumentBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDocumentBusinessItem()
         * @generated
         */
        EClass DOCUMENT_BUSINESS_ITEM = eINSTANCE.getDocumentBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.InputBusinessItemImpl <em>Input Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.InputBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getInputBusinessItem()
         * @generated
         */
        EClass INPUT_BUSINESS_ITEM = eINSTANCE.getInputBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.ListBusinessItemImpl <em>List Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.ListBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getListBusinessItem()
         * @generated
         */
        EClass LIST_BUSINESS_ITEM = eINSTANCE.getListBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.DatabaseBusinessItemImpl <em>Database Business Item</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.DatabaseBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getDatabaseBusinessItem()
         * @generated
         */
        EClass DATABASE_BUSINESS_ITEM = eINSTANCE.getDatabaseBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FileRegexpMetadataImpl <em>File Regexp Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FileRegexpMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileRegexpMetadata()
         * @generated
         */
        EClass FILE_REGEXP_METADATA = eINSTANCE.getFileRegexpMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.ActorBusinessItemImpl <em>Actor Business Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.ActorBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getActorBusinessItem()
         * @generated
         */
        EClass ACTOR_BUSINESS_ITEM = eINSTANCE.getActorBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.EllipseBusinessItemImpl <em>Ellipse Business Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.EllipseBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getEllipseBusinessItem()
         * @generated
         */
        EClass ELLIPSE_BUSINESS_ITEM = eINSTANCE.getEllipseBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.GearBusinessItemImpl <em>Gear Business Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.GearBusinessItemImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getGearBusinessItem()
         * @generated
         */
        EClass GEAR_BUSINESS_ITEM = eINSTANCE.getGearBusinessItem();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FileXmlMetadataImpl <em>File Xml Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FileXmlMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileXmlMetadata()
         * @generated
         */
        EClass FILE_XML_METADATA = eINSTANCE.getFileXmlMetadata();

        /**
         * The meta object literal for the '{@link org.talend.designer.business.model.business.impl.FileLdifMetadataImpl <em>File Ldif Metadata</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.designer.business.model.business.impl.FileLdifMetadataImpl
         * @see org.talend.designer.business.model.business.impl.BusinessPackageImpl#getFileLdifMetadata()
         * @generated
         */
        EClass FILE_LDIF_METADATA = eINSTANCE.getFileLdifMetadata();

    }

} // BusinessPackage
