/**
 */
package it.univaq.disim.mde.editor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.disim.mde.editor.EditorPackage
 * @generated
 */
public interface EditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditorFactory eINSTANCE = it.univaq.disim.mde.editor.impl.EditorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selector</em>'.
	 * @generated
	 */
	EditorSelector createEditorSelector();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Interaction Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Position</em>'.
	 * @generated
	 */
	InteractionPosition createInteractionPosition();

	/**
	 * Returns a new object of class '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formula</em>'.
	 * @generated
	 */
	Formula createFormula();

	/**
	 * Returns a new object of class '<em>Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editor</em>'.
	 * @generated
	 */
	Editor createEditor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EditorPackage getEditorPackage();

} //EditorFactory
