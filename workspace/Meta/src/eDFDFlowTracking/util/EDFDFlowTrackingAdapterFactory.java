/**
 */
package eDFDFlowTracking.util;

import eDFDFlowTracking.Asset;
import eDFDFlowTracking.Assumption;
import eDFDFlowTracking.AttackerProfile;
import eDFDFlowTracking.DataStore;
import eDFDFlowTracking.EDFD;
import eDFDFlowTracking.EDFDFlowTrackingPackage;
import eDFDFlowTracking.Element;
import eDFDFlowTracking.ExternalEntity;
import eDFDFlowTracking.Flow;
import eDFDFlowTracking.NamedEntity;
import eDFDFlowTracking.Responsibility;
import eDFDFlowTracking.TrustZone;
import eDFDFlowTracking.Value;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eDFDFlowTracking.EDFDFlowTrackingPackage
 * @generated
 */
public class EDFDFlowTrackingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EDFDFlowTrackingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFDFlowTrackingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EDFDFlowTrackingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDFDFlowTrackingSwitch<Adapter> modelSwitch =
		new EDFDFlowTrackingSwitch<Adapter>() {
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseProcess(eDFDFlowTracking.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseEDFD(EDFD object) {
				return createEDFDAdapter();
			}
			@Override
			public Adapter caseDataStore(DataStore object) {
				return createDataStoreAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseExternalEntity(ExternalEntity object) {
				return createExternalEntityAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseAssumption(Assumption object) {
				return createAssumptionAdapter();
			}
			@Override
			public Adapter caseAttackerProfile(AttackerProfile object) {
				return createAttackerProfileAdapter();
			}
			@Override
			public Adapter caseTrustZone(TrustZone object) {
				return createTrustZoneAdapter();
			}
			@Override
			public Adapter caseResponsibility(Responsibility object) {
				return createResponsibilityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.EDFD <em>EDFD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.EDFD
	 * @generated
	 */
	public Adapter createEDFDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.DataStore
	 * @generated
	 */
	public Adapter createDataStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.ExternalEntity <em>External Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.ExternalEntity
	 * @generated
	 */
	public Adapter createExternalEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.Assumption
	 * @generated
	 */
	public Adapter createAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.AttackerProfile <em>Attacker Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.AttackerProfile
	 * @generated
	 */
	public Adapter createAttackerProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.TrustZone <em>Trust Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.TrustZone
	 * @generated
	 */
	public Adapter createTrustZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eDFDFlowTracking.Responsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eDFDFlowTracking.Responsibility
	 * @generated
	 */
	public Adapter createResponsibilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EDFDFlowTrackingAdapterFactory
