/**
 */
package nz.auckland.arch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.CommunicationLink#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationLink#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationLink#getNetworkType <em>Network Type</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationLink#getSource <em>Source</em>}</li>
 *   <li>{@link nz.auckland.arch.CommunicationLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getCommunicationLink()
 * @model
 * @generated
 */
public interface CommunicationLink extends EObject {
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
	 * @see nz.auckland.arch.ArchPackage#getCommunicationLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nz.auckland.arch.LinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type</em>' attribute.
	 * @see nz.auckland.arch.LinkType
	 * @see #setLinkType(LinkType)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationLink_LinkType()
	 * @model
	 * @generated
	 */
	LinkType getLinkType();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationLink#getLinkType <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' attribute.
	 * @see nz.auckland.arch.LinkType
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(LinkType value);

	/**
	 * Returns the value of the '<em><b>Network Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nz.auckland.arch.NetworkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Type</em>' attribute.
	 * @see nz.auckland.arch.NetworkType
	 * @see #setNetworkType(NetworkType)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationLink_NetworkType()
	 * @model
	 * @generated
	 */
	NetworkType getNetworkType();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationLink#getNetworkType <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Type</em>' attribute.
	 * @see nz.auckland.arch.NetworkType
	 * @see #getNetworkType()
	 * @generated
	 */
	void setNetworkType(NetworkType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(CommunicationPort)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationLink_Source()
	 * @model
	 * @generated
	 */
	CommunicationPort getSource();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CommunicationPort value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CommunicationPort)
	 * @see nz.auckland.arch.ArchPackage#getCommunicationLink_Target()
	 * @model
	 * @generated
	 */
	CommunicationPort getTarget();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.CommunicationLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CommunicationPort value);

} // CommunicationLink
