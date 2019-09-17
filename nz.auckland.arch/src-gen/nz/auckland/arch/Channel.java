/**
 */
package nz.auckland.arch;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.Channel#getType <em>Type</em>}</li>
 *   <li>{@link nz.auckland.arch.Channel#getBind <em>Bind</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends Event {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see nz.auckland.arch.ArchPackage#getChannel_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Channel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Bind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bind</em>' reference.
	 * @see #setBind(Channel)
	 * @see nz.auckland.arch.ArchPackage#getChannel_Bind()
	 * @model
	 * @generated
	 */
	Channel getBind();

	/**
	 * Sets the value of the '{@link nz.auckland.arch.Channel#getBind <em>Bind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bind</em>' reference.
	 * @see #getBind()
	 * @generated
	 */
	void setBind(Channel value);

} // Channel
