/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.dataquality.domain;

import org.eclipse.emf.ecore.EObject;
import org.talend.dataquality.indicators.Indicator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.talend.dataquality.domain.LiteralValue#getEncodeValueMeaning <em>Encode Value Meaning</em>}</li>
 *   <li>{@link org.talend.dataquality.domain.LiteralValue#getIndicator <em>Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.talend.dataquality.domain.DomainPackage#getLiteralValue()
 * @model
 * @generated
 */
public interface LiteralValue extends EObject {
    /**
     * Returns the value of the '<em><b>Encode Value Meaning</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Encode Value Meaning</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Encode Value Meaning</em>' attribute.
     * @see #setEncodeValueMeaning(String)
     * @see org.talend.dataquality.domain.DomainPackage#getLiteralValue_EncodeValueMeaning()
     * @model
     * @generated
     */
    String getEncodeValueMeaning();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.LiteralValue#getEncodeValueMeaning <em>Encode Value Meaning</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Encode Value Meaning</em>' attribute.
     * @see #getEncodeValueMeaning()
     * @generated
     */
    void setEncodeValueMeaning(String value);

    /**
     * Returns the value of the '<em><b>Indicator</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.talend.dataquality.indicators.Indicator#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Indicator</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indicator</em>' reference.
     * @see #setIndicator(Indicator)
     * @see org.talend.dataquality.domain.DomainPackage#getLiteralValue_Indicator()
     * @see org.talend.dataquality.indicators.Indicator#getValue
     * @model opposite="value"
     * @generated
     */
    Indicator getIndicator();

    /**
     * Sets the value of the '{@link org.talend.dataquality.domain.LiteralValue#getIndicator <em>Indicator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Indicator</em>' reference.
     * @see #getIndicator()
     * @generated
     */
    void setIndicator(Indicator value);

} // LiteralValue
