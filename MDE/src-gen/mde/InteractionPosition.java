/**
 */
package mde;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.InteractionPosition#getElement <em>Element</em>}</li>
 *   <li>{@link mde.InteractionPosition#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see mde.MdePackage#getInteractionPosition()
 * @model
 * @generated
 */
public interface InteractionPosition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(String)
	 * @see mde.MdePackage#getInteractionPosition_Element()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getElement();

	/**
	 * Sets the value of the '{@link mde.InteractionPosition#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see mde.MdePackage#getInteractionPosition_Position()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link mde.InteractionPosition#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

} // InteractionPosition
