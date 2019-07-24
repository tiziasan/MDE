/**
 */
package mde.impl;

import java.util.Collection;

import mde.Action;
import mde.Context;
import mde.Editor;
import mde.EditorSelector;
import mde.Event;
import mde.Formula;
import mde.MDEPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Editor Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mde.impl.EditorSelectorImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link mde.impl.EditorSelectorImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link mde.impl.EditorSelectorImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link mde.impl.EditorSelectorImpl#getFormulas <em>Formulas</em>}</li>
 *   <li>{@link mde.impl.EditorSelectorImpl#getEditors <em>Editors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditorSelectorImpl extends NamedElementImpl implements EditorSelector {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> contexts;

	/**
	 * The cached value of the '{@link #getFormulas() <em>Formulas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulas()
	 * @generated
	 * @ordered
	 */
	protected EList<Formula> formulas;

	/**
	 * The cached value of the '{@link #getEditors() <em>Editors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditors()
	 * @generated
	 * @ordered
	 */
	protected EList<Editor> editors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditorSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDEPackage.Literals.EDITOR_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, MDEPackage.EDITOR_SELECTOR__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, MDEPackage.EDITOR_SELECTOR__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Context> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<Context>(Context.class, this, MDEPackage.EDITOR_SELECTOR__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Formula> getFormulas() {
		if (formulas == null) {
			formulas = new EObjectContainmentEList<Formula>(Formula.class, this, MDEPackage.EDITOR_SELECTOR__FORMULAS);
		}
		return formulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Editor> getEditors() {
		if (editors == null) {
			editors = new EObjectContainmentEList<Editor>(Editor.class, this, MDEPackage.EDITOR_SELECTOR__EDITORS);
		}
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MDEPackage.EDITOR_SELECTOR__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case MDEPackage.EDITOR_SELECTOR__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
		case MDEPackage.EDITOR_SELECTOR__CONTEXTS:
			return ((InternalEList<?>) getContexts()).basicRemove(otherEnd, msgs);
		case MDEPackage.EDITOR_SELECTOR__FORMULAS:
			return ((InternalEList<?>) getFormulas()).basicRemove(otherEnd, msgs);
		case MDEPackage.EDITOR_SELECTOR__EDITORS:
			return ((InternalEList<?>) getEditors()).basicRemove(otherEnd, msgs);
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
		case MDEPackage.EDITOR_SELECTOR__ACTIONS:
			return getActions();
		case MDEPackage.EDITOR_SELECTOR__EVENTS:
			return getEvents();
		case MDEPackage.EDITOR_SELECTOR__CONTEXTS:
			return getContexts();
		case MDEPackage.EDITOR_SELECTOR__FORMULAS:
			return getFormulas();
		case MDEPackage.EDITOR_SELECTOR__EDITORS:
			return getEditors();
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
		case MDEPackage.EDITOR_SELECTOR__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case MDEPackage.EDITOR_SELECTOR__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case MDEPackage.EDITOR_SELECTOR__CONTEXTS:
			getContexts().clear();
			getContexts().addAll((Collection<? extends Context>) newValue);
			return;
		case MDEPackage.EDITOR_SELECTOR__FORMULAS:
			getFormulas().clear();
			getFormulas().addAll((Collection<? extends Formula>) newValue);
			return;
		case MDEPackage.EDITOR_SELECTOR__EDITORS:
			getEditors().clear();
			getEditors().addAll((Collection<? extends Editor>) newValue);
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
		case MDEPackage.EDITOR_SELECTOR__ACTIONS:
			getActions().clear();
			return;
		case MDEPackage.EDITOR_SELECTOR__EVENTS:
			getEvents().clear();
			return;
		case MDEPackage.EDITOR_SELECTOR__CONTEXTS:
			getContexts().clear();
			return;
		case MDEPackage.EDITOR_SELECTOR__FORMULAS:
			getFormulas().clear();
			return;
		case MDEPackage.EDITOR_SELECTOR__EDITORS:
			getEditors().clear();
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
		case MDEPackage.EDITOR_SELECTOR__ACTIONS:
			return actions != null && !actions.isEmpty();
		case MDEPackage.EDITOR_SELECTOR__EVENTS:
			return events != null && !events.isEmpty();
		case MDEPackage.EDITOR_SELECTOR__CONTEXTS:
			return contexts != null && !contexts.isEmpty();
		case MDEPackage.EDITOR_SELECTOR__FORMULAS:
			return formulas != null && !formulas.isEmpty();
		case MDEPackage.EDITOR_SELECTOR__EDITORS:
			return editors != null && !editors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EditorSelectorImpl
