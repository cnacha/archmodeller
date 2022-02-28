/**
 */
package nz.auckland.arch.provider;

import java.util.Collection;
import java.util.List;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.BehaviourProperty;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link nz.auckland.arch.BehaviourProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourPropertyItemProvider extends VerificationPropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourPropertyItemProvider(AdapterFactory adapterFactory) {
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

			addValidPropertyDescriptor(object);
			addCounterExamplePropertyDescriptor(object);
			addVisitedStatesPropertyDescriptor(object);
			addVerifyTimePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addTestportPropertyDescriptor(object);
			addTraceExamplePropertyDescriptor(object);
			addExprTextPropertyDescriptor(object);
			addConnectorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Valid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BehaviourProperty_valid_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BehaviourProperty_valid_feature",
								"_UI_BehaviourProperty_type"),
						ArchPackage.Literals.BEHAVIOUR_PROPERTY__VALID, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Counter Example feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCounterExamplePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BehaviourProperty_counterExample_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BehaviourProperty_counterExample_feature",
								"_UI_BehaviourProperty_type"),
						ArchPackage.Literals.BEHAVIOUR_PROPERTY__COUNTER_EXAMPLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Visited States feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisitedStatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BehaviourProperty_visitedStates_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BehaviourProperty_visitedStates_feature",
								"_UI_BehaviourProperty_type"),
						ArchPackage.Literals.BEHAVIOUR_PROPERTY__VISITED_STATES, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Verify Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerifyTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BehaviourProperty_verifyTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BehaviourProperty_verifyTime_feature",
								"_UI_BehaviourProperty_type"),
						ArchPackage.Literals.BEHAVIOUR_PROPERTY__VERIFY_TIME, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BehaviourProperty_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BehaviourProperty_type_feature",
								"_UI_BehaviourProperty_type"),
						ArchPackage.Literals.BEHAVIOUR_PROPERTY__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Testport feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTestportPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BehaviourProperty_testport_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BehaviourProperty_testport_feature",
								"_UI_BehaviourProperty_type"),
						ArchPackage.Literals.BEHAVIOUR_PROPERTY__TESTPORT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Trace Example feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraceExamplePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BehaviourProperty_traceExample_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BehaviourProperty_traceExample_feature",
								"_UI_BehaviourProperty_type"),
						ArchPackage.Literals.BEHAVIOUR_PROPERTY__TRACE_EXAMPLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expr Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExprTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BehaviourProperty_exprText_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BehaviourProperty_exprText_feature",
								"_UI_BehaviourProperty_type"),
						ArchPackage.Literals.BEHAVIOUR_PROPERTY__EXPR_TEXT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BehaviourProperty_connector_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BehaviourProperty_connector_feature",
								"_UI_BehaviourProperty_type"),
						ArchPackage.Literals.BEHAVIOUR_PROPERTY__CONNECTOR, true, false, true, null, null, null));
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
			childrenFeatures.add(ArchPackage.Literals.BEHAVIOUR_PROPERTY__LTLEXPR);
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
	 * This returns BehaviourProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BehaviourProperty"));
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
		String label = ((BehaviourProperty) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BehaviourProperty_type")
				: getString("_UI_BehaviourProperty_type") + " " + label;
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

		switch (notification.getFeatureID(BehaviourProperty.class)) {
		case ArchPackage.BEHAVIOUR_PROPERTY__VALID:
		case ArchPackage.BEHAVIOUR_PROPERTY__COUNTER_EXAMPLE:
		case ArchPackage.BEHAVIOUR_PROPERTY__VISITED_STATES:
		case ArchPackage.BEHAVIOUR_PROPERTY__VERIFY_TIME:
		case ArchPackage.BEHAVIOUR_PROPERTY__TYPE:
		case ArchPackage.BEHAVIOUR_PROPERTY__TRACE_EXAMPLE:
		case ArchPackage.BEHAVIOUR_PROPERTY__EXPR_TEXT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__LTLEXPR:
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

		newChildDescriptors.add(createChildParameter(ArchPackage.Literals.BEHAVIOUR_PROPERTY__LTLEXPR,
				ArchFactory.eINSTANCE.createLTLNestedExpr()));

		newChildDescriptors.add(createChildParameter(ArchPackage.Literals.BEHAVIOUR_PROPERTY__LTLEXPR,
				ArchFactory.eINSTANCE.createLTLRegularExpr()));
	}

}
