/**
 */
package nz.auckland.arch.impl;

import java.util.Collection;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.InterimModel;
import nz.auckland.arch.MigrationModel;

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
 * An implementation of the model object '<em><b>Migration Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nz.auckland.arch.impl.MigrationModelImpl#getSource <em>Source</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.MigrationModelImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link nz.auckland.arch.impl.MigrationModelImpl#getInterimmodels <em>Interimmodels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MigrationModelImpl extends MinimalEObjectImpl.Container implements MigrationModel {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected DesignModel source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DesignModel target;

	/**
	 * The cached value of the '{@link #getInterimmodels() <em>Interimmodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterimmodels()
	 * @generated
	 * @ordered
	 */
	protected EList<InterimModel> interimmodels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MigrationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchPackage.Literals.MIGRATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignModel getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (DesignModel) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.MIGRATION_MODEL__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignModel basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(DesignModel newSource) {
		DesignModel oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.MIGRATION_MODEL__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignModel getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (DesignModel) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchPackage.MIGRATION_MODEL__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignModel basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(DesignModel newTarget) {
		DesignModel oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.MIGRATION_MODEL__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterimModel> getInterimmodels() {
		if (interimmodels == null) {
			interimmodels = new EObjectContainmentEList<InterimModel>(InterimModel.class, this,
					ArchPackage.MIGRATION_MODEL__INTERIMMODELS);
		}
		return interimmodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchPackage.MIGRATION_MODEL__INTERIMMODELS:
			return ((InternalEList<?>) getInterimmodels()).basicRemove(otherEnd, msgs);
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
		case ArchPackage.MIGRATION_MODEL__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ArchPackage.MIGRATION_MODEL__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case ArchPackage.MIGRATION_MODEL__INTERIMMODELS:
			return getInterimmodels();
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
		case ArchPackage.MIGRATION_MODEL__SOURCE:
			setSource((DesignModel) newValue);
			return;
		case ArchPackage.MIGRATION_MODEL__TARGET:
			setTarget((DesignModel) newValue);
			return;
		case ArchPackage.MIGRATION_MODEL__INTERIMMODELS:
			getInterimmodels().clear();
			getInterimmodels().addAll((Collection<? extends InterimModel>) newValue);
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
		case ArchPackage.MIGRATION_MODEL__SOURCE:
			setSource((DesignModel) null);
			return;
		case ArchPackage.MIGRATION_MODEL__TARGET:
			setTarget((DesignModel) null);
			return;
		case ArchPackage.MIGRATION_MODEL__INTERIMMODELS:
			getInterimmodels().clear();
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
		case ArchPackage.MIGRATION_MODEL__SOURCE:
			return source != null;
		case ArchPackage.MIGRATION_MODEL__TARGET:
			return target != null;
		case ArchPackage.MIGRATION_MODEL__INTERIMMODELS:
			return interimmodels != null && !interimmodels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MigrationModelImpl
