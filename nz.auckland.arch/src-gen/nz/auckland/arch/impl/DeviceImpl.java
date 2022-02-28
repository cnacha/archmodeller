/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.Device;
import nz.auckland.arch.ExecutionEnvironment;
import nz.auckland.arch.HostType;
import nz.auckland.arch.NetAccessType;

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
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.DeviceImpl#getNetAccessType <em>Net Access Type</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.DeviceImpl#getNode <em>Node</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.DeviceImpl#getHostType <em>Host Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
	/**
	 * The default value of the '{@link #getNetAccessType() <em>Net Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final NetAccessType NET_ACCESS_TYPE_EDEFAULT = NetAccessType.PRIVATE;

	/**
	 * The cached value of the '{@link #getNetAccessType() <em>Net Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetAccessType()
	 * @generated
	 * @ordered
	 */
	protected NetAccessType netAccessType = NET_ACCESS_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionEnvironment> node;

	/**
	 * The default value of the '{@link #getHostType() <em>Host Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostType()
	 * @generated
	 * @ordered
	 */
	protected static final HostType HOST_TYPE_EDEFAULT = HostType.VIRTUAL_MACHINE;

	/**
	 * The cached value of the '{@link #getHostType() <em>Host Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostType()
	 * @generated
	 * @ordered
	 */
	protected HostType hostType = HOST_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetAccessType getNetAccessType() {
		return netAccessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetAccessType(NetAccessType newNetAccessType) {
		NetAccessType oldNetAccessType = netAccessType;
		netAccessType = newNetAccessType == null ? NET_ACCESS_TYPE_EDEFAULT : newNetAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.DEVICE__NET_ACCESS_TYPE, oldNetAccessType,
					netAccessType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExecutionEnvironment> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<ExecutionEnvironment>(ExecutionEnvironment.class, this,
					ArchPackage.DEVICE__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostType getHostType() {
		return hostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostType(HostType newHostType) {
		HostType oldHostType = hostType;
		hostType = newHostType == null ? HOST_TYPE_EDEFAULT : newHostType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.DEVICE__HOST_TYPE, oldHostType,
					hostType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.DEVICE__NODE:
			return ((InternalEList<?>) getNode()).basicRemove(otherEnd, msgs);
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
		case ArchPackage.DEVICE__NET_ACCESS_TYPE:
			return getNetAccessType();
		case ArchPackage.DEVICE__NAME:
			return getName();
		case ArchPackage.DEVICE__NODE:
			return getNode();
		case ArchPackage.DEVICE__HOST_TYPE:
			return getHostType();
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
		case ArchPackage.DEVICE__NET_ACCESS_TYPE:
			setNetAccessType((NetAccessType) newValue);
			return;
		case ArchPackage.DEVICE__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.DEVICE__NODE:
			getNode().clear();
			getNode().addAll((Collection<? extends ExecutionEnvironment>) newValue);
			return;
		case ArchPackage.DEVICE__HOST_TYPE:
			setHostType((HostType) newValue);
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
		case ArchPackage.DEVICE__NET_ACCESS_TYPE:
			setNetAccessType(NET_ACCESS_TYPE_EDEFAULT);
			return;
		case ArchPackage.DEVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.DEVICE__NODE:
			getNode().clear();
			return;
		case ArchPackage.DEVICE__HOST_TYPE:
			setHostType(HOST_TYPE_EDEFAULT);
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
		case ArchPackage.DEVICE__NET_ACCESS_TYPE:
			return netAccessType != NET_ACCESS_TYPE_EDEFAULT;
		case ArchPackage.DEVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.DEVICE__NODE:
			return node != null && !node.isEmpty();
		case ArchPackage.DEVICE__HOST_TYPE:
			return hostType != HOST_TYPE_EDEFAULT;
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
		result.append(" (netAccessType: ");
		result.append(netAccessType);
		result.append(", name: ");
		result.append(name);
		result.append(", hostType: ");
		result.append(hostType);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
