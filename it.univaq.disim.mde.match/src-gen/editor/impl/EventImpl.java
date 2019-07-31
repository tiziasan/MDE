/**
 */
package editor.impl;

import editor.Context;
import editor.EditorPackage;
import editor.Event;
import editor.InteractionPosition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link editor.impl.EventImpl#getType <em>Type</em>}</li>
 *   <li>{@link editor.impl.EventImpl#getEventPosition <em>Event Position</em>}</li>
 *   <li>{@link editor.impl.EventImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends NamedElementImpl implements Event {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventPosition() <em>Event Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventPosition()
	 * @generated
	 * @ordered
	 */
	protected InteractionPosition eventPosition;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Context context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EditorPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EVENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionPosition getEventPosition() {
		if (eventPosition != null && eventPosition.eIsProxy()) {
			InternalEObject oldEventPosition = (InternalEObject) eventPosition;
			eventPosition = (InteractionPosition) eResolveProxy(oldEventPosition);
			if (eventPosition != oldEventPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EditorPackage.EVENT__EVENT_POSITION,
							oldEventPosition, eventPosition));
			}
		}
		return eventPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionPosition basicGetEventPosition() {
		return eventPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventPosition(InteractionPosition newEventPosition) {
		InteractionPosition oldEventPosition = eventPosition;
		eventPosition = newEventPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EVENT__EVENT_POSITION, oldEventPosition,
					eventPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject) context;
			context = (Context) eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EditorPackage.EVENT__CONTEXT, oldContext,
							context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Context newContext) {
		Context oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EditorPackage.EVENT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EditorPackage.EVENT__TYPE:
			return getType();
		case EditorPackage.EVENT__EVENT_POSITION:
			if (resolve)
				return getEventPosition();
			return basicGetEventPosition();
		case EditorPackage.EVENT__CONTEXT:
			if (resolve)
				return getContext();
			return basicGetContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EditorPackage.EVENT__TYPE:
			setType((String) newValue);
			return;
		case EditorPackage.EVENT__EVENT_POSITION:
			setEventPosition((InteractionPosition) newValue);
			return;
		case EditorPackage.EVENT__CONTEXT:
			setContext((Context) newValue);
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
		case EditorPackage.EVENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case EditorPackage.EVENT__EVENT_POSITION:
			setEventPosition((InteractionPosition) null);
			return;
		case EditorPackage.EVENT__CONTEXT:
			setContext((Context) null);
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
		case EditorPackage.EVENT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case EditorPackage.EVENT__EVENT_POSITION:
			return eventPosition != null;
		case EditorPackage.EVENT__CONTEXT:
			return context != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EventImpl
