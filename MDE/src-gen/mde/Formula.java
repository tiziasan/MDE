/**
 */
package mde;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.Formula#getOperation <em>Operation</em>}</li>
 *   <li>{@link mde.Formula#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see mde.MDEPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see mde.MDEPackage#getFormula_Operation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link mde.Formula#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link mde.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see mde.MDEPackage#getFormula_Variables()
	 * @model
	 * @generated
	 */
	EList<Property> getVariables();

} // Formula
