/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refactor Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.RefactorSet#getSource <em>Source</em>}</li>
 *   <li>{@link nz.auckland.arch.RefactorSet#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getRefactorSet()
 * @model
 * @generated
 */
public interface RefactorSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(DesignModel)
	 * @see nz.auckland.arch.ArchPackage#getRefactorSet_Source()
	 * @model
	 * @generated
	 */
	DesignModel getSource();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.RefactorSet#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DesignModel value);

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.RefactorPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getRefactorSet_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefactorPart> getParts();

} // RefactorSet
