/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.RoleType;

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
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.ConnectorTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ConnectorTypeImpl#getRoletype <em>Roletype</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ConnectorTypeImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ConnectorTypeImpl#getEaConnector <em>Ea Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorTypeImpl extends MinimalEObjectImpl.Container implements ConnectorType {
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
	 * The cached value of the '{@link #getRoletype() <em>Roletype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoletype()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleType> roletype;

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
	 * The cached value of the '{@link #getEaConnector() <em>Ea Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEaConnector()
	 * @generated
	 * @ordered
	 */
	protected ConnectorType eaConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.CONNECTOR_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.CONNECTOR_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RoleType> getRoletype() {
		if (roletype == null) {
			roletype = new EObjectContainmentEList<RoleType>(RoleType.class, this,
					ArchPackage.CONNECTOR_TYPE__ROLETYPE);
		}
		return roletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValid(boolean newValid) {
		boolean oldValid = valid;
		valid = newValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.CONNECTOR_TYPE__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorType getEaConnector() {
		if (eaConnector != null && eaConnector.eIsProxy()) {
			InternalEObject oldEaConnector = (InternalEObject) eaConnector;
			eaConnector = (ConnectorType) eResolveProxy(oldEaConnector);
			if (eaConnector != oldEaConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.CONNECTOR_TYPE__EA_CONNECTOR,
							oldEaConnector, eaConnector));
			}
		}
		return eaConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType basicGetEaConnector() {
		return eaConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEaConnector(ConnectorType newEaConnector) {
		ConnectorType oldEaConnector = eaConnector;
		eaConnector = newEaConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.CONNECTOR_TYPE__EA_CONNECTOR,
					oldEaConnector, eaConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.CONNECTOR_TYPE__ROLETYPE:
			return ((InternalEList<?>) getRoletype()).basicRemove(otherEnd, msgs);
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
		case ArchPackage.CONNECTOR_TYPE__NAME:
			return getName();
		case ArchPackage.CONNECTOR_TYPE__ROLETYPE:
			return getRoletype();
		case ArchPackage.CONNECTOR_TYPE__VALID:
			return isValid();
		case ArchPackage.CONNECTOR_TYPE__EA_CONNECTOR:
			if (resolve)
				return getEaConnector();
			return basicGetEaConnector();
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
		case ArchPackage.CONNECTOR_TYPE__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.CONNECTOR_TYPE__ROLETYPE:
			getRoletype().clear();
			getRoletype().addAll((Collection<? extends RoleType>) newValue);
			return;
		case ArchPackage.CONNECTOR_TYPE__VALID:
			setValid((Boolean) newValue);
			return;
		case ArchPackage.CONNECTOR_TYPE__EA_CONNECTOR:
			setEaConnector((ConnectorType) newValue);
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
		case ArchPackage.CONNECTOR_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.CONNECTOR_TYPE__ROLETYPE:
			getRoletype().clear();
			return;
		case ArchPackage.CONNECTOR_TYPE__VALID:
			setValid(VALID_EDEFAULT);
			return;
		case ArchPackage.CONNECTOR_TYPE__EA_CONNECTOR:
			setEaConnector((ConnectorType) null);
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
		case ArchPackage.CONNECTOR_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.CONNECTOR_TYPE__ROLETYPE:
			return roletype != null && !roletype.isEmpty();
		case ArchPackage.CONNECTOR_TYPE__VALID:
			return valid != VALID_EDEFAULT;
		case ArchPackage.CONNECTOR_TYPE__EA_CONNECTOR:
			return eaConnector != null;
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
		result.append(", valid: ");
		result.append(valid);
		result.append(')');
		return result.toString();
	}

} //ConnectorTypeImpl
