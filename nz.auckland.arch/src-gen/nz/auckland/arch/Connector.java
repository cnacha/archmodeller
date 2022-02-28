/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.Connector#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.Connector#getType <em>Type</em>}</li>
 *   <li>{@link nz.auckland.arch.Connector#getRole <em>Role</em>}</li>
 *   <li>{@link nz.auckland.arch.Connector#getConnectortype <em>Connectortype</em>}</li>
 *   <li>{@link nz.auckland.arch.Connector#isValid <em>Valid</em>}</li>
 *   <li>{@link nz.auckland.arch.Connector#getCommunicationlink <em>Communicationlink</em>}</li>
 *   <li>{@link nz.auckland.arch.Connector#getSecurityCharacters <em>Security Characters</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nz.auckland.arch.ArchPackage#getConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see nz.auckland.arch.ArchPackage#getConnector_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Connector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getConnector_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Returns the value of the '<em><b>Connectortype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectortype</em>' reference.
	 * @see #setConnectortype(ConnectorType)
	 * @see nz.auckland.arch.ArchPackage#getConnector_Connectortype()
	 * @model
	 * @generated
	 */
	ConnectorType getConnectortype();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Connector#getConnectortype <em>Connectortype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectortype</em>' reference.
	 * @see #getConnectortype()
	 * @generated
	 */
	void setConnectortype(ConnectorType value);

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see nz.auckland.arch.ArchPackage#getConnector_Valid()
	 * @model default="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Connector#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Communicationlink</b></em>' reference list.
	 * The list contents are of type {@link nz.auckland.arch.CommunicationLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicationlink</em>' reference list.
	 * @see nz.auckland.arch.ArchPackage#getConnector_Communicationlink()
	 * @model
	 * @generated
	 */
	EList<CommunicationLink> getCommunicationlink();

	/**
	 * Returns the value of the '<em><b>Security Characters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Characters</em>' attribute.
	 * @see #setSecurityCharacters(String)
	 * @see nz.auckland.arch.ArchPackage#getConnector_SecurityCharacters()
	 * @model
	 * @generated
	 */
	String getSecurityCharacters();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Connector#getSecurityCharacters <em>Security Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Characters</em>' attribute.
	 * @see #getSecurityCharacters()
	 * @generated
	 */
	void setSecurityCharacters(String value);

} // Connector
