/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.ArchStyle#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.ArchStyle#getConnectortype <em>Connectortype</em>}</li>
 *   <li>{@link nz.auckland.arch.ArchStyle#getComponenttype <em>Componenttype</em>}</li>
 *   <li>{@link nz.auckland.arch.ArchStyle#isValid <em>Valid</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getArchStyle()
 * @model
 * @generated
 */
public interface ArchStyle extends EObject {
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
	 * @see nz.auckland.arch.ArchPackage#getArchStyle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.ArchStyle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connectortype</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.ConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectortype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectortype</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getArchStyle_Connectortype()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorType> getConnectortype();

	/**
	 * Returns the value of the '<em><b>Componenttype</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Componenttype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componenttype</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getArchStyle_Componenttype()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentType> getComponenttype();

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
	 * @see nz.auckland.arch.ArchPackage#getArchStyle_Valid()
	 * @model default="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.ArchStyle#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

} // ArchStyle
