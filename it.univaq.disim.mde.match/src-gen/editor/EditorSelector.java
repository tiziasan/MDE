/**
 */
package editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link editor.EditorSelector#getActions <em>Actions</em>}</li>
 *   <li>{@link editor.EditorSelector#getEvents <em>Events</em>}</li>
 *   <li>{@link editor.EditorSelector#getContexts <em>Contexts</em>}</li>
 *   <li>{@link editor.EditorSelector#getFormulas <em>Formulas</em>}</li>
 *   <li>{@link editor.EditorSelector#getEditors <em>Editors</em>}</li>
 * </ul>
 *
 * @see editor.EditorPackage#getEditorSelector()
 * @model
 * @generated
 */
public interface EditorSelector extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link editor.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see editor.EditorPackage#getEditorSelector_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link editor.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see editor.EditorPackage#getEditorSelector_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link editor.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see editor.EditorPackage#getEditorSelector_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link editor.Formula}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' containment reference list.
	 * @see editor.EditorPackage#getEditorSelector_Formulas()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Formula> getFormulas();

	/**
	 * Returns the value of the '<em><b>Editors</b></em>' containment reference list.
	 * The list contents are of type {@link editor.Editor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editors</em>' containment reference list.
	 * @see editor.EditorPackage#getEditorSelector_Editors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Editor> getEditors();

} // EditorSelector
