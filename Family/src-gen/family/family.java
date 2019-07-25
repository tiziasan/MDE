/**
 */
package family;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link family.family#getNumberOfComponents <em>Number Of Components</em>}</li>
 *   <li>{@link family.family#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see family.FamilyPackage#getfamily()
 * @model
 * @generated
 */
public interface family extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Number Of Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Components</em>' attribute.
	 * @see #setNumberOfComponents(int)
	 * @see family.FamilyPackage#getfamily_NumberOfComponents()
	 * @model
	 * @generated
	 */
	int getNumberOfComponents();

	/**
	 * Sets the value of the '{@link family.family#getNumberOfComponents <em>Number Of Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Components</em>' attribute.
	 * @see #getNumberOfComponents()
	 * @generated
	 */
	void setNumberOfComponents(int value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link family.Members}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see family.FamilyPackage#getfamily_Member()
	 * @model containment="true"
	 * @generated
	 */
	EList<Members> getMember();

} // family
