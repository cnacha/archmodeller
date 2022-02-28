/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.Component#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.Component#getType <em>Type</em>}</li>
 *   <li>{@link nz.auckland.arch.Component#getPort <em>Port</em>}</li>
 *   <li>{@link nz.auckland.arch.Component#isValid <em>Valid</em>}</li>
 *   <li>{@link nz.auckland.arch.Component#getDeploymentnode <em>Deploymentnode</em>}</li>
 *   <li>{@link nz.auckland.arch.Component#getCriticalLevel <em>Critical Level</em>}</li>
 *   <li>{@link nz.auckland.arch.Component#getSecurityCharacters <em>Security Characters</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nz.auckland.arch.ArchPackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Component#getName <em>Name</em>}' attribute.
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
	 * @see nz.auckland.arch.ArchPackage#getComponent_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Component#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getComponent_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see nz.auckland.arch.ArchPackage#getComponent_Valid()
	 * @model default="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Component#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Deploymentnode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploymentnode</em>' reference.
	 * @see #setDeploymentnode(ExecutionEnvironment)
	 * @see nz.auckland.arch.ArchPackage#getComponent_Deploymentnode()
	 * @model
	 * @generated
	 */
	ExecutionEnvironment getDeploymentnode();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Component#getDeploymentnode <em>Deploymentnode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploymentnode</em>' reference.
	 * @see #getDeploymentnode()
	 * @generated
	 */
	void setDeploymentnode(ExecutionEnvironment value);

	/**
	 * Returns the value of the '<em><b>Critical Level</b></em>' attribute.
	 * The literals are from the enumeration {@link nz.auckland.arch.CriticalLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical Level</em>' attribute.
	 * @see nz.auckland.arch.CriticalLevel
	 * @see #setCriticalLevel(CriticalLevel)
	 * @see nz.auckland.arch.ArchPackage#getComponent_CriticalLevel()
	 * @model
	 * @generated
	 */
	CriticalLevel getCriticalLevel();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Component#getCriticalLevel <em>Critical Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Level</em>' attribute.
	 * @see nz.auckland.arch.CriticalLevel
	 * @see #getCriticalLevel()
	 * @generated
	 */
	void setCriticalLevel(CriticalLevel value);

	/**
	 * Returns the value of the '<em><b>Security Characters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Characters</em>' attribute.
	 * @see #setSecurityCharacters(String)
	 * @see nz.auckland.arch.ArchPackage#getComponent_SecurityCharacters()
	 * @model
	 * @generated
	 */
	String getSecurityCharacters();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Component#getSecurityCharacters <em>Security Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Characters</em>' attribute.
	 * @see #getSecurityCharacters()
	 * @generated
	 */
	void setSecurityCharacters(String value);

} // Component
