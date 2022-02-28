/**
 */
package nz.auckland.arch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nz.auckland.arch.ArchPackage#getNodeType()
 * @model
 * @generated
 */
public enum NodeType implements Enumerator {
	/**
	 * The '<em><b>DOCKER CONTAINER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER_CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	DOCKER_CONTAINER(1, "DOCKER_CONTAINER", "DOCKER_CONTAINER"),

	/**
	 * The '<em><b>APPLICATION CONTAINER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_CONTAINER(2, "APPLICATION_CONTAINER", "APPLICATION_CONTAINER"),

	/**
	 * The '<em><b>FILE SYSTEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_SYSTEM(3, "FILE_SYSTEM", "FILE_SYSTEM");

	/**
	 * The '<em><b>DOCKER CONTAINER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER_CONTAINER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOCKER_CONTAINER_VALUE = 1;

	/**
	 * The '<em><b>APPLICATION CONTAINER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_CONTAINER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_CONTAINER_VALUE = 2;

	/**
	 * The '<em><b>FILE SYSTEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_SYSTEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILE_SYSTEM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Node Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NodeType[] VALUES_ARRAY = new NodeType[] { DOCKER_CONTAINER, APPLICATION_CONTAINER,
			FILE_SYSTEM, };

	/**
	 * A public read-only list of all the '<em><b>Node Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NodeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeType get(int value) {
		switch (value) {
		case DOCKER_CONTAINER_VALUE:
			return DOCKER_CONTAINER;
		case APPLICATION_CONTAINER_VALUE:
			return APPLICATION_CONTAINER;
		case FILE_SYSTEM_VALUE:
			return FILE_SYSTEM;
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
	private NodeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //NodeType
