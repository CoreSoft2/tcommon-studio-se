/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain.pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.talend.dataquality.domain.pattern.PatternFactory
 * @model kind="package"
 * @generated
 */
public interface PatternPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "pattern";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.domain.pattern";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.domain.pattern";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    PatternPackage eINSTANCE = org.talend.dataquality.domain.pattern.impl.PatternPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.impl.PatternImpl
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getPattern()
     * @generated
     */
    int PATTERN = 0;

    /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN__COMPONENTS = 0;

    /**
     * The number of structural features of the '<em>Pattern</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.impl.PatternComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.impl.PatternComponentImpl
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getPatternComponent()
     * @generated
     */
    int PATTERN_COMPONENT = 1;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PATTERN_COMPONENT_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.impl.RegularExpressionImpl <em>Regular Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.impl.RegularExpressionImpl
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getRegularExpression()
     * @generated
     */
    int REGULAR_EXPRESSION = 2;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGULAR_EXPRESSION__EXPRESSION = PATTERN_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Regular Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REGULAR_EXPRESSION_FEATURE_COUNT = PATTERN_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.impl.AttributeReferenceImpl
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getAttributeReference()
     * @generated
     */
    int ATTRIBUTE_REFERENCE = 3;

    /**
     * The feature id for the '<em><b>Referenced Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE = PATTERN_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Attribute Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_REFERENCE_FEATURE_COUNT = PATTERN_COMPONENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.pattern.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.pattern.impl.ComponentReferenceImpl
     * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getComponentReference()
     * @generated
     */
    int COMPONENT_REFERENCE = 4;

    /**
     * The feature id for the '<em><b>Referenced Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_REFERENCE__REFERENCED_COMPONENT = PATTERN_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Component Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_REFERENCE_FEATURE_COUNT = PATTERN_COMPONENT_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.pattern.Pattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pattern</em>'.
     * @see org.talend.dataquality.domain.pattern.Pattern
     * @generated
     */
    EClass getPattern();

    /**
     * Returns the meta object for the containment reference list '{@link org.talend.dataquality.domain.pattern.Pattern#getComponents <em>Components</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Components</em>'.
     * @see org.talend.dataquality.domain.pattern.Pattern#getComponents()
     * @see #getPattern()
     * @generated
     */
    EReference getPattern_Components();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.pattern.PatternComponent <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see org.talend.dataquality.domain.pattern.PatternComponent
     * @generated
     */
    EClass getPatternComponent();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.pattern.RegularExpression <em>Regular Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Regular Expression</em>'.
     * @see org.talend.dataquality.domain.pattern.RegularExpression
     * @generated
     */
    EClass getRegularExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.talend.dataquality.domain.pattern.RegularExpression#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see org.talend.dataquality.domain.pattern.RegularExpression#getExpression()
     * @see #getRegularExpression()
     * @generated
     */
    EReference getRegularExpression_Expression();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.pattern.AttributeReference <em>Attribute Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Reference</em>'.
     * @see org.talend.dataquality.domain.pattern.AttributeReference
     * @generated
     */
    EClass getAttributeReference();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.domain.pattern.AttributeReference#getReferencedAttribute <em>Referenced Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referenced Attribute</em>'.
     * @see org.talend.dataquality.domain.pattern.AttributeReference#getReferencedAttribute()
     * @see #getAttributeReference()
     * @generated
     */
    EReference getAttributeReference_ReferencedAttribute();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.pattern.ComponentReference <em>Component Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component Reference</em>'.
     * @see org.talend.dataquality.domain.pattern.ComponentReference
     * @generated
     */
    EClass getComponentReference();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.domain.pattern.ComponentReference#getReferencedComponent <em>Referenced Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referenced Component</em>'.
     * @see org.talend.dataquality.domain.pattern.ComponentReference#getReferencedComponent()
     * @see #getComponentReference()
     * @generated
     */
    EReference getComponentReference_ReferencedComponent();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    PatternFactory getPatternFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.impl.PatternImpl <em>Pattern</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.impl.PatternImpl
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getPattern()
         * @generated
         */
        EClass PATTERN = eINSTANCE.getPattern();

        /**
         * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PATTERN__COMPONENTS = eINSTANCE.getPattern_Components();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.impl.PatternComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.impl.PatternComponentImpl
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getPatternComponent()
         * @generated
         */
        EClass PATTERN_COMPONENT = eINSTANCE.getPatternComponent();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.impl.RegularExpressionImpl <em>Regular Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.impl.RegularExpressionImpl
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getRegularExpression()
         * @generated
         */
        EClass REGULAR_EXPRESSION = eINSTANCE.getRegularExpression();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REGULAR_EXPRESSION__EXPRESSION = eINSTANCE.getRegularExpression_Expression();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.impl.AttributeReferenceImpl
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getAttributeReference()
         * @generated
         */
        EClass ATTRIBUTE_REFERENCE = eINSTANCE.getAttributeReference();

        /**
         * The meta object literal for the '<em><b>Referenced Attribute</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_REFERENCE__REFERENCED_ATTRIBUTE = eINSTANCE.getAttributeReference_ReferencedAttribute();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.pattern.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.pattern.impl.ComponentReferenceImpl
         * @see org.talend.dataquality.domain.pattern.impl.PatternPackageImpl#getComponentReference()
         * @generated
         */
        EClass COMPONENT_REFERENCE = eINSTANCE.getComponentReference();

        /**
         * The meta object literal for the '<em><b>Referenced Component</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT_REFERENCE__REFERENCED_COMPONENT = eINSTANCE.getComponentReference_ReferencedComponent();

    }

} //PatternPackage
