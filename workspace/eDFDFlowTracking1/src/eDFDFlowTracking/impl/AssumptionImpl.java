/**
 */
package eDFDFlowTracking.impl;

import eDFDFlowTracking.Assumption;
import eDFDFlowTracking.EDFDFlowTracking1Package;
import eDFDFlowTracking.Layer;
import eDFDFlowTracking.Objective;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eDFDFlowTracking.impl.AssumptionImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link eDFDFlowTracking.impl.AssumptionImpl#getLayer <em>Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssumptionImpl extends MinimalEObjectImpl.Container implements Assumption {
	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> objective;

	/**
	 * The default value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected static final Layer LAYER_EDEFAULT = Layer.TRANSPORT;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected Layer layer = LAYER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDFDFlowTracking1Package.Literals.ASSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getObjective() {
		if (objective == null) {
			objective = new EDataTypeUniqueEList<Objective>(Objective.class, this, EDFDFlowTracking1Package.ASSUMPTION__OBJECTIVE);
		}
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer getLayer() {
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(Layer newLayer) {
		Layer oldLayer = layer;
		layer = newLayer == null ? LAYER_EDEFAULT : newLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDFDFlowTracking1Package.ASSUMPTION__LAYER, oldLayer, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDFDFlowTracking1Package.ASSUMPTION__OBJECTIVE:
				return getObjective();
			case EDFDFlowTracking1Package.ASSUMPTION__LAYER:
				return getLayer();
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
			case EDFDFlowTracking1Package.ASSUMPTION__OBJECTIVE:
				getObjective().clear();
				getObjective().addAll((Collection<? extends Objective>)newValue);
				return;
			case EDFDFlowTracking1Package.ASSUMPTION__LAYER:
				setLayer((Layer)newValue);
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
			case EDFDFlowTracking1Package.ASSUMPTION__OBJECTIVE:
				getObjective().clear();
				return;
			case EDFDFlowTracking1Package.ASSUMPTION__LAYER:
				setLayer(LAYER_EDEFAULT);
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
			case EDFDFlowTracking1Package.ASSUMPTION__OBJECTIVE:
				return objective != null && !objective.isEmpty();
			case EDFDFlowTracking1Package.ASSUMPTION__LAYER:
				return layer != LAYER_EDEFAULT;
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
		result.append(" (Objective: ");
		result.append(objective);
		result.append(", Layer: ");
		result.append(layer);
		result.append(')');
		return result.toString();
	}

} //AssumptionImpl
