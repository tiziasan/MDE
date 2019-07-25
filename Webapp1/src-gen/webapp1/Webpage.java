/**
 */
package webapp1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Webpage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webapp1.Webpage#getContent <em>Content</em>}</li>
 *   <li>{@link webapp1.Webpage#isHomepage <em>Homepage</em>}</li>
 *   <li>{@link webapp1.Webpage#getShownBy <em>Shown By</em>}</li>
 * </ul>
 *
 * @see webapp1.Webapp1Package#getWebpage()
 * @model
 * @generated
 */
public interface Webpage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see webapp1.Webapp1Package#getWebpage_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link webapp1.Webpage#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Homepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homepage</em>' attribute.
	 * @see #setHomepage(boolean)
	 * @see webapp1.Webapp1Package#getWebpage_Homepage()
	 * @model
	 * @generated
	 */
	boolean isHomepage();

	/**
	 * Sets the value of the '{@link webapp1.Webpage#isHomepage <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homepage</em>' attribute.
	 * @see #isHomepage()
	 * @generated
	 */
	void setHomepage(boolean value);

	/**
	 * Returns the value of the '<em><b>Shown By</b></em>' reference list.
	 * The list contents are of type {@link webapp1.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shown By</em>' reference list.
	 * @see webapp1.Webapp1Package#getWebpage_ShownBy()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getShownBy();

} // Webpage
