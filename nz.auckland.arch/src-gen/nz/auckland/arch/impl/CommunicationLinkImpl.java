/**
 */
package nz.auckland.arch.impl;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.CommunicationLink;
import nz.auckland.arch.CommunicationPort;
import nz.auckland.arch.LinkType;
import nz.auckland.arch.NetworkType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.CommunicationLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationLinkImpl#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationLinkImpl#getNetworkType <em>Network Type</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.CommunicationLinkImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationLinkImpl extends MinimalEObjectImpl.Container implements CommunicationLink {
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
	 * The default value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final LinkType LINK_TYPE_EDEFAULT = LinkType.HTTP;

	/**
	 * The cached value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected LinkType linkType = LINK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkType() <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkType()
	 * @generated
	 * @ordered
	 */
	protected static final NetworkType NETWORK_TYPE_EDEFAULT = NetworkType.INTRANET;

	/**
	 * The cached value of the '{@link #getNetworkType() <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkType()
	 * @generated
	 * @ordered
	 */
	protected NetworkType networkType = NETWORK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected CommunicationPort source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CommunicationPort target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.COMMUNICATION_LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getLinkType() {
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkType(LinkType newLinkType) {
		LinkType oldLinkType = linkType;
		linkType = newLinkType == null ? LINK_TYPE_EDEFAULT : newLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_LINK__LINK_TYPE,
					oldLinkType, linkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkType getNetworkType() {
		return networkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkType(NetworkType newNetworkType) {
		NetworkType oldNetworkType = networkType;
		networkType = newNetworkType == null ? NETWORK_TYPE_EDEFAULT : newNetworkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_LINK__NETWORK_TYPE,
					oldNetworkType, networkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationPort getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (CommunicationPort) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.COMMUNICATION_LINK__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(CommunicationPort newSource) {
		CommunicationPort oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_LINK__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationPort getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (CommunicationPort) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.COMMUNICATION_LINK__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPort basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(CommunicationPort newTarget) {
		CommunicationPort oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMMUNICATION_LINK__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchPackage.COMMUNICATION_LINK__NAME:
			return getName();
		case ArchPackage.COMMUNICATION_LINK__LINK_TYPE:
			return getLinkType();
		case ArchPackage.COMMUNICATION_LINK__NETWORK_TYPE:
			return getNetworkType();
		case ArchPackage.COMMUNICATION_LINK__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ArchPackage.COMMUNICATION_LINK__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArchPackage.COMMUNICATION_LINK__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.COMMUNICATION_LINK__LINK_TYPE:
			setLinkType((LinkType) newValue);
			return;
		case ArchPackage.COMMUNICATION_LINK__NETWORK_TYPE:
			setNetworkType((NetworkType) newValue);
			return;
		case ArchPackage.COMMUNICATION_LINK__SOURCE:
			setSource((CommunicationPort) newValue);
			return;
		case ArchPackage.COMMUNICATION_LINK__TARGET:
			setTarget((CommunicationPort) newValue);
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
		case ArchPackage.COMMUNICATION_LINK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.COMMUNICATION_LINK__LINK_TYPE:
			setLinkType(LINK_TYPE_EDEFAULT);
			return;
		case ArchPackage.COMMUNICATION_LINK__NETWORK_TYPE:
			setNetworkType(NETWORK_TYPE_EDEFAULT);
			return;
		case ArchPackage.COMMUNICATION_LINK__SOURCE:
			setSource((CommunicationPort) null);
			return;
		case ArchPackage.COMMUNICATION_LINK__TARGET:
			setTarget((CommunicationPort) null);
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
		case ArchPackage.COMMUNICATION_LINK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.COMMUNICATION_LINK__LINK_TYPE:
			return linkType != LINK_TYPE_EDEFAULT;
		case ArchPackage.COMMUNICATION_LINK__NETWORK_TYPE:
			return networkType != NETWORK_TYPE_EDEFAULT;
		case ArchPackage.COMMUNICATION_LINK__SOURCE:
			return source != null;
		case ArchPackage.COMMUNICATION_LINK__TARGET:
			return target != null;
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
		result.append(", linkType: ");
		result.append(linkType);
		result.append(", networkType: ");
		result.append(networkType);
		result.append(')');
		return result.toString();
	}

} //CommunicationLinkImpl
