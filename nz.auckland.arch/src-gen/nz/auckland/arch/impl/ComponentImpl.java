/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.Component;
import nz.auckland.arch.CriticalLevel;
import nz.auckland.arch.ExecutionEnvironment;
import nz.auckland.arch.Port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ComponentImpl#getPort <em>Port</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ComponentImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ComponentImpl#getDeploymentnode <em>Deploymentnode</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ComponentImpl#getCriticalLevel <em>Critical Level</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ComponentImpl#getSecurityCharacters <em>Security Characters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected boolean valid = VALID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeploymentnode() <em>Deploymentnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentnode()
	 * @generated
	 * @ordered
	 */
	protected ExecutionEnvironment deploymentnode;

	/**
	 * The default value of the '{@link #getCriticalLevel() <em>Critical Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CriticalLevel CRITICAL_LEVEL_EDEFAULT = CriticalLevel.VERY_LOW;

	/**
	 * The cached value of the '{@link #getCriticalLevel() <em>Critical Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalLevel()
	 * @generated
	 * @ordered
	 */
	protected CriticalLevel criticalLevel = CRITICAL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityCharacters() <em>Security Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityCharacters()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_CHARACTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityCharacters() <em>Security Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityCharacters()
	 * @generated
	 * @ordered
	 */
	protected String securityCharacters = SECURITY_CHARACTERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMPONENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, ArchPackage.COMPONENT__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid(boolean newValid) {
		boolean oldValid = valid;
		valid = newValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMPONENT__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment getDeploymentnode() {
		if (deploymentnode != null && deploymentnode.eIsProxy()) {
			InternalEObject oldDeploymentnode = (InternalEObject) deploymentnode;
			deploymentnode = (ExecutionEnvironment) eResolveProxy(oldDeploymentnode);
			if (deploymentnode != oldDeploymentnode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.COMPONENT__DEPLOYMENTNODE,
							oldDeploymentnode, deploymentnode));
			}
		}
		return deploymentnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironment basicGetDeploymentnode() {
		return deploymentnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentnode(ExecutionEnvironment newDeploymentnode) {
		ExecutionEnvironment oldDeploymentnode = deploymentnode;
		deploymentnode = newDeploymentnode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMPONENT__DEPLOYMENTNODE,
					oldDeploymentnode, deploymentnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalLevel getCriticalLevel() {
		return criticalLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalLevel(CriticalLevel newCriticalLevel) {
		CriticalLevel oldCriticalLevel = criticalLevel;
		criticalLevel = newCriticalLevel == null ? CRITICAL_LEVEL_EDEFAULT : newCriticalLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMPONENT__CRITICAL_LEVEL,
					oldCriticalLevel, criticalLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityCharacters() {
		return securityCharacters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityCharacters(String newSecurityCharacters) {
		String oldSecurityCharacters = securityCharacters;
		securityCharacters = newSecurityCharacters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMPONENT__SECURITY_CHARACTERS,
					oldSecurityCharacters, securityCharacters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.COMPONENT__PORT:
			return ((InternalEList<?>) getPort()).basicRemove(otherEnd, msgs);
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
		case ArchPackage.COMPONENT__NAME:
			return getName();
		case ArchPackage.COMPONENT__TYPE:
			return getType();
		case ArchPackage.COMPONENT__PORT:
			return getPort();
		case ArchPackage.COMPONENT__VALID:
			return isValid();
		case ArchPackage.COMPONENT__DEPLOYMENTNODE:
			if (resolve)
				return getDeploymentnode();
			return basicGetDeploymentnode();
		case ArchPackage.COMPONENT__CRITICAL_LEVEL:
			return getCriticalLevel();
		case ArchPackage.COMPONENT__SECURITY_CHARACTERS:
			return getSecurityCharacters();
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
		case ArchPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.COMPONENT__TYPE:
			setType((String) newValue);
			return;
		case ArchPackage.COMPONENT__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends Port>) newValue);
			return;
		case ArchPackage.COMPONENT__VALID:
			setValid((Boolean) newValue);
			return;
		case ArchPackage.COMPONENT__DEPLOYMENTNODE:
			setDeploymentnode((ExecutionEnvironment) newValue);
			return;
		case ArchPackage.COMPONENT__CRITICAL_LEVEL:
			setCriticalLevel((CriticalLevel) newValue);
			return;
		case ArchPackage.COMPONENT__SECURITY_CHARACTERS:
			setSecurityCharacters((String) newValue);
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
		case ArchPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.COMPONENT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArchPackage.COMPONENT__PORT:
			getPort().clear();
			return;
		case ArchPackage.COMPONENT__VALID:
			setValid(VALID_EDEFAULT);
			return;
		case ArchPackage.COMPONENT__DEPLOYMENTNODE:
			setDeploymentnode((ExecutionEnvironment) null);
			return;
		case ArchPackage.COMPONENT__CRITICAL_LEVEL:
			setCriticalLevel(CRITICAL_LEVEL_EDEFAULT);
			return;
		case ArchPackage.COMPONENT__SECURITY_CHARACTERS:
			setSecurityCharacters(SECURITY_CHARACTERS_EDEFAULT);
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
		case ArchPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.COMPONENT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ArchPackage.COMPONENT__PORT:
			return port != null && !port.isEmpty();
		case ArchPackage.COMPONENT__VALID:
			return valid != VALID_EDEFAULT;
		case ArchPackage.COMPONENT__DEPLOYMENTNODE:
			return deploymentnode != null;
		case ArchPackage.COMPONENT__CRITICAL_LEVEL:
			return criticalLevel != CRITICAL_LEVEL_EDEFAULT;
		case ArchPackage.COMPONENT__SECURITY_CHARACTERS:
			return SECURITY_CHARACTERS_EDEFAULT == null ? securityCharacters != null
					: !SECURITY_CHARACTERS_EDEFAULT.equals(securityCharacters);
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
		result.append(", type: ");
		result.append(type);
		result.append(", valid: ");
		result.append(valid);
		result.append(", criticalLevel: ");
		result.append(criticalLevel);
		result.append(", securityCharacters: ");
		result.append(securityCharacters);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
