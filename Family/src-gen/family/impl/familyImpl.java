/**
 */
package family.impl;

import family.FamilyPackage;
import family.Members;
import family.family;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link family.impl.familyImpl#getNumberOfComponents <em>Number Of Components</em>}</li>
 *   <li>{@link family.impl.familyImpl#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class familyImpl extends NamedElementImpl implements family {
	/**
	 * The default value of the '{@link #getNumberOfComponents() <em>Number Of Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfComponents()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_COMPONENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfComponents() <em>Number Of Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfComponents()
	 * @generated
	 * @ordered
	 */
	protected int numberOfComponents = NUMBER_OF_COMPONENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Members> member;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected familyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfComponents() {
		return numberOfComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfComponents(int newNumberOfComponents) {
		int oldNumberOfComponents = numberOfComponents;
		numberOfComponents = newNumberOfComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.FAMILY__NUMBER_OF_COMPONENTS,
					oldNumberOfComponents, numberOfComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Members> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<Members>(Members.class, this, FamilyPackage.FAMILY__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FamilyPackage.FAMILY__MEMBER:
			return ((InternalEList<?>) getMember()).basicRemove(otherEnd, msgs);
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
		case FamilyPackage.FAMILY__NUMBER_OF_COMPONENTS:
			return getNumberOfComponents();
		case FamilyPackage.FAMILY__MEMBER:
			return getMember();
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
		case FamilyPackage.FAMILY__NUMBER_OF_COMPONENTS:
			setNumberOfComponents((Integer) newValue);
			return;
		case FamilyPackage.FAMILY__MEMBER:
			getMember().clear();
			getMember().addAll((Collection<? extends Members>) newValue);
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
		case FamilyPackage.FAMILY__NUMBER_OF_COMPONENTS:
			setNumberOfComponents(NUMBER_OF_COMPONENTS_EDEFAULT);
			return;
		case FamilyPackage.FAMILY__MEMBER:
			getMember().clear();
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
		case FamilyPackage.FAMILY__NUMBER_OF_COMPONENTS:
			return numberOfComponents != NUMBER_OF_COMPONENTS_EDEFAULT;
		case FamilyPackage.FAMILY__MEMBER:
			return member != null && !member.isEmpty();
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
		result.append(" (numberOfComponents: ");
		result.append(numberOfComponents);
		result.append(')');
		return result.toString();
	}

} //familyImpl
