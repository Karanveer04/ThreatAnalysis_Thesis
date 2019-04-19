/**
 */
package eDFDFlowTracking.impl;

import eDFDFlowTracking.AttackerProfile;
import eDFDFlowTracking.EDFDFlowTracking1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attacker Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eDFDFlowTracking.impl.AttackerProfileImpl#getName <em>Name</em>}</li>
 *   <li>{@link eDFDFlowTracking.impl.AttackerProfileImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link eDFDFlowTracking.impl.AttackerProfileImpl#getObservation <em>Observation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerProfileImpl extends MinimalEObjectImpl.Container implements AttackerProfile {
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
	 * The default value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected static final int OBSERVATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected int observation = OBSERVATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDFDFlowTracking1Package.Literals.ATTACKER_PROFILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDFDFlowTracking1Package.ATTACKER_PROFILE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDFDFlowTracking1Package.ATTACKER_PROFILE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(int newObservation) {
		int oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDFDFlowTracking1Package.ATTACKER_PROFILE__OBSERVATION, oldObservation, observation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__NAME:
				return getName();
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__NUMBER:
				return getNumber();
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__OBSERVATION:
				return getObservation();
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
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__NAME:
				setName((String)newValue);
				return;
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__NUMBER:
				setNumber((Integer)newValue);
				return;
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__OBSERVATION:
				setObservation((Integer)newValue);
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
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__OBSERVATION:
				setObservation(OBSERVATION_EDEFAULT);
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
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__NUMBER:
				return number != NUMBER_EDEFAULT;
			case EDFDFlowTracking1Package.ATTACKER_PROFILE__OBSERVATION:
				return observation != OBSERVATION_EDEFAULT;
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
		result.append(", Observation: ");
		result.append(observation);
		result.append(')');
		return result.toString();
	}

} //AttackerProfileImpl
