/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.RoleType#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.RoleType#getEvent <em>Event</em>}</li>
 *   <li>{@link nz.auckland.arch.RoleType#getPorttype <em>Porttype</em>}</li>
 *   <li>{@link nz.auckland.arch.RoleType#isValid <em>Valid</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getRoleType()
 * @model
 * @generated
 */
public interface RoleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nz.auckland.arch.ArchPackage#getRoleType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.RoleType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getRoleType_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Porttype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porttype</em>' reference.
	 * @see #setPorttype(PortType)
	 * @see nz.auckland.arch.ArchPackage#getRoleType_Porttype()
	 * @model
	 * @generated
	 */
	PortType getPorttype();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.RoleType#getPorttype <em>Porttype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porttype</em>' reference.
	 * @see #getPorttype()
	 * @generated
	 */
	void setPorttype(PortType value);

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see nz.auckland.arch.ArchPackage#getRoleType_Valid()
	 * @model default="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.RoleType#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

} // RoleType
