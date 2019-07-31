/**
 */
package it.univaq.disim.mde.editor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.editor.Event#getType <em>Type</em>}</li>
 *   <li>{@link it.univaq.disim.mde.editor.Event#getEventPosition <em>Event Position</em>}</li>
 *   <li>{@link it.univaq.disim.mde.editor.Event#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.editor.EditorPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see it.univaq.disim.mde.editor.EditorPackage#getEvent_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.editor.Event#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Event Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Position</em>' reference.
	 * @see #setEventPosition(InteractionPosition)
	 * @see it.univaq.disim.mde.editor.EditorPackage#getEvent_EventPosition()
	 * @model required="true"
	 * @generated
	 */
	InteractionPosition getEventPosition();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.editor.Event#getEventPosition <em>Event Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Position</em>' reference.
	 * @see #getEventPosition()
	 * @generated
	 */
	void setEventPosition(InteractionPosition value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see it.univaq.disim.mde.editor.EditorPackage#getEvent_Context()
	 * @model required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.editor.Event#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // Event
