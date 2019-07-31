/**
 */
package it.univaq.disim.mde.match;

import editor.Context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link it.univaq.disim.mde.match.Match#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link it.univaq.disim.mde.match.Match#getShapes <em>Shapes</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.match.MatchPackage#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Metaclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass</em>' reference.
	 * @see #setMetaclass(EClass)
	 * @see it.univaq.disim.mde.match.MatchPackage#getMatch_Metaclass()
	 * @model
	 * @generated
	 */
	EClass getMetaclass();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.match.Match#getMetaclass <em>Metaclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaclass</em>' reference.
	 * @see #getMetaclass()
	 * @generated
	 */
	void setMetaclass(EClass value);

	/**
	 * Returns the value of the '<em><b>Shapes</b></em>' reference list.
	 * The list contents are of type {@link editor.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes</em>' reference list.
	 * @see it.univaq.disim.mde.match.MatchPackage#getMatch_Shapes()
	 * @model
	 * @generated
	 */
	EList<Context> getShapes();

} // Match
