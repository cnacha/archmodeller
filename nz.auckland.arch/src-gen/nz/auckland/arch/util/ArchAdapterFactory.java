/**
 */
package nz.auckland.arch.util;

import nz.auckland.arch.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nz.auckland.arch.ArchPackage
 * @generated
 */
public class ArchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArchPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchSwitch<Adapter> modelSwitch = new ArchSwitch<Adapter>() {
		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseDesignModel(DesignModel object) {
			return createDesignModelAdapter();
		}

		@Override
		public Adapter caseConnector(Connector object) {
			return createConnectorAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseChannel(Channel object) {
			return createChannelAdapter();
		}

		@Override
		public Adapter caseRoleType(RoleType object) {
			return createRoleTypeAdapter();
		}

		@Override
		public Adapter caseConnectorType(ConnectorType object) {
			return createConnectorTypeAdapter();
		}

		@Override
		public Adapter caseComponentType(ComponentType object) {
			return createComponentTypeAdapter();
		}

		@Override
		public Adapter casePortType(PortType object) {
			return createPortTypeAdapter();
		}

		@Override
		public Adapter caseArchStyle(ArchStyle object) {
			return createArchStyleAdapter();
		}

		@Override
		public Adapter caseBehaviourProperty(BehaviourProperty object) {
			return createBehaviourPropertyAdapter();
		}

		@Override
		public Adapter caseLTLExpr(LTLExpr object) {
			return createLTLExprAdapter();
		}

		@Override
		public Adapter caseLTLNestedExpr(LTLNestedExpr object) {
			return createLTLNestedExprAdapter();
		}

		@Override
		public Adapter caseLTLRegularExpr(LTLRegularExpr object) {
			return createLTLRegularExprAdapter();
		}

		@Override
		public Adapter caseVerificationProperty(VerificationProperty object) {
			return createVerificationPropertyAdapter();
		}

		@Override
		public Adapter caseStructuralProperty(StructuralProperty object) {
			return createStructuralPropertyAdapter();
		}

		@Override
		public Adapter caseDevice(Device object) {
			return createDeviceAdapter();
		}

		@Override
		public Adapter caseExecutionEnvironment(ExecutionEnvironment object) {
			return createExecutionEnvironmentAdapter();
		}

		@Override
		public Adapter caseCommunicationLink(CommunicationLink object) {
			return createCommunicationLinkAdapter();
		}

		@Override
		public Adapter caseCommunicationPort(CommunicationPort object) {
			return createCommunicationPortAdapter();
		}

		@Override
		public Adapter caseOntologyLabel(OntologyLabel object) {
			return createOntologyLabelAdapter();
		}

		@Override
		public Adapter caseMigrationModel(MigrationModel object) {
			return createMigrationModelAdapter();
		}

		@Override
		public Adapter caseInterimModel(InterimModel object) {
			return createInterimModelAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.DesignModel <em>Design Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.DesignModel
	 * @generated
	 */
	public Adapter createDesignModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.Channel
	 * @generated
	 */
	public Adapter createChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.RoleType
	 * @generated
	 */
	public Adapter createRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.ArchStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.ArchStyle
	 * @generated
	 */
	public Adapter createArchStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.BehaviourProperty <em>Behaviour Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.BehaviourProperty
	 * @generated
	 */
	public Adapter createBehaviourPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.LTLExpr <em>LTL Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.LTLExpr
	 * @generated
	 */
	public Adapter createLTLExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.LTLNestedExpr <em>LTL Nested Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.LTLNestedExpr
	 * @generated
	 */
	public Adapter createLTLNestedExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.LTLRegularExpr <em>LTL Regular Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.LTLRegularExpr
	 * @generated
	 */
	public Adapter createLTLRegularExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.VerificationProperty <em>Verification Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.VerificationProperty
	 * @generated
	 */
	public Adapter createVerificationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.StructuralProperty <em>Structural Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.StructuralProperty
	 * @generated
	 */
	public Adapter createStructuralPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.ExecutionEnvironment
	 * @generated
	 */
	public Adapter createExecutionEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.CommunicationLink <em>Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.CommunicationLink
	 * @generated
	 */
	public Adapter createCommunicationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.CommunicationPort <em>Communication Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.CommunicationPort
	 * @generated
	 */
	public Adapter createCommunicationPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.OntologyLabel <em>Ontology Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.OntologyLabel
	 * @generated
	 */
	public Adapter createOntologyLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.MigrationModel <em>Migration Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.MigrationModel
	 * @generated
	 */
	public Adapter createMigrationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nz.auckland.arch.InterimModel <em>Interim Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nz.auckland.arch.InterimModel
	 * @generated
	 */
	public Adapter createInterimModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArchAdapterFactory
