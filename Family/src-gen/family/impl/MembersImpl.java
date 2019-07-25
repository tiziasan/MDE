/**
 */
package family.impl;

import family.FamilyPackage;
import family.Members;
import family.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Members</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link family.impl.MembersImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link family.impl.MembersImpl#isHasChild <em>Has Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MembersImpl extends NamedElementImpl implements Members {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The default value of the '{@link #isHasChild() <em>Has Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasChild()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_CHILD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasChild() <em>Has Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasChild()
	 * @generated
	 * @ordered
	 */
	protected boolean hasChild = HAS_CHILD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MembersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.MEMBERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject) person;
			person = (Person) eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.MEMBERS__PERSON, oldPerson,
							person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerson(Person newPerson) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.MEMBERS__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasChild() {
		return hasChild;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasChild(boolean newHasChild) {
		boolean oldHasChild = hasChild;
		hasChild = newHasChild;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.MEMBERS__HAS_CHILD, oldHasChild,
					hasChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FamilyPackage.MEMBERS__PERSON:
			if (resolve)
				return getPerson();
			return basicGetPerson();
		case FamilyPackage.MEMBERS__HAS_CHILD:
			return isHasChild();
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
		case FamilyPackage.MEMBERS__PERSON:
			setPerson((Person) newValue);
			return;
		case FamilyPackage.MEMBERS__HAS_CHILD:
			setHasChild((Boolean) newValue);
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
		case FamilyPackage.MEMBERS__PERSON:
			setPerson((Person) null);
			return;
		case FamilyPackage.MEMBERS__HAS_CHILD:
			setHasChild(HAS_CHILD_EDEFAULT);
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
		case FamilyPackage.MEMBERS__PERSON:
			return person != null;
		case FamilyPackage.MEMBERS__HAS_CHILD:
			return hasChild != HAS_CHILD_EDEFAULT;
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
		result.append(" (hasChild: ");
		result.append(hasChild);
		result.append(')');
		return result.toString();
	}

} //MembersImpl
