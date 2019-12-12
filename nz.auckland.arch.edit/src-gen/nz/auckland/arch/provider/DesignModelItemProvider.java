/**
 */
package nz.auckland.arch.provider;

import java.util.Collection;
import java.util.List;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.DesignModel;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link nz.auckland.arch.DesignModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DesignModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignModelItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DesignModel_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DesignModel_name_feature",
								"_UI_DesignModel_type"),
						ArchPackage.Literals.DESIGN_MODEL__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(ArchPackage.Literals.DESIGN_MODEL__COMPONENT);
			childrenFeatures.add(ArchPackage.Literals.DESIGN_MODEL__CONNECTOR);
			childrenFeatures.add(ArchPackage.Literals.DESIGN_MODEL__ARCHSTYLE);
			childrenFeatures.add(ArchPackage.Literals.DESIGN_MODEL__VERIFY_PROPERTY);
			childrenFeatures.add(ArchPackage.Literals.DESIGN_MODEL__HOST);
			childrenFeatures.add(ArchPackage.Literals.DESIGN_MODEL__LINK);
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
	 * This returns DesignModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DesignModel"));
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
		String label = ((DesignModel) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_DesignModel_type")
				: getString("_UI_DesignModel_type") + " " + label;
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

		switch (notification.getFeatureID(DesignModel.class)) {
		case ArchPackage.DESIGN_MODEL__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ArchPackage.DESIGN_MODEL__COMPONENT:
		case ArchPackage.DESIGN_MODEL__CONNECTOR:
		case ArchPackage.DESIGN_MODEL__ARCHSTYLE:
		case ArchPackage.DESIGN_MODEL__VERIFY_PROPERTY:
		case ArchPackage.DESIGN_MODEL__HOST:
		case ArchPackage.DESIGN_MODEL__LINK:
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

		newChildDescriptors.add(createChildParameter(ArchPackage.Literals.DESIGN_MODEL__COMPONENT,
				ArchFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add(createChildParameter(ArchPackage.Literals.DESIGN_MODEL__CONNECTOR,
				ArchFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add(createChildParameter(ArchPackage.Literals.DESIGN_MODEL__ARCHSTYLE,
				ArchFactory.eINSTANCE.createArchStyle()));

		newChildDescriptors.add(createChildParameter(ArchPackage.Literals.DESIGN_MODEL__VERIFY_PROPERTY,
				ArchFactory.eINSTANCE.createBehaviourProperty()));

		newChildDescriptors.add(createChildParameter(ArchPackage.Literals.DESIGN_MODEL__VERIFY_PROPERTY,
				ArchFactory.eINSTANCE.createStructuralProperty()));

		newChildDescriptors.add(
				createChildParameter(ArchPackage.Literals.DESIGN_MODEL__HOST, ArchFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add(createChildParameter(ArchPackage.Literals.DESIGN_MODEL__LINK,
				ArchFactory.eINSTANCE.createCommunicationLink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ArchEditPlugin.INSTANCE;
	}

}
