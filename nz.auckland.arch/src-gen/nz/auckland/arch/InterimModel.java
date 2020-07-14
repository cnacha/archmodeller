/**
 */
package nz.auckland.arch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interim Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.InterimModel#getStep <em>Step</em>}</li>
 *   <li>{@link nz.auckland.arch.InterimModel#getDescription <em>Description</em>}</li>
 *   <li>{@link nz.auckland.arch.InterimModel#getNextModel <em>Next Model</em>}</li>
 *   <li>{@link nz.auckland.arch.InterimModel#getDesignmodel <em>Designmodel</em>}</li>
 *   <li>{@link nz.auckland.arch.InterimModel#isIsStable <em>Is Stable</em>}</li>
 *   <li>{@link nz.auckland.arch.InterimModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getInterimModel()
 * @model
 * @generated
 */
public interface InterimModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Designmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designmodel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designmodel</em>' containment reference.
	 * @see #setDesignmodel(DesignModel)
	 * @see nz.auckland.arch.ArchPackage#getInterimModel_Designmodel()
	 * @model containment="true"
	 * @generated
	 */
	DesignModel getDesignmodel();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.InterimModel#getDesignmodel <em>Designmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designmodel</em>' containment reference.
	 * @see #getDesignmodel()
	 * @generated
	 */
	void setDesignmodel(DesignModel value);

	/**
	 * Returns the value of the '<em><b>Is Stable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Stable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stable</em>' attribute.
	 * @see #setIsStable(boolean)
	 * @see nz.auckland.arch.ArchPackage#getInterimModel_IsStable()
	 * @model
	 * @generated
	 */
	boolean isIsStable();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.InterimModel#isIsStable <em>Is Stable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stable</em>' attribute.
	 * @see #isIsStable()
	 * @generated
	 */
	void setIsStable(boolean value);

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
	 * @see nz.auckland.arch.ArchPackage#getInterimModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.InterimModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see nz.auckland.arch.ArchPackage#getInterimModel_Step()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.InterimModel#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see nz.auckland.arch.ArchPackage#getInterimModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.InterimModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Next Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Model</em>' reference.
	 * @see #setNextModel(InterimModel)
	 * @see nz.auckland.arch.ArchPackage#getInterimModel_NextModel()
	 * @model
	 * @generated
	 */
	InterimModel getNextModel();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.InterimModel#getNextModel <em>Next Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Model</em>' reference.
	 * @see #getNextModel()
	 * @generated
	 */
	void setNextModel(InterimModel value);

} // InterimModel
