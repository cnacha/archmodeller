/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.ArchStyle;
import nz.auckland.arch.ComponentType;
import nz.auckland.arch.ConnectorType;

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
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.ArchStyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ArchStyleImpl#getConnectortype <em>Connectortype</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ArchStyleImpl#getComponenttype <em>Componenttype</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.ArchStyleImpl#isValid <em>Valid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchStyleImpl extends MinimalEObjectImpl.Container implements ArchStyle {
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
	 * The cached value of the '{@link #getConnectortype() <em>Connectortype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectortype()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorType> connectortype;

	/**
	 * The cached value of the '{@link #getComponenttype() <em>Componenttype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponenttype()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> componenttype;

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
	protected ArchStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.ARCH_STYLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ARCH_STYLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnectortype() {
		if (connectortype == null) {
			connectortype = new EObjectContainmentEList<ConnectorType>(ConnectorType.class, this,
					ArchPackage.ARCH_STYLE__CONNECTORTYPE);
		}
		return connectortype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getComponenttype() {
		if (componenttype == null) {
			componenttype = new EObjectContainmentEList<ComponentType>(ComponentType.class, this,
					ArchPackage.ARCH_STYLE__COMPONENTTYPE);
		}
		return componenttype;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ARCH_STYLE__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.ARCH_STYLE__CONNECTORTYPE:
			return ((InternalEList<?>) getConnectortype()).basicRemove(otherEnd, msgs);
		case ArchPackage.ARCH_STYLE__COMPONENTTYPE:
			return ((InternalEList<?>) getComponenttype()).basicRemove(otherEnd, msgs);
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
		case ArchPackage.ARCH_STYLE__NAME:
			return getName();
		case ArchPackage.ARCH_STYLE__CONNECTORTYPE:
			return getConnectortype();
		case ArchPackage.ARCH_STYLE__COMPONENTTYPE:
			return getComponenttype();
		case ArchPackage.ARCH_STYLE__VALID:
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
		case ArchPackage.ARCH_STYLE__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.ARCH_STYLE__CONNECTORTYPE:
			getConnectortype().clear();
			getConnectortype().addAll((Collection<? extends ConnectorType>) newValue);
			return;
		case ArchPackage.ARCH_STYLE__COMPONENTTYPE:
			getComponenttype().clear();
			getComponenttype().addAll((Collection<? extends ComponentType>) newValue);
			return;
		case ArchPackage.ARCH_STYLE__VALID:
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
		case ArchPackage.ARCH_STYLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.ARCH_STYLE__CONNECTORTYPE:
			getConnectortype().clear();
			return;
		case ArchPackage.ARCH_STYLE__COMPONENTTYPE:
			getComponenttype().clear();
			return;
		case ArchPackage.ARCH_STYLE__VALID:
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
		case ArchPackage.ARCH_STYLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.ARCH_STYLE__CONNECTORTYPE:
			return connectortype != null && !connectortype.isEmpty();
		case ArchPackage.ARCH_STYLE__COMPONENTTYPE:
			return componenttype != null && !componenttype.isEmpty();
		case ArchPackage.ARCH_STYLE__VALID:
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

} //ArchStyleImpl
