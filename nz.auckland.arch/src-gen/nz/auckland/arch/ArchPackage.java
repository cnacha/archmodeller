/**
 */
package nz.auckland.arch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nz.auckland.arch.ArchFactory
 * @model kind="package"
 * @generated
 */
public interface ArchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/arch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchPackage eINSTANCE = nz.auckland.arch.impl.ArchPackageImpl.init();

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.ComponentImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORT = 2;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VALID = 3;

	/**
	 * The feature id for the '<em><b>Deploymentnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DEPLOYMENTNODE = 4;

	/**
	 * The feature id for the '<em><b>Critical Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CRITICAL_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Security Characters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SECURITY_CHARACTERS = 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.DesignModelImpl <em>Design Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.DesignModelImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getDesignModel()
	 * @generated
	 */
	int DESIGN_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Archstyle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__ARCHSTYLE = 2;

	/**
	 * The feature id for the '<em><b>Verify Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__VERIFY_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__NAME = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__HOST = 5;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__LINK = 6;

	/**
	 * The feature id for the '<em><b>Ontologylabel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL__ONTOLOGYLABEL = 7;

	/**
	 * The number of structural features of the '<em>Design Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Design Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.ConnectorImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ROLE = 2;

	/**
	 * The feature id for the '<em><b>Connectortype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTORTYPE = 3;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__VALID = 4;

	/**
	 * The feature id for the '<em><b>Communicationlink</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__COMMUNICATIONLINK = 5;

	/**
	 * The feature id for the '<em><b>Security Characters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SECURITY_CHARACTERS = 6;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.PortImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ROLE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__VALID = 4;

	/**
	 * The feature id for the '<em><b>Insecure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INSECURE = 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ATTRIBUTES = 6;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.EventImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.RoleImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Roletype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLETYPE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__VALID = 3;

	/**
	 * The feature id for the '<em><b>Next Role Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NEXT_ROLE_EXPR = 4;

	/**
	 * The feature id for the '<em><b>Operator Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OPERATOR_EXPR = 5;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONNECTOR = 6;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.ChannelImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NEXT = EVENT__NEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__TYPE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__BIND = EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.RoleTypeImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Porttype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__PORTTYPE = 2;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__VALID = 3;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.ConnectorTypeImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Roletype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ROLETYPE = 1;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__VALID = 2;

	/**
	 * The feature id for the '<em><b>Ea Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__EA_CONNECTOR = 3;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.ComponentTypeImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Porttype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PORTTYPE = 1;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__VALID = 2;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.PortTypeImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__VALID = 1;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.ArchStyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.ArchStyleImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getArchStyle()
	 * @generated
	 */
	int ARCH_STYLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_STYLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connectortype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_STYLE__CONNECTORTYPE = 1;

	/**
	 * The feature id for the '<em><b>Componenttype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_STYLE__COMPONENTTYPE = 2;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_STYLE__VALID = 3;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_STYLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.VerificationPropertyImpl <em>Verification Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.VerificationPropertyImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getVerificationProperty()
	 * @generated
	 */
	int VERIFICATION_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_PROPERTY__MODEL = 1;

	/**
	 * The number of structural features of the '<em>Verification Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Verification Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.BehaviourPropertyImpl <em>Behaviour Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.BehaviourPropertyImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getBehaviourProperty()
	 * @generated
	 */
	int BEHAVIOUR_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__NAME = VERIFICATION_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__MODEL = VERIFICATION_PROPERTY__MODEL;

	/**
	 * The feature id for the '<em><b>Ltlexpr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__LTLEXPR = VERIFICATION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__VALID = VERIFICATION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Counter Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__COUNTER_EXAMPLE = VERIFICATION_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visited States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__VISITED_STATES = VERIFICATION_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Verify Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__VERIFY_TIME = VERIFICATION_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__TYPE = VERIFICATION_PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Testport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__TESTPORT = VERIFICATION_PROPERTY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Trace Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__TRACE_EXAMPLE = VERIFICATION_PROPERTY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Expr Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__EXPR_TEXT = VERIFICATION_PROPERTY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY__CONNECTOR = VERIFICATION_PROPERTY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Behaviour Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY_FEATURE_COUNT = VERIFICATION_PROPERTY_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Behaviour Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_PROPERTY_OPERATION_COUNT = VERIFICATION_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.LTLExprImpl <em>LTL Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.LTLExprImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getLTLExpr()
	 * @generated
	 */
	int LTL_EXPR = 13;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_EXPR__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_EXPR__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Next Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_EXPR__NEXT_EXPR = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_EXPR__PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_EXPR__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_EXPR__PORT = 5;

	/**
	 * The number of structural features of the '<em>LTL Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_EXPR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>LTL Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.LTLNestedExprImpl <em>LTL Nested Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.LTLNestedExprImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getLTLNestedExpr()
	 * @generated
	 */
	int LTL_NESTED_EXPR = 14;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_NESTED_EXPR__EVENT = LTL_EXPR__EVENT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_NESTED_EXPR__OPERATOR = LTL_EXPR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Next Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_NESTED_EXPR__NEXT_EXPR = LTL_EXPR__NEXT_EXPR;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_NESTED_EXPR__PROPERTY = LTL_EXPR__PROPERTY;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_NESTED_EXPR__ROLE = LTL_EXPR__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_NESTED_EXPR__PORT = LTL_EXPR__PORT;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_NESTED_EXPR__EXPR = LTL_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LTL Nested Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_NESTED_EXPR_FEATURE_COUNT = LTL_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LTL Nested Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_NESTED_EXPR_OPERATION_COUNT = LTL_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.LTLRegularExprImpl <em>LTL Regular Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.LTLRegularExprImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getLTLRegularExpr()
	 * @generated
	 */
	int LTL_REGULAR_EXPR = 15;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_REGULAR_EXPR__EVENT = LTL_EXPR__EVENT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_REGULAR_EXPR__OPERATOR = LTL_EXPR__OPERATOR;

	/**
	 * The feature id for the '<em><b>Next Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_REGULAR_EXPR__NEXT_EXPR = LTL_EXPR__NEXT_EXPR;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_REGULAR_EXPR__PROPERTY = LTL_EXPR__PROPERTY;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_REGULAR_EXPR__ROLE = LTL_EXPR__ROLE;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_REGULAR_EXPR__PORT = LTL_EXPR__PORT;

	/**
	 * The number of structural features of the '<em>LTL Regular Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_REGULAR_EXPR_FEATURE_COUNT = LTL_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LTL Regular Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTL_REGULAR_EXPR_OPERATION_COUNT = LTL_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.StructuralPropertyImpl <em>Structural Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.StructuralPropertyImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getStructuralProperty()
	 * @generated
	 */
	int STRUCTURAL_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_PROPERTY__NAME = VERIFICATION_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_PROPERTY__MODEL = VERIFICATION_PROPERTY__MODEL;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_PROPERTY__RESULT = VERIFICATION_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structural Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_PROPERTY_FEATURE_COUNT = VERIFICATION_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Structural Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_PROPERTY_OPERATION_COUNT = VERIFICATION_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.DeviceImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 18;

	/**
	 * The feature id for the '<em><b>Net Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NET_ACCESS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NODE = 2;

	/**
	 * The feature id for the '<em><b>Host Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__HOST_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.ExecutionEnvironmentImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getExecutionEnvironment()
	 * @generated
	 */
	int EXECUTION_ENVIRONMENT = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT__PORT = 3;

	/**
	 * The number of structural features of the '<em>Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Execution Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.CommunicationLinkImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getCommunicationLink()
	 * @generated
	 */
	int COMMUNICATION_LINK = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__LINK_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Network Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__NETWORK_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Communication Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.CommunicationPortImpl <em>Communication Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.CommunicationPortImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getCommunicationPort()
	 * @generated
	 */
	int COMMUNICATION_PORT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT__PORT_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT__NODE = 2;

	/**
	 * The feature id for the '<em><b>Namedport</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT__NAMEDPORT = 3;

	/**
	 * The feature id for the '<em><b>Has Firewall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT__HAS_FIREWALL = 4;

	/**
	 * The feature id for the '<em><b>Has Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT__HAS_AUTHENTICATION = 5;

	/**
	 * The feature id for the '<em><b>Has Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT__HAS_AUTHORIZATION = 6;

	/**
	 * The feature id for the '<em><b>Has Input Sanitization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT__HAS_INPUT_SANITIZATION = 7;

	/**
	 * The number of structural features of the '<em>Communication Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Communication Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.OntologyLabelImpl <em>Ontology Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.OntologyLabelImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getOntologyLabel()
	 * @generated
	 */
	int ONTOLOGY_LABEL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LABEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LABEL__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LABEL__SUB_CLASS_OF = 2;

	/**
	 * The number of structural features of the '<em>Ontology Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LABEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ontology Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONTOLOGY_LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.MigrationModelImpl <em>Migration Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.MigrationModelImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getMigrationModel()
	 * @generated
	 */
	int MIGRATION_MODEL = 23;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_MODEL__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_MODEL__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Interimmodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_MODEL__INTERIMMODELS = 2;

	/**
	 * The number of structural features of the '<em>Migration Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Migration Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.impl.InterimModelImpl <em>Interim Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.impl.InterimModelImpl
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getInterimModel()
	 * @generated
	 */
	int INTERIM_MODEL = 24;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_MODEL__STEP = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_MODEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Next Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_MODEL__NEXT_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Designmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_MODEL__DESIGNMODEL = 3;

	/**
	 * The feature id for the '<em><b>Is Stable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_MODEL__IS_STABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_MODEL__NAME = 5;

	/**
	 * The number of structural features of the '<em>Interim Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Interim Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERIM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.ExprOperator <em>Expr Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.ExprOperator
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getExprOperator()
	 * @generated
	 */
	int EXPR_OPERATOR = 25;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.LTLOperator <em>LTL Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.LTLOperator
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getLTLOperator()
	 * @generated
	 */
	int LTL_OPERATOR = 26;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.BehaviourPropType <em>Behaviour Prop Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.BehaviourPropType
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getBehaviourPropType()
	 * @generated
	 */
	int BEHAVIOUR_PROP_TYPE = 27;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.NodeType <em>Node Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.NodeType
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getNodeType()
	 * @generated
	 */
	int NODE_TYPE = 28;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.HostType <em>Host Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.HostType
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getHostType()
	 * @generated
	 */
	int HOST_TYPE = 29;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.LinkType <em>Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.LinkType
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 30;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.NetAccessType <em>Net Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.NetAccessType
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getNetAccessType()
	 * @generated
	 */
	int NET_ACCESS_TYPE = 31;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.NetworkType <em>Network Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.NetworkType
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 32;

	/**
	 * The meta object id for the '{@link nz.auckland.arch.CriticalLevel <em>Critical Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nz.auckland.arch.CriticalLevel
	 * @see nz.auckland.arch.impl.ArchPackageImpl#getCriticalLevel()
	 * @generated
	 */
	int CRITICAL_LEVEL = 33;

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see nz.auckland.arch.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see nz.auckland.arch.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.Component#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see nz.auckland.arch.Component#getPort()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Port();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Component#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see nz.auckland.arch.Component#isValid()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Valid();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.Component#getDeploymentnode <em>Deploymentnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deploymentnode</em>'.
	 * @see nz.auckland.arch.Component#getDeploymentnode()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Deploymentnode();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Component#getCriticalLevel <em>Critical Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical Level</em>'.
	 * @see nz.auckland.arch.Component#getCriticalLevel()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_CriticalLevel();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Component#getSecurityCharacters <em>Security Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Characters</em>'.
	 * @see nz.auckland.arch.Component#getSecurityCharacters()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_SecurityCharacters();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.DesignModel <em>Design Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Model</em>'.
	 * @see nz.auckland.arch.DesignModel
	 * @generated
	 */
	EClass getDesignModel();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.DesignModel#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see nz.auckland.arch.DesignModel#getComponent()
	 * @see #getDesignModel()
	 * @generated
	 */
	EReference getDesignModel_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.DesignModel#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see nz.auckland.arch.DesignModel#getConnector()
	 * @see #getDesignModel()
	 * @generated
	 */
	EReference getDesignModel_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.DesignModel#getArchstyle <em>Archstyle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Archstyle</em>'.
	 * @see nz.auckland.arch.DesignModel#getArchstyle()
	 * @see #getDesignModel()
	 * @generated
	 */
	EReference getDesignModel_Archstyle();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.DesignModel#getVerifyProperty <em>Verify Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verify Property</em>'.
	 * @see nz.auckland.arch.DesignModel#getVerifyProperty()
	 * @see #getDesignModel()
	 * @generated
	 */
	EReference getDesignModel_VerifyProperty();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.DesignModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.DesignModel#getName()
	 * @see #getDesignModel()
	 * @generated
	 */
	EAttribute getDesignModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.DesignModel#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Host</em>'.
	 * @see nz.auckland.arch.DesignModel#getHost()
	 * @see #getDesignModel()
	 * @generated
	 */
	EReference getDesignModel_Host();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.DesignModel#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see nz.auckland.arch.DesignModel#getLink()
	 * @see #getDesignModel()
	 * @generated
	 */
	EReference getDesignModel_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.DesignModel#getOntologylabel <em>Ontologylabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ontologylabel</em>'.
	 * @see nz.auckland.arch.DesignModel#getOntologylabel()
	 * @see #getDesignModel()
	 * @generated
	 */
	EReference getDesignModel_Ontologylabel();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see nz.auckland.arch.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Connector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see nz.auckland.arch.Connector#getType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.Connector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see nz.auckland.arch.Connector#getRole()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Role();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.Connector#getConnectortype <em>Connectortype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectortype</em>'.
	 * @see nz.auckland.arch.Connector#getConnectortype()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Connectortype();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Connector#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see nz.auckland.arch.Connector#isValid()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Valid();

	/**
	 * Returns the meta object for the reference list '{@link nz.auckland.arch.Connector#getCommunicationlink <em>Communicationlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communicationlink</em>'.
	 * @see nz.auckland.arch.Connector#getCommunicationlink()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Communicationlink();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Connector#getSecurityCharacters <em>Security Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Characters</em>'.
	 * @see nz.auckland.arch.Connector#getSecurityCharacters()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_SecurityCharacters();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see nz.auckland.arch.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.Port#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see nz.auckland.arch.Port#getEvents()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Events();

	/**
	 * Returns the meta object for the reference list '{@link nz.auckland.arch.Port#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see nz.auckland.arch.Port#getRole()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Role();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see nz.auckland.arch.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Port#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see nz.auckland.arch.Port#isValid()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Valid();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Port#isInsecure <em>Insecure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insecure</em>'.
	 * @see nz.auckland.arch.Port#isInsecure()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Insecure();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Port#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributes</em>'.
	 * @see nz.auckland.arch.Port#getAttributes()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Attributes();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see nz.auckland.arch.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.Event#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see nz.auckland.arch.Event#getNext()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Next();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see nz.auckland.arch.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.Role#getRoletype <em>Roletype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roletype</em>'.
	 * @see nz.auckland.arch.Role#getRoletype()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Roletype();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Role#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see nz.auckland.arch.Role#getType()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Type();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Role#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see nz.auckland.arch.Role#isValid()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Valid();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.Role#getNextRoleExpr <em>Next Role Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Role Expr</em>'.
	 * @see nz.auckland.arch.Role#getNextRoleExpr()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_NextRoleExpr();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Role#getOperatorExpr <em>Operator Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator Expr</em>'.
	 * @see nz.auckland.arch.Role#getOperatorExpr()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_OperatorExpr();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.Role#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see nz.auckland.arch.Role#getConnector()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Connector();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see nz.auckland.arch.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Channel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see nz.auckland.arch.Channel#getType()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Type();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.Channel#getBind <em>Bind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bind</em>'.
	 * @see nz.auckland.arch.Channel#getBind()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Bind();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see nz.auckland.arch.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.RoleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.RoleType#getName()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.RoleType#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see nz.auckland.arch.RoleType#getEvent()
	 * @see #getRoleType()
	 * @generated
	 */
	EReference getRoleType_Event();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.RoleType#getPorttype <em>Porttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Porttype</em>'.
	 * @see nz.auckland.arch.RoleType#getPorttype()
	 * @see #getRoleType()
	 * @generated
	 */
	EReference getRoleType_Porttype();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.RoleType#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see nz.auckland.arch.RoleType#isValid()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Valid();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see nz.auckland.arch.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.ConnectorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.ConnectorType#getName()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.ConnectorType#getRoletype <em>Roletype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roletype</em>'.
	 * @see nz.auckland.arch.ConnectorType#getRoletype()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Roletype();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.ConnectorType#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see nz.auckland.arch.ConnectorType#isValid()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Valid();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.ConnectorType#getEaConnector <em>Ea Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ea Connector</em>'.
	 * @see nz.auckland.arch.ConnectorType#getEaConnector()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_EaConnector();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see nz.auckland.arch.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.ComponentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.ComponentType#getName()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.ComponentType#getPorttype <em>Porttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Porttype</em>'.
	 * @see nz.auckland.arch.ComponentType#getPorttype()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Porttype();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.ComponentType#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see nz.auckland.arch.ComponentType#isValid()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Valid();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see nz.auckland.arch.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.PortType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.PortType#getName()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Name();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.PortType#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see nz.auckland.arch.PortType#isValid()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Valid();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.ArchStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see nz.auckland.arch.ArchStyle
	 * @generated
	 */
	EClass getArchStyle();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.ArchStyle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.ArchStyle#getName()
	 * @see #getArchStyle()
	 * @generated
	 */
	EAttribute getArchStyle_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.ArchStyle#getConnectortype <em>Connectortype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectortype</em>'.
	 * @see nz.auckland.arch.ArchStyle#getConnectortype()
	 * @see #getArchStyle()
	 * @generated
	 */
	EReference getArchStyle_Connectortype();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.ArchStyle#getComponenttype <em>Componenttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Componenttype</em>'.
	 * @see nz.auckland.arch.ArchStyle#getComponenttype()
	 * @see #getArchStyle()
	 * @generated
	 */
	EReference getArchStyle_Componenttype();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.ArchStyle#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see nz.auckland.arch.ArchStyle#isValid()
	 * @see #getArchStyle()
	 * @generated
	 */
	EAttribute getArchStyle_Valid();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.BehaviourProperty <em>Behaviour Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour Property</em>'.
	 * @see nz.auckland.arch.BehaviourProperty
	 * @generated
	 */
	EClass getBehaviourProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.BehaviourProperty#getLtlexpr <em>Ltlexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ltlexpr</em>'.
	 * @see nz.auckland.arch.BehaviourProperty#getLtlexpr()
	 * @see #getBehaviourProperty()
	 * @generated
	 */
	EReference getBehaviourProperty_Ltlexpr();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.BehaviourProperty#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see nz.auckland.arch.BehaviourProperty#isValid()
	 * @see #getBehaviourProperty()
	 * @generated
	 */
	EAttribute getBehaviourProperty_Valid();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.BehaviourProperty#getCounterExample <em>Counter Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Example</em>'.
	 * @see nz.auckland.arch.BehaviourProperty#getCounterExample()
	 * @see #getBehaviourProperty()
	 * @generated
	 */
	EAttribute getBehaviourProperty_CounterExample();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.BehaviourProperty#getVisitedStates <em>Visited States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visited States</em>'.
	 * @see nz.auckland.arch.BehaviourProperty#getVisitedStates()
	 * @see #getBehaviourProperty()
	 * @generated
	 */
	EAttribute getBehaviourProperty_VisitedStates();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.BehaviourProperty#getVerifyTime <em>Verify Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Time</em>'.
	 * @see nz.auckland.arch.BehaviourProperty#getVerifyTime()
	 * @see #getBehaviourProperty()
	 * @generated
	 */
	EAttribute getBehaviourProperty_VerifyTime();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.BehaviourProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see nz.auckland.arch.BehaviourProperty#getType()
	 * @see #getBehaviourProperty()
	 * @generated
	 */
	EAttribute getBehaviourProperty_Type();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.BehaviourProperty#getTestport <em>Testport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testport</em>'.
	 * @see nz.auckland.arch.BehaviourProperty#getTestport()
	 * @see #getBehaviourProperty()
	 * @generated
	 */
	EReference getBehaviourProperty_Testport();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.BehaviourProperty#getTraceExample <em>Trace Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Example</em>'.
	 * @see nz.auckland.arch.BehaviourProperty#getTraceExample()
	 * @see #getBehaviourProperty()
	 * @generated
	 */
	EAttribute getBehaviourProperty_TraceExample();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.BehaviourProperty#getExprText <em>Expr Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr Text</em>'.
	 * @see nz.auckland.arch.BehaviourProperty#getExprText()
	 * @see #getBehaviourProperty()
	 * @generated
	 */
	EAttribute getBehaviourProperty_ExprText();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.BehaviourProperty#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see nz.auckland.arch.BehaviourProperty#getConnector()
	 * @see #getBehaviourProperty()
	 * @generated
	 */
	EReference getBehaviourProperty_Connector();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.LTLExpr <em>LTL Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTL Expr</em>'.
	 * @see nz.auckland.arch.LTLExpr
	 * @generated
	 */
	EClass getLTLExpr();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.LTLExpr#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see nz.auckland.arch.LTLExpr#getEvent()
	 * @see #getLTLExpr()
	 * @generated
	 */
	EReference getLTLExpr_Event();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.LTLExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see nz.auckland.arch.LTLExpr#getOperator()
	 * @see #getLTLExpr()
	 * @generated
	 */
	EAttribute getLTLExpr_Operator();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.LTLExpr#getNextExpr <em>Next Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Expr</em>'.
	 * @see nz.auckland.arch.LTLExpr#getNextExpr()
	 * @see #getLTLExpr()
	 * @generated
	 */
	EReference getLTLExpr_NextExpr();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.LTLExpr#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see nz.auckland.arch.LTLExpr#getProperty()
	 * @see #getLTLExpr()
	 * @generated
	 */
	EReference getLTLExpr_Property();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.LTLExpr#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see nz.auckland.arch.LTLExpr#getRole()
	 * @see #getLTLExpr()
	 * @generated
	 */
	EReference getLTLExpr_Role();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.LTLExpr#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see nz.auckland.arch.LTLExpr#getPort()
	 * @see #getLTLExpr()
	 * @generated
	 */
	EReference getLTLExpr_Port();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.LTLNestedExpr <em>LTL Nested Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTL Nested Expr</em>'.
	 * @see nz.auckland.arch.LTLNestedExpr
	 * @generated
	 */
	EClass getLTLNestedExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.LTLNestedExpr#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expr</em>'.
	 * @see nz.auckland.arch.LTLNestedExpr#getExpr()
	 * @see #getLTLNestedExpr()
	 * @generated
	 */
	EReference getLTLNestedExpr_Expr();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.LTLRegularExpr <em>LTL Regular Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTL Regular Expr</em>'.
	 * @see nz.auckland.arch.LTLRegularExpr
	 * @generated
	 */
	EClass getLTLRegularExpr();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.VerificationProperty <em>Verification Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Property</em>'.
	 * @see nz.auckland.arch.VerificationProperty
	 * @generated
	 */
	EClass getVerificationProperty();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.VerificationProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.VerificationProperty#getName()
	 * @see #getVerificationProperty()
	 * @generated
	 */
	EAttribute getVerificationProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.VerificationProperty#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see nz.auckland.arch.VerificationProperty#getModel()
	 * @see #getVerificationProperty()
	 * @generated
	 */
	EReference getVerificationProperty_Model();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.StructuralProperty <em>Structural Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Property</em>'.
	 * @see nz.auckland.arch.StructuralProperty
	 * @generated
	 */
	EClass getStructuralProperty();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.StructuralProperty#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see nz.auckland.arch.StructuralProperty#getResult()
	 * @see #getStructuralProperty()
	 * @generated
	 */
	EAttribute getStructuralProperty_Result();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see nz.auckland.arch.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Device#getNetAccessType <em>Net Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Access Type</em>'.
	 * @see nz.auckland.arch.Device#getNetAccessType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_NetAccessType();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.Device#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see nz.auckland.arch.Device#getNode()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Node();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.Device#getHostType <em>Host Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Type</em>'.
	 * @see nz.auckland.arch.Device#getHostType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_HostType();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.ExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Environment</em>'.
	 * @see nz.auckland.arch.ExecutionEnvironment
	 * @generated
	 */
	EClass getExecutionEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.ExecutionEnvironment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see nz.auckland.arch.ExecutionEnvironment#getType()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EAttribute getExecutionEnvironment_Type();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.ExecutionEnvironment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.ExecutionEnvironment#getName()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EAttribute getExecutionEnvironment_Name();

	/**
	 * Returns the meta object for the reference list '{@link nz.auckland.arch.ExecutionEnvironment#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see nz.auckland.arch.ExecutionEnvironment#getComponent()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EReference getExecutionEnvironment_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.ExecutionEnvironment#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see nz.auckland.arch.ExecutionEnvironment#getPort()
	 * @see #getExecutionEnvironment()
	 * @generated
	 */
	EReference getExecutionEnvironment_Port();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.CommunicationLink <em>Communication Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Link</em>'.
	 * @see nz.auckland.arch.CommunicationLink
	 * @generated
	 */
	EClass getCommunicationLink();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.CommunicationLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.CommunicationLink#getName()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EAttribute getCommunicationLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.CommunicationLink#getLinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Type</em>'.
	 * @see nz.auckland.arch.CommunicationLink#getLinkType()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EAttribute getCommunicationLink_LinkType();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.CommunicationLink#getNetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Type</em>'.
	 * @see nz.auckland.arch.CommunicationLink#getNetworkType()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EAttribute getCommunicationLink_NetworkType();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.CommunicationLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see nz.auckland.arch.CommunicationLink#getSource()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_Source();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.CommunicationLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see nz.auckland.arch.CommunicationLink#getTarget()
	 * @see #getCommunicationLink()
	 * @generated
	 */
	EReference getCommunicationLink_Target();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.CommunicationPort <em>Communication Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Port</em>'.
	 * @see nz.auckland.arch.CommunicationPort
	 * @generated
	 */
	EClass getCommunicationPort();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.CommunicationPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.CommunicationPort#getName()
	 * @see #getCommunicationPort()
	 * @generated
	 */
	EAttribute getCommunicationPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.CommunicationPort#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see nz.auckland.arch.CommunicationPort#getPortNumber()
	 * @see #getCommunicationPort()
	 * @generated
	 */
	EAttribute getCommunicationPort_PortNumber();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.CommunicationPort#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see nz.auckland.arch.CommunicationPort#getNode()
	 * @see #getCommunicationPort()
	 * @generated
	 */
	EReference getCommunicationPort_Node();

	/**
	 * Returns the meta object for the reference list '{@link nz.auckland.arch.CommunicationPort#getNamedport <em>Namedport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Namedport</em>'.
	 * @see nz.auckland.arch.CommunicationPort#getNamedport()
	 * @see #getCommunicationPort()
	 * @generated
	 */
	EReference getCommunicationPort_Namedport();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.CommunicationPort#isHasFirewall <em>Has Firewall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Firewall</em>'.
	 * @see nz.auckland.arch.CommunicationPort#isHasFirewall()
	 * @see #getCommunicationPort()
	 * @generated
	 */
	EAttribute getCommunicationPort_HasFirewall();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.CommunicationPort#isHasAuthentication <em>Has Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Authentication</em>'.
	 * @see nz.auckland.arch.CommunicationPort#isHasAuthentication()
	 * @see #getCommunicationPort()
	 * @generated
	 */
	EAttribute getCommunicationPort_HasAuthentication();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.CommunicationPort#isHasAuthorization <em>Has Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Authorization</em>'.
	 * @see nz.auckland.arch.CommunicationPort#isHasAuthorization()
	 * @see #getCommunicationPort()
	 * @generated
	 */
	EAttribute getCommunicationPort_HasAuthorization();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.CommunicationPort#isHasInputSanitization <em>Has Input Sanitization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Input Sanitization</em>'.
	 * @see nz.auckland.arch.CommunicationPort#isHasInputSanitization()
	 * @see #getCommunicationPort()
	 * @generated
	 */
	EAttribute getCommunicationPort_HasInputSanitization();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.OntologyLabel <em>Ontology Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ontology Label</em>'.
	 * @see nz.auckland.arch.OntologyLabel
	 * @generated
	 */
	EClass getOntologyLabel();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.OntologyLabel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.OntologyLabel#getName()
	 * @see #getOntologyLabel()
	 * @generated
	 */
	EAttribute getOntologyLabel_Name();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.OntologyLabel#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see nz.auckland.arch.OntologyLabel#getExpression()
	 * @see #getOntologyLabel()
	 * @generated
	 */
	EAttribute getOntologyLabel_Expression();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.OntologyLabel#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Class Of</em>'.
	 * @see nz.auckland.arch.OntologyLabel#getSubClassOf()
	 * @see #getOntologyLabel()
	 * @generated
	 */
	EAttribute getOntologyLabel_SubClassOf();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.MigrationModel <em>Migration Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migration Model</em>'.
	 * @see nz.auckland.arch.MigrationModel
	 * @generated
	 */
	EClass getMigrationModel();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.MigrationModel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see nz.auckland.arch.MigrationModel#getSource()
	 * @see #getMigrationModel()
	 * @generated
	 */
	EReference getMigrationModel_Source();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.MigrationModel#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see nz.auckland.arch.MigrationModel#getTarget()
	 * @see #getMigrationModel()
	 * @generated
	 */
	EReference getMigrationModel_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link nz.auckland.arch.MigrationModel#getInterimmodels <em>Interimmodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interimmodels</em>'.
	 * @see nz.auckland.arch.MigrationModel#getInterimmodels()
	 * @see #getMigrationModel()
	 * @generated
	 */
	EReference getMigrationModel_Interimmodels();

	/**
	 * Returns the meta object for class '{@link nz.auckland.arch.InterimModel <em>Interim Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interim Model</em>'.
	 * @see nz.auckland.arch.InterimModel
	 * @generated
	 */
	EClass getInterimModel();

	/**
	 * Returns the meta object for the containment reference '{@link nz.auckland.arch.InterimModel#getDesignmodel <em>Designmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Designmodel</em>'.
	 * @see nz.auckland.arch.InterimModel#getDesignmodel()
	 * @see #getInterimModel()
	 * @generated
	 */
	EReference getInterimModel_Designmodel();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.InterimModel#isIsStable <em>Is Stable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Stable</em>'.
	 * @see nz.auckland.arch.InterimModel#isIsStable()
	 * @see #getInterimModel()
	 * @generated
	 */
	EAttribute getInterimModel_IsStable();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.InterimModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nz.auckland.arch.InterimModel#getName()
	 * @see #getInterimModel()
	 * @generated
	 */
	EAttribute getInterimModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.InterimModel#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see nz.auckland.arch.InterimModel#getStep()
	 * @see #getInterimModel()
	 * @generated
	 */
	EAttribute getInterimModel_Step();

	/**
	 * Returns the meta object for the attribute '{@link nz.auckland.arch.InterimModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see nz.auckland.arch.InterimModel#getDescription()
	 * @see #getInterimModel()
	 * @generated
	 */
	EAttribute getInterimModel_Description();

	/**
	 * Returns the meta object for the reference '{@link nz.auckland.arch.InterimModel#getNextModel <em>Next Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Model</em>'.
	 * @see nz.auckland.arch.InterimModel#getNextModel()
	 * @see #getInterimModel()
	 * @generated
	 */
	EReference getInterimModel_NextModel();

	/**
	 * Returns the meta object for enum '{@link nz.auckland.arch.ExprOperator <em>Expr Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expr Operator</em>'.
	 * @see nz.auckland.arch.ExprOperator
	 * @generated
	 */
	EEnum getExprOperator();

	/**
	 * Returns the meta object for enum '{@link nz.auckland.arch.LTLOperator <em>LTL Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LTL Operator</em>'.
	 * @see nz.auckland.arch.LTLOperator
	 * @generated
	 */
	EEnum getLTLOperator();

	/**
	 * Returns the meta object for enum '{@link nz.auckland.arch.BehaviourPropType <em>Behaviour Prop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behaviour Prop Type</em>'.
	 * @see nz.auckland.arch.BehaviourPropType
	 * @generated
	 */
	EEnum getBehaviourPropType();

	/**
	 * Returns the meta object for enum '{@link nz.auckland.arch.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Node Type</em>'.
	 * @see nz.auckland.arch.NodeType
	 * @generated
	 */
	EEnum getNodeType();

	/**
	 * Returns the meta object for enum '{@link nz.auckland.arch.HostType <em>Host Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Host Type</em>'.
	 * @see nz.auckland.arch.HostType
	 * @generated
	 */
	EEnum getHostType();

	/**
	 * Returns the meta object for enum '{@link nz.auckland.arch.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Type</em>'.
	 * @see nz.auckland.arch.LinkType
	 * @generated
	 */
	EEnum getLinkType();

	/**
	 * Returns the meta object for enum '{@link nz.auckland.arch.NetAccessType <em>Net Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Net Access Type</em>'.
	 * @see nz.auckland.arch.NetAccessType
	 * @generated
	 */
	EEnum getNetAccessType();

	/**
	 * Returns the meta object for enum '{@link nz.auckland.arch.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Network Type</em>'.
	 * @see nz.auckland.arch.NetworkType
	 * @generated
	 */
	EEnum getNetworkType();

	/**
	 * Returns the meta object for enum '{@link nz.auckland.arch.CriticalLevel <em>Critical Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Critical Level</em>'.
	 * @see nz.auckland.arch.CriticalLevel
	 * @generated
	 */
	EEnum getCriticalLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchFactory getArchFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.ComponentImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORT = eINSTANCE.getComponent_Port();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__VALID = eINSTANCE.getComponent_Valid();

		/**
		 * The meta object literal for the '<em><b>Deploymentnode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DEPLOYMENTNODE = eINSTANCE.getComponent_Deploymentnode();

		/**
		 * The meta object literal for the '<em><b>Critical Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CRITICAL_LEVEL = eINSTANCE.getComponent_CriticalLevel();

		/**
		 * The meta object literal for the '<em><b>Security Characters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__SECURITY_CHARACTERS = eINSTANCE.getComponent_SecurityCharacters();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.DesignModelImpl <em>Design Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.DesignModelImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getDesignModel()
		 * @generated
		 */
		EClass DESIGN_MODEL = eINSTANCE.getDesignModel();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_MODEL__COMPONENT = eINSTANCE.getDesignModel_Component();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_MODEL__CONNECTOR = eINSTANCE.getDesignModel_Connector();

		/**
		 * The meta object literal for the '<em><b>Archstyle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_MODEL__ARCHSTYLE = eINSTANCE.getDesignModel_Archstyle();

		/**
		 * The meta object literal for the '<em><b>Verify Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_MODEL__VERIFY_PROPERTY = eINSTANCE.getDesignModel_VerifyProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_MODEL__NAME = eINSTANCE.getDesignModel_Name();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_MODEL__HOST = eINSTANCE.getDesignModel_Host();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_MODEL__LINK = eINSTANCE.getDesignModel_Link();

		/**
		 * The meta object literal for the '<em><b>Ontologylabel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_MODEL__ONTOLOGYLABEL = eINSTANCE.getDesignModel_Ontologylabel();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.ConnectorImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__ROLE = eINSTANCE.getConnector_Role();

		/**
		 * The meta object literal for the '<em><b>Connectortype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CONNECTORTYPE = eINSTANCE.getConnector_Connectortype();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__VALID = eINSTANCE.getConnector_Valid();

		/**
		 * The meta object literal for the '<em><b>Communicationlink</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__COMMUNICATIONLINK = eINSTANCE.getConnector_Communicationlink();

		/**
		 * The meta object literal for the '<em><b>Security Characters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__SECURITY_CHARACTERS = eINSTANCE.getConnector_SecurityCharacters();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.PortImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__EVENTS = eINSTANCE.getPort_Events();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ROLE = eINSTANCE.getPort_Role();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__VALID = eINSTANCE.getPort_Valid();

		/**
		 * The meta object literal for the '<em><b>Insecure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__INSECURE = eINSTANCE.getPort_Insecure();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__ATTRIBUTES = eINSTANCE.getPort_Attributes();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.EventImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__NEXT = eINSTANCE.getEvent_Next();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.RoleImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Roletype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLETYPE = eINSTANCE.getRole_Roletype();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__TYPE = eINSTANCE.getRole_Type();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__VALID = eINSTANCE.getRole_Valid();

		/**
		 * The meta object literal for the '<em><b>Next Role Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__NEXT_ROLE_EXPR = eINSTANCE.getRole_NextRoleExpr();

		/**
		 * The meta object literal for the '<em><b>Operator Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__OPERATOR_EXPR = eINSTANCE.getRole_OperatorExpr();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CONNECTOR = eINSTANCE.getRole_Connector();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.ChannelImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__TYPE = eINSTANCE.getChannel_Type();

		/**
		 * The meta object literal for the '<em><b>Bind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__BIND = eINSTANCE.getChannel_Bind();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.RoleTypeImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__NAME = eINSTANCE.getRoleType_Name();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE__EVENT = eINSTANCE.getRoleType_Event();

		/**
		 * The meta object literal for the '<em><b>Porttype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE__PORTTYPE = eINSTANCE.getRoleType_Porttype();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__VALID = eINSTANCE.getRoleType_Valid();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.ConnectorTypeImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getConnectorType()
		 * @generated
		 */
		EClass CONNECTOR_TYPE = eINSTANCE.getConnectorType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TYPE__NAME = eINSTANCE.getConnectorType_Name();

		/**
		 * The meta object literal for the '<em><b>Roletype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__ROLETYPE = eINSTANCE.getConnectorType_Roletype();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR_TYPE__VALID = eINSTANCE.getConnectorType_Valid();

		/**
		 * The meta object literal for the '<em><b>Ea Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_TYPE__EA_CONNECTOR = eINSTANCE.getConnectorType_EaConnector();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.ComponentTypeImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__NAME = eINSTANCE.getComponentType_Name();

		/**
		 * The meta object literal for the '<em><b>Porttype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PORTTYPE = eINSTANCE.getComponentType_Porttype();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__VALID = eINSTANCE.getComponentType_Valid();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.PortTypeImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__NAME = eINSTANCE.getPortType_Name();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__VALID = eINSTANCE.getPortType_Valid();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.ArchStyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.ArchStyleImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getArchStyle()
		 * @generated
		 */
		EClass ARCH_STYLE = eINSTANCE.getArchStyle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCH_STYLE__NAME = eINSTANCE.getArchStyle_Name();

		/**
		 * The meta object literal for the '<em><b>Connectortype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCH_STYLE__CONNECTORTYPE = eINSTANCE.getArchStyle_Connectortype();

		/**
		 * The meta object literal for the '<em><b>Componenttype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCH_STYLE__COMPONENTTYPE = eINSTANCE.getArchStyle_Componenttype();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCH_STYLE__VALID = eINSTANCE.getArchStyle_Valid();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.BehaviourPropertyImpl <em>Behaviour Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.BehaviourPropertyImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getBehaviourProperty()
		 * @generated
		 */
		EClass BEHAVIOUR_PROPERTY = eINSTANCE.getBehaviourProperty();

		/**
		 * The meta object literal for the '<em><b>Ltlexpr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_PROPERTY__LTLEXPR = eINSTANCE.getBehaviourProperty_Ltlexpr();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR_PROPERTY__VALID = eINSTANCE.getBehaviourProperty_Valid();

		/**
		 * The meta object literal for the '<em><b>Counter Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR_PROPERTY__COUNTER_EXAMPLE = eINSTANCE.getBehaviourProperty_CounterExample();

		/**
		 * The meta object literal for the '<em><b>Visited States</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR_PROPERTY__VISITED_STATES = eINSTANCE.getBehaviourProperty_VisitedStates();

		/**
		 * The meta object literal for the '<em><b>Verify Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR_PROPERTY__VERIFY_TIME = eINSTANCE.getBehaviourProperty_VerifyTime();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR_PROPERTY__TYPE = eINSTANCE.getBehaviourProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Testport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_PROPERTY__TESTPORT = eINSTANCE.getBehaviourProperty_Testport();

		/**
		 * The meta object literal for the '<em><b>Trace Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR_PROPERTY__TRACE_EXAMPLE = eINSTANCE.getBehaviourProperty_TraceExample();

		/**
		 * The meta object literal for the '<em><b>Expr Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOUR_PROPERTY__EXPR_TEXT = eINSTANCE.getBehaviourProperty_ExprText();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_PROPERTY__CONNECTOR = eINSTANCE.getBehaviourProperty_Connector();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.LTLExprImpl <em>LTL Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.LTLExprImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getLTLExpr()
		 * @generated
		 */
		EClass LTL_EXPR = eINSTANCE.getLTLExpr();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_EXPR__EVENT = eINSTANCE.getLTLExpr_Event();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LTL_EXPR__OPERATOR = eINSTANCE.getLTLExpr_Operator();

		/**
		 * The meta object literal for the '<em><b>Next Expr</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_EXPR__NEXT_EXPR = eINSTANCE.getLTLExpr_NextExpr();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_EXPR__PROPERTY = eINSTANCE.getLTLExpr_Property();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_EXPR__ROLE = eINSTANCE.getLTLExpr_Role();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_EXPR__PORT = eINSTANCE.getLTLExpr_Port();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.LTLNestedExprImpl <em>LTL Nested Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.LTLNestedExprImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getLTLNestedExpr()
		 * @generated
		 */
		EClass LTL_NESTED_EXPR = eINSTANCE.getLTLNestedExpr();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LTL_NESTED_EXPR__EXPR = eINSTANCE.getLTLNestedExpr_Expr();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.LTLRegularExprImpl <em>LTL Regular Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.LTLRegularExprImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getLTLRegularExpr()
		 * @generated
		 */
		EClass LTL_REGULAR_EXPR = eINSTANCE.getLTLRegularExpr();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.VerificationPropertyImpl <em>Verification Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.VerificationPropertyImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getVerificationProperty()
		 * @generated
		 */
		EClass VERIFICATION_PROPERTY = eINSTANCE.getVerificationProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_PROPERTY__NAME = eINSTANCE.getVerificationProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_PROPERTY__MODEL = eINSTANCE.getVerificationProperty_Model();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.StructuralPropertyImpl <em>Structural Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.StructuralPropertyImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getStructuralProperty()
		 * @generated
		 */
		EClass STRUCTURAL_PROPERTY = eINSTANCE.getStructuralProperty();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_PROPERTY__RESULT = eINSTANCE.getStructuralProperty_Result();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.DeviceImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Net Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NET_ACCESS_TYPE = eINSTANCE.getDevice_NetAccessType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__NODE = eINSTANCE.getDevice_Node();

		/**
		 * The meta object literal for the '<em><b>Host Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__HOST_TYPE = eINSTANCE.getDevice_HostType();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.ExecutionEnvironmentImpl <em>Execution Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.ExecutionEnvironmentImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getExecutionEnvironment()
		 * @generated
		 */
		EClass EXECUTION_ENVIRONMENT = eINSTANCE.getExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_ENVIRONMENT__TYPE = eINSTANCE.getExecutionEnvironment_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_ENVIRONMENT__NAME = eINSTANCE.getExecutionEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT__COMPONENT = eINSTANCE.getExecutionEnvironment_Component();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENVIRONMENT__PORT = eINSTANCE.getExecutionEnvironment_Port();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.CommunicationLinkImpl <em>Communication Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.CommunicationLinkImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getCommunicationLink()
		 * @generated
		 */
		EClass COMMUNICATION_LINK = eINSTANCE.getCommunicationLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_LINK__NAME = eINSTANCE.getCommunicationLink_Name();

		/**
		 * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_LINK__LINK_TYPE = eINSTANCE.getCommunicationLink_LinkType();

		/**
		 * The meta object literal for the '<em><b>Network Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_LINK__NETWORK_TYPE = eINSTANCE.getCommunicationLink_NetworkType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__SOURCE = eINSTANCE.getCommunicationLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_LINK__TARGET = eINSTANCE.getCommunicationLink_Target();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.CommunicationPortImpl <em>Communication Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.CommunicationPortImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getCommunicationPort()
		 * @generated
		 */
		EClass COMMUNICATION_PORT = eINSTANCE.getCommunicationPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PORT__NAME = eINSTANCE.getCommunicationPort_Name();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PORT__PORT_NUMBER = eINSTANCE.getCommunicationPort_PortNumber();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PORT__NODE = eINSTANCE.getCommunicationPort_Node();

		/**
		 * The meta object literal for the '<em><b>Namedport</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PORT__NAMEDPORT = eINSTANCE.getCommunicationPort_Namedport();

		/**
		 * The meta object literal for the '<em><b>Has Firewall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PORT__HAS_FIREWALL = eINSTANCE.getCommunicationPort_HasFirewall();

		/**
		 * The meta object literal for the '<em><b>Has Authentication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PORT__HAS_AUTHENTICATION = eINSTANCE.getCommunicationPort_HasAuthentication();

		/**
		 * The meta object literal for the '<em><b>Has Authorization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PORT__HAS_AUTHORIZATION = eINSTANCE.getCommunicationPort_HasAuthorization();

		/**
		 * The meta object literal for the '<em><b>Has Input Sanitization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PORT__HAS_INPUT_SANITIZATION = eINSTANCE.getCommunicationPort_HasInputSanitization();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.OntologyLabelImpl <em>Ontology Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.OntologyLabelImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getOntologyLabel()
		 * @generated
		 */
		EClass ONTOLOGY_LABEL = eINSTANCE.getOntologyLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_LABEL__NAME = eINSTANCE.getOntologyLabel_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_LABEL__EXPRESSION = eINSTANCE.getOntologyLabel_Expression();

		/**
		 * The meta object literal for the '<em><b>Sub Class Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONTOLOGY_LABEL__SUB_CLASS_OF = eINSTANCE.getOntologyLabel_SubClassOf();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.MigrationModelImpl <em>Migration Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.MigrationModelImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getMigrationModel()
		 * @generated
		 */
		EClass MIGRATION_MODEL = eINSTANCE.getMigrationModel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION_MODEL__SOURCE = eINSTANCE.getMigrationModel_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION_MODEL__TARGET = eINSTANCE.getMigrationModel_Target();

		/**
		 * The meta object literal for the '<em><b>Interimmodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION_MODEL__INTERIMMODELS = eINSTANCE.getMigrationModel_Interimmodels();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.impl.InterimModelImpl <em>Interim Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.impl.InterimModelImpl
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getInterimModel()
		 * @generated
		 */
		EClass INTERIM_MODEL = eINSTANCE.getInterimModel();

		/**
		 * The meta object literal for the '<em><b>Designmodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIM_MODEL__DESIGNMODEL = eINSTANCE.getInterimModel_Designmodel();

		/**
		 * The meta object literal for the '<em><b>Is Stable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERIM_MODEL__IS_STABLE = eINSTANCE.getInterimModel_IsStable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERIM_MODEL__NAME = eINSTANCE.getInterimModel_Name();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERIM_MODEL__STEP = eINSTANCE.getInterimModel_Step();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERIM_MODEL__DESCRIPTION = eINSTANCE.getInterimModel_Description();

		/**
		 * The meta object literal for the '<em><b>Next Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERIM_MODEL__NEXT_MODEL = eINSTANCE.getInterimModel_NextModel();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.ExprOperator <em>Expr Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.ExprOperator
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getExprOperator()
		 * @generated
		 */
		EEnum EXPR_OPERATOR = eINSTANCE.getExprOperator();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.LTLOperator <em>LTL Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.LTLOperator
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getLTLOperator()
		 * @generated
		 */
		EEnum LTL_OPERATOR = eINSTANCE.getLTLOperator();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.BehaviourPropType <em>Behaviour Prop Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.BehaviourPropType
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getBehaviourPropType()
		 * @generated
		 */
		EEnum BEHAVIOUR_PROP_TYPE = eINSTANCE.getBehaviourPropType();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.NodeType <em>Node Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.NodeType
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getNodeType()
		 * @generated
		 */
		EEnum NODE_TYPE = eINSTANCE.getNodeType();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.HostType <em>Host Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.HostType
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getHostType()
		 * @generated
		 */
		EEnum HOST_TYPE = eINSTANCE.getHostType();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.LinkType <em>Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.LinkType
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getLinkType()
		 * @generated
		 */
		EEnum LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.NetAccessType <em>Net Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.NetAccessType
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getNetAccessType()
		 * @generated
		 */
		EEnum NET_ACCESS_TYPE = eINSTANCE.getNetAccessType();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.NetworkType <em>Network Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.NetworkType
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getNetworkType()
		 * @generated
		 */
		EEnum NETWORK_TYPE = eINSTANCE.getNetworkType();

		/**
		 * The meta object literal for the '{@link nz.auckland.arch.CriticalLevel <em>Critical Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nz.auckland.arch.CriticalLevel
		 * @see nz.auckland.arch.impl.ArchPackageImpl#getCriticalLevel()
		 * @generated
		 */
		EEnum CRITICAL_LEVEL = eINSTANCE.getCriticalLevel();

	}

} //ArchPackage
