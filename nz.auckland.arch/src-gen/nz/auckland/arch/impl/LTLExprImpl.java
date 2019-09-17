/**
 */
package nz.auckland.arch.impl;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.Event;
import nz.auckland.arch.LTLExpr;
import nz.auckland.arch.LTLOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LTL Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.LTLExprImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.LTLExprImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.LTLExprImpl#getNextExpr <em>Next Expr</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.LTLExprImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LTLExprImpl extends MinimalEObjectImpl.Container implements LTLExpr {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LTLOperator OPERATOR_EDEFAULT = LTLOperator.NONE;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected LTLOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextExpr() <em>Next Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextExpr()
	 * @generated
	 * @ordered
	 */
	protected LTLExpr nextExpr;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected BehaviourProperty property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTLExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.LTL_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		if (event != null && event.eIsProxy()) {
			InternalEObject oldEvent = (InternalEObject) event;
			event = (Event) eResolveProxy(oldEvent);
			if (event != oldEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.LTL_EXPR__EVENT, oldEvent,
							event));
			}
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.LTL_EXPR__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(LTLOperator newOperator) {
		LTLOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.LTL_EXPR__OPERATOR, oldOperator,
					operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLExpr getNextExpr() {
		if (nextExpr != null && nextExpr.eIsProxy()) {
			InternalEObject oldNextExpr = (InternalEObject) nextExpr;
			nextExpr = (LTLExpr) eResolveProxy(oldNextExpr);
			if (nextExpr != oldNextExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.LTL_EXPR__NEXT_EXPR,
							oldNextExpr, nextExpr));
			}
		}
		return nextExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLExpr basicGetNextExpr() {
		return nextExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextExpr(LTLExpr newNextExpr) {
		LTLExpr oldNextExpr = nextExpr;
		nextExpr = newNextExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.LTL_EXPR__NEXT_EXPR, oldNextExpr,
					nextExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourProperty getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject) property;
			property = (BehaviourProperty) eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.LTL_EXPR__PROPERTY,
							oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourProperty basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(BehaviourProperty newProperty) {
		BehaviourProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.LTL_EXPR__PROPERTY, oldProperty,
					property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchPackage.LTL_EXPR__EVENT:
			if (resolve)
				return getEvent();
			return basicGetEvent();
		case ArchPackage.LTL_EXPR__OPERATOR:
			return getOperator();
		case ArchPackage.LTL_EXPR__NEXT_EXPR:
			if (resolve)
				return getNextExpr();
			return basicGetNextExpr();
		case ArchPackage.LTL_EXPR__PROPERTY:
			if (resolve)
				return getProperty();
			return basicGetProperty();
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
		case ArchPackage.LTL_EXPR__EVENT:
			setEvent((Event) newValue);
			return;
		case ArchPackage.LTL_EXPR__OPERATOR:
			setOperator((LTLOperator) newValue);
			return;
		case ArchPackage.LTL_EXPR__NEXT_EXPR:
			setNextExpr((LTLExpr) newValue);
			return;
		case ArchPackage.LTL_EXPR__PROPERTY:
			setProperty((BehaviourProperty) newValue);
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
		case ArchPackage.LTL_EXPR__EVENT:
			setEvent((Event) null);
			return;
		case ArchPackage.LTL_EXPR__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case ArchPackage.LTL_EXPR__NEXT_EXPR:
			setNextExpr((LTLExpr) null);
			return;
		case ArchPackage.LTL_EXPR__PROPERTY:
			setProperty((BehaviourProperty) null);
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
		case ArchPackage.LTL_EXPR__EVENT:
			return event != null;
		case ArchPackage.LTL_EXPR__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case ArchPackage.LTL_EXPR__NEXT_EXPR:
			return nextExpr != null;
		case ArchPackage.LTL_EXPR__PROPERTY:
			return property != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //LTLExprImpl
