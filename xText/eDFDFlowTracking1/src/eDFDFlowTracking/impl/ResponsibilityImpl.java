/**
 */
package eDFDFlowTracking.impl;

import eDFDFlowTracking.Asset;
import eDFDFlowTracking.EDFDFlowTracking1Package;
import eDFDFlowTracking.Responsibility;
import eDFDFlowTracking.ResponsibilityType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eDFDFlowTracking.impl.ResponsibilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link eDFDFlowTracking.impl.ResponsibilityImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link eDFDFlowTracking.impl.ResponsibilityImpl#getAction <em>Action</em>}</li>
 *   <li>{@link eDFDFlowTracking.impl.ResponsibilityImpl#getIncomeassets <em>Incomeassets</em>}</li>
 *   <li>{@link eDFDFlowTracking.impl.ResponsibilityImpl#getOutcomeassets <em>Outcomeassets</em>}</li>
 *   <li>{@link eDFDFlowTracking.impl.ResponsibilityImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponsibilityImpl extends MinimalEObjectImpl.Container implements Responsibility {
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
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibilityType> action;

	/**
	 * The cached value of the '{@link #getIncomeassets() <em>Incomeassets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomeassets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> incomeassets;

	/**
	 * The cached value of the '{@link #getOutcomeassets() <em>Outcomeassets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeassets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> outcomeassets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDFDFlowTracking1Package.Literals.RESPONSIBILITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDFDFlowTracking1Package.RESPONSIBILITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDFDFlowTracking1Package.RESPONSIBILITY__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResponsibilityType> getAction() {
		if (action == null) {
			action = new EDataTypeUniqueEList<ResponsibilityType>(ResponsibilityType.class, this, EDFDFlowTracking1Package.RESPONSIBILITY__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getIncomeassets() {
		if (incomeassets == null) {
			incomeassets = new EObjectResolvingEList<Asset>(Asset.class, this, EDFDFlowTracking1Package.RESPONSIBILITY__INCOMEASSETS);
		}
		return incomeassets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getOutcomeassets() {
		if (outcomeassets == null) {
			outcomeassets = new EObjectResolvingEList<Asset>(Asset.class, this, EDFDFlowTracking1Package.RESPONSIBILITY__OUTCOMEASSETS);
		}
		return outcomeassets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eDFDFlowTracking.Process getProcess() {
		if (eContainerFeatureID() != EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS) return null;
		return (eDFDFlowTracking.Process)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(eDFDFlowTracking.Process newProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcess, EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(eDFDFlowTracking.Process newProcess) {
		if (newProcess != eInternalContainer() || (eContainerFeatureID() != EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS && newProcess != null)) {
			if (EcoreUtil.isAncestor(this, newProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, EDFDFlowTracking1Package.PROCESS__RESPONSIBILITY, eDFDFlowTracking.Process.class, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcess((eDFDFlowTracking.Process)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS:
				return basicSetProcess(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS:
				return eInternalContainer().eInverseRemove(this, EDFDFlowTracking1Package.PROCESS__RESPONSIBILITY, eDFDFlowTracking.Process.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDFDFlowTracking1Package.RESPONSIBILITY__NAME:
				return getName();
			case EDFDFlowTracking1Package.RESPONSIBILITY__NUMBER:
				return getNumber();
			case EDFDFlowTracking1Package.RESPONSIBILITY__ACTION:
				return getAction();
			case EDFDFlowTracking1Package.RESPONSIBILITY__INCOMEASSETS:
				return getIncomeassets();
			case EDFDFlowTracking1Package.RESPONSIBILITY__OUTCOMEASSETS:
				return getOutcomeassets();
			case EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS:
				return getProcess();
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
			case EDFDFlowTracking1Package.RESPONSIBILITY__NAME:
				setName((String)newValue);
				return;
			case EDFDFlowTracking1Package.RESPONSIBILITY__NUMBER:
				setNumber((Integer)newValue);
				return;
			case EDFDFlowTracking1Package.RESPONSIBILITY__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ResponsibilityType>)newValue);
				return;
			case EDFDFlowTracking1Package.RESPONSIBILITY__INCOMEASSETS:
				getIncomeassets().clear();
				getIncomeassets().addAll((Collection<? extends Asset>)newValue);
				return;
			case EDFDFlowTracking1Package.RESPONSIBILITY__OUTCOMEASSETS:
				getOutcomeassets().clear();
				getOutcomeassets().addAll((Collection<? extends Asset>)newValue);
				return;
			case EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS:
				setProcess((eDFDFlowTracking.Process)newValue);
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
			case EDFDFlowTracking1Package.RESPONSIBILITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EDFDFlowTracking1Package.RESPONSIBILITY__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case EDFDFlowTracking1Package.RESPONSIBILITY__ACTION:
				getAction().clear();
				return;
			case EDFDFlowTracking1Package.RESPONSIBILITY__INCOMEASSETS:
				getIncomeassets().clear();
				return;
			case EDFDFlowTracking1Package.RESPONSIBILITY__OUTCOMEASSETS:
				getOutcomeassets().clear();
				return;
			case EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS:
				setProcess((eDFDFlowTracking.Process)null);
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
			case EDFDFlowTracking1Package.RESPONSIBILITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EDFDFlowTracking1Package.RESPONSIBILITY__NUMBER:
				return number != NUMBER_EDEFAULT;
			case EDFDFlowTracking1Package.RESPONSIBILITY__ACTION:
				return action != null && !action.isEmpty();
			case EDFDFlowTracking1Package.RESPONSIBILITY__INCOMEASSETS:
				return incomeassets != null && !incomeassets.isEmpty();
			case EDFDFlowTracking1Package.RESPONSIBILITY__OUTCOMEASSETS:
				return outcomeassets != null && !outcomeassets.isEmpty();
			case EDFDFlowTracking1Package.RESPONSIBILITY__PROCESS:
				return getProcess() != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", number: ");
		result.append(number);
		result.append(", Action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //ResponsibilityImpl
