/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.ComponentType#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.ComponentType#getPorttype <em>Porttype</em>}</li>
 *   <li>{@link nz.auckland.arch.ComponentType#isValid <em>Valid</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getComponentType()
 * @model
 * @generated
 */
public interface ComponentType extends EObject {
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
	 * @see nz.auckland.arch.ArchPackage#getComponentType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.ComponentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Porttype</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.PortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porttype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porttype</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getComponentType_Porttype()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortType> getPorttype();

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
	 * @see nz.auckland.arch.ArchPackage#getComponentType_Valid()
	 * @model default="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.ComponentType#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

} // ComponentType
