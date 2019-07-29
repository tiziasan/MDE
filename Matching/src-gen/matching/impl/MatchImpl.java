/**
 */
package matching.impl;

import java.util.Collection;

import matching.ContextShape;
import matching.Match;
import matching.MatchingPackage;
import matching.Metaclass;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link matching.impl.MatchImpl#getMetaclasses <em>Metaclasses</em>}</li>
 *   <li>{@link matching.impl.MatchImpl#getContextShapes <em>Context Shapes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The cached value of the '{@link #getMetaclasses() <em>Metaclasses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Metaclass> metaclasses;

	/**
	 * The cached value of the '{@link #getContextShapes() <em>Context Shapes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextShape> contextShapes;

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
		return MatchingPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Metaclass> getMetaclasses() {
		if (metaclasses == null) {
			metaclasses = new EObjectContainmentEList<Metaclass>(Metaclass.class, this,
					MatchingPackage.MATCH__METACLASSES);
		}
		return metaclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextShape> getContextShapes() {
		if (contextShapes == null) {
			contextShapes = new EObjectContainmentEList<ContextShape>(ContextShape.class, this,
					MatchingPackage.MATCH__CONTEXT_SHAPES);
		}
		return contextShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MatchingPackage.MATCH__METACLASSES:
			return ((InternalEList<?>) getMetaclasses()).basicRemove(otherEnd, msgs);
		case MatchingPackage.MATCH__CONTEXT_SHAPES:
			return ((InternalEList<?>) getContextShapes()).basicRemove(otherEnd, msgs);
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
		case MatchingPackage.MATCH__METACLASSES:
			return getMetaclasses();
		case MatchingPackage.MATCH__CONTEXT_SHAPES:
			return getContextShapes();
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
		case MatchingPackage.MATCH__METACLASSES:
			getMetaclasses().clear();
			getMetaclasses().addAll((Collection<? extends Metaclass>) newValue);
			return;
		case MatchingPackage.MATCH__CONTEXT_SHAPES:
			getContextShapes().clear();
			getContextShapes().addAll((Collection<? extends ContextShape>) newValue);
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
		case MatchingPackage.MATCH__METACLASSES:
			getMetaclasses().clear();
			return;
		case MatchingPackage.MATCH__CONTEXT_SHAPES:
			getContextShapes().clear();
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
		case MatchingPackage.MATCH__METACLASSES:
			return metaclasses != null && !metaclasses.isEmpty();
		case MatchingPackage.MATCH__CONTEXT_SHAPES:
			return contextShapes != null && !contextShapes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatchImpl
