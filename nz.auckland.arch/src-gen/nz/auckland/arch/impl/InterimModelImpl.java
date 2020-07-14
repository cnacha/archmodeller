/**
 */
package nz.auckland.arch.impl;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.InterimModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interim Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.InterimModelImpl#getStep <em>Step</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.InterimModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.InterimModelImpl#getNextModel <em>Next Model</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.InterimModelImpl#getDesignmodel <em>Designmodel</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.InterimModelImpl#isIsStable <em>Is Stable</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.InterimModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterimModelImpl extends MinimalEObjectImpl.Container implements InterimModel {
	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final int STEP_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected int step = STEP_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextModel() <em>Next Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextModel()
	 * @generated
	 * @ordered
	 */
	protected InterimModel nextModel;

	/**
	 * The cached value of the '{@link #getDesignmodel() <em>Designmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignmodel()
	 * @generated
	 * @ordered
	 */
	protected DesignModel designmodel;

	/**
	 * The default value of the '{@link #isIsStable() <em>Is Stable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsStable() <em>Is Stable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStable()
	 * @generated
	 * @ordered
	 */
	protected boolean isStable = IS_STABLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterimModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.INTERIM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignModel getDesignmodel() {
		return designmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignmodel(DesignModel newDesignmodel, NotificationChain msgs) {
		DesignModel oldDesignmodel = designmodel;
		designmodel = newDesignmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArchPackage.INTERIM_MODEL__DESIGNMODEL, oldDesignmodel, newDesignmodel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignmodel(DesignModel newDesignmodel) {
		if (newDesignmodel != designmodel) {
			NotificationChain msgs = null;
			if (designmodel != null)
				msgs = ((InternalEObject) designmodel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArchPackage.INTERIM_MODEL__DESIGNMODEL, null, msgs);
			if (newDesignmodel != null)
				msgs = ((InternalEObject) newDesignmodel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArchPackage.INTERIM_MODEL__DESIGNMODEL, null, msgs);
			msgs = basicSetDesignmodel(newDesignmodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.INTERIM_MODEL__DESIGNMODEL,
					newDesignmodel, newDesignmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStable() {
		return isStable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStable(boolean newIsStable) {
		boolean oldIsStable = isStable;
		isStable = newIsStable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.INTERIM_MODEL__IS_STABLE, oldIsStable,
					isStable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.INTERIM_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.INTERIM_MODEL__DESIGNMODEL:
			return basicSetDesignmodel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(int newStep) {
		int oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.INTERIM_MODEL__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.INTERIM_MODEL__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterimModel getNextModel() {
		if (nextModel != null && nextModel.eIsProxy()) {
			InternalEObject oldNextModel = (InternalEObject) nextModel;
			nextModel = (InterimModel) eResolveProxy(oldNextModel);
			if (nextModel != oldNextModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.INTERIM_MODEL__NEXT_MODEL,
							oldNextModel, nextModel));
			}
		}
		return nextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterimModel basicGetNextModel() {
		return nextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextModel(InterimModel newNextModel) {
		InterimModel oldNextModel = nextModel;
		nextModel = newNextModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.INTERIM_MODEL__NEXT_MODEL, oldNextModel,
					nextModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchPackage.INTERIM_MODEL__STEP:
			return getStep();
		case ArchPackage.INTERIM_MODEL__DESCRIPTION:
			return getDescription();
		case ArchPackage.INTERIM_MODEL__NEXT_MODEL:
			if (resolve)
				return getNextModel();
			return basicGetNextModel();
		case ArchPackage.INTERIM_MODEL__DESIGNMODEL:
			return getDesignmodel();
		case ArchPackage.INTERIM_MODEL__IS_STABLE:
			return isIsStable();
		case ArchPackage.INTERIM_MODEL__NAME:
			return getName();
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
		case ArchPackage.INTERIM_MODEL__STEP:
			setStep((Integer) newValue);
			return;
		case ArchPackage.INTERIM_MODEL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ArchPackage.INTERIM_MODEL__NEXT_MODEL:
			setNextModel((InterimModel) newValue);
			return;
		case ArchPackage.INTERIM_MODEL__DESIGNMODEL:
			setDesignmodel((DesignModel) newValue);
			return;
		case ArchPackage.INTERIM_MODEL__IS_STABLE:
			setIsStable((Boolean) newValue);
			return;
		case ArchPackage.INTERIM_MODEL__NAME:
			setName((String) newValue);
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
		case ArchPackage.INTERIM_MODEL__STEP:
			setStep(STEP_EDEFAULT);
			return;
		case ArchPackage.INTERIM_MODEL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ArchPackage.INTERIM_MODEL__NEXT_MODEL:
			setNextModel((InterimModel) null);
			return;
		case ArchPackage.INTERIM_MODEL__DESIGNMODEL:
			setDesignmodel((DesignModel) null);
			return;
		case ArchPackage.INTERIM_MODEL__IS_STABLE:
			setIsStable(IS_STABLE_EDEFAULT);
			return;
		case ArchPackage.INTERIM_MODEL__NAME:
			setName(NAME_EDEFAULT);
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
		case ArchPackage.INTERIM_MODEL__STEP:
			return step != STEP_EDEFAULT;
		case ArchPackage.INTERIM_MODEL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ArchPackage.INTERIM_MODEL__NEXT_MODEL:
			return nextModel != null;
		case ArchPackage.INTERIM_MODEL__DESIGNMODEL:
			return designmodel != null;
		case ArchPackage.INTERIM_MODEL__IS_STABLE:
			return isStable != IS_STABLE_EDEFAULT;
		case ArchPackage.INTERIM_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (step: ");
		result.append(step);
		result.append(", description: ");
		result.append(description);
		result.append(", isStable: ");
		result.append(isStable);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InterimModelImpl
