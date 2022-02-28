/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.RefactorPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refactor Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.RefactorPartImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RefactorPartImpl#getName <em>Name</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RefactorPartImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RefactorPartImpl#isCopyStructure <em>Copy Structure</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RefactorPartImpl#isReplaceStrcuture <em>Replace Strcuture</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.RefactorPartImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefactorPartImpl extends MinimalEObjectImpl.Container implements RefactorPart {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected DesignModel reference;

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
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviourProperty> functions;

	/**
	 * The default value of the '{@link #isCopyStructure() <em>Copy Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopyStructure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COPY_STRUCTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCopyStructure() <em>Copy Structure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopyStructure()
	 * @generated
	 * @ordered
	 */
	protected boolean copyStructure = COPY_STRUCTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReplaceStrcuture() <em>Replace Strcuture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceStrcuture()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPLACE_STRCUTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReplaceStrcuture() <em>Replace Strcuture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceStrcuture()
	 * @generated
	 * @ordered
	 */
	protected boolean replaceStrcuture = REPLACE_STRCUTURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected RefactorPart next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefactorPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.REFACTOR_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignModel getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject) reference;
			reference = (DesignModel) eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.REFACTOR_PART__REFERENCE,
							oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignModel basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReference(DesignModel newReference) {
		DesignModel oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.REFACTOR_PART__REFERENCE, oldReference,
					reference));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.REFACTOR_PART__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehaviourProperty> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<BehaviourProperty>(BehaviourProperty.class, this,
					ArchPackage.REFACTOR_PART__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCopyStructure() {
		return copyStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyStructure(boolean newCopyStructure) {
		boolean oldCopyStructure = copyStructure;
		copyStructure = newCopyStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.REFACTOR_PART__COPY_STRUCTURE,
					oldCopyStructure, copyStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReplaceStrcuture() {
		return replaceStrcuture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplaceStrcuture(boolean newReplaceStrcuture) {
		boolean oldReplaceStrcuture = replaceStrcuture;
		replaceStrcuture = newReplaceStrcuture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.REFACTOR_PART__REPLACE_STRCUTURE,
					oldReplaceStrcuture, replaceStrcuture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefactorPart getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject) next;
			next = (RefactorPart) eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.REFACTOR_PART__NEXT, oldNext,
							next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactorPart basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(RefactorPart newNext) {
		RefactorPart oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.REFACTOR_PART__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.REFACTOR_PART__FUNCTIONS:
			return ((InternalEList<?>) getFunctions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchPackage.REFACTOR_PART__REFERENCE:
			if (resolve)
				return getReference();
			return basicGetReference();
		case ArchPackage.REFACTOR_PART__NAME:
			return getName();
		case ArchPackage.REFACTOR_PART__FUNCTIONS:
			return getFunctions();
		case ArchPackage.REFACTOR_PART__COPY_STRUCTURE:
			return isCopyStructure();
		case ArchPackage.REFACTOR_PART__REPLACE_STRCUTURE:
			return isReplaceStrcuture();
		case ArchPackage.REFACTOR_PART__NEXT:
			if (resolve)
				return getNext();
			return basicGetNext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArchPackage.REFACTOR_PART__REFERENCE:
			setReference((DesignModel) newValue);
			return;
		case ArchPackage.REFACTOR_PART__NAME:
			setName((String) newValue);
			return;
		case ArchPackage.REFACTOR_PART__FUNCTIONS:
			getFunctions().clear();
			getFunctions().addAll((Collection<? extends BehaviourProperty>) newValue);
			return;
		case ArchPackage.REFACTOR_PART__COPY_STRUCTURE:
			setCopyStructure((Boolean) newValue);
			return;
		case ArchPackage.REFACTOR_PART__REPLACE_STRCUTURE:
			setReplaceStrcuture((Boolean) newValue);
			return;
		case ArchPackage.REFACTOR_PART__NEXT:
			setNext((RefactorPart) newValue);
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
		case ArchPackage.REFACTOR_PART__REFERENCE:
			setReference((DesignModel) null);
			return;
		case ArchPackage.REFACTOR_PART__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ArchPackage.REFACTOR_PART__FUNCTIONS:
			getFunctions().clear();
			return;
		case ArchPackage.REFACTOR_PART__COPY_STRUCTURE:
			setCopyStructure(COPY_STRUCTURE_EDEFAULT);
			return;
		case ArchPackage.REFACTOR_PART__REPLACE_STRCUTURE:
			setReplaceStrcuture(REPLACE_STRCUTURE_EDEFAULT);
			return;
		case ArchPackage.REFACTOR_PART__NEXT:
			setNext((RefactorPart) null);
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
		case ArchPackage.REFACTOR_PART__REFERENCE:
			return reference != null;
		case ArchPackage.REFACTOR_PART__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ArchPackage.REFACTOR_PART__FUNCTIONS:
			return functions != null && !functions.isEmpty();
		case ArchPackage.REFACTOR_PART__COPY_STRUCTURE:
			return copyStructure != COPY_STRUCTURE_EDEFAULT;
		case ArchPackage.REFACTOR_PART__REPLACE_STRCUTURE:
			return replaceStrcuture != REPLACE_STRCUTURE_EDEFAULT;
		case ArchPackage.REFACTOR_PART__NEXT:
			return next != null;
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
		result.append(", copyStructure: ");
		result.append(copyStructure);
		result.append(", replaceStrcuture: ");
		result.append(replaceStrcuture);
		result.append(')');
		return result.toString();
	}

} //RefactorPartImpl
