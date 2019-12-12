/**
 */
package nz.auckland.arch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LTL Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.LTLExpr#getEvent <em>Event</em>}</li>
 *   <li>{@link nz.auckland.arch.LTLExpr#getOperator <em>Operator</em>}</li>
 *   <li>{@link nz.auckland.arch.LTLExpr#getNextExpr <em>Next Expr</em>}</li>
 *   <li>{@link nz.auckland.arch.LTLExpr#getProperty <em>Property</em>}</li>
 *   <li>{@link nz.auckland.arch.LTLExpr#getRole <em>Role</em>}</li>
 *   <li>{@link nz.auckland.arch.LTLExpr#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getLTLExpr()
 * @model abstract="true"
 * @generated
 */
public interface LTLExpr extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see nz.auckland.arch.ArchPackage#getLTLExpr_Event()
	 * @model
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.LTLExpr#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link nz.auckland.arch.LTLOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see nz.auckland.arch.LTLOperator
	 * @see #setOperator(LTLOperator)
	 * @see nz.auckland.arch.ArchPackage#getLTLExpr_Operator()
	 * @model default="NONE"
	 * @generated
	 */
	LTLOperator getOperator();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.LTLExpr#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see nz.auckland.arch.LTLOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LTLOperator value);

	/**
	 * Returns the value of the '<em><b>Next Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Expr</em>' reference.
	 * @see #setNextExpr(LTLExpr)
	 * @see nz.auckland.arch.ArchPackage#getLTLExpr_NextExpr()
	 * @model
	 * @generated
	 */
	LTLExpr getNextExpr();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.LTLExpr#getNextExpr <em>Next Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Expr</em>' reference.
	 * @see #getNextExpr()
	 * @generated
	 */
	void setNextExpr(LTLExpr value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(BehaviourProperty)
	 * @see nz.auckland.arch.ArchPackage#getLTLExpr_Property()
	 * @model
	 * @generated
	 */
	BehaviourProperty getProperty();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.LTLExpr#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(BehaviourProperty value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see nz.auckland.arch.ArchPackage#getLTLExpr_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.LTLExpr#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see nz.auckland.arch.ArchPackage#getLTLExpr_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.LTLExpr#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

} // LTLExpr
