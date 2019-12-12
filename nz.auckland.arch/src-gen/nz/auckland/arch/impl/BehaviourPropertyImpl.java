/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.BehaviourPropType;
import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.LTLExpr;

import nz.auckland.arch.Port;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.BehaviourPropertyImpl#getLtlexpr <em>Ltlexpr</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.BehaviourPropertyImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.BehaviourPropertyImpl#getCounterExample <em>Counter Example</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.BehaviourPropertyImpl#getVisitedStates <em>Visited States</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.BehaviourPropertyImpl#getVerifyTime <em>Verify Time</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.BehaviourPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.BehaviourPropertyImpl#getTestport <em>Testport</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.BehaviourPropertyImpl#getTraceExample <em>Trace Example</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourPropertyImpl extends VerificationPropertyImpl implements BehaviourProperty {
	/**
	 * The cached value of the '{@link #getLtlexpr() <em>Ltlexpr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtlexpr()
	 * @generated
	 * @ordered
	 */
	protected EList<LTLExpr> ltlexpr;

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
	 * The default value of the '{@link #getCounterExample() <em>Counter Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterExample()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounterExample() <em>Counter Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterExample()
	 * @generated
	 * @ordered
	 */
	protected String counterExample = COUNTER_EXAMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisitedStates() <em>Visited States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitedStates()
	 * @generated
	 * @ordered
	 */
	protected static final int VISITED_STATES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVisitedStates() <em>Visited States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitedStates()
	 * @generated
	 * @ordered
	 */
	protected int visitedStates = VISITED_STATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerifyTime() <em>Verify Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyTime()
	 * @generated
	 * @ordered
	 */
	protected static final double VERIFY_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVerifyTime() <em>Verify Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyTime()
	 * @generated
	 * @ordered
	 */
	protected double verifyTime = VERIFY_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BehaviourPropType TYPE_EDEFAULT = BehaviourPropType.LTL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BehaviourPropType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestport() <em>Testport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestport()
	 * @generated
	 * @ordered
	 */
	protected Port testport;

	/**
	 * The default value of the '{@link #getTraceExample() <em>Trace Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceExample()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceExample() <em>Trace Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceExample()
	 * @generated
	 * @ordered
	 */
	protected String traceExample = TRACE_EXAMPLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.BEHAVIOUR_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LTLExpr> getLtlexpr() {
		if (ltlexpr == null) {
			ltlexpr = new EObjectContainmentEList<LTLExpr>(LTLExpr.class, this,
					ArchPackage.BEHAVIOUR_PROPERTY__LTLEXPR);
		}
		return ltlexpr;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.BEHAVIOUR_PROPERTY__VALID, oldValid,
					valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCounterExample() {
		return counterExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterExample(String newCounterExample) {
		String oldCounterExample = counterExample;
		counterExample = newCounterExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.BEHAVIOUR_PROPERTY__COUNTER_EXAMPLE,
					oldCounterExample, counterExample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVisitedStates() {
		return visitedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisitedStates(int newVisitedStates) {
		int oldVisitedStates = visitedStates;
		visitedStates = newVisitedStates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.BEHAVIOUR_PROPERTY__VISITED_STATES,
					oldVisitedStates, visitedStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVerifyTime() {
		return verifyTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifyTime(double newVerifyTime) {
		double oldVerifyTime = verifyTime;
		verifyTime = newVerifyTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.BEHAVIOUR_PROPERTY__VERIFY_TIME,
					oldVerifyTime, verifyTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourPropType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BehaviourPropType newType) {
		BehaviourPropType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.BEHAVIOUR_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getTestport() {
		if (testport != null && testport.eIsProxy()) {
			InternalEObject oldTestport = (InternalEObject) testport;
			testport = (Port) eResolveProxy(oldTestport);
			if (testport != oldTestport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.BEHAVIOUR_PROPERTY__TESTPORT,
							oldTestport, testport));
			}
		}
		return testport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetTestport() {
		return testport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestport(Port newTestport) {
		Port oldTestport = testport;
		testport = newTestport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.BEHAVIOUR_PROPERTY__TESTPORT, oldTestport,
					testport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceExample() {
		return traceExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceExample(String newTraceExample) {
		String oldTraceExample = traceExample;
		traceExample = newTraceExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.BEHAVIOUR_PROPERTY__TRACE_EXAMPLE,
					oldTraceExample, traceExample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.BEHAVIOUR_PROPERTY__LTLEXPR:
			return ((InternalEList<?>) getLtlexpr()).basicRemove(otherEnd, msgs);
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
		case ArchPackage.BEHAVIOUR_PROPERTY__LTLEXPR:
			return getLtlexpr();
		case ArchPackage.BEHAVIOUR_PROPERTY__VALID:
			return isValid();
		case ArchPackage.BEHAVIOUR_PROPERTY__COUNTER_EXAMPLE:
			return getCounterExample();
		case ArchPackage.BEHAVIOUR_PROPERTY__VISITED_STATES:
			return getVisitedStates();
		case ArchPackage.BEHAVIOUR_PROPERTY__VERIFY_TIME:
			return getVerifyTime();
		case ArchPackage.BEHAVIOUR_PROPERTY__TYPE:
			return getType();
		case ArchPackage.BEHAVIOUR_PROPERTY__TESTPORT:
			if (resolve)
				return getTestport();
			return basicGetTestport();
		case ArchPackage.BEHAVIOUR_PROPERTY__TRACE_EXAMPLE:
			return getTraceExample();
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
		case ArchPackage.BEHAVIOUR_PROPERTY__LTLEXPR:
			getLtlexpr().clear();
			getLtlexpr().addAll((Collection<? extends LTLExpr>) newValue);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__VALID:
			setValid((Boolean) newValue);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__COUNTER_EXAMPLE:
			setCounterExample((String) newValue);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__VISITED_STATES:
			setVisitedStates((Integer) newValue);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__VERIFY_TIME:
			setVerifyTime((Double) newValue);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__TYPE:
			setType((BehaviourPropType) newValue);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__TESTPORT:
			setTestport((Port) newValue);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__TRACE_EXAMPLE:
			setTraceExample((String) newValue);
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
		case ArchPackage.BEHAVIOUR_PROPERTY__LTLEXPR:
			getLtlexpr().clear();
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__VALID:
			setValid(VALID_EDEFAULT);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__COUNTER_EXAMPLE:
			setCounterExample(COUNTER_EXAMPLE_EDEFAULT);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__VISITED_STATES:
			setVisitedStates(VISITED_STATES_EDEFAULT);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__VERIFY_TIME:
			setVerifyTime(VERIFY_TIME_EDEFAULT);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__TESTPORT:
			setTestport((Port) null);
			return;
		case ArchPackage.BEHAVIOUR_PROPERTY__TRACE_EXAMPLE:
			setTraceExample(TRACE_EXAMPLE_EDEFAULT);
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
		case ArchPackage.BEHAVIOUR_PROPERTY__LTLEXPR:
			return ltlexpr != null && !ltlexpr.isEmpty();
		case ArchPackage.BEHAVIOUR_PROPERTY__VALID:
			return valid != VALID_EDEFAULT;
		case ArchPackage.BEHAVIOUR_PROPERTY__COUNTER_EXAMPLE:
			return COUNTER_EXAMPLE_EDEFAULT == null ? counterExample != null
					: !COUNTER_EXAMPLE_EDEFAULT.equals(counterExample);
		case ArchPackage.BEHAVIOUR_PROPERTY__VISITED_STATES:
			return visitedStates != VISITED_STATES_EDEFAULT;
		case ArchPackage.BEHAVIOUR_PROPERTY__VERIFY_TIME:
			return verifyTime != VERIFY_TIME_EDEFAULT;
		case ArchPackage.BEHAVIOUR_PROPERTY__TYPE:
			return type != TYPE_EDEFAULT;
		case ArchPackage.BEHAVIOUR_PROPERTY__TESTPORT:
			return testport != null;
		case ArchPackage.BEHAVIOUR_PROPERTY__TRACE_EXAMPLE:
			return TRACE_EXAMPLE_EDEFAULT == null ? traceExample != null : !TRACE_EXAMPLE_EDEFAULT.equals(traceExample);
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
		result.append(" (valid: ");
		result.append(valid);
		result.append(", counterExample: ");
		result.append(counterExample);
		result.append(", visitedStates: ");
		result.append(visitedStates);
		result.append(", verifyTime: ");
		result.append(verifyTime);
		result.append(", type: ");
		result.append(type);
		result.append(", traceExample: ");
		result.append(traceExample);
		result.append(')');
		return result.toString();
	}

} //BehaviourPropertyImpl
