/**
 */
package editor.impl;

import editor.Context;
import editor.Editor;
import editor.EditorPackage;
import editor.InteractionPosition;
import editor.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link editor.impl.ContextImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link editor.impl.ContextImpl#isComposed <em>Composed</em>}</li>
 *   <li>{@link editor.impl.ContextImpl#getNumberOfElements <em>Number Of Elements</em>}</li>
 *   <li>{@link editor.impl.ContextImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link editor.impl.ContextImpl#getInteractionPositions <em>Interaction Positions</em>}</li>
 *   <li>{@link editor.impl.ContextImpl#getEditors <em>Editors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends NamedElementImpl implements Context {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #isComposed() <em>Composed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComposed() <em>Composed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposed()
	 * @generated
	 * @ordered
	 */
	protected boolean composed = COMPOSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfElements() <em>Number Of Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfElements()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ELEMENTS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNumberOfElements() <em>Number Of Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfElements()
	 * @generated
	 * @ordered
	 */
	protected int numberOfElements = NUMBER_OF_ELEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> components;

	/**
	 * The cached value of the '{@link #getInteractionPositions() <em>Interaction Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionPosition> interactionPositions;

	/**
	 * The cached value of the '{@link #getEditors() <em>Editors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<Editor> editors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditorPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, EditorPackage.CONTEXT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isComposed() {
		return composed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComposed(boolean newComposed) {
		boolean oldComposed = composed;
		composed = newComposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CONTEXT__COMPOSED, oldComposed,
					composed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfElements() {
		return numberOfElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfElements(int newNumberOfElements) {
		int oldNumberOfElements = numberOfElements;
		numberOfElements = newNumberOfElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.CONTEXT__NUMBER_OF_ELEMENTS,
					oldNumberOfElements, numberOfElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Context> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<Context>(Context.class, this, EditorPackage.CONTEXT__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InteractionPosition> getInteractionPositions() {
		if (interactionPositions == null) {
			interactionPositions = new EObjectContainmentEList<InteractionPosition>(InteractionPosition.class, this,
					EditorPackage.CONTEXT__INTERACTION_POSITIONS);
		}
		return interactionPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Editor> getEditors() {
		if (editors == null) {
			editors = new EObjectResolvingEList<Editor>(Editor.class, this, EditorPackage.CONTEXT__EDITORS);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EditorPackage.CONTEXT__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case EditorPackage.CONTEXT__INTERACTION_POSITIONS:
			return ((InternalEList<?>) getInteractionPositions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EditorPackage.CONTEXT__PROPERTIES:
			return getProperties();
		case EditorPackage.CONTEXT__COMPOSED:
			return isComposed();
		case EditorPackage.CONTEXT__NUMBER_OF_ELEMENTS:
			return getNumberOfElements();
		case EditorPackage.CONTEXT__COMPONENTS:
			return getComponents();
		case EditorPackage.CONTEXT__INTERACTION_POSITIONS:
			return getInteractionPositions();
		case EditorPackage.CONTEXT__EDITORS:
			return getEditors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EditorPackage.CONTEXT__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case EditorPackage.CONTEXT__COMPOSED:
			setComposed((Boolean) newValue);
			return;
		case EditorPackage.CONTEXT__NUMBER_OF_ELEMENTS:
			setNumberOfElements((Integer) newValue);
			return;
		case EditorPackage.CONTEXT__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Context>) newValue);
			return;
		case EditorPackage.CONTEXT__INTERACTION_POSITIONS:
			getInteractionPositions().clear();
			getInteractionPositions().addAll((Collection<? extends InteractionPosition>) newValue);
			return;
		case EditorPackage.CONTEXT__EDITORS:
			getEditors().clear();
			getEditors().addAll((Collection<? extends Editor>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EditorPackage.CONTEXT__PROPERTIES:
			getProperties().clear();
			return;
		case EditorPackage.CONTEXT__COMPOSED:
			setComposed(COMPOSED_EDEFAULT);
			return;
		case EditorPackage.CONTEXT__NUMBER_OF_ELEMENTS:
			setNumberOfElements(NUMBER_OF_ELEMENTS_EDEFAULT);
			return;
		case EditorPackage.CONTEXT__COMPONENTS:
			getComponents().clear();
			return;
		case EditorPackage.CONTEXT__INTERACTION_POSITIONS:
			getInteractionPositions().clear();
			return;
		case EditorPackage.CONTEXT__EDITORS:
			getEditors().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EditorPackage.CONTEXT__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case EditorPackage.CONTEXT__COMPOSED:
			return composed != COMPOSED_EDEFAULT;
		case EditorPackage.CONTEXT__NUMBER_OF_ELEMENTS:
			return numberOfElements != NUMBER_OF_ELEMENTS_EDEFAULT;
		case EditorPackage.CONTEXT__COMPONENTS:
			return components != null && !components.isEmpty();
		case EditorPackage.CONTEXT__INTERACTION_POSITIONS:
			return interactionPositions != null && !interactionPositions.isEmpty();
		case EditorPackage.CONTEXT__EDITORS:
			return editors != null && !editors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (composed: ");
		result.append(composed);
		result.append(", numberOfElements: ");
		result.append(numberOfElements);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
