/**
 */
package nz.auckland.arch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.Role#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.Role#getRoletype <em>Roletype</em>}</li>
 *   <li>{@link nz.auckland.arch.Role#getType <em>Type</em>}</li>
 *   <li>{@link nz.auckland.arch.Role#isValid <em>Valid</em>}</li>
 *   <li>{@link nz.auckland.arch.Role#getNextRoleExpr <em>Next Role Expr</em>}</li>
 *   <li>{@link nz.auckland.arch.Role#getOperatorExpr <em>Operator Expr</em>}</li>
 *   <li>{@link nz.auckland.arch.Role#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nz.auckland.arch.ArchPackage#getRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Roletype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roletype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roletype</em>' reference.
	 * @see #setRoletype(RoleType)
	 * @see nz.auckland.arch.ArchPackage#getRole_Roletype()
	 * @model
	 * @generated
	 */
	RoleType getRoletype();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Role#getRoletype <em>Roletype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roletype</em>' reference.
	 * @see #getRoletype()
	 * @generated
	 */
	void setRoletype(RoleType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see nz.auckland.arch.ArchPackage#getRole_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Role#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see nz.auckland.arch.ArchPackage#getRole_Valid()
	 * @model default="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Role#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Next Role Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Role Expr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Role Expr</em>' reference.
	 * @see #setNextRoleExpr(Role)
	 * @see nz.auckland.arch.ArchPackage#getRole_NextRoleExpr()
	 * @model
	 * @generated
	 */
	Role getNextRoleExpr();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Role#getNextRoleExpr <em>Next Role Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Role Expr</em>' reference.
	 * @see #getNextRoleExpr()
	 * @generated
	 */
	void setNextRoleExpr(Role value);

	/**
	 * Returns the value of the '<em><b>Operator Expr</b></em>' attribute.
	 * The default value is <code>"COUPLING"</code>.
	 * The literals are from the enumeration {@link nz.auckland.arch.ExprOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Expr</em>' attribute.
	 * @see nz.auckland.arch.ExprOperator
	 * @see #setOperatorExpr(ExprOperator)
	 * @see nz.auckland.arch.ArchPackage#getRole_OperatorExpr()
	 * @model default="COUPLING"
	 * @generated
	 */
	ExprOperator getOperatorExpr();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Role#getOperatorExpr <em>Operator Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Expr</em>' attribute.
	 * @see nz.auckland.arch.ExprOperator
	 * @see #getOperatorExpr()
	 * @generated
	 */
	void setOperatorExpr(ExprOperator value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see nz.auckland.arch.ArchPackage#getRole_Connector()
	 * @model
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Role#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // Role
