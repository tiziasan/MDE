/**
 */
package mde.provider;

import java.util.Collection;
import java.util.List;

import mde.EditorSelector;
import mde.MDEFactory;
import mde.MDEPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mde.EditorSelector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EditorSelectorItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditorSelectorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MDEPackage.Literals.EDITOR_SELECTOR__ACTIONS);
			childrenFeatures.add(MDEPackage.Literals.EDITOR_SELECTOR__EVENTS);
			childrenFeatures.add(MDEPackage.Literals.EDITOR_SELECTOR__CONTEXTS);
			childrenFeatures.add(MDEPackage.Literals.EDITOR_SELECTOR__FORMULAS);
			childrenFeatures.add(MDEPackage.Literals.EDITOR_SELECTOR__EDITORS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EditorSelector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EditorSelector"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EditorSelector) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_EditorSelector_type")
				: getString("_UI_EditorSelector_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EditorSelector.class)) {
		case MDEPackage.EDITOR_SELECTOR__ACTIONS:
		case MDEPackage.EDITOR_SELECTOR__EVENTS:
		case MDEPackage.EDITOR_SELECTOR__CONTEXTS:
		case MDEPackage.EDITOR_SELECTOR__FORMULAS:
		case MDEPackage.EDITOR_SELECTOR__EDITORS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(MDEPackage.Literals.EDITOR_SELECTOR__ACTIONS,
				MDEFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(
				createChildParameter(MDEPackage.Literals.EDITOR_SELECTOR__EVENTS, MDEFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add(createChildParameter(MDEPackage.Literals.EDITOR_SELECTOR__CONTEXTS,
				MDEFactory.eINSTANCE.createContext()));

		newChildDescriptors.add(createChildParameter(MDEPackage.Literals.EDITOR_SELECTOR__FORMULAS,
				MDEFactory.eINSTANCE.createFormula()));

		newChildDescriptors.add(createChildParameter(MDEPackage.Literals.EDITOR_SELECTOR__EDITORS,
				MDEFactory.eINSTANCE.createEditor()));
	}

}
