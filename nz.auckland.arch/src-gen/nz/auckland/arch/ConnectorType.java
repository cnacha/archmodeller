/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.ConnectorType#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.ConnectorType#getRoletype <em>Roletype</em>}</li>
 *   <li>{@link nz.auckland.arch.ConnectorType#isValid <em>Valid</em>}</li>
 *   <li>{@link nz.auckland.arch.ConnectorType#getEaConnector <em>Ea Connector</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getConnectorType()
 * @model
 * @generated
 */
public interface ConnectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nz.auckland.arch.ArchPackage#getConnectorType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.ConnectorType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Roletype</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.RoleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roletype</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getConnectorType_Roletype()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleType> getRoletype();

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see nz.auckland.arch.ArchPackage#getConnectorType_Valid()
	 * @model default="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.ConnectorType#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Ea Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ea Connector</em>' reference.
	 * @see #setEaConnector(ConnectorType)
	 * @see nz.auckland.arch.ArchPackage#getConnectorType_EaConnector()
	 * @model
	 * @generated
	 */
	ConnectorType getEaConnector();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.ConnectorType#getEaConnector <em>Ea Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ea Connector</em>' reference.
	 * @see #getEaConnector()
	 * @generated
	 */
	void setEaConnector(ConnectorType value);

} // ConnectorType
