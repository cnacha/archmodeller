/**
 */
package nz.auckland.arch.provider;

import java.util.Collection;
import java.util.List;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.CommunicationPort;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link nz.auckland.arch.CommunicationPort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationPortItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPortItemProvider(AdapterFactory adapterFactory) {
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
			addPortNumberPropertyDescriptor(object);
			addNodePropertyDescriptor(object);
			addNamedportPropertyDescriptor(object);
			addHasFirewallPropertyDescriptor(object);
			addHasAuthenticationPropertyDescriptor(object);
			addHasAuthorizationPropertyDescriptor(object);
			addHasInputSanitizationPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_CommunicationPort_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommunicationPort_name_feature",
								"_UI_CommunicationPort_type"),
						ArchPackage.Literals.COMMUNICATION_PORT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Port Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommunicationPort_portNumber_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommunicationPort_portNumber_feature",
								"_UI_CommunicationPort_type"),
						ArchPackage.Literals.COMMUNICATION_PORT__PORT_NUMBER, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommunicationPort_node_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommunicationPort_node_feature",
								"_UI_CommunicationPort_type"),
						ArchPackage.Literals.COMMUNICATION_PORT__NODE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Namedport feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamedportPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommunicationPort_namedport_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommunicationPort_namedport_feature",
								"_UI_CommunicationPort_type"),
						ArchPackage.Literals.COMMUNICATION_PORT__NAMEDPORT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Has Firewall feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasFirewallPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommunicationPort_hasFirewall_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommunicationPort_hasFirewall_feature",
								"_UI_CommunicationPort_type"),
						ArchPackage.Literals.COMMUNICATION_PORT__HAS_FIREWALL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Has Authentication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAuthenticationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationPort_hasAuthentication_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationPort_hasAuthentication_feature",
						"_UI_CommunicationPort_type"),
				ArchPackage.Literals.COMMUNICATION_PORT__HAS_AUTHENTICATION, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Has Authorization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasAuthorizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationPort_hasAuthorization_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationPort_hasAuthorization_feature",
						"_UI_CommunicationPort_type"),
				ArchPackage.Literals.COMMUNICATION_PORT__HAS_AUTHORIZATION, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Has Input Sanitization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasInputSanitizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationPort_hasInputSanitization_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationPort_hasInputSanitization_feature",
						"_UI_CommunicationPort_type"),
				ArchPackage.Literals.COMMUNICATION_PORT__HAS_INPUT_SANITIZATION, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CommunicationPort.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommunicationPort"));
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
		String label = ((CommunicationPort) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_CommunicationPort_type")
				: getString("_UI_CommunicationPort_type") + " " + label;
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

		switch (notification.getFeatureID(CommunicationPort.class)) {
		case ArchPackage.COMMUNICATION_PORT__NAME:
		case ArchPackage.COMMUNICATION_PORT__PORT_NUMBER:
		case ArchPackage.COMMUNICATION_PORT__HAS_FIREWALL:
		case ArchPackage.COMMUNICATION_PORT__HAS_AUTHENTICATION:
		case ArchPackage.COMMUNICATION_PORT__HAS_AUTHORIZATION:
		case ArchPackage.COMMUNICATION_PORT__HAS_INPUT_SANITIZATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
