/**
 */
package nz.auckland.arch.impl;

import nz.auckland.arch.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchFactoryImpl extends EFactoryImpl implements ArchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArchFactory init() {
		try {
			ArchFactory theArchFactory = (ArchFactory) EPackage.Registry.INSTANCE.getEFactory(ArchPackage.eNS_URI);
			if (theArchFactory != null) {
				return theArchFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ArchPackage.COMPONENT:
			return createComponent();
		case ArchPackage.DESIGN_MODEL:
			return createDesignModel();
		case ArchPackage.CONNECTOR:
			return createConnector();
		case ArchPackage.PORT:
			return createPort();
		case ArchPackage.EVENT:
			return createEvent();
		case ArchPackage.ROLE:
			return createRole();
		case ArchPackage.CHANNEL:
			return createChannel();
		case ArchPackage.ROLE_TYPE:
			return createRoleType();
		case ArchPackage.CONNECTOR_TYPE:
			return createConnectorType();
		case ArchPackage.COMPONENT_TYPE:
			return createComponentType();
		case ArchPackage.PORT_TYPE:
			return createPortType();
		case ArchPackage.ARCH_STYLE:
			return createArchStyle();
		case ArchPackage.BEHAVIOUR_PROPERTY:
			return createBehaviourProperty();
		case ArchPackage.LTL_NESTED_EXPR:
			return createLTLNestedExpr();
		case ArchPackage.LTL_REGULAR_EXPR:
			return createLTLRegularExpr();
		case ArchPackage.STRUCTURAL_PROPERTY:
			return createStructuralProperty();
		case ArchPackage.DEVICE:
			return createDevice();
		case ArchPackage.EXECUTION_ENVIRONMENT:
			return createExecutionEnvironment();
		case ArchPackage.COMMUNICATION_LINK:
			return createCommunicationLink();
		case ArchPackage.COMMUNICATION_PORT:
			return createCommunicationPort();
		case ArchPackage.ONTOLOGY_LABEL:
			return createOntologyLabel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ArchPackage.EXPR_OPERATOR:
			return createExprOperatorFromString(eDataType, initialValue);
		case ArchPackage.LTL_OPERATOR:
			return createLTLOperatorFromString(eDataType, initialValue);
		case ArchPackage.BEHAVIOUR_PROP_TYPE:
			return createBehaviourPropTypeFromString(eDataType, initialValue);
		case ArchPackage.NODE_TYPE:
			return createNodeTypeFromString(eDataType, initialValue);
		case ArchPackage.HOST_TYPE:
			return createHostTypeFromString(eDataType, initialValue);
		case ArchPackage.LINK_TYPE:
			return createLinkTypeFromString(eDataType, initialValue);
		case ArchPackage.NET_ACCESS_TYPE:
			return createNetAccessTypeFromString(eDataType, initialValue);
		case ArchPackage.NETWORK_TYPE:
			return createNetworkTypeFromString(eDataType, initialValue);
		case ArchPackage.CRITICAL_LEVEL:
			return createCriticalLevelFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ArchPackage.EXPR_OPERATOR:
			return convertExprOperatorToString(eDataType, instanceValue);
		case ArchPackage.LTL_OPERATOR:
			return convertLTLOperatorToString(eDataType, instanceValue);
		case ArchPackage.BEHAVIOUR_PROP_TYPE:
			return convertBehaviourPropTypeToString(eDataType, instanceValue);
		case ArchPackage.NODE_TYPE:
			return convertNodeTypeToString(eDataType, instanceValue);
		case ArchPackage.HOST_TYPE:
			return convertHostTypeToString(eDataType, instanceValue);
		case ArchPackage.LINK_TYPE:
			return convertLinkTypeToString(eDataType, instanceValue);
		case ArchPackage.NET_ACCESS_TYPE:
			return convertNetAccessTypeToString(eDataType, instanceValue);
		case ArchPackage.NETWORK_TYPE:
			return convertNetworkTypeToString(eDataType, instanceValue);
		case ArchPackage.CRITICAL_LEVEL:
			return convertCriticalLevelToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignModel createDesignModel() {
		DesignModelImpl designModel = new DesignModelImpl();
		return designModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType createConnectorType() {
		ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortType createPortType() {
		PortTypeImpl portType = new PortTypeImpl();
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchStyle createArchStyle() {
		ArchStyleImpl archStyle = new ArchStyleImpl();
		return archStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourProperty createBehaviourProperty() {
		BehaviourPropertyImpl behaviourProperty = new BehaviourPropertyImpl();
		return behaviourProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLNestedExpr createLTLNestedExpr() {
		LTLNestedExprImpl ltlNestedExpr = new LTLNestedExprImpl();
		return ltlNestedExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLRegularExpr createLTLRegularExpr() {
		LTLRegularExprImpl ltlRegularExpr = new LTLRegularExprImpl();
		return ltlRegularExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralProperty createStructuralProperty() {
		StructuralPropertyImpl structuralProperty = new StructuralPropertyImpl();
		return structuralProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment createExecutionEnvironment() {
		ExecutionEnvironmentImpl executionEnvironment = new ExecutionEnvironmentImpl();
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLink createCommunicationLink() {
		CommunicationLinkImpl communicationLink = new CommunicationLinkImpl();
		return communicationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPort createCommunicationPort() {
		CommunicationPortImpl communicationPort = new CommunicationPortImpl();
		return communicationPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyLabel createOntologyLabel() {
		OntologyLabelImpl ontologyLabel = new OntologyLabelImpl();
		return ontologyLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExprOperator createExprOperatorFromString(EDataType eDataType, String initialValue) {
		ExprOperator result = ExprOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExprOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLOperator createLTLOperatorFromString(EDataType eDataType, String initialValue) {
		LTLOperator result = LTLOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLTLOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourPropType createBehaviourPropTypeFromString(EDataType eDataType, String initialValue) {
		BehaviourPropType result = BehaviourPropType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBehaviourPropTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeType createNodeTypeFromString(EDataType eDataType, String initialValue) {
		NodeType result = NodeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostType createHostTypeFromString(EDataType eDataType, String initialValue) {
		HostType result = HostType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHostTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkTypeFromString(EDataType eDataType, String initialValue) {
		LinkType result = LinkType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetAccessType createNetAccessTypeFromString(EDataType eDataType, String initialValue) {
		NetAccessType result = NetAccessType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType createNetworkTypeFromString(EDataType eDataType, String initialValue) {
		NetworkType result = NetworkType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNetworkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalLevel createCriticalLevelFromString(EDataType eDataType, String initialValue) {
		CriticalLevel result = CriticalLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCriticalLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchPackage getArchPackage() {
		return (ArchPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchPackage getPackage() {
		return ArchPackage.eINSTANCE;
	}

} //ArchFactoryImpl
