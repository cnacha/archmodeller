/**
 */
package nz.auckland.arch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Behaviour Prop Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nz.auckland.arch.ArchPackage#getBehaviourPropType()
 * @model
 * @generated
 */
public enum BehaviourPropType implements Enumerator {
	/**
	 * The '<em><b>LTL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTL_VALUE
	 * @generated
	 * @ordered
	 */
	LTL(0, "LTL", "LTL"),

	/**
	 * The '<em><b>Circular Free</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCULAR_FREE_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCULAR_FREE(1, "CircularFree", "CD"),

	/**
	 * The '<em><b>Decomposition Free</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECOMPOSITION_FREE_VALUE
	 * @generated
	 * @ordered
	 */
	DECOMPOSITION_FREE(2, "DecompositionFree", "FD"),

	/**
	 * The '<em><b>Poltergeist Free</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLTERGEIST_FREE_VALUE
	 * @generated
	 * @ordered
	 */
	POLTERGEIST_FREE(3, "PoltergeistFree", "PG"),

	/**
	 * The '<em><b>Ambiguous Interface Free</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMBIGUOUS_INTERFACE_FREE_VALUE
	 * @generated
	 * @ordered
	 */
	AMBIGUOUS_INTERFACE_FREE(4, "AmbiguousInterfaceFree", "AI");

	/**
	 * The '<em><b>LTL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LTL_VALUE = 0;

	/**
	 * The '<em><b>Circular Free</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCULAR_FREE
	 * @model name="CircularFree" literal="CD"
	 * @generated
	 * @ordered
	 */
	public static final int CIRCULAR_FREE_VALUE = 1;

	/**
	 * The '<em><b>Decomposition Free</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECOMPOSITION_FREE
	 * @model name="DecompositionFree" literal="FD"
	 * @generated
	 * @ordered
	 */
	public static final int DECOMPOSITION_FREE_VALUE = 2;

	/**
	 * The '<em><b>Poltergeist Free</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLTERGEIST_FREE
	 * @model name="PoltergeistFree" literal="PG"
	 * @generated
	 * @ordered
	 */
	public static final int POLTERGEIST_FREE_VALUE = 3;

	/**
	 * The '<em><b>Ambiguous Interface Free</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMBIGUOUS_INTERFACE_FREE
	 * @model name="AmbiguousInterfaceFree" literal="AI"
	 * @generated
	 * @ordered
	 */
	public static final int AMBIGUOUS_INTERFACE_FREE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Behaviour Prop Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BehaviourPropType[] VALUES_ARRAY = new BehaviourPropType[] { LTL, CIRCULAR_FREE,
			DECOMPOSITION_FREE, POLTERGEIST_FREE, AMBIGUOUS_INTERFACE_FREE, };

	/**
	 * A public read-only list of all the '<em><b>Behaviour Prop Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BehaviourPropType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Behaviour Prop Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BehaviourPropType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BehaviourPropType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behaviour Prop Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BehaviourPropType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BehaviourPropType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behaviour Prop Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BehaviourPropType get(int value) {
		switch (value) {
		case LTL_VALUE:
			return LTL;
		case CIRCULAR_FREE_VALUE:
			return CIRCULAR_FREE;
		case DECOMPOSITION_FREE_VALUE:
			return DECOMPOSITION_FREE;
		case POLTERGEIST_FREE_VALUE:
			return POLTERGEIST_FREE;
		case AMBIGUOUS_INTERFACE_FREE_VALUE:
			return AMBIGUOUS_INTERFACE_FREE;
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
	private BehaviourPropType(int value, String name, String literal) {
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

} //BehaviourPropType
