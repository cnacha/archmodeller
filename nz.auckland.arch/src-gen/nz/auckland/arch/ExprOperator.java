/**
 */
package nz.auckland.arch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Expr Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nz.auckland.arch.ArchPackage#getExprOperator()
 * @model
 * @generated
 */
public enum ExprOperator implements Enumerator {
	/**
	 * The '<em><b>PARALLEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL(0, "PARALLEL", "PARALLEL"),

	/**
	 * The '<em><b>COUPLING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUPLING_VALUE
	 * @generated
	 * @ordered
	 */
	COUPLING(1, "COUPLING", "COUPLING"),

	/**
	 * The '<em><b>INTERLEAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERLEAVE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERLEAVE(2, "INTERLEAVE", "INTERLEAVE");

	/**
	 * The '<em><b>PARALLEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARALLEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_VALUE = 0;

	/**
	 * The '<em><b>COUPLING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COUPLING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUPLING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COUPLING_VALUE = 1;

	/**
	 * The '<em><b>INTERLEAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERLEAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERLEAVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERLEAVE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Expr Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExprOperator[] VALUES_ARRAY = new ExprOperator[] { PARALLEL, COUPLING, INTERLEAVE, };

	/**
	 * A public read-only list of all the '<em><b>Expr Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExprOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expr Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExprOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExprOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expr Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExprOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExprOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expr Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExprOperator get(int value) {
		switch (value) {
		case PARALLEL_VALUE:
			return PARALLEL;
		case COUPLING_VALUE:
			return COUPLING;
		case INTERLEAVE_VALUE:
			return INTERLEAVE;
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
	private ExprOperator(int value, String name, String literal) {
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

} //ExprOperator
