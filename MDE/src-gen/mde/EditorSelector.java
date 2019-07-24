/**
 */
package mde;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.EditorSelector#getActions <em>Actions</em>}</li>
 *   <li>{@link mde.EditorSelector#getEvents <em>Events</em>}</li>
 *   <li>{@link mde.EditorSelector#getContexts <em>Contexts</em>}</li>
 *   <li>{@link mde.EditorSelector#getFormulas <em>Formulas</em>}</li>
 *   <li>{@link mde.EditorSelector#getEditors <em>Editors</em>}</li>
 * </ul>
 *
 * @see mde.MDEPackage#getEditorSelector()
 * @model
 * @generated
 */
public interface EditorSelector extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link mde.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see mde.MDEPackage#getEditorSelector_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link mde.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see mde.MDEPackage#getEditorSelector_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link mde.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see mde.MDEPackage#getEditorSelector_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link mde.Formula}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' containment reference list.
	 * @see mde.MDEPackage#getEditorSelector_Formulas()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Formula> getFormulas();

	/**
	 * Returns the value of the '<em><b>Editors</b></em>' containment reference list.
	 * The list contents are of type {@link mde.Editor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editors</em>' containment reference list.
	 * @see mde.MDEPackage#getEditorSelector_Editors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Editor> getEditors();

} // EditorSelector
