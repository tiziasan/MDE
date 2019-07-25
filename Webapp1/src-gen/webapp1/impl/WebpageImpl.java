/**
 */
package webapp1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import webapp1.Entity;
import webapp1.Webapp1Package;
import webapp1.Webpage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Webpage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webapp1.impl.WebpageImpl#getContent <em>Content</em>}</li>
 *   <li>{@link webapp1.impl.WebpageImpl#isHomepage <em>Homepage</em>}</li>
 *   <li>{@link webapp1.impl.WebpageImpl#getShownBy <em>Shown By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebpageImpl extends NamedElementImpl implements Webpage {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isHomepage() <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHomepage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HOMEPAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHomepage() <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHomepage()
	 * @generated
	 * @ordered
	 */
	protected boolean homepage = HOMEPAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShownBy() <em>Shown By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShownBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> shownBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebpageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Webapp1Package.Literals.WEBPAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp1Package.WEBPAGE__CONTENT, oldContent,
					content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHomepage() {
		return homepage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomepage(boolean newHomepage) {
		boolean oldHomepage = homepage;
		homepage = newHomepage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Webapp1Package.WEBPAGE__HOMEPAGE, oldHomepage,
					homepage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getShownBy() {
		if (shownBy == null) {
			shownBy = new EObjectResolvingEList<Entity>(Entity.class, this, Webapp1Package.WEBPAGE__SHOWN_BY);
		}
		return shownBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Webapp1Package.WEBPAGE__CONTENT:
			return getContent();
		case Webapp1Package.WEBPAGE__HOMEPAGE:
			return isHomepage();
		case Webapp1Package.WEBPAGE__SHOWN_BY:
			return getShownBy();
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
		case Webapp1Package.WEBPAGE__CONTENT:
			setContent((String) newValue);
			return;
		case Webapp1Package.WEBPAGE__HOMEPAGE:
			setHomepage((Boolean) newValue);
			return;
		case Webapp1Package.WEBPAGE__SHOWN_BY:
			getShownBy().clear();
			getShownBy().addAll((Collection<? extends Entity>) newValue);
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
		case Webapp1Package.WEBPAGE__CONTENT:
			setContent(CONTENT_EDEFAULT);
			return;
		case Webapp1Package.WEBPAGE__HOMEPAGE:
			setHomepage(HOMEPAGE_EDEFAULT);
			return;
		case Webapp1Package.WEBPAGE__SHOWN_BY:
			getShownBy().clear();
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
		case Webapp1Package.WEBPAGE__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		case Webapp1Package.WEBPAGE__HOMEPAGE:
			return homepage != HOMEPAGE_EDEFAULT;
		case Webapp1Package.WEBPAGE__SHOWN_BY:
			return shownBy != null && !shownBy.isEmpty();
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
		result.append(" (content: ");
		result.append(content);
		result.append(", homepage: ");
		result.append(homepage);
		result.append(')');
		return result.toString();
	}

} //WebpageImpl
