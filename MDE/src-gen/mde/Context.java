/**
 */
package mde;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mde.Context#getProperties <em>Properties</em>}</li>
 *   <li>{@link mde.Context#isComposed <em>Composed</em>}</li>
 *   <li>{@link mde.Context#getNumberOfElements <em>Number Of Elements</em>}</li>
 *   <li>{@link mde.Context#getComponents <em>Components</em>}</li>
 *   <li>{@link mde.Context#getInteractionPositions <em>Interaction Positions</em>}</li>
 *   <li>{@link mde.Context#getEditors <em>Editors</em>}</li>
 * </ul>
 *
 * @see mde.MdePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link mde.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see mde.MdePackage#getContext_Properties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Composed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed</em>' attribute.
	 * @see #setComposed(boolean)
	 * @see mde.MdePackage#getContext_Composed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isComposed();

	/**
	 * Sets the value of the '{@link mde.Context#isComposed <em>Composed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed</em>' attribute.
	 * @see #isComposed()
	 * @generated
	 */
	void setComposed(boolean value);

	/**
	 * Returns the value of the '<em><b>Number Of Elements</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Elements</em>' attribute.
	 * @see #setNumberOfElements(int)
	 * @see mde.MdePackage#getContext_NumberOfElements()
	 * @model default="1" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNumberOfElements();

	/**
	 * Sets the value of the '{@link mde.Context#getNumberOfElements <em>Number Of Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Elements</em>' attribute.
	 * @see #getNumberOfElements()
	 * @generated
	 */
	void setNumberOfElements(int value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link mde.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see mde.MdePackage#getContext_Components()
	 * @model
	 * @generated
	 */
	EList<Context> getComponents();

	/**
	 * Returns the value of the '<em><b>Interaction Positions</b></em>' containment reference list.
	 * The list contents are of type {@link mde.InteractionPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Positions</em>' containment reference list.
	 * @see mde.MdePackage#getContext_InteractionPositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionPosition> getInteractionPositions();

	/**
	 * Returns the value of the '<em><b>Editors</b></em>' reference list.
	 * The list contents are of type {@link mde.Editor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editors</em>' reference list.
	 * @see mde.MdePackage#getContext_Editors()
	 * @model required="true"
	 * @generated
	 */
	EList<Editor> getEditors();

} // Context
