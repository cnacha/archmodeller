/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.CommunicationPort#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationPort#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationPort#getNode <em>Node</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationPort#getNamedport <em>Namedport</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationPort#isHasFirewall <em>Has Firewall</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationPort#isHasAuthentication <em>Has Authentication</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationPort#isHasAuthorization <em>Has Authorization</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationPort#isHasInputSanitization <em>Has Input Sanitization</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getCommunicationPort()
 * @model
 * @generated
 */
public interface CommunicationPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Number</em>' attribute.
	 * @see #setPortNumber(int)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationPort_PortNumber()
	 * @model
	 * @generated
	 */
	int getPortNumber();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationPort#getPortNumber <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' attribute.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(int value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(ExecutionEnvironment)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationPort_Node()
	 * @model
	 * @generated
	 */
	ExecutionEnvironment getNode();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationPort#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(ExecutionEnvironment value);

	/**
	 * Returns the value of the '<em><b>Namedport</b></em>' reference list.
	 * The list contents are of type {@link nz.auckland.arch.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namedport</em>' reference list.
	 * @see nz.auckland.arch.ArchPackage#getCommunicationPort_Namedport()
	 * @model
	 * @generated
	 */
	EList<Port> getNamedport();

	/**
	 * Returns the value of the '<em><b>Has Firewall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Firewall</em>' attribute.
	 * @see #setHasFirewall(boolean)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationPort_HasFirewall()
	 * @model
	 * @generated
	 */
	boolean isHasFirewall();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationPort#isHasFirewall <em>Has Firewall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Firewall</em>' attribute.
	 * @see #isHasFirewall()
	 * @generated
	 */
	void setHasFirewall(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Authentication</em>' attribute.
	 * @see #setHasAuthentication(boolean)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationPort_HasAuthentication()
	 * @model
	 * @generated
	 */
	boolean isHasAuthentication();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationPort#isHasAuthentication <em>Has Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Authentication</em>' attribute.
	 * @see #isHasAuthentication()
	 * @generated
	 */
	void setHasAuthentication(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Authorization</em>' attribute.
	 * @see #setHasAuthorization(boolean)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationPort_HasAuthorization()
	 * @model
	 * @generated
	 */
	boolean isHasAuthorization();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationPort#isHasAuthorization <em>Has Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Authorization</em>' attribute.
	 * @see #isHasAuthorization()
	 * @generated
	 */
	void setHasAuthorization(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Input Sanitization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Sanitization</em>' attribute.
	 * @see #setHasInputSanitization(boolean)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationPort_HasInputSanitization()
	 * @model
	 * @generated
	 */
	boolean isHasInputSanitization();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationPort#isHasInputSanitization <em>Has Input Sanitization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Input Sanitization</em>' attribute.
	 * @see #isHasInputSanitization()
	 * @generated
	 */
	void setHasInputSanitization(boolean value);

} // CommunicationPort
