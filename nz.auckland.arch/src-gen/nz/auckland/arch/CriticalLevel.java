/**
 */
package nz.auckland.arch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Critical Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nz.auckland.arch.ArchPackage#getCriticalLevel()
 * @model
 * @generated
 */
public enum CriticalLevel implements Enumerator {
	/**
	 * The '<em><b>Very Low</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_LOW_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_LOW(0, "VeryLow", "Very Low"),

	/**
	 * The '<em><b>Low</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOW(1, "Low", "Low"),

	/**
	 * The '<em><b>High</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH(2, "High", "High"),

	/**
	 * The '<em><b>Very High</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	VERY_HIGH(3, "VeryHigh", "VeryHigh");

	/**
	 * The '<em><b>Very Low</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_LOW
	 * @model name="VeryLow" literal="Very Low"
	 * @generated
	 * @ordered
	 */
	public static final int VERY_LOW_VALUE = 0;

	/**
	 * The '<em><b>Low</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @model name="Low"
	 * @generated
	 * @ordered
	 */
	public static final int LOW_VALUE = 1;

	/**
	 * The '<em><b>High</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @model name="High"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUE = 2;

	/**
	 * The '<em><b>Very High</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERY_HIGH
	 * @model name="VeryHigh"
	 * @generated
	 * @ordered
	 */
	public static final int VERY_HIGH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Critical Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CriticalLevel[] VALUES_ARRAY = new CriticalLevel[] { VERY_LOW, LOW, HIGH, VERY_HIGH, };

	/**
	 * A public read-only list of all the '<em><b>Critical Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CriticalLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Critical Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CriticalLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CriticalLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Critical Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CriticalLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CriticalLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Critical Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CriticalLevel get(int value) {
		switch (value) {
		case VERY_LOW_VALUE:
			return VERY_LOW;
		case LOW_VALUE:
			return LOW;
		case HIGH_VALUE:
			return HIGH;
		case VERY_HIGH_VALUE:
			return VERY_HIGH;
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
	private CriticalLevel(int value, String name, String literal) {
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

} //CriticalLevel
