/**
 */
package webapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webapp.WebPage#getContent <em>Content</em>}</li>
 *   <li>{@link webapp.WebPage#isOnpage <em>Onpage</em>}</li>
 * </ul>
 *
 * @see webapp.WebappPackage#getWebPage()
 * @model
 * @generated
 */
public interface WebPage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see webapp.WebappPackage#getWebPage_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link webapp.WebPage#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Onpage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onpage</em>' attribute.
	 * @see #setOnpage(boolean)
	 * @see webapp.WebappPackage#getWebPage_Onpage()
	 * @model
	 * @generated
	 */
	boolean isOnpage();

	/**
	 * Sets the value of the '{@link webapp.WebPage#isOnpage <em>Onpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onpage</em>' attribute.
	 * @see #isOnpage()
	 * @generated
	 */
	void setOnpage(boolean value);

} // WebPage
