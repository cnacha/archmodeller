/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.ArchStyle;
import nz.auckland.arch.CommunicationLink;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Device;
import nz.auckland.arch.VerificationProperty;

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
 * An implementation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.DesignModelImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.DesignModelImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.DesignModelImpl#getArchstyle <em>Archstyle</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.DesignModelImpl#getVerifyProperty <em>Verify Property</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.DesignModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.DesignModelImpl#getHost <em>Host</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.DesignModelImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignModelImpl extends MinimalEObjectImpl.Container implements DesignModel {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

	/**
	 * The cached value of the '{@link #getArchstyle() <em>Archstyle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchstyle()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchStyle> archstyle;

	/**
	 * The cached value of the '{@link #getVerifyProperty() <em>Verify Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationProperty> verifyProperty;

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
	 * The cached value of the '{@link #getHost() <em>Host</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> host;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.DESIGN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this,
					ArchPackage.DESIGN_MODEL__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentEList<Connector>(Connector.class, this,
					ArchPackage.DESIGN_MODEL__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchStyle> getArchstyle() {
		if (archstyle == null) {
			archstyle = new EObjectContainmentEList<ArchStyle>(ArchStyle.class, this,
					ArchPackage.DESIGN_MODEL__ARCHSTYLE);
		}
		return archstyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VerificationProperty> getVerifyProperty() {
		if (verifyProperty == null) {
			verifyProperty = new EObjectContainmentEList<VerificationProperty>(VerificationProperty.class, this,
					ArchPackage.DESIGN_MODEL__VERIFY_PROPERTY);
		}
		return verifyProperty;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.DESIGN_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getHost() {
		if (host == null) {
			host = new EObjectContainmentEList<Device>(Device.class, this, ArchPackage.DESIGN_MODEL__HOST);
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLink> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<CommunicationLink>(CommunicationLink.class, this,
					ArchPackage.DESIGN_MODEL__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.DESIGN_MODEL__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		case ArchPackage.DESIGN_MODEL__CONNECTOR:
			return ((InternalEList<?>) getConnector()).basicRemove(otherEnd, msgs);
		case ArchPackage.DESIGN_MODEL__ARCHSTYLE:
			return ((InternalEList<?>) getArchstyle()).basicRemove(otherEnd, msgs);
		case ArchPackage.DESIGN_MODEL__VERIFY_PROPERTY:
			return ((InternalEList<?>) getVerifyProperty()).basicRemove(otherEnd, msgs);
		case ArchPackage.DESIGN_MODEL__HOST:
			return ((InternalEList<?>) getHost()).basicRemove(otherEnd, msgs);
		case ArchPackage.DESIGN_MODEL__LINK:
			return ((InternalEList<?>) getLink()).basicRemove(otherEnd, msgs);
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
		case ArchPackage.DESIGN_MODEL__COMPONENT:
			return getComponent();
		case ArchPackage.DESIGN_MODEL__CONNECTOR:
			return getConnector();
		case ArchPackage.DESIGN_MODEL__ARCHSTYLE:
			return getArchstyle();
		case ArchPackage.DESIGN_MODEL__VERIFY_PROPERTY:
			return getVerifyProperty();
		case ArchPackage.DESIGN_MODEL__NAME:
			return getName();
		case ArchPackage.DESIGN_MODEL__HOST:
			return getHost();
		case ArchPackage.DESIGN_MODEL__LINK:
			return getLink();
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
		case ArchPackage.DESIGN_MODEL__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		case ArchPackage.DESIGN_MODEL__CONNECTOR:
			getConnector().clear();
			getConnector().addAll((Collection<? extends Connector>) newValue);
			return;
		case ArchPackage.DESIGN_MODEL__ARCHSTYLE:
			getArchstyle().clear();
			getArchstyle().addAll((Collection<? extends ArchStyle>) newValue);
			return;
		case ArchPackage.DESIGN_MODEL__VERIFY_PROPERTY:
			getVerifyProperty().clear();
			getVerifyProperty().addAll((Collection<? extends VerificationProperty>) newValue);
			return;
		case ArchPackage.DESIGN_MODEL__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.DESIGN_MODEL__HOST:
			getHost().clear();
			getHost().addAll((Collection<? extends Device>) newValue);
			return;
		case ArchPackage.DESIGN_MODEL__LINK:
			getLink().clear();
			getLink().addAll((Collection<? extends CommunicationLink>) newValue);
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
		case ArchPackage.DESIGN_MODEL__COMPONENT:
			getComponent().clear();
			return;
		case ArchPackage.DESIGN_MODEL__CONNECTOR:
			getConnector().clear();
			return;
		case ArchPackage.DESIGN_MODEL__ARCHSTYLE:
			getArchstyle().clear();
			return;
		case ArchPackage.DESIGN_MODEL__VERIFY_PROPERTY:
			getVerifyProperty().clear();
			return;
		case ArchPackage.DESIGN_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.DESIGN_MODEL__HOST:
			getHost().clear();
			return;
		case ArchPackage.DESIGN_MODEL__LINK:
			getLink().clear();
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
		case ArchPackage.DESIGN_MODEL__COMPONENT:
			return component != null && !component.isEmpty();
		case ArchPackage.DESIGN_MODEL__CONNECTOR:
			return connector != null && !connector.isEmpty();
		case ArchPackage.DESIGN_MODEL__ARCHSTYLE:
			return archstyle != null && !archstyle.isEmpty();
		case ArchPackage.DESIGN_MODEL__VERIFY_PROPERTY:
			return verifyProperty != null && !verifyProperty.isEmpty();
		case ArchPackage.DESIGN_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.DESIGN_MODEL__HOST:
			return host != null && !host.isEmpty();
		case ArchPackage.DESIGN_MODEL__LINK:
			return link != null && !link.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //DesignModelImpl
