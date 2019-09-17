/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.BehaviourProperty#getLtlexpr <em>Ltlexpr</em>}</li>
 *   <li>{@link nz.auckland.arch.BehaviourProperty#isValid <em>Valid</em>}</li>
 *   <li>{@link nz.auckland.arch.BehaviourProperty#getCounterExample <em>Counter Example</em>}</li>
 *   <li>{@link nz.auckland.arch.BehaviourProperty#getVisitedStates <em>Visited States</em>}</li>
 *   <li>{@link nz.auckland.arch.BehaviourProperty#getVerifyTime <em>Verify Time</em>}</li>
 *   <li>{@link nz.auckland.arch.BehaviourProperty#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getBehaviourProperty()
 * @model
 * @generated
 */
public interface BehaviourProperty extends VerificationProperty {
	/**
	 * Returns the value of the '<em><b>Ltlexpr</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.LTLExpr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ltlexpr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ltlexpr</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getBehaviourProperty_Ltlexpr()
	 * @model containment="true"
	 * @generated
	 */
	EList<LTLExpr> getLtlexpr();

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see nz.auckland.arch.ArchPackage#getBehaviourProperty_Valid()
	 * @model default="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.BehaviourProperty#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Counter Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Example</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Example</em>' attribute.
	 * @see #setCounterExample(String)
	 * @see nz.auckland.arch.ArchPackage#getBehaviourProperty_CounterExample()
	 * @model
	 * @generated
	 */
	String getCounterExample();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.BehaviourProperty#getCounterExample <em>Counter Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Example</em>' attribute.
	 * @see #getCounterExample()
	 * @generated
	 */
	void setCounterExample(String value);

	/**
	 * Returns the value of the '<em><b>Visited States</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visited States</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visited States</em>' attribute.
	 * @see #setVisitedStates(int)
	 * @see nz.auckland.arch.ArchPackage#getBehaviourProperty_VisitedStates()
	 * @model
	 * @generated
	 */
	int getVisitedStates();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.BehaviourProperty#getVisitedStates <em>Visited States</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visited States</em>' attribute.
	 * @see #getVisitedStates()
	 * @generated
	 */
	void setVisitedStates(int value);

	/**
	 * Returns the value of the '<em><b>Verify Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Time</em>' attribute.
	 * @see #setVerifyTime(double)
	 * @see nz.auckland.arch.ArchPackage#getBehaviourProperty_VerifyTime()
	 * @model
	 * @generated
	 */
	double getVerifyTime();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.BehaviourProperty#getVerifyTime <em>Verify Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Time</em>' attribute.
	 * @see #getVerifyTime()
	 * @generated
	 */
	void setVerifyTime(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nz.auckland.arch.BehaviourPropType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see nz.auckland.arch.BehaviourPropType
	 * @see #setType(BehaviourPropType)
	 * @see nz.auckland.arch.ArchPackage#getBehaviourProperty_Type()
	 * @model
	 * @generated
	 */
	BehaviourPropType getType();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.BehaviourProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see nz.auckland.arch.BehaviourPropType
	 * @see #getType()
	 * @generated
	 */
	void setType(BehaviourPropType value);

} // BehaviourProperty
