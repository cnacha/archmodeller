/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refactor Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.RefactorPart#getReference <em>Reference</em>}</li>
 *   <li>{@link nz.auckland.arch.RefactorPart#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.RefactorPart#getFunctions <em>Functions</em>}</li>
 *   <li>{@link nz.auckland.arch.RefactorPart#isCopyStructure <em>Copy Structure</em>}</li>
 *   <li>{@link nz.auckland.arch.RefactorPart#isReplaceStrcuture <em>Replace Strcuture</em>}</li>
 *   <li>{@link nz.auckland.arch.RefactorPart#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getRefactorPart()
 * @model
 * @generated
 */
public interface RefactorPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(DesignModel)
	 * @see nz.auckland.arch.ArchPackage#getRefactorPart_Reference()
	 * @model
	 * @generated
	 */
	DesignModel getReference();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.RefactorPart#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(DesignModel value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nz.auckland.arch.ArchPackage#getRefactorPart_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.RefactorPart#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.BehaviourProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getRefactorPart_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviourProperty> getFunctions();

	/**
	 * Returns the value of the '<em><b>Copy Structure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy Structure</em>' attribute.
	 * @see #setCopyStructure(boolean)
	 * @see nz.auckland.arch.ArchPackage#getRefactorPart_CopyStructure()
	 * @model
	 * @generated
	 */
	boolean isCopyStructure();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.RefactorPart#isCopyStructure <em>Copy Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Structure</em>' attribute.
	 * @see #isCopyStructure()
	 * @generated
	 */
	void setCopyStructure(boolean value);

	/**
	 * Returns the value of the '<em><b>Replace Strcuture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace Strcuture</em>' attribute.
	 * @see #setReplaceStrcuture(boolean)
	 * @see nz.auckland.arch.ArchPackage#getRefactorPart_ReplaceStrcuture()
	 * @model
	 * @generated
	 */
	boolean isReplaceStrcuture();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.RefactorPart#isReplaceStrcuture <em>Replace Strcuture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace Strcuture</em>' attribute.
	 * @see #isReplaceStrcuture()
	 * @generated
	 */
	void setReplaceStrcuture(boolean value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(RefactorPart)
	 * @see nz.auckland.arch.ArchPackage#getRefactorPart_Next()
	 * @model
	 * @generated
	 */
	RefactorPart getNext();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.RefactorPart#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(RefactorPart value);

} // RefactorPart
