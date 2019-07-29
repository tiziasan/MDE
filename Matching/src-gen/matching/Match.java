/**
 */
package matching;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link matching.Match#getMetaclasses <em>Metaclasses</em>}</li>
 *   <li>{@link matching.Match#getContextShapes <em>Context Shapes</em>}</li>
 * </ul>
 *
 * @see matching.MatchingPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Metaclasses</b></em>' containment reference list.
	 * The list contents are of type {@link matching.Metaclass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclasses</em>' containment reference list.
	 * @see matching.MatchingPackage#getMatch_Metaclasses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metaclass> getMetaclasses();

	/**
	 * Returns the value of the '<em><b>Context Shapes</b></em>' containment reference list.
	 * The list contents are of type {@link matching.ContextShape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Shapes</em>' containment reference list.
	 * @see matching.MatchingPackage#getMatch_ContextShapes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextShape> getContextShapes();

} // Match
