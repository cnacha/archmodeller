/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migration Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.MigrationModel#getSource <em>Source</em>}</li>
 *   <li>{@link nz.auckland.arch.MigrationModel#getTarget <em>Target</em>}</li>
 *   <li>{@link nz.auckland.arch.MigrationModel#getInterimmodels <em>Interimmodels</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getMigrationModel()
 * @model
 * @generated
 */
public interface MigrationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DesignModel)
	 * @see nz.auckland.arch.ArchPackage#getMigrationModel_Source()
	 * @model
	 * @generated
	 */
	DesignModel getSource();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.MigrationModel#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DesignModel value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DesignModel)
	 * @see nz.auckland.arch.ArchPackage#getMigrationModel_Target()
	 * @model
	 * @generated
	 */
	DesignModel getTarget();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.MigrationModel#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DesignModel value);

	/**
	 * Returns the value of the '<em><b>Interimmodels</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.InterimModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interimmodels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interimmodels</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getMigrationModel_Interimmodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterimModel> getInterimmodels();

} // MigrationModel
