/**
 */
package nz.auckland.arch.impl;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ExprOperator;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RoleImpl#getRoletype <em>Roletype</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RoleImpl#getType <em>Type</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RoleImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RoleImpl#getNextRoleExpr <em>Next Role Expr</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RoleImpl#getOperatorExpr <em>Operator Expr</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RoleImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends MinimalEObjectImpl.Container implements Role {
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
	 * The cached value of the '{@link #getRoletype() <em>Roletype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoletype()
	 * @generated
	 * @ordered
	 */
	protected RoleType roletype;

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
	 * The cached value of the '{@link #getNextRoleExpr() <em>Next Role Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextRoleExpr()
	 * @generated
	 * @ordered
	 */
	protected Role nextRoleExpr;

	/**
	 * The default value of the '{@link #getOperatorExpr() <em>Operator Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorExpr()
	 * @generated
	 * @ordered
	 */
	protected static final ExprOperator OPERATOR_EXPR_EDEFAULT = ExprOperator.COUPLING;

	/**
	 * The cached value of the '{@link #getOperatorExpr() <em>Operator Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorExpr()
	 * @generated
	 * @ordered
	 */
	protected ExprOperator operatorExpr = OPERATOR_EXPR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.ROLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoletype() {
		if (roletype != null && roletype.eIsProxy()) {
			InternalEObject oldRoletype = (InternalEObject) roletype;
			roletype = (RoleType) eResolveProxy(oldRoletype);
			if (roletype != oldRoletype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.ROLE__ROLETYPE, oldRoletype,
							roletype));
			}
		}
		return roletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoletype() {
		return roletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoletype(RoleType newRoletype) {
		RoleType oldRoletype = roletype;
		roletype = newRoletype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ROLE__ROLETYPE, oldRoletype, roletype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ROLE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ROLE__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getNextRoleExpr() {
		if (nextRoleExpr != null && nextRoleExpr.eIsProxy()) {
			InternalEObject oldNextRoleExpr = (InternalEObject) nextRoleExpr;
			nextRoleExpr = (Role) eResolveProxy(oldNextRoleExpr);
			if (nextRoleExpr != oldNextRoleExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.ROLE__NEXT_ROLE_EXPR,
							oldNextRoleExpr, nextRoleExpr));
			}
		}
		return nextRoleExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetNextRoleExpr() {
		return nextRoleExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextRoleExpr(Role newNextRoleExpr) {
		Role oldNextRoleExpr = nextRoleExpr;
		nextRoleExpr = newNextRoleExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ROLE__NEXT_ROLE_EXPR, oldNextRoleExpr,
					nextRoleExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExprOperator getOperatorExpr() {
		return operatorExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorExpr(ExprOperator newOperatorExpr) {
		ExprOperator oldOperatorExpr = operatorExpr;
		operatorExpr = newOperatorExpr == null ? OPERATOR_EXPR_EDEFAULT : newOperatorExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ROLE__OPERATOR_EXPR, oldOperatorExpr,
					operatorExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject) connector;
			connector = (Connector) eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.ROLE__CONNECTOR, oldConnector,
							connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnector(Connector newConnector) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ROLE__CONNECTOR, oldConnector,
					connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchPackage.ROLE__NAME:
			return getName();
		case ArchPackage.ROLE__ROLETYPE:
			if (resolve)
				return getRoletype();
			return basicGetRoletype();
		case ArchPackage.ROLE__TYPE:
			return getType();
		case ArchPackage.ROLE__VALID:
			return isValid();
		case ArchPackage.ROLE__NEXT_ROLE_EXPR:
			if (resolve)
				return getNextRoleExpr();
			return basicGetNextRoleExpr();
		case ArchPackage.ROLE__OPERATOR_EXPR:
			return getOperatorExpr();
		case ArchPackage.ROLE__CONNECTOR:
			if (resolve)
				return getConnector();
			return basicGetConnector();
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
		case ArchPackage.ROLE__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.ROLE__ROLETYPE:
			setRoletype((RoleType) newValue);
			return;
		case ArchPackage.ROLE__TYPE:
			setType((String) newValue);
			return;
		case ArchPackage.ROLE__VALID:
			setValid((Boolean) newValue);
			return;
		case ArchPackage.ROLE__NEXT_ROLE_EXPR:
			setNextRoleExpr((Role) newValue);
			return;
		case ArchPackage.ROLE__OPERATOR_EXPR:
			setOperatorExpr((ExprOperator) newValue);
			return;
		case ArchPackage.ROLE__CONNECTOR:
			setConnector((Connector) newValue);
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
		case ArchPackage.ROLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.ROLE__ROLETYPE:
			setRoletype((RoleType) null);
			return;
		case ArchPackage.ROLE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArchPackage.ROLE__VALID:
			setValid(VALID_EDEFAULT);
			return;
		case ArchPackage.ROLE__NEXT_ROLE_EXPR:
			setNextRoleExpr((Role) null);
			return;
		case ArchPackage.ROLE__OPERATOR_EXPR:
			setOperatorExpr(OPERATOR_EXPR_EDEFAULT);
			return;
		case ArchPackage.ROLE__CONNECTOR:
			setConnector((Connector) null);
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
		case ArchPackage.ROLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.ROLE__ROLETYPE:
			return roletype != null;
		case ArchPackage.ROLE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ArchPackage.ROLE__VALID:
			return valid != VALID_EDEFAULT;
		case ArchPackage.ROLE__NEXT_ROLE_EXPR:
			return nextRoleExpr != null;
		case ArchPackage.ROLE__OPERATOR_EXPR:
			return operatorExpr != OPERATOR_EXPR_EDEFAULT;
		case ArchPackage.ROLE__CONNECTOR:
			return connector != null;
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
		result.append(", operatorExpr: ");
		result.append(operatorExpr);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
