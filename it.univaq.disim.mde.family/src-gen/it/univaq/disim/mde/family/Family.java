/**
 */
package it.univaq.disim.mde.family;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.univaq.disim.mde.family.Family#getNumberOfComponents <em>Number Of Components</em>}</li>
 *   <li>{@link it.univaq.disim.mde.family.Family#getMember <em>Member</em>}</li>
 *   <li>{@link it.univaq.disim.mde.family.Family#getFamilyIncome <em>Family Income</em>}</li>
 * </ul>
 *
 * @see it.univaq.disim.mde.family.FamilyPackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Number Of Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Components</em>' attribute.
	 * @see #setNumberOfComponents(int)
	 * @see it.univaq.disim.mde.family.FamilyPackage#getFamily_NumberOfComponents()
	 * @model
	 * @generated
	 */
	int getNumberOfComponents();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.family.Family#getNumberOfComponents <em>Number Of Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Components</em>' attribute.
	 * @see #getNumberOfComponents()
	 * @generated
	 */
	void setNumberOfComponents(int value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.disim.mde.family.Members}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see it.univaq.disim.mde.family.FamilyPackage#getFamily_Member()
	 * @model containment="true"
	 * @generated
	 */
	EList<Members> getMember();

	/**
	 * Returns the value of the '<em><b>Family Income</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Income</em>' attribute.
	 * @see #setFamilyIncome(double)
	 * @see it.univaq.disim.mde.family.FamilyPackage#getFamily_FamilyIncome()
	 * @model
	 * @generated
	 */
	double getFamilyIncome();

	/**
	 * Sets the value of the '{@link it.univaq.disim.mde.family.Family#getFamilyIncome <em>Family Income</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Income</em>' attribute.
	 * @see #getFamilyIncome()
	 * @generated
	 */
	void setFamilyIncome(double value);

} // Family
