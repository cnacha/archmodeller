/**
 */
package nz.auckland.arch.impl;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.OntologyLabel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.OntologyLabelImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.OntologyLabelImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.OntologyLabelImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologyLabelImpl extends MinimalEObjectImpl.Container implements OntologyLabel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_CLASS_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected String subClassOf = SUB_CLASS_OF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntologyLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.ONTOLOGY_LABEL;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ONTOLOGY_LABEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ONTOLOGY_LABEL__EXPRESSION, oldExpression,
					expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubClassOf() {
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClassOf(String newSubClassOf) {
		String oldSubClassOf = subClassOf;
		subClassOf = newSubClassOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.ONTOLOGY_LABEL__SUB_CLASS_OF,
					oldSubClassOf, subClassOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchPackage.ONTOLOGY_LABEL__NAME:
			return getName();
		case ArchPackage.ONTOLOGY_LABEL__EXPRESSION:
			return getExpression();
		case ArchPackage.ONTOLOGY_LABEL__SUB_CLASS_OF:
			return getSubClassOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArchPackage.ONTOLOGY_LABEL__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.ONTOLOGY_LABEL__EXPRESSION:
			setExpression((String) newValue);
			return;
		case ArchPackage.ONTOLOGY_LABEL__SUB_CLASS_OF:
			setSubClassOf((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArchPackage.ONTOLOGY_LABEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.ONTOLOGY_LABEL__EXPRESSION:
			setExpression(EXPRESSION_EDEFAULT);
			return;
		case ArchPackage.ONTOLOGY_LABEL__SUB_CLASS_OF:
			setSubClassOf(SUB_CLASS_OF_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArchPackage.ONTOLOGY_LABEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.ONTOLOGY_LABEL__EXPRESSION:
			return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		case ArchPackage.ONTOLOGY_LABEL__SUB_CLASS_OF:
			return SUB_CLASS_OF_EDEFAULT == null ? subClassOf != null : !SUB_CLASS_OF_EDEFAULT.equals(subClassOf);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", expression: ");
		result.append(expression);
		result.append(", subClassOf: ");
		result.append(subClassOf);
		result.append(')');
		return result.toString();
	}

} //OntologyLabelImpl
