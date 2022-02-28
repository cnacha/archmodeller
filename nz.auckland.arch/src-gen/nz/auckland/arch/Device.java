/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.Device#getNetAccessType <em>Net Access Type</em>}</li>
 *   <li>{@link nz.auckland.arch.Device#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.Device#getNode <em>Node</em>}</li>
 *   <li>{@link nz.auckland.arch.Device#getHostType <em>Host Type</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Net Access Type</b></em>' attribute.
	 * The default value is <code>"PRIVATE"</code>.
	 * The literals are from the enumeration {@link nz.auckland.arch.NetAccessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net Access Type</em>' attribute.
	 * @see nz.auckland.arch.NetAccessType
	 * @see #setNetAccessType(NetAccessType)
	 * @see nz.auckland.arch.ArchPackage#getDevice_NetAccessType()
	 * @model default="PRIVATE"
	 * @generated
	 */
	NetAccessType getNetAccessType();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Device#getNetAccessType <em>Net Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Access Type</em>' attribute.
	 * @see nz.auckland.arch.NetAccessType
	 * @see #getNetAccessType()
	 * @generated
	 */
	void setNetAccessType(NetAccessType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nz.auckland.arch.ArchPackage#getDevice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.ExecutionEnvironment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getDevice_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionEnvironment> getNode();

	/**
	 * Returns the value of the '<em><b>Host Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nz.auckland.arch.HostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Type</em>' attribute.
	 * @see nz.auckland.arch.HostType
	 * @see #setHostType(HostType)
	 * @see nz.auckland.arch.ArchPackage#getDevice_HostType()
	 * @model
	 * @generated
	 */
	HostType getHostType();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Device#getHostType <em>Host Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Type</em>' attribute.
	 * @see nz.auckland.arch.HostType
	 * @see #getHostType()
	 * @generated
	 */
	void setHostType(HostType value);

} // Device
