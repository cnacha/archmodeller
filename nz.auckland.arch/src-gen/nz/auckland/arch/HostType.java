/**
 */
package nz.auckland.arch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Host Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nz.auckland.arch.ArchPackage#getHostType()
 * @model
 * @generated
 */
public enum HostType implements Enumerator {
	/**
	 * The '<em><b>VIRTUAL MACHINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL_MACHINE(0, "VIRTUAL_MACHINE", "VIRTUAL_MACHINE"),

	/**
	 * The '<em><b>DEDICATED SERVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEDICATED_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	DEDICATED_SERVER(1, "DEDICATED_SERVER", "DEDICATED_SERVER"),

	/**
	 * The '<em><b>CLOUD PLATFORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_PLATFORM_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD_PLATFORM(2, "CLOUD_PLATFORM", "CLOUD_PLATFORM"),
	/**
	 * The '<em><b>MOBILE PHONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MOBILE_PHONE_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILE_PHONE(3, "MOBILE_PHONE", "MOBILE_PHONE");

	/**
	 * The '<em><b>VIRTUAL MACHINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIRTUAL MACHINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_MACHINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_MACHINE_VALUE = 0;

	/**
	 * The '<em><b>DEDICATED SERVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEDICATED SERVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEDICATED_SERVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEDICATED_SERVER_VALUE = 1;

	/**
	 * The '<em><b>CLOUD PLATFORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOUD PLATFORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOUD_PLATFORM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_PLATFORM_VALUE = 2;

	/**
	 * The '<em><b>MOBILE PHONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOBILE PHONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOBILE_PHONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOBILE_PHONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Host Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HostType[] VALUES_ARRAY = new HostType[] { VIRTUAL_MACHINE, DEDICATED_SERVER, CLOUD_PLATFORM,
			MOBILE_PHONE, };

	/**
	 * A public read-only list of all the '<em><b>Host Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HostType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Host Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HostType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HostType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Host Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HostType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HostType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Host Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HostType get(int value) {
		switch (value) {
		case VIRTUAL_MACHINE_VALUE:
			return VIRTUAL_MACHINE;
		case DEDICATED_SERVER_VALUE:
			return DEDICATED_SERVER;
		case CLOUD_PLATFORM_VALUE:
			return CLOUD_PLATFORM;
		case MOBILE_PHONE_VALUE:
			return MOBILE_PHONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HostType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //HostType
