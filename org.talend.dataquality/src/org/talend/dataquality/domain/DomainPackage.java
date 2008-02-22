/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.talend.dataquality.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "domain";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://dataquality.domain";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dataquality.domain";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DomainPackage eINSTANCE = org.talend.dataquality.domain.impl.DomainPackageImpl.init();

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.impl.DomainImpl
     * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getDomain()
     * @generated
     */
    int DOMAIN = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__DATA_TYPE = 2;

    /**
     * The feature id for the '<em><b>Length Restriction</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__LENGTH_RESTRICTION = 3;

    /**
     * The feature id for the '<em><b>Ranges</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__RANGES = 4;

    /**
     * The feature id for the '<em><b>Patterns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN__PATTERNS = 5;

    /**
     * The number of structural features of the '<em>Domain</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOMAIN_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.impl.EnumerationRuleImpl <em>Enumeration Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.impl.EnumerationRuleImpl
     * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getEnumerationRule()
     * @generated
     */
    int ENUMERATION_RULE = 1;

    /**
     * The feature id for the '<em><b>Domain</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_RULE__DOMAIN = 0;

    /**
     * The feature id for the '<em><b>Enumeration</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_RULE__ENUMERATION = 1;

    /**
     * The number of structural features of the '<em>Enumeration Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_RULE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.impl.RangeRestrictionImpl <em>Range Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.impl.RangeRestrictionImpl
     * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getRangeRestriction()
     * @generated
     */
    int RANGE_RESTRICTION = 2;

    /**
     * The feature id for the '<em><b>Lower Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_RESTRICTION__LOWER_VALUE = 0;

    /**
     * The feature id for the '<em><b>Upper Value</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_RESTRICTION__UPPER_VALUE = 1;

    /**
     * The feature id for the '<em><b>Expressions</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_RESTRICTION__EXPRESSIONS = 2;

    /**
     * The number of structural features of the '<em>Range Restriction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RANGE_RESTRICTION_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.impl.LiteralValueImpl <em>Literal Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.impl.LiteralValueImpl
     * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getLiteralValue()
     * @generated
     */
    int LITERAL_VALUE = 3;

    /**
     * The feature id for the '<em><b>Encode Value Meaning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_VALUE__ENCODE_VALUE_MEANING = 0;

    /**
     * The feature id for the '<em><b>Indicator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_VALUE__INDICATOR = 1;

    /**
     * The number of structural features of the '<em>Literal Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LITERAL_VALUE_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.impl.LengthRestrictionImpl <em>Length Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.impl.LengthRestrictionImpl
     * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getLengthRestriction()
     * @generated
     */
    int LENGTH_RESTRICTION = 4;

    /**
     * The feature id for the '<em><b>Maximum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LENGTH_RESTRICTION__MAXIMUM = 0;

    /**
     * The feature id for the '<em><b>Minimum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LENGTH_RESTRICTION__MINIMUM = 1;

    /**
     * The number of structural features of the '<em>Length Restriction</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LENGTH_RESTRICTION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.impl.NumericValueImpl <em>Numeric Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.impl.NumericValueImpl
     * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getNumericValue()
     * @generated
     */
    int NUMERIC_VALUE = 5;

    /**
     * The feature id for the '<em><b>Encode Value Meaning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_VALUE__ENCODE_VALUE_MEANING = LITERAL_VALUE__ENCODE_VALUE_MEANING;

    /**
     * The feature id for the '<em><b>Indicator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_VALUE__INDICATOR = LITERAL_VALUE__INDICATOR;

    /**
     * The number of structural features of the '<em>Numeric Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_VALUE_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.impl.TextValueImpl <em>Text Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.impl.TextValueImpl
     * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getTextValue()
     * @generated
     */
    int TEXT_VALUE = 6;

    /**
     * The feature id for the '<em><b>Encode Value Meaning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_VALUE__ENCODE_VALUE_MEANING = LITERAL_VALUE__ENCODE_VALUE_MEANING;

    /**
     * The feature id for the '<em><b>Indicator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_VALUE__INDICATOR = LITERAL_VALUE__INDICATOR;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_VALUE__VALUE = LITERAL_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Text Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_VALUE_FEATURE_COUNT = LITERAL_VALUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.impl.IntegerValueImpl <em>Integer Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.impl.IntegerValueImpl
     * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getIntegerValue()
     * @generated
     */
    int INTEGER_VALUE = 7;

    /**
     * The feature id for the '<em><b>Encode Value Meaning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_VALUE__ENCODE_VALUE_MEANING = NUMERIC_VALUE__ENCODE_VALUE_MEANING;

    /**
     * The feature id for the '<em><b>Indicator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_VALUE__INDICATOR = NUMERIC_VALUE__INDICATOR;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_VALUE__VALUE = NUMERIC_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Integer Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INTEGER_VALUE_FEATURE_COUNT = NUMERIC_VALUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.impl.RealNumberValueImpl <em>Real Number Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.impl.RealNumberValueImpl
     * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getRealNumberValue()
     * @generated
     */
    int REAL_NUMBER_VALUE = 8;

    /**
     * The feature id for the '<em><b>Encode Value Meaning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_NUMBER_VALUE__ENCODE_VALUE_MEANING = NUMERIC_VALUE__ENCODE_VALUE_MEANING;

    /**
     * The feature id for the '<em><b>Indicator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_NUMBER_VALUE__INDICATOR = NUMERIC_VALUE__INDICATOR;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_NUMBER_VALUE__VALUE = NUMERIC_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Real Number Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REAL_NUMBER_VALUE_FEATURE_COUNT = NUMERIC_VALUE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.talend.dataquality.domain.impl.DateValueImpl <em>Date Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.talend.dataquality.domain.impl.DateValueImpl
     * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getDateValue()
     * @generated
     */
    int DATE_VALUE = 9;

    /**
     * The feature id for the '<em><b>Encode Value Meaning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_VALUE__ENCODE_VALUE_MEANING = NUMERIC_VALUE__ENCODE_VALUE_MEANING;

    /**
     * The feature id for the '<em><b>Indicator</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_VALUE__INDICATOR = NUMERIC_VALUE__INDICATOR;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_VALUE__VALUE = NUMERIC_VALUE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Date Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_VALUE_FEATURE_COUNT = NUMERIC_VALUE_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.Domain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Domain</em>'.
     * @see org.talend.dataquality.domain.Domain
     * @generated
     */
    EClass getDomain();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.domain.Domain#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.talend.dataquality.domain.Domain#getName()
     * @see #getDomain()
     * @generated
     */
    EAttribute getDomain_Name();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.domain.Domain#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.talend.dataquality.domain.Domain#getDescription()
     * @see #getDomain()
     * @generated
     */
    EAttribute getDomain_Description();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.domain.Domain#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Type</em>'.
     * @see org.talend.dataquality.domain.Domain#getDataType()
     * @see #getDomain()
     * @generated
     */
    EReference getDomain_DataType();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.domain.Domain#getLengthRestriction <em>Length Restriction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Length Restriction</em>'.
     * @see org.talend.dataquality.domain.Domain#getLengthRestriction()
     * @see #getDomain()
     * @generated
     */
    EReference getDomain_LengthRestriction();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.domain.Domain#getRanges <em>Ranges</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Ranges</em>'.
     * @see org.talend.dataquality.domain.Domain#getRanges()
     * @see #getDomain()
     * @generated
     */
    EReference getDomain_Ranges();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.domain.Domain#getPatterns <em>Patterns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Patterns</em>'.
     * @see org.talend.dataquality.domain.Domain#getPatterns()
     * @see #getDomain()
     * @generated
     */
    EReference getDomain_Patterns();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.EnumerationRule <em>Enumeration Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration Rule</em>'.
     * @see org.talend.dataquality.domain.EnumerationRule
     * @generated
     */
    EClass getEnumerationRule();

    /**
     * Returns the meta object for the reference list '{@link org.talend.dataquality.domain.EnumerationRule#getDomain <em>Domain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Domain</em>'.
     * @see org.talend.dataquality.domain.EnumerationRule#getDomain()
     * @see #getEnumerationRule()
     * @generated
     */
    EReference getEnumerationRule_Domain();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.domain.EnumerationRule#getEnumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Enumeration</em>'.
     * @see org.talend.dataquality.domain.EnumerationRule#getEnumeration()
     * @see #getEnumerationRule()
     * @generated
     */
    EReference getEnumerationRule_Enumeration();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.RangeRestriction <em>Range Restriction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Range Restriction</em>'.
     * @see org.talend.dataquality.domain.RangeRestriction
     * @generated
     */
    EClass getRangeRestriction();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.domain.RangeRestriction#getLowerValue <em>Lower Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Lower Value</em>'.
     * @see org.talend.dataquality.domain.RangeRestriction#getLowerValue()
     * @see #getRangeRestriction()
     * @generated
     */
    EReference getRangeRestriction_LowerValue();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.domain.RangeRestriction#getUpperValue <em>Upper Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Upper Value</em>'.
     * @see org.talend.dataquality.domain.RangeRestriction#getUpperValue()
     * @see #getRangeRestriction()
     * @generated
     */
    EReference getRangeRestriction_UpperValue();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.domain.RangeRestriction#getExpressions <em>Expressions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Expressions</em>'.
     * @see org.talend.dataquality.domain.RangeRestriction#getExpressions()
     * @see #getRangeRestriction()
     * @generated
     */
    EReference getRangeRestriction_Expressions();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.LiteralValue <em>Literal Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Literal Value</em>'.
     * @see org.talend.dataquality.domain.LiteralValue
     * @generated
     */
    EClass getLiteralValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.domain.LiteralValue#getEncodeValueMeaning <em>Encode Value Meaning</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Encode Value Meaning</em>'.
     * @see org.talend.dataquality.domain.LiteralValue#getEncodeValueMeaning()
     * @see #getLiteralValue()
     * @generated
     */
    EAttribute getLiteralValue_EncodeValueMeaning();

    /**
     * Returns the meta object for the reference '{@link org.talend.dataquality.domain.LiteralValue#getIndicator <em>Indicator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Indicator</em>'.
     * @see org.talend.dataquality.domain.LiteralValue#getIndicator()
     * @see #getLiteralValue()
     * @generated
     */
    EReference getLiteralValue_Indicator();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.LengthRestriction <em>Length Restriction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Length Restriction</em>'.
     * @see org.talend.dataquality.domain.LengthRestriction
     * @generated
     */
    EClass getLengthRestriction();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.domain.LengthRestriction#getMaximum <em>Maximum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maximum</em>'.
     * @see org.talend.dataquality.domain.LengthRestriction#getMaximum()
     * @see #getLengthRestriction()
     * @generated
     */
    EAttribute getLengthRestriction_Maximum();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.domain.LengthRestriction#getMinimum <em>Minimum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Minimum</em>'.
     * @see org.talend.dataquality.domain.LengthRestriction#getMinimum()
     * @see #getLengthRestriction()
     * @generated
     */
    EAttribute getLengthRestriction_Minimum();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.NumericValue <em>Numeric Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Numeric Value</em>'.
     * @see org.talend.dataquality.domain.NumericValue
     * @generated
     */
    EClass getNumericValue();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.TextValue <em>Text Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text Value</em>'.
     * @see org.talend.dataquality.domain.TextValue
     * @generated
     */
    EClass getTextValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.domain.TextValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.dataquality.domain.TextValue#getValue()
     * @see #getTextValue()
     * @generated
     */
    EAttribute getTextValue_Value();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.IntegerValue <em>Integer Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Integer Value</em>'.
     * @see org.talend.dataquality.domain.IntegerValue
     * @generated
     */
    EClass getIntegerValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.domain.IntegerValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.dataquality.domain.IntegerValue#getValue()
     * @see #getIntegerValue()
     * @generated
     */
    EAttribute getIntegerValue_Value();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.RealNumberValue <em>Real Number Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Real Number Value</em>'.
     * @see org.talend.dataquality.domain.RealNumberValue
     * @generated
     */
    EClass getRealNumberValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.domain.RealNumberValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.dataquality.domain.RealNumberValue#getValue()
     * @see #getRealNumberValue()
     * @generated
     */
    EAttribute getRealNumberValue_Value();

    /**
     * Returns the meta object for class '{@link org.talend.dataquality.domain.DateValue <em>Date Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Date Value</em>'.
     * @see org.talend.dataquality.domain.DateValue
     * @generated
     */
    EClass getDateValue();

    /**
     * Returns the meta object for the attribute '{@link org.talend.dataquality.domain.DateValue#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.talend.dataquality.domain.DateValue#getValue()
     * @see #getDateValue()
     * @generated
     */
    EAttribute getDateValue_Value();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DomainFactory getDomainFactory();

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
         * The meta object literal for the '{@link org.talend.dataquality.domain.impl.DomainImpl <em>Domain</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.impl.DomainImpl
         * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getDomain()
         * @generated
         */
        EClass DOMAIN = eINSTANCE.getDomain();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOMAIN__DESCRIPTION = eINSTANCE.getDomain_Description();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOMAIN__DATA_TYPE = eINSTANCE.getDomain_DataType();

        /**
         * The meta object literal for the '<em><b>Length Restriction</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOMAIN__LENGTH_RESTRICTION = eINSTANCE.getDomain_LengthRestriction();

        /**
         * The meta object literal for the '<em><b>Ranges</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOMAIN__RANGES = eINSTANCE.getDomain_Ranges();

        /**
         * The meta object literal for the '<em><b>Patterns</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOMAIN__PATTERNS = eINSTANCE.getDomain_Patterns();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.impl.EnumerationRuleImpl <em>Enumeration Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.impl.EnumerationRuleImpl
         * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getEnumerationRule()
         * @generated
         */
        EClass ENUMERATION_RULE = eINSTANCE.getEnumerationRule();

        /**
         * The meta object literal for the '<em><b>Domain</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION_RULE__DOMAIN = eINSTANCE.getEnumerationRule_Domain();

        /**
         * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION_RULE__ENUMERATION = eINSTANCE.getEnumerationRule_Enumeration();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.impl.RangeRestrictionImpl <em>Range Restriction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.impl.RangeRestrictionImpl
         * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getRangeRestriction()
         * @generated
         */
        EClass RANGE_RESTRICTION = eINSTANCE.getRangeRestriction();

        /**
         * The meta object literal for the '<em><b>Lower Value</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RANGE_RESTRICTION__LOWER_VALUE = eINSTANCE.getRangeRestriction_LowerValue();

        /**
         * The meta object literal for the '<em><b>Upper Value</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RANGE_RESTRICTION__UPPER_VALUE = eINSTANCE.getRangeRestriction_UpperValue();

        /**
         * The meta object literal for the '<em><b>Expressions</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RANGE_RESTRICTION__EXPRESSIONS = eINSTANCE.getRangeRestriction_Expressions();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.impl.LiteralValueImpl <em>Literal Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.impl.LiteralValueImpl
         * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getLiteralValue()
         * @generated
         */
        EClass LITERAL_VALUE = eINSTANCE.getLiteralValue();

        /**
         * The meta object literal for the '<em><b>Encode Value Meaning</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LITERAL_VALUE__ENCODE_VALUE_MEANING = eINSTANCE.getLiteralValue_EncodeValueMeaning();

        /**
         * The meta object literal for the '<em><b>Indicator</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LITERAL_VALUE__INDICATOR = eINSTANCE.getLiteralValue_Indicator();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.impl.LengthRestrictionImpl <em>Length Restriction</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.impl.LengthRestrictionImpl
         * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getLengthRestriction()
         * @generated
         */
        EClass LENGTH_RESTRICTION = eINSTANCE.getLengthRestriction();

        /**
         * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LENGTH_RESTRICTION__MAXIMUM = eINSTANCE.getLengthRestriction_Maximum();

        /**
         * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LENGTH_RESTRICTION__MINIMUM = eINSTANCE.getLengthRestriction_Minimum();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.impl.NumericValueImpl <em>Numeric Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.impl.NumericValueImpl
         * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getNumericValue()
         * @generated
         */
        EClass NUMERIC_VALUE = eINSTANCE.getNumericValue();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.impl.TextValueImpl <em>Text Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.impl.TextValueImpl
         * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getTextValue()
         * @generated
         */
        EClass TEXT_VALUE = eINSTANCE.getTextValue();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXT_VALUE__VALUE = eINSTANCE.getTextValue_Value();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.impl.IntegerValueImpl <em>Integer Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.impl.IntegerValueImpl
         * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getIntegerValue()
         * @generated
         */
        EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.impl.RealNumberValueImpl <em>Real Number Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.impl.RealNumberValueImpl
         * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getRealNumberValue()
         * @generated
         */
        EClass REAL_NUMBER_VALUE = eINSTANCE.getRealNumberValue();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REAL_NUMBER_VALUE__VALUE = eINSTANCE.getRealNumberValue_Value();

        /**
         * The meta object literal for the '{@link org.talend.dataquality.domain.impl.DateValueImpl <em>Date Value</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.talend.dataquality.domain.impl.DateValueImpl
         * @see org.talend.dataquality.domain.impl.DomainPackageImpl#getDateValue()
         * @generated
         */
        EClass DATE_VALUE = eINSTANCE.getDateValue();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATE_VALUE__VALUE = eINSTANCE.getDateValue_Value();

    }

} //DomainPackage
