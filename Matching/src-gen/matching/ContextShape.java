/**
 */
package matching;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link matching.ContextShape#getRepresents <em>Represents</em>}</li>
 * </ul>
 *
 * @see matching.MatchingPackage#getContextShape()
 * @model
 * @generated
 */
public interface ContextShape extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Represents</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represents</em>' reference.
	 * @see #setRepresents(Metaclass)
	 * @see matching.MatchingPackage#getContextShape_Represents()
	 * @model
	 * @generated
	 */
	Metaclass getRepresents();

	/**
	 * Sets the value of the '{@link matching.ContextShape#getRepresents <em>Represents</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represents</em>' reference.
	 * @see #getRepresents()
	 * @generated
	 */
	void setRepresents(Metaclass value);

} // ContextShape
