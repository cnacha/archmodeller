/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.ExecutionEnvironment#getType <em>Type</em>}</li>
 *   <li>{@link nz.auckland.arch.ExecutionEnvironment#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.ExecutionEnvironment#getComponent <em>Component</em>}</li>
 *   <li>{@link nz.auckland.arch.ExecutionEnvironment#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getExecutionEnvironment()
 * @model
 * @generated
 */
public interface ExecutionEnvironment extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nz.auckland.arch.NodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see nz.auckland.arch.NodeType
	 * @see #setType(NodeType)
	 * @see nz.auckland.arch.ArchPackage#getExecutionEnvironment_Type()
	 * @model
	 * @generated
	 */
	NodeType getType();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.ExecutionEnvironment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see nz.auckland.arch.NodeType
	 * @see #getType()
	 * @generated
	 */
	void setType(NodeType value);

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
	 * @see nz.auckland.arch.ArchPackage#getExecutionEnvironment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.ExecutionEnvironment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link nz.auckland.arch.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see nz.auckland.arch.ArchPackage#getExecutionEnvironment_Component()
	 * @model
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.CommunicationPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getExecutionEnvironment_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationPort> getPort();

} // ExecutionEnvironment
