/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.Role;

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
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ConnectorImpl#getRole <em>Role</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ConnectorImpl#getConnectortype <em>Connectortype</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ConnectorImpl#isValid <em>Valid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
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
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * The cached value of the '{@link #getConnectortype() <em>Connectortype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectortype()
	 * @generated
	 * @ordered
	 */
	protected ConnectorType connectortype;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.CONNECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.CONNECTOR__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<Role>(Role.class, this, ArchPackage.CONNECTOR__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType getConnectortype() {
		if (connectortype != null && connectortype.eIsProxy()) {
			InternalEObject oldConnectortype = (InternalEObject) connectortype;
			connectortype = (ConnectorType) eResolveProxy(oldConnectortype);
			if (connectortype != oldConnectortype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.CONNECTOR__CONNECTORTYPE,
							oldConnectortype, connectortype));
			}
		}
		return connectortype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType basicGetConnectortype() {
		return connectortype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectortype(ConnectorType newConnectortype) {
		ConnectorType oldConnectortype = connectortype;
		connectortype = newConnectortype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.CONNECTOR__CONNECTORTYPE,
					oldConnectortype, connectortype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.CONNECTOR__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.CONNECTOR__ROLE:
			return ((InternalEList<?>) getRole()).basicRemove(otherEnd, msgs);
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
		case ArchPackage.CONNECTOR__NAME:
			return getName();
		case ArchPackage.CONNECTOR__TYPE:
			return getType();
		case ArchPackage.CONNECTOR__ROLE:
			return getRole();
		case ArchPackage.CONNECTOR__CONNECTORTYPE:
			if (resolve)
				return getConnectortype();
			return basicGetConnectortype();
		case ArchPackage.CONNECTOR__VALID:
			return isValid();
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
		case ArchPackage.CONNECTOR__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.CONNECTOR__TYPE:
			setType((String) newValue);
			return;
		case ArchPackage.CONNECTOR__ROLE:
			getRole().clear();
			getRole().addAll((Collection<? extends Role>) newValue);
			return;
		case ArchPackage.CONNECTOR__CONNECTORTYPE:
			setConnectortype((ConnectorType) newValue);
			return;
		case ArchPackage.CONNECTOR__VALID:
			setValid((Boolean) newValue);
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
		case ArchPackage.CONNECTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.CONNECTOR__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArchPackage.CONNECTOR__ROLE:
			getRole().clear();
			return;
		case ArchPackage.CONNECTOR__CONNECTORTYPE:
			setConnectortype((ConnectorType) null);
			return;
		case ArchPackage.CONNECTOR__VALID:
			setValid(VALID_EDEFAULT);
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
		case ArchPackage.CONNECTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.CONNECTOR__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ArchPackage.CONNECTOR__ROLE:
			return role != null && !role.isEmpty();
		case ArchPackage.CONNECTOR__CONNECTORTYPE:
			return connectortype != null;
		case ArchPackage.CONNECTOR__VALID:
			return valid != VALID_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
