/**
 */
package it.univaq.disim.mde.match;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.match.Root#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.match.MatchPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.disim.mde.match.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see it.univaq.disim.mde.match.MatchPackage#getRoot_Matches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Match> getMatches();

} // Root
