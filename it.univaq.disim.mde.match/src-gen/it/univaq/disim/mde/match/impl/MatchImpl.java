/**
 */
package it.univaq.disim.mde.match.impl;

import editor.Context;

import it.univaq.disim.mde.match.Match;
import it.univaq.disim.mde.match.MatchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.match.impl.MatchImpl#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link it.univaq.disim.mde.match.impl.MatchImpl#getShapes <em>Shapes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The cached value of the '{@link #getMetaclass() <em>Metaclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclass()
	 * @generated
	 * @ordered
	 */
	protected EClass metaclass;

	/**
	 * The cached value of the '{@link #getShapes() <em>Shapes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> shapes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MatchPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetaclass() {
		if (metaclass != null && metaclass.eIsProxy()) {
			InternalEObject oldMetaclass = (InternalEObject) metaclass;
			metaclass = (EClass) eResolveProxy(oldMetaclass);
			if (metaclass != oldMetaclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MatchPackage.MATCH__METACLASS,
							oldMetaclass, metaclass));
			}
		}
		return metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetMetaclass() {
		return metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaclass(EClass newMetaclass) {
		EClass oldMetaclass = metaclass;
		metaclass = newMetaclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MatchPackage.MATCH__METACLASS, oldMetaclass,
					metaclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Context> getShapes() {
		if (shapes == null) {
			shapes = new EObjectResolvingEList<Context>(Context.class, this, MatchPackage.MATCH__SHAPES);
		}
		return shapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MatchPackage.MATCH__METACLASS:
			if (resolve)
				return getMetaclass();
			return basicGetMetaclass();
		case MatchPackage.MATCH__SHAPES:
			return getShapes();
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
		case MatchPackage.MATCH__METACLASS:
			setMetaclass((EClass) newValue);
			return;
		case MatchPackage.MATCH__SHAPES:
			getShapes().clear();
			getShapes().addAll((Collection<? extends Context>) newValue);
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
		case MatchPackage.MATCH__METACLASS:
			setMetaclass((EClass) null);
			return;
		case MatchPackage.MATCH__SHAPES:
			getShapes().clear();
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
		case MatchPackage.MATCH__METACLASS:
			return metaclass != null;
		case MatchPackage.MATCH__SHAPES:
			return shapes != null && !shapes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatchImpl
