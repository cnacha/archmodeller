/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.ComponentType;
import nz.auckland.arch.PortType;

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
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.ComponentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ComponentTypeImpl#getPorttype <em>Porttype</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ComponentTypeImpl#isValid <em>Valid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentTypeImpl extends MinimalEObjectImpl.Container implements ComponentType {
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
	 * The cached value of the '{@link #getPorttype() <em>Porttype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorttype()
	 * @generated
	 * @ordered
	 */
	protected EList<PortType> porttype;

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
	protected ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.COMPONENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMPONENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortType> getPorttype() {
		if (porttype == null) {
			porttype = new EObjectContainmentEList<PortType>(PortType.class, this,
					ArchPackage.COMPONENT_TYPE__PORTTYPE);
		}
		return porttype;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.COMPONENT_TYPE__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.COMPONENT_TYPE__PORTTYPE:
			return ((InternalEList<?>) getPorttype()).basicRemove(otherEnd, msgs);
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
		case ArchPackage.COMPONENT_TYPE__NAME:
			return getName();
		case ArchPackage.COMPONENT_TYPE__PORTTYPE:
			return getPorttype();
		case ArchPackage.COMPONENT_TYPE__VALID:
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
		case ArchPackage.COMPONENT_TYPE__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.COMPONENT_TYPE__PORTTYPE:
			getPorttype().clear();
			getPorttype().addAll((Collection<? extends PortType>) newValue);
			return;
		case ArchPackage.COMPONENT_TYPE__VALID:
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
		case ArchPackage.COMPONENT_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.COMPONENT_TYPE__PORTTYPE:
			getPorttype().clear();
			return;
		case ArchPackage.COMPONENT_TYPE__VALID:
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
		case ArchPackage.COMPONENT_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.COMPONENT_TYPE__PORTTYPE:
			return porttype != null && !porttype.isEmpty();
		case ArchPackage.COMPONENT_TYPE__VALID:
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
		result.append(", valid: ");
		result.append(valid);
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
