/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.Event;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.PortImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.PortImpl#getRole <em>Role</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.PortImpl#getType <em>Type</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.PortImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.PortImpl#isInsecure <em>Insecure</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.PortImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port {
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
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

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
	 * The default value of the '{@link #isInsecure() <em>Insecure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsecure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSECURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsecure() <em>Insecure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsecure()
	 * @generated
	 * @ordered
	 */
	protected boolean insecure = INSECURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributes() <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected String attributes = ATTRIBUTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, ArchPackage.PORT__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectResolvingEList<Role>(Role.class, this, ArchPackage.PORT__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.PORT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.PORT__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInsecure() {
		return insecure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsecure(boolean newInsecure) {
		boolean oldInsecure = insecure;
		insecure = newInsecure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.PORT__INSECURE, oldInsecure, insecure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributes(String newAttributes) {
		String oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.PORT__ATTRIBUTES, oldAttributes,
					attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.PORT__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
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
		case ArchPackage.PORT__NAME:
			return getName();
		case ArchPackage.PORT__EVENTS:
			return getEvents();
		case ArchPackage.PORT__ROLE:
			return getRole();
		case ArchPackage.PORT__TYPE:
			return getType();
		case ArchPackage.PORT__VALID:
			return isValid();
		case ArchPackage.PORT__INSECURE:
			return isInsecure();
		case ArchPackage.PORT__ATTRIBUTES:
			return getAttributes();
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
		case ArchPackage.PORT__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.PORT__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case ArchPackage.PORT__ROLE:
			getRole().clear();
			getRole().addAll((Collection<? extends Role>) newValue);
			return;
		case ArchPackage.PORT__TYPE:
			setType((String) newValue);
			return;
		case ArchPackage.PORT__VALID:
			setValid((Boolean) newValue);
			return;
		case ArchPackage.PORT__INSECURE:
			setInsecure((Boolean) newValue);
			return;
		case ArchPackage.PORT__ATTRIBUTES:
			setAttributes((String) newValue);
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
		case ArchPackage.PORT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.PORT__EVENTS:
			getEvents().clear();
			return;
		case ArchPackage.PORT__ROLE:
			getRole().clear();
			return;
		case ArchPackage.PORT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArchPackage.PORT__VALID:
			setValid(VALID_EDEFAULT);
			return;
		case ArchPackage.PORT__INSECURE:
			setInsecure(INSECURE_EDEFAULT);
			return;
		case ArchPackage.PORT__ATTRIBUTES:
			setAttributes(ATTRIBUTES_EDEFAULT);
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
		case ArchPackage.PORT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.PORT__EVENTS:
			return events != null && !events.isEmpty();
		case ArchPackage.PORT__ROLE:
			return role != null && !role.isEmpty();
		case ArchPackage.PORT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ArchPackage.PORT__VALID:
			return valid != VALID_EDEFAULT;
		case ArchPackage.PORT__INSECURE:
			return insecure != INSECURE_EDEFAULT;
		case ArchPackage.PORT__ATTRIBUTES:
			return ATTRIBUTES_EDEFAULT == null ? attributes != null : !ATTRIBUTES_EDEFAULT.equals(attributes);
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
		result.append(", insecure: ");
		result.append(insecure);
		result.append(", attributes: ");
		result.append(attributes);
		result.append(')');
		return result.toString();
	}

} //PortImpl
