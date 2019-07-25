/**
 */
package family;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Members</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link family.Members#getPerson <em>Person</em>}</li>
 *   <li>{@link family.Members#isHasChild <em>Has Child</em>}</li>
 * </ul>
 *
 * @see family.FamilyPackage#getMembers()
 * @model
 * @generated
 */
public interface Members extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see family.FamilyPackage#getMembers_Person()
	 * @model required="true"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link family.Members#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Has Child</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Child</em>' attribute.
	 * @see #setHasChild(boolean)
	 * @see family.FamilyPackage#getMembers_HasChild()
	 * @model
	 * @generated
	 */
	boolean isHasChild();

	/**
	 * Sets the value of the '{@link family.Members#isHasChild <em>Has Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Child</em>' attribute.
	 * @see #isHasChild()
	 * @generated
	 */
	void setHasChild(boolean value);

} // Members
