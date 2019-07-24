/**
 */
package mde.impl;

import java.util.Collection;

import mde.Formula;
import mde.MdePackage;
import mde.Property;
import mde.PropertyTypes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mde.impl.PropertyImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link mde.impl.PropertyImpl#isIsCalculated <em>Is Calculated</em>}</li>
 *   <li>{@link mde.impl.PropertyImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends NamedElementImpl implements Property {
	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyTypes DATA_TYPE_EDEFAULT = PropertyTypes.INTEGER;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected PropertyTypes dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCalculated() <em>Is Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCalculated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CALCULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCalculated() <em>Is Calculated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCalculated()
	 * @generated
	 * @ordered
	 */
	protected boolean isCalculated = IS_CALCULATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected EList<Formula> formula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MdePackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyTypes getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(PropertyTypes newDataType) {
		PropertyTypes oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdePackage.PROPERTY__DATA_TYPE, oldDataType,
					dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsCalculated() {
		return isCalculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCalculated(boolean newIsCalculated) {
		boolean oldIsCalculated = isCalculated;
		isCalculated = newIsCalculated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MdePackage.PROPERTY__IS_CALCULATED, oldIsCalculated,
					isCalculated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Formula> getFormula() {
		if (formula == null) {
			formula = new EObjectResolvingEList<Formula>(Formula.class, this, MdePackage.PROPERTY__FORMULA);
		}
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MdePackage.PROPERTY__DATA_TYPE:
			return getDataType();
		case MdePackage.PROPERTY__IS_CALCULATED:
			return isIsCalculated();
		case MdePackage.PROPERTY__FORMULA:
			return getFormula();
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
		case MdePackage.PROPERTY__DATA_TYPE:
			setDataType((PropertyTypes) newValue);
			return;
		case MdePackage.PROPERTY__IS_CALCULATED:
			setIsCalculated((Boolean) newValue);
			return;
		case MdePackage.PROPERTY__FORMULA:
			getFormula().clear();
			getFormula().addAll((Collection<? extends Formula>) newValue);
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
		case MdePackage.PROPERTY__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
			return;
		case MdePackage.PROPERTY__IS_CALCULATED:
			setIsCalculated(IS_CALCULATED_EDEFAULT);
			return;
		case MdePackage.PROPERTY__FORMULA:
			getFormula().clear();
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
		case MdePackage.PROPERTY__DATA_TYPE:
			return dataType != DATA_TYPE_EDEFAULT;
		case MdePackage.PROPERTY__IS_CALCULATED:
			return isCalculated != IS_CALCULATED_EDEFAULT;
		case MdePackage.PROPERTY__FORMULA:
			return formula != null && !formula.isEmpty();
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
		result.append(" (dataType: ");
		result.append(dataType);
		result.append(", isCalculated: ");
		result.append(isCalculated);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
