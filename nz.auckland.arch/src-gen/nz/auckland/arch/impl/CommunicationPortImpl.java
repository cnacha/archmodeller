/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.CommunicationPort;
import nz.auckland.arch.ExecutionEnvironment;
import nz.auckland.arch.Port;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.CommunicationPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationPortImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationPortImpl#getNode <em>Node</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationPortImpl#getNamedport <em>Namedport</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationPortImpl#isHasFirewall <em>Has Firewall</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationPortImpl#isHasAuthentication <em>Has Authentication</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationPortImpl#isHasAuthorization <em>Has Authorization</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationPortImpl#isHasInputSanitization <em>Has Input Sanitization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationPortImpl extends MinimalEObjectImpl.Container implements CommunicationPort {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected int portNumber = PORT_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected ExecutionEnvironment node;

	/**
	 * The cached value of the '{@link #getNamedport() <em>Namedport</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedport()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> namedport;

	/**
	 * The default value of the '{@link #isHasFirewall() <em>Has Firewall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasFirewall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_FIREWALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasFirewall() <em>Has Firewall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasFirewall()
	 * @generated
	 * @ordered
	 */
	protected boolean hasFirewall = HAS_FIREWALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasAuthentication() <em>Has Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAuthentication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_AUTHENTICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasAuthentication() <em>Has Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAuthentication()
	 * @generated
	 * @ordered
	 */
	protected boolean hasAuthentication = HAS_AUTHENTICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasAuthorization() <em>Has Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAuthorization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_AUTHORIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasAuthorization() <em>Has Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAuthorization()
	 * @generated
	 * @ordered
	 */
	protected boolean hasAuthorization = HAS_AUTHORIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasInputSanitization() <em>Has Input Sanitization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasInputSanitization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_INPUT_SANITIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasInputSanitization() <em>Has Input Sanitization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasInputSanitization()
	 * @generated
	 * @ordered
	 */
	protected boolean hasInputSanitization = HAS_INPUT_SANITIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.COMMUNICATION_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortNumber(int newPortNumber) {
		int oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_PORT__PORT_NUMBER,
					oldPortNumber, portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionEnvironment getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject) node;
			node = (ExecutionEnvironment) eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.COMMUNICATION_PORT__NODE,
							oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNode(ExecutionEnvironment newNode) {
		ExecutionEnvironment oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_PORT__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getNamedport() {
		if (namedport == null) {
			namedport = new EObjectResolvingEList<Port>(Port.class, this, ArchPackage.COMMUNICATION_PORT__NAMEDPORT);
		}
		return namedport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasFirewall() {
		return hasFirewall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasFirewall(boolean newHasFirewall) {
		boolean oldHasFirewall = hasFirewall;
		hasFirewall = newHasFirewall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_PORT__HAS_FIREWALL,
					oldHasFirewall, hasFirewall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasAuthentication() {
		return hasAuthentication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasAuthentication(boolean newHasAuthentication) {
		boolean oldHasAuthentication = hasAuthentication;
		hasAuthentication = newHasAuthentication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_PORT__HAS_AUTHENTICATION,
					oldHasAuthentication, hasAuthentication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasAuthorization() {
		return hasAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasAuthorization(boolean newHasAuthorization) {
		boolean oldHasAuthorization = hasAuthorization;
		hasAuthorization = newHasAuthorization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_PORT__HAS_AUTHORIZATION,
					oldHasAuthorization, hasAuthorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasInputSanitization() {
		return hasInputSanitization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasInputSanitization(boolean newHasInputSanitization) {
		boolean oldHasInputSanitization = hasInputSanitization;
		hasInputSanitization = newHasInputSanitization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ArchPackage.COMMUNICATION_PORT__HAS_INPUT_SANITIZATION, oldHasInputSanitization,
					hasInputSanitization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchPackage.COMMUNICATION_PORT__NAME:
			return getName();
		case ArchPackage.COMMUNICATION_PORT__PORT_NUMBER:
			return getPortNumber();
		case ArchPackage.COMMUNICATION_PORT__NODE:
			if (resolve)
				return getNode();
			return basicGetNode();
		case ArchPackage.COMMUNICATION_PORT__NAMEDPORT:
			return getNamedport();
		case ArchPackage.COMMUNICATION_PORT__HAS_FIREWALL:
			return isHasFirewall();
		case ArchPackage.COMMUNICATION_PORT__HAS_AUTHENTICATION:
			return isHasAuthentication();
		case ArchPackage.COMMUNICATION_PORT__HAS_AUTHORIZATION:
			return isHasAuthorization();
		case ArchPackage.COMMUNICATION_PORT__HAS_INPUT_SANITIZATION:
			return isHasInputSanitization();
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
		case ArchPackage.COMMUNICATION_PORT__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.COMMUNICATION_PORT__PORT_NUMBER:
			setPortNumber((Integer) newValue);
			return;
		case ArchPackage.COMMUNICATION_PORT__NODE:
			setNode((ExecutionEnvironment) newValue);
			return;
		case ArchPackage.COMMUNICATION_PORT__NAMEDPORT:
			getNamedport().clear();
			getNamedport().addAll((Collection<? extends Port>) newValue);
			return;
		case ArchPackage.COMMUNICATION_PORT__HAS_FIREWALL:
			setHasFirewall((Boolean) newValue);
			return;
		case ArchPackage.COMMUNICATION_PORT__HAS_AUTHENTICATION:
			setHasAuthentication((Boolean) newValue);
			return;
		case ArchPackage.COMMUNICATION_PORT__HAS_AUTHORIZATION:
			setHasAuthorization((Boolean) newValue);
			return;
		case ArchPackage.COMMUNICATION_PORT__HAS_INPUT_SANITIZATION:
			setHasInputSanitization((Boolean) newValue);
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
		case ArchPackage.COMMUNICATION_PORT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.COMMUNICATION_PORT__PORT_NUMBER:
			setPortNumber(PORT_NUMBER_EDEFAULT);
			return;
		case ArchPackage.COMMUNICATION_PORT__NODE:
			setNode((ExecutionEnvironment) null);
			return;
		case ArchPackage.COMMUNICATION_PORT__NAMEDPORT:
			getNamedport().clear();
			return;
		case ArchPackage.COMMUNICATION_PORT__HAS_FIREWALL:
			setHasFirewall(HAS_FIREWALL_EDEFAULT);
			return;
		case ArchPackage.COMMUNICATION_PORT__HAS_AUTHENTICATION:
			setHasAuthentication(HAS_AUTHENTICATION_EDEFAULT);
			return;
		case ArchPackage.COMMUNICATION_PORT__HAS_AUTHORIZATION:
			setHasAuthorization(HAS_AUTHORIZATION_EDEFAULT);
			return;
		case ArchPackage.COMMUNICATION_PORT__HAS_INPUT_SANITIZATION:
			setHasInputSanitization(HAS_INPUT_SANITIZATION_EDEFAULT);
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
		case ArchPackage.COMMUNICATION_PORT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.COMMUNICATION_PORT__PORT_NUMBER:
			return portNumber != PORT_NUMBER_EDEFAULT;
		case ArchPackage.COMMUNICATION_PORT__NODE:
			return node != null;
		case ArchPackage.COMMUNICATION_PORT__NAMEDPORT:
			return namedport != null && !namedport.isEmpty();
		case ArchPackage.COMMUNICATION_PORT__HAS_FIREWALL:
			return hasFirewall != HAS_FIREWALL_EDEFAULT;
		case ArchPackage.COMMUNICATION_PORT__HAS_AUTHENTICATION:
			return hasAuthentication != HAS_AUTHENTICATION_EDEFAULT;
		case ArchPackage.COMMUNICATION_PORT__HAS_AUTHORIZATION:
			return hasAuthorization != HAS_AUTHORIZATION_EDEFAULT;
		case ArchPackage.COMMUNICATION_PORT__HAS_INPUT_SANITIZATION:
			return hasInputSanitization != HAS_INPUT_SANITIZATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", portNumber: ");
		result.append(portNumber);
		result.append(", hasFirewall: ");
		result.append(hasFirewall);
		result.append(", hasAuthentication: ");
		result.append(hasAuthentication);
		result.append(", hasAuthorization: ");
		result.append(hasAuthorization);
		result.append(", hasInputSanitization: ");
		result.append(hasInputSanitization);
		result.append(')');
		return result.toString();
	}

} //CommunicationPortImpl
