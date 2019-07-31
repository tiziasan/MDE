/**
 */
package editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link editor.Property#getDataType <em>Data Type</em>}</li>
 *   <li>{@link editor.Property#isIsCalculated <em>Is Calculated</em>}</li>
 *   <li>{@link editor.Property#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see editor.EditorPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link editor.PropertyTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see editor.PropertyTypes
	 * @see #setDataType(PropertyTypes)
	 * @see editor.EditorPackage#getProperty_DataType()
	 * @model required="true"
	 * @generated
	 */
	PropertyTypes getDataType();

	/**
	 * Sets the value of the '{@link editor.Property#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see editor.PropertyTypes
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(PropertyTypes value);

	/**
	 * Returns the value of the '<em><b>Is Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Calculated</em>' attribute.
	 * @see #setIsCalculated(boolean)
	 * @see editor.EditorPackage#getProperty_IsCalculated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsCalculated();

	/**
	 * Sets the value of the '{@link editor.Property#isIsCalculated <em>Is Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Calculated</em>' attribute.
	 * @see #isIsCalculated()
	 * @generated
	 */
	void setIsCalculated(boolean value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' reference list.
	 * The list contents are of type {@link editor.Formula}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' reference list.
	 * @see editor.EditorPackage#getProperty_Formula()
	 * @model
	 * @generated
	 */
	EList<Formula> getFormula();

} // Property
