/**
 */
package nz.auckland.arch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.VerificationProperty#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.VerificationProperty#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getVerificationProperty()
 * @model abstract="true"
 * @generated
 */
public interface VerificationProperty extends EObject {
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
	 * @see nz.auckland.arch.ArchPackage#getVerificationProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.VerificationProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(DesignModel)
	 * @see nz.auckland.arch.ArchPackage#getVerificationProperty_Model()
	 * @model
	 * @generated
	 */
	DesignModel getModel();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.VerificationProperty#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(DesignModel value);

} // VerificationProperty
