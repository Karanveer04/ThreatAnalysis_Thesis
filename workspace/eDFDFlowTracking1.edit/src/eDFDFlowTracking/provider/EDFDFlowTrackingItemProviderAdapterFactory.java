/**
 */
package eDFDFlowTracking.provider;

import eDFDFlowTracking.util.EDFDFlowTrackingAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EDFDFlowTrackingItemProviderAdapterFactory extends EDFDFlowTrackingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFDFlowTrackingItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.Asset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetItemProvider assetItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssetAdapter() {
		if (assetItemProvider == null) {
			assetItemProvider = new AssetItemProvider(this);
		}

		return assetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.Process} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessItemProvider processItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessAdapter() {
		if (processItemProvider == null) {
			processItemProvider = new ProcessItemProvider(this);
		}

		return processItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.EDFD} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDFDItemProvider edfdItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.EDFD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEDFDAdapter() {
		if (edfdItemProvider == null) {
			edfdItemProvider = new EDFDItemProvider(this);
		}

		return edfdItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.DataStore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStoreItemProvider dataStoreItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.DataStore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataStoreAdapter() {
		if (dataStoreItemProvider == null) {
			dataStoreItemProvider = new DataStoreItemProvider(this);
		}

		return dataStoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.Flow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowItemProvider flowItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.Flow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlowAdapter() {
		if (flowItemProvider == null) {
			flowItemProvider = new FlowItemProvider(this);
		}

		return flowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.ExternalEntity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalEntityItemProvider externalEntityItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.ExternalEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalEntityAdapter() {
		if (externalEntityItemProvider == null) {
			externalEntityItemProvider = new ExternalEntityItemProvider(this);
		}

		return externalEntityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.Value} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueItemProvider valueItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueAdapter() {
		if (valueItemProvider == null) {
			valueItemProvider = new ValueItemProvider(this);
		}

		return valueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.Assumption} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssumptionItemProvider assumptionItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.Assumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssumptionAdapter() {
		if (assumptionItemProvider == null) {
			assumptionItemProvider = new AssumptionItemProvider(this);
		}

		return assumptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.AttackerProfile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerProfileItemProvider attackerProfileItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.AttackerProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttackerProfileAdapter() {
		if (attackerProfileItemProvider == null) {
			attackerProfileItemProvider = new AttackerProfileItemProvider(this);
		}

		return attackerProfileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.TrustZone} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustZoneItemProvider trustZoneItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.TrustZone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrustZoneAdapter() {
		if (trustZoneItemProvider == null) {
			trustZoneItemProvider = new TrustZoneItemProvider(this);
		}

		return trustZoneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eDFDFlowTracking.Responsibility} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsibilityItemProvider responsibilityItemProvider;

	/**
	 * This creates an adapter for a {@link eDFDFlowTracking.Responsibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponsibilityAdapter() {
		if (responsibilityItemProvider == null) {
			responsibilityItemProvider = new ResponsibilityItemProvider(this);
		}

		return responsibilityItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (assetItemProvider != null) assetItemProvider.dispose();
		if (processItemProvider != null) processItemProvider.dispose();
		if (edfdItemProvider != null) edfdItemProvider.dispose();
		if (dataStoreItemProvider != null) dataStoreItemProvider.dispose();
		if (flowItemProvider != null) flowItemProvider.dispose();
		if (externalEntityItemProvider != null) externalEntityItemProvider.dispose();
		if (valueItemProvider != null) valueItemProvider.dispose();
		if (assumptionItemProvider != null) assumptionItemProvider.dispose();
		if (attackerProfileItemProvider != null) attackerProfileItemProvider.dispose();
		if (trustZoneItemProvider != null) trustZoneItemProvider.dispose();
		if (responsibilityItemProvider != null) responsibilityItemProvider.dispose();
	}

}
