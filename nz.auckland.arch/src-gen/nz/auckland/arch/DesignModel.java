/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.DesignModel#getComponent <em>Component</em>}</li>
 *   <li>{@link nz.auckland.arch.DesignModel#getConnector <em>Connector</em>}</li>
 *   <li>{@link nz.auckland.arch.DesignModel#getArchstyle <em>Archstyle</em>}</li>
 *   <li>{@link nz.auckland.arch.DesignModel#getVerifyProperty <em>Verify Property</em>}</li>
 *   <li>{@link nz.auckland.arch.DesignModel#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.DesignModel#getHost <em>Host</em>}</li>
 *   <li>{@link nz.auckland.arch.DesignModel#getLink <em>Link</em>}</li>
 *   <li>{@link nz.auckland.arch.DesignModel#getOntologylabel <em>Ontologylabel</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getDesignModel()
 * @model
 * @generated
 */
public interface DesignModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getDesignModel_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getDesignModel_Connector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnector();

	/**
	 * Returns the value of the '<em><b>Archstyle</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.ArchStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archstyle</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getDesignModel_Archstyle()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchStyle> getArchstyle();

	/**
	 * Returns the value of the '<em><b>Verify Property</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.VerificationProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Property</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getDesignModel_VerifyProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<VerificationProperty> getVerifyProperty();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nz.auckland.arch.ArchPackage#getDesignModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.DesignModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getDesignModel_Host()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getHost();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.CommunicationLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getDesignModel_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationLink> getLink();

	/**
	 * Returns the value of the '<em><b>Ontologylabel</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.OntologyLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontologylabel</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getDesignModel_Ontologylabel()
	 * @model containment="true"
	 * @generated
	 */
	EList<OntologyLabel> getOntologylabel();

} // DesignModel
