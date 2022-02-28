/**
 */
package nz.auckland.arch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.OntologyLabel#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.OntologyLabel#getExpression <em>Expression</em>}</li>
 *   <li>{@link nz.auckland.arch.OntologyLabel#getSubClassOf <em>Sub Class Of</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getOntologyLabel()
 * @model
 * @generated
 */
public interface OntologyLabel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nz.auckland.arch.ArchPackage#getOntologyLabel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.OntologyLabel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see nz.auckland.arch.ArchPackage#getOntologyLabel_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.OntologyLabel#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Sub Class Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Of</em>' attribute.
	 * @see #setSubClassOf(String)
	 * @see nz.auckland.arch.ArchPackage#getOntologyLabel_SubClassOf()
	 * @model
	 * @generated
	 */
	String getSubClassOf();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.OntologyLabel#getSubClassOf <em>Sub Class Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class Of</em>' attribute.
	 * @see #getSubClassOf()
	 * @generated
	 */
	void setSubClassOf(String value);

} // OntologyLabel
