/**
 */
package nz.auckland.arch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LTL Nested Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.LTLNestedExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see nz.auckland.arch.ArchPackage#getLTLNestedExpr()
 * @model
 * @generated
 */
public interface LTLNestedExpr extends LTLExpr {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
	 * The list contents are of type {@link nz.auckland.arch.LTLExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference list.
	 * @see nz.auckland.arch.ArchPackage#getLTLNestedExpr_Expr()
	 * @model containment="true"
	 * @generated
	 */
	EList<LTLExpr> getExpr();

} // LTLNestedExpr
