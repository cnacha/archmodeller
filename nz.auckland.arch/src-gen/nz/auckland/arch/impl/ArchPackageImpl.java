/**
 */
package nz.auckland.arch.impl;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.ArchStyle;
import nz.auckland.arch.BehaviourPropType;
import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.Channel;
import nz.auckland.arch.CommunicationLink;
import nz.auckland.arch.CommunicationPort;
import nz.auckland.arch.Component;
import nz.auckland.arch.ComponentType;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.CriticalLevel;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Device;
import nz.auckland.arch.Event;
import nz.auckland.arch.ExecutionEnvironment;
import nz.auckland.arch.ExprOperator;
import nz.auckland.arch.HostType;
import nz.auckland.arch.InterimModel;
import nz.auckland.arch.LTLExpr;
import nz.auckland.arch.LTLNestedExpr;
import nz.auckland.arch.LTLOperator;
import nz.auckland.arch.LTLRegularExpr;
import nz.auckland.arch.LinkType;
import nz.auckland.arch.MigrationModel;
import nz.auckland.arch.NetAccessType;
import nz.auckland.arch.NetworkType;
import nz.auckland.arch.NodeType;
import nz.auckland.arch.OntologyLabel;
import nz.auckland.arch.Port;
import nz.auckland.arch.PortType;
import nz.auckland.arch.RefactorPart;
import nz.auckland.arch.RefactorSet;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;
import nz.auckland.arch.StructuralProperty;
import nz.auckland.arch.VerificationProperty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchPackageImpl extends EPackageImpl implements ArchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviourPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltlExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltlNestedExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltlRegularExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ontologyLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interimModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refactorPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refactorSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exprOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ltlOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum behaviourPropTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hostTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum netAccessTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum networkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum criticalLevelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see nz.auckland.arch.ArchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchPackageImpl() {
		super(eNS_URI, ArchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchPackage init() {
		if (isInited)
			return (ArchPackage) EPackage.Registry.INSTANCE.getEPackage(ArchPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArchPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArchPackageImpl theArchPackage = registeredArchPackage instanceof ArchPackageImpl
				? (ArchPackageImpl) registeredArchPackage
				: new ArchPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theArchPackage.createPackageContents();

		// Initialize created meta-data
		theArchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchPackage.eNS_URI, theArchPackage);
		return theArchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Type() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Port() {
		return (EReference) componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Valid() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Deploymentnode() {
		return (EReference) componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_CriticalLevel() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_SecurityCharacters() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesignModel() {
		return designModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignModel_Component() {
		return (EReference) designModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignModel_Connector() {
		return (EReference) designModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignModel_Archstyle() {
		return (EReference) designModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignModel_VerifyProperty() {
		return (EReference) designModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignModel_Name() {
		return (EAttribute) designModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignModel_Host() {
		return (EReference) designModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignModel_Link() {
		return (EReference) designModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignModel_Ontologylabel() {
		return (EReference) designModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Name() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Type() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Role() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Connectortype() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_Valid() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_Communicationlink() {
		return (EReference) connectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnector_SecurityCharacters() {
		return (EAttribute) connectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Name() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPort_Events() {
		return (EReference) portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPort_Role() {
		return (EReference) portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Type() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Valid() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Insecure() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Attributes() {
		return (EAttribute) portEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Name() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_Next() {
		return (EReference) eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Name() {
		return (EAttribute) roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Roletype() {
		return (EReference) roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Type() {
		return (EAttribute) roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Valid() {
		return (EAttribute) roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_NextRoleExpr() {
		return (EReference) roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_OperatorExpr() {
		return (EAttribute) roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Connector() {
		return (EReference) roleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannel_Type() {
		return (EAttribute) channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannel_Bind() {
		return (EReference) channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleType() {
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleType_Name() {
		return (EAttribute) roleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleType_Event() {
		return (EReference) roleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleType_Porttype() {
		return (EReference) roleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleType_Valid() {
		return (EAttribute) roleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnectorType() {
		return connectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorType_Name() {
		return (EAttribute) connectorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorType_Roletype() {
		return (EReference) connectorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnectorType_Valid() {
		return (EAttribute) connectorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnectorType_EaConnector() {
		return (EReference) connectorTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentType_Name() {
		return (EAttribute) componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentType_Porttype() {
		return (EReference) componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentType_Valid() {
		return (EAttribute) componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortType() {
		return portTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortType_Name() {
		return (EAttribute) portTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortType_Valid() {
		return (EAttribute) portTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchStyle() {
		return archStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchStyle_Name() {
		return (EAttribute) archStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchStyle_Connectortype() {
		return (EReference) archStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchStyle_Componenttype() {
		return (EReference) archStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchStyle_Valid() {
		return (EAttribute) archStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviourProperty() {
		return behaviourPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviourProperty_Ltlexpr() {
		return (EReference) behaviourPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviourProperty_Valid() {
		return (EAttribute) behaviourPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviourProperty_CounterExample() {
		return (EAttribute) behaviourPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviourProperty_VisitedStates() {
		return (EAttribute) behaviourPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviourProperty_VerifyTime() {
		return (EAttribute) behaviourPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviourProperty_Type() {
		return (EAttribute) behaviourPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviourProperty_Testport() {
		return (EReference) behaviourPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviourProperty_TraceExample() {
		return (EAttribute) behaviourPropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviourProperty_ExprText() {
		return (EAttribute) behaviourPropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviourProperty_Connector() {
		return (EReference) behaviourPropertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTLExpr() {
		return ltlExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLTLExpr_Event() {
		return (EReference) ltlExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLTLExpr_Operator() {
		return (EAttribute) ltlExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLTLExpr_NextExpr() {
		return (EReference) ltlExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLTLExpr_Property() {
		return (EReference) ltlExprEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLTLExpr_Role() {
		return (EReference) ltlExprEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLTLExpr_Port() {
		return (EReference) ltlExprEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTLNestedExpr() {
		return ltlNestedExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLTLNestedExpr_Expr() {
		return (EReference) ltlNestedExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTLRegularExpr() {
		return ltlRegularExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerificationProperty() {
		return verificationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerificationProperty_Name() {
		return (EAttribute) verificationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVerificationProperty_Model() {
		return (EReference) verificationPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructuralProperty() {
		return structuralPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStructuralProperty_Result() {
		return (EAttribute) structuralPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_NetAccessType() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_Name() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDevice_Node() {
		return (EReference) deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_HostType() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionEnvironment() {
		return executionEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionEnvironment_Type() {
		return (EAttribute) executionEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionEnvironment_Name() {
		return (EAttribute) executionEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionEnvironment_Component() {
		return (EReference) executionEnvironmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionEnvironment_Port() {
		return (EReference) executionEnvironmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationLink() {
		return communicationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationLink_Name() {
		return (EAttribute) communicationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationLink_LinkType() {
		return (EAttribute) communicationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationLink_NetworkType() {
		return (EAttribute) communicationLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationLink_Source() {
		return (EReference) communicationLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationLink_Target() {
		return (EReference) communicationLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationPort() {
		return communicationPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationPort_Name() {
		return (EAttribute) communicationPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationPort_PortNumber() {
		return (EAttribute) communicationPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationPort_Node() {
		return (EReference) communicationPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationPort_Namedport() {
		return (EReference) communicationPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationPort_HasFirewall() {
		return (EAttribute) communicationPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationPort_HasAuthentication() {
		return (EAttribute) communicationPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationPort_HasAuthorization() {
		return (EAttribute) communicationPortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationPort_HasInputSanitization() {
		return (EAttribute) communicationPortEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOntologyLabel() {
		return ontologyLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologyLabel_Name() {
		return (EAttribute) ontologyLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologyLabel_Expression() {
		return (EAttribute) ontologyLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOntologyLabel_SubClassOf() {
		return (EAttribute) ontologyLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMigrationModel() {
		return migrationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMigrationModel_Source() {
		return (EReference) migrationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMigrationModel_Target() {
		return (EReference) migrationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMigrationModel_Interimmodels() {
		return (EReference) migrationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterimModel() {
		return interimModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterimModel_Step() {
		return (EAttribute) interimModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterimModel_Description() {
		return (EAttribute) interimModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterimModel_NextModel() {
		return (EReference) interimModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterimModel_Designmodel() {
		return (EReference) interimModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterimModel_IsStable() {
		return (EAttribute) interimModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterimModel_Name() {
		return (EAttribute) interimModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefactorPart() {
		return refactorPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefactorPart_Reference() {
		return (EReference) refactorPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefactorPart_Name() {
		return (EAttribute) refactorPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefactorPart_Functions() {
		return (EReference) refactorPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefactorPart_CopyStructure() {
		return (EAttribute) refactorPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefactorPart_ReplaceStrcuture() {
		return (EAttribute) refactorPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefactorPart_Next() {
		return (EReference) refactorPartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefactorSet() {
		return refactorSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefactorSet_Source() {
		return (EReference) refactorSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefactorSet_Parts() {
		return (EReference) refactorSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExprOperator() {
		return exprOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLTLOperator() {
		return ltlOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBehaviourPropType() {
		return behaviourPropTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNodeType() {
		return nodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHostType() {
		return hostTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLinkType() {
		return linkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNetAccessType() {
		return netAccessTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNetworkType() {
		return networkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCriticalLevel() {
		return criticalLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArchFactory getArchFactory() {
		return (ArchFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEAttribute(componentEClass, COMPONENT__TYPE);
		createEReference(componentEClass, COMPONENT__PORT);
		createEAttribute(componentEClass, COMPONENT__VALID);
		createEReference(componentEClass, COMPONENT__DEPLOYMENTNODE);
		createEAttribute(componentEClass, COMPONENT__CRITICAL_LEVEL);
		createEAttribute(componentEClass, COMPONENT__SECURITY_CHARACTERS);

		designModelEClass = createEClass(DESIGN_MODEL);
		createEReference(designModelEClass, DESIGN_MODEL__COMPONENT);
		createEReference(designModelEClass, DESIGN_MODEL__CONNECTOR);
		createEReference(designModelEClass, DESIGN_MODEL__ARCHSTYLE);
		createEReference(designModelEClass, DESIGN_MODEL__VERIFY_PROPERTY);
		createEAttribute(designModelEClass, DESIGN_MODEL__NAME);
		createEReference(designModelEClass, DESIGN_MODEL__HOST);
		createEReference(designModelEClass, DESIGN_MODEL__LINK);
		createEReference(designModelEClass, DESIGN_MODEL__ONTOLOGYLABEL);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__NAME);
		createEAttribute(connectorEClass, CONNECTOR__TYPE);
		createEReference(connectorEClass, CONNECTOR__ROLE);
		createEReference(connectorEClass, CONNECTOR__CONNECTORTYPE);
		createEAttribute(connectorEClass, CONNECTOR__VALID);
		createEReference(connectorEClass, CONNECTOR__COMMUNICATIONLINK);
		createEAttribute(connectorEClass, CONNECTOR__SECURITY_CHARACTERS);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NAME);
		createEReference(portEClass, PORT__EVENTS);
		createEReference(portEClass, PORT__ROLE);
		createEAttribute(portEClass, PORT__TYPE);
		createEAttribute(portEClass, PORT__VALID);
		createEAttribute(portEClass, PORT__INSECURE);
		createEAttribute(portEClass, PORT__ATTRIBUTES);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);
		createEReference(eventEClass, EVENT__NEXT);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEReference(roleEClass, ROLE__ROLETYPE);
		createEAttribute(roleEClass, ROLE__TYPE);
		createEAttribute(roleEClass, ROLE__VALID);
		createEReference(roleEClass, ROLE__NEXT_ROLE_EXPR);
		createEAttribute(roleEClass, ROLE__OPERATOR_EXPR);
		createEReference(roleEClass, ROLE__CONNECTOR);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__TYPE);
		createEReference(channelEClass, CHANNEL__BIND);

		roleTypeEClass = createEClass(ROLE_TYPE);
		createEAttribute(roleTypeEClass, ROLE_TYPE__NAME);
		createEReference(roleTypeEClass, ROLE_TYPE__EVENT);
		createEReference(roleTypeEClass, ROLE_TYPE__PORTTYPE);
		createEAttribute(roleTypeEClass, ROLE_TYPE__VALID);

		connectorTypeEClass = createEClass(CONNECTOR_TYPE);
		createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__NAME);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__ROLETYPE);
		createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__VALID);
		createEReference(connectorTypeEClass, CONNECTOR_TYPE__EA_CONNECTOR);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__NAME);
		createEReference(componentTypeEClass, COMPONENT_TYPE__PORTTYPE);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__VALID);

		portTypeEClass = createEClass(PORT_TYPE);
		createEAttribute(portTypeEClass, PORT_TYPE__NAME);
		createEAttribute(portTypeEClass, PORT_TYPE__VALID);

		archStyleEClass = createEClass(ARCH_STYLE);
		createEAttribute(archStyleEClass, ARCH_STYLE__NAME);
		createEReference(archStyleEClass, ARCH_STYLE__CONNECTORTYPE);
		createEReference(archStyleEClass, ARCH_STYLE__COMPONENTTYPE);
		createEAttribute(archStyleEClass, ARCH_STYLE__VALID);

		behaviourPropertyEClass = createEClass(BEHAVIOUR_PROPERTY);
		createEReference(behaviourPropertyEClass, BEHAVIOUR_PROPERTY__LTLEXPR);
		createEAttribute(behaviourPropertyEClass, BEHAVIOUR_PROPERTY__VALID);
		createEAttribute(behaviourPropertyEClass, BEHAVIOUR_PROPERTY__COUNTER_EXAMPLE);
		createEAttribute(behaviourPropertyEClass, BEHAVIOUR_PROPERTY__VISITED_STATES);
		createEAttribute(behaviourPropertyEClass, BEHAVIOUR_PROPERTY__VERIFY_TIME);
		createEAttribute(behaviourPropertyEClass, BEHAVIOUR_PROPERTY__TYPE);
		createEReference(behaviourPropertyEClass, BEHAVIOUR_PROPERTY__TESTPORT);
		createEAttribute(behaviourPropertyEClass, BEHAVIOUR_PROPERTY__TRACE_EXAMPLE);
		createEAttribute(behaviourPropertyEClass, BEHAVIOUR_PROPERTY__EXPR_TEXT);
		createEReference(behaviourPropertyEClass, BEHAVIOUR_PROPERTY__CONNECTOR);

		ltlExprEClass = createEClass(LTL_EXPR);
		createEReference(ltlExprEClass, LTL_EXPR__EVENT);
		createEAttribute(ltlExprEClass, LTL_EXPR__OPERATOR);
		createEReference(ltlExprEClass, LTL_EXPR__NEXT_EXPR);
		createEReference(ltlExprEClass, LTL_EXPR__PROPERTY);
		createEReference(ltlExprEClass, LTL_EXPR__ROLE);
		createEReference(ltlExprEClass, LTL_EXPR__PORT);

		ltlNestedExprEClass = createEClass(LTL_NESTED_EXPR);
		createEReference(ltlNestedExprEClass, LTL_NESTED_EXPR__EXPR);

		ltlRegularExprEClass = createEClass(LTL_REGULAR_EXPR);

		verificationPropertyEClass = createEClass(VERIFICATION_PROPERTY);
		createEAttribute(verificationPropertyEClass, VERIFICATION_PROPERTY__NAME);
		createEReference(verificationPropertyEClass, VERIFICATION_PROPERTY__MODEL);

		structuralPropertyEClass = createEClass(STRUCTURAL_PROPERTY);
		createEAttribute(structuralPropertyEClass, STRUCTURAL_PROPERTY__RESULT);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__NET_ACCESS_TYPE);
		createEAttribute(deviceEClass, DEVICE__NAME);
		createEReference(deviceEClass, DEVICE__NODE);
		createEAttribute(deviceEClass, DEVICE__HOST_TYPE);

		executionEnvironmentEClass = createEClass(EXECUTION_ENVIRONMENT);
		createEAttribute(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__TYPE);
		createEAttribute(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__NAME);
		createEReference(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__COMPONENT);
		createEReference(executionEnvironmentEClass, EXECUTION_ENVIRONMENT__PORT);

		communicationLinkEClass = createEClass(COMMUNICATION_LINK);
		createEAttribute(communicationLinkEClass, COMMUNICATION_LINK__NAME);
		createEAttribute(communicationLinkEClass, COMMUNICATION_LINK__LINK_TYPE);
		createEAttribute(communicationLinkEClass, COMMUNICATION_LINK__NETWORK_TYPE);
		createEReference(communicationLinkEClass, COMMUNICATION_LINK__SOURCE);
		createEReference(communicationLinkEClass, COMMUNICATION_LINK__TARGET);

		communicationPortEClass = createEClass(COMMUNICATION_PORT);
		createEAttribute(communicationPortEClass, COMMUNICATION_PORT__NAME);
		createEAttribute(communicationPortEClass, COMMUNICATION_PORT__PORT_NUMBER);
		createEReference(communicationPortEClass, COMMUNICATION_PORT__NODE);
		createEReference(communicationPortEClass, COMMUNICATION_PORT__NAMEDPORT);
		createEAttribute(communicationPortEClass, COMMUNICATION_PORT__HAS_FIREWALL);
		createEAttribute(communicationPortEClass, COMMUNICATION_PORT__HAS_AUTHENTICATION);
		createEAttribute(communicationPortEClass, COMMUNICATION_PORT__HAS_AUTHORIZATION);
		createEAttribute(communicationPortEClass, COMMUNICATION_PORT__HAS_INPUT_SANITIZATION);

		ontologyLabelEClass = createEClass(ONTOLOGY_LABEL);
		createEAttribute(ontologyLabelEClass, ONTOLOGY_LABEL__NAME);
		createEAttribute(ontologyLabelEClass, ONTOLOGY_LABEL__EXPRESSION);
		createEAttribute(ontologyLabelEClass, ONTOLOGY_LABEL__SUB_CLASS_OF);

		migrationModelEClass = createEClass(MIGRATION_MODEL);
		createEReference(migrationModelEClass, MIGRATION_MODEL__SOURCE);
		createEReference(migrationModelEClass, MIGRATION_MODEL__TARGET);
		createEReference(migrationModelEClass, MIGRATION_MODEL__INTERIMMODELS);

		interimModelEClass = createEClass(INTERIM_MODEL);
		createEAttribute(interimModelEClass, INTERIM_MODEL__STEP);
		createEAttribute(interimModelEClass, INTERIM_MODEL__DESCRIPTION);
		createEReference(interimModelEClass, INTERIM_MODEL__NEXT_MODEL);
		createEReference(interimModelEClass, INTERIM_MODEL__DESIGNMODEL);
		createEAttribute(interimModelEClass, INTERIM_MODEL__IS_STABLE);
		createEAttribute(interimModelEClass, INTERIM_MODEL__NAME);

		refactorPartEClass = createEClass(REFACTOR_PART);
		createEReference(refactorPartEClass, REFACTOR_PART__REFERENCE);
		createEAttribute(refactorPartEClass, REFACTOR_PART__NAME);
		createEReference(refactorPartEClass, REFACTOR_PART__FUNCTIONS);
		createEAttribute(refactorPartEClass, REFACTOR_PART__COPY_STRUCTURE);
		createEAttribute(refactorPartEClass, REFACTOR_PART__REPLACE_STRCUTURE);
		createEReference(refactorPartEClass, REFACTOR_PART__NEXT);

		refactorSetEClass = createEClass(REFACTOR_SET);
		createEReference(refactorSetEClass, REFACTOR_SET__SOURCE);
		createEReference(refactorSetEClass, REFACTOR_SET__PARTS);

		// Create enums
		exprOperatorEEnum = createEEnum(EXPR_OPERATOR);
		ltlOperatorEEnum = createEEnum(LTL_OPERATOR);
		behaviourPropTypeEEnum = createEEnum(BEHAVIOUR_PROP_TYPE);
		nodeTypeEEnum = createEEnum(NODE_TYPE);
		hostTypeEEnum = createEEnum(HOST_TYPE);
		linkTypeEEnum = createEEnum(LINK_TYPE);
		netAccessTypeEEnum = createEEnum(NET_ACCESS_TYPE);
		networkTypeEEnum = createEEnum(NETWORK_TYPE);
		criticalLevelEEnum = createEEnum(CRITICAL_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		channelEClass.getESuperTypes().add(this.getEvent());
		behaviourPropertyEClass.getESuperTypes().add(this.getVerificationProperty());
		ltlNestedExprEClass.getESuperTypes().add(this.getLTLExpr());
		ltlRegularExprEClass.getESuperTypes().add(this.getLTLExpr());
		structuralPropertyEClass.getESuperTypes().add(this.getVerificationProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Type(), ecorePackage.getEString(), "type", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Port(), this.getPort(), null, "port", null, 0, -1, Component.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getComponent_Valid(), ecorePackage.getEBoolean(), "valid", "true", 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Deploymentnode(), this.getExecutionEnvironment(), null, "deploymentnode", null, 0,
				1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_CriticalLevel(), this.getCriticalLevel(), "criticalLevel", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_SecurityCharacters(), ecorePackage.getEString(), "securityCharacters", null, 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(designModelEClass, DesignModel.class, "DesignModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignModel_Component(), this.getComponent(), null, "component", null, 0, -1,
				DesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignModel_Connector(), this.getConnector(), null, "connector", null, 0, -1,
				DesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignModel_Archstyle(), this.getArchStyle(), null, "archstyle", null, 0, -1,
				DesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignModel_VerifyProperty(), this.getVerificationProperty(), null, "verifyProperty", null, 0,
				-1, DesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DesignModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignModel_Host(), this.getDevice(), null, "host", null, 0, -1, DesignModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignModel_Link(), this.getCommunicationLink(), null, "link", null, 0, -1, DesignModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignModel_Ontologylabel(), this.getOntologyLabel(), null, "ontologylabel", null, 0, -1,
				DesignModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Type(), ecorePackage.getEString(), "type", null, 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Role(), this.getRole(), null, "role", null, 0, -1, Connector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getConnector_Connectortype(), this.getConnectorType(), null, "connectortype", null, 0, 1,
				Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Valid(), ecorePackage.getEBoolean(), "valid", "true", 0, 1, Connector.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Communicationlink(), this.getCommunicationLink(), null, "communicationlink", null,
				0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_SecurityCharacters(), ecorePackage.getEString(), "securityCharacters", null, 0, 1,
				Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Events(), this.getEvent(), null, "events", null, 0, -1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPort_Role(), this.getRole(), null, "role", null, 0, -1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPort_Type(), ecorePackage.getEString(), "type", null, 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Valid(), ecorePackage.getEBoolean(), "valid", "true", 0, 1, Port.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Insecure(), ecorePackage.getEBoolean(), "insecure", null, 0, 1, Port.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Attributes(), ecorePackage.getEString(), "attributes", null, 0, 1, Port.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Next(), this.getEvent(), null, "next", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Roletype(), this.getRoleType(), null, "roletype", null, 0, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRole_Type(), ecorePackage.getEString(), "type", null, 0, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Valid(), ecorePackage.getEBoolean(), "valid", "true", 0, 1, Role.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_NextRoleExpr(), this.getRole(), null, "nextRoleExpr", null, 0, 1, Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_OperatorExpr(), this.getExprOperator(), "operatorExpr", "COUPLING", 0, 1, Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Connector(), this.getConnector(), null, "connector", null, 0, 1, Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_Type(), ecorePackage.getEString(), "type", null, 0, 1, Channel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Bind(), this.getChannel(), null, "bind", null, 0, 1, Channel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, RoleType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleType_Event(), this.getEvent(), null, "event", null, 0, -1, RoleType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRoleType_Porttype(), this.getPortType(), null, "porttype", null, 0, 1, RoleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleType_Valid(), ecorePackage.getEBoolean(), "valid", "true", 0, 1, RoleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorTypeEClass, ConnectorType.class, "ConnectorType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectorType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConnectorType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_Roletype(), this.getRoleType(), null, "roletype", null, 0, -1,
				ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectorType_Valid(), ecorePackage.getEBoolean(), "valid", "true", 0, 1, ConnectorType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorType_EaConnector(), this.getConnectorType(), null, "eaConnector", null, 0, 1,
				ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_Porttype(), this.getPortType(), null, "porttype", null, 0, -1,
				ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentType_Valid(), ecorePackage.getEBoolean(), "valid", "true", 0, 1, ComponentType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portTypeEClass, PortType.class, "PortType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortType_Name(), ecorePackage.getEString(), "name", null, 0, 1, PortType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortType_Valid(), ecorePackage.getEBoolean(), "valid", "true", 0, 1, PortType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(archStyleEClass, ArchStyle.class, "ArchStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArchStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchStyle_Connectortype(), this.getConnectorType(), null, "connectortype", null, 0, -1,
				ArchStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchStyle_Componenttype(), this.getComponentType(), null, "componenttype", null, 0, -1,
				ArchStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchStyle_Valid(), ecorePackage.getEBoolean(), "valid", "true", 0, 1, ArchStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviourPropertyEClass, BehaviourProperty.class, "BehaviourProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviourProperty_Ltlexpr(), this.getLTLExpr(), null, "ltlexpr", null, 0, -1,
				BehaviourProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourProperty_Valid(), ecorePackage.getEBoolean(), "valid", "true", 0, 1,
				BehaviourProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourProperty_CounterExample(), ecorePackage.getEString(), "counterExample", null, 0, 1,
				BehaviourProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourProperty_VisitedStates(), ecorePackage.getEInt(), "visitedStates", null, 0, 1,
				BehaviourProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourProperty_VerifyTime(), ecorePackage.getEDouble(), "verifyTime", null, 0, 1,
				BehaviourProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourProperty_Type(), this.getBehaviourPropType(), "type", null, 0, 1,
				BehaviourProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviourProperty_Testport(), this.getPort(), null, "testport", null, 0, 1,
				BehaviourProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourProperty_TraceExample(), ecorePackage.getEString(), "traceExample", null, 0, 1,
				BehaviourProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviourProperty_ExprText(), ecorePackage.getEString(), "exprText", null, 0, 1,
				BehaviourProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviourProperty_Connector(), this.getConnector(), null, "connector", null, 0, 1,
				BehaviourProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltlExprEClass, LTLExpr.class, "LTLExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLTLExpr_Event(), this.getEvent(), null, "event", null, 0, 1, LTLExpr.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getLTLExpr_Operator(), this.getLTLOperator(), "operator", "NONE", 0, 1, LTLExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLTLExpr_NextExpr(), this.getLTLExpr(), null, "nextExpr", null, 0, 1, LTLExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLTLExpr_Property(), this.getBehaviourProperty(), null, "property", null, 0, 1, LTLExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLTLExpr_Role(), this.getRole(), null, "role", null, 0, 1, LTLExpr.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLTLExpr_Port(), this.getPort(), null, "port", null, 0, 1, LTLExpr.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ltlNestedExprEClass, LTLNestedExpr.class, "LTLNestedExpr", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLTLNestedExpr_Expr(), this.getLTLExpr(), null, "expr", null, 0, -1, LTLNestedExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltlRegularExprEClass, LTLRegularExpr.class, "LTLRegularExpr", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(verificationPropertyEClass, VerificationProperty.class, "VerificationProperty", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerificationProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				VerificationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationProperty_Model(), this.getDesignModel(), null, "model", null, 0, 1,
				VerificationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralPropertyEClass, StructuralProperty.class, "StructuralProperty", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralProperty_Result(), ecorePackage.getEString(), "result", null, 0, 1,
				StructuralProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_NetAccessType(), this.getNetAccessType(), "netAccessType", "PRIVATE", 0, 1,
				Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Node(), this.getExecutionEnvironment(), null, "node", null, 0, -1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_HostType(), this.getHostType(), "hostType", null, 0, 1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionEnvironmentEClass, ExecutionEnvironment.class, "ExecutionEnvironment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionEnvironment_Type(), this.getNodeType(), "type", null, 0, 1,
				ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionEnvironment_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionEnvironment_Component(), this.getComponent(), null, "component", null, 0, -1,
				ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionEnvironment_Port(), this.getCommunicationPort(), null, "port", null, 0, -1,
				ExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationLinkEClass, CommunicationLink.class, "CommunicationLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationLink_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationLink_LinkType(), this.getLinkType(), "linkType", null, 0, 1,
				CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationLink_NetworkType(), this.getNetworkType(), "networkType", null, 0, 1,
				CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLink_Source(), this.getCommunicationPort(), null, "source", null, 0, 1,
				CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLink_Target(), this.getCommunicationPort(), null, "target", null, 0, 1,
				CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationPortEClass, CommunicationPort.class, "CommunicationPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationPort_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				CommunicationPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationPort_PortNumber(), ecorePackage.getEInt(), "portNumber", null, 0, 1,
				CommunicationPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationPort_Node(), this.getExecutionEnvironment(), null, "node", null, 0, 1,
				CommunicationPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationPort_Namedport(), this.getPort(), null, "namedport", null, 0, -1,
				CommunicationPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationPort_HasFirewall(), ecorePackage.getEBoolean(), "hasFirewall", null, 0, 1,
				CommunicationPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationPort_HasAuthentication(), ecorePackage.getEBoolean(), "hasAuthentication", null,
				0, 1, CommunicationPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationPort_HasAuthorization(), ecorePackage.getEBoolean(), "hasAuthorization", null, 0,
				1, CommunicationPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationPort_HasInputSanitization(), ecorePackage.getEBoolean(), "hasInputSanitization",
				null, 0, 1, CommunicationPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ontologyLabelEClass, OntologyLabel.class, "OntologyLabel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOntologyLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, OntologyLabel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOntologyLabel_Expression(), ecorePackage.getEString(), "expression", null, 0, 1,
				OntologyLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOntologyLabel_SubClassOf(), ecorePackage.getEString(), "subClassOf", null, 0, 1,
				OntologyLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(migrationModelEClass, MigrationModel.class, "MigrationModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMigrationModel_Source(), this.getDesignModel(), null, "source", null, 0, 1,
				MigrationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMigrationModel_Target(), this.getDesignModel(), null, "target", null, 0, 1,
				MigrationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMigrationModel_Interimmodels(), this.getInterimModel(), null, "interimmodels", null, 0, -1,
				MigrationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interimModelEClass, InterimModel.class, "InterimModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterimModel_Step(), theXMLTypePackage.getInt(), "step", null, 0, 1, InterimModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterimModel_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				InterimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getInterimModel_NextModel(), this.getInterimModel(), null, "nextModel", null, 0, 1,
				InterimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterimModel_Designmodel(), this.getDesignModel(), null, "designmodel", null, 0, 1,
				InterimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterimModel_IsStable(), ecorePackage.getEBoolean(), "isStable", null, 0, 1,
				InterimModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterimModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterimModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refactorPartEClass, RefactorPart.class, "RefactorPart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefactorPart_Reference(), this.getDesignModel(), null, "reference", null, 0, 1,
				RefactorPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefactorPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, RefactorPart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefactorPart_Functions(), this.getBehaviourProperty(), null, "functions", null, 0, -1,
				RefactorPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefactorPart_CopyStructure(), ecorePackage.getEBoolean(), "copyStructure", null, 0, 1,
				RefactorPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefactorPart_ReplaceStrcuture(), ecorePackage.getEBoolean(), "replaceStrcuture", null, 0, 1,
				RefactorPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRefactorPart_Next(), this.getRefactorPart(), null, "next", null, 0, 1, RefactorPart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refactorSetEClass, RefactorSet.class, "RefactorSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefactorSet_Source(), this.getDesignModel(), null, "source", null, 0, 1, RefactorSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefactorSet_Parts(), this.getRefactorPart(), null, "parts", null, 0, -1, RefactorSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(exprOperatorEEnum, ExprOperator.class, "ExprOperator");
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.PARALLEL);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.COUPLING);
		addEEnumLiteral(exprOperatorEEnum, ExprOperator.INTERLEAVE);

		initEEnum(ltlOperatorEEnum, LTLOperator.class, "LTLOperator");
		addEEnumLiteral(ltlOperatorEEnum, LTLOperator.ALWAYS);
		addEEnumLiteral(ltlOperatorEEnum, LTLOperator.EVENTUALLY);
		addEEnumLiteral(ltlOperatorEEnum, LTLOperator.NONE);

		initEEnum(behaviourPropTypeEEnum, BehaviourPropType.class, "BehaviourPropType");
		addEEnumLiteral(behaviourPropTypeEEnum, BehaviourPropType.LTL);
		addEEnumLiteral(behaviourPropTypeEEnum, BehaviourPropType.CIRCULAR_FREE);
		addEEnumLiteral(behaviourPropTypeEEnum, BehaviourPropType.DECOMPOSITION_FREE);
		addEEnumLiteral(behaviourPropTypeEEnum, BehaviourPropType.POLTERGEIST_FREE);
		addEEnumLiteral(behaviourPropTypeEEnum, BehaviourPropType.AMBIGUOUS_INTERFACE_FREE);

		initEEnum(nodeTypeEEnum, NodeType.class, "NodeType");
		addEEnumLiteral(nodeTypeEEnum, NodeType.DOCKER_CONTAINER);
		addEEnumLiteral(nodeTypeEEnum, NodeType.APPLICATION_CONTAINER);
		addEEnumLiteral(nodeTypeEEnum, NodeType.FILE_SYSTEM);

		initEEnum(hostTypeEEnum, HostType.class, "HostType");
		addEEnumLiteral(hostTypeEEnum, HostType.VIRTUAL_MACHINE);
		addEEnumLiteral(hostTypeEEnum, HostType.DEDICATED_SERVER);
		addEEnumLiteral(hostTypeEEnum, HostType.CLOUD_PLATFORM);
		addEEnumLiteral(hostTypeEEnum, HostType.MOBILE_PHONE);

		initEEnum(linkTypeEEnum, LinkType.class, "LinkType");
		addEEnumLiteral(linkTypeEEnum, LinkType.HTTP);
		addEEnumLiteral(linkTypeEEnum, LinkType.HTTPS);
		addEEnumLiteral(linkTypeEEnum, LinkType.FTPS);
		addEEnumLiteral(linkTypeEEnum, LinkType.FTP);

		initEEnum(netAccessTypeEEnum, NetAccessType.class, "NetAccessType");
		addEEnumLiteral(netAccessTypeEEnum, NetAccessType.PRIVATE);
		addEEnumLiteral(netAccessTypeEEnum, NetAccessType.PUBLIC);

		initEEnum(networkTypeEEnum, NetworkType.class, "NetworkType");
		addEEnumLiteral(networkTypeEEnum, NetworkType.INTRANET);
		addEEnumLiteral(networkTypeEEnum, NetworkType.INTERNET);

		initEEnum(criticalLevelEEnum, CriticalLevel.class, "CriticalLevel");
		addEEnumLiteral(criticalLevelEEnum, CriticalLevel.VERY_LOW);
		addEEnumLiteral(criticalLevelEEnum, CriticalLevel.LOW);
		addEEnumLiteral(criticalLevelEEnum, CriticalLevel.HIGH);
		addEEnumLiteral(criticalLevelEEnum, CriticalLevel.VERY_HIGH);

		// Create resource
		createResource(eNS_URI);
	}

} //ArchPackageImpl
