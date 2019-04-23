/**
 * Generated from platform:/resource/Viatra_Query/src/viatra/eDFDXformM2M.vql
 */
package viatra;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import viatra.AssetSource;
import viatra.Assets;
import viatra.Boundaries;
import viatra.BoundariesAssets;
import viatra.ComparatorProcesses;
import viatra.ConfidentialAsset;
import viatra.DSElements;
import viatra.EDFD;
import viatra.EDFDAsset;
import viatra.EEElement;
import viatra.EEElements;
import viatra.EEandDSAssetElement;
import viatra.EEandDSElement;
import viatra.FlowElements;
import viatra.HighPriorityAsset;
import viatra.NodeElements;
import viatra.NodeElementsAssets;
import viatra.ProcessElements;
import viatra.ProcessElementsAssets;
import viatra.PublicAsset;
import viatra.Responsibilities;
import viatra.ResponsibilityTypes;
import viatra.SourceOfFlow;
import viatra.TargetOfFlow;

/**
 * A pattern group formed of all public patterns defined in eDFDXformM2M.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file eDFDXformM2M.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package viatra, the group contains the definition of the following patterns: <ul>
 * <li>EDFD</li>
 * <li>EDFDAsset</li>
 * <li>Boundaries</li>
 * <li>BoundariesAssets</li>
 * <li>NodeElements</li>
 * <li>NodeElementsAssets</li>
 * <li>EEandDSElement</li>
 * <li>EEandDSAssetElement</li>
 * <li>EEElements</li>
 * <li>EEElement</li>
 * <li>AssetSource</li>
 * <li>DSElements</li>
 * <li>ProcessElements</li>
 * <li>ProcessElementsAssets</li>
 * <li>FlowElements</li>
 * <li>Assets</li>
 * <li>Responsibilities</li>
 * <li>ResponsibilityTypes</li>
 * <li>sourceOfFlow</li>
 * <li>targetOfFlow</li>
 * <li>highPriorityAsset</li>
 * <li>confidentialAsset</li>
 * <li>publicAsset</li>
 * <li>comparatorProcesses</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class EDFDXformM2M extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static EDFDXformM2M instance() {
    if (INSTANCE == null) {
        INSTANCE = new EDFDXformM2M();
    }
    return INSTANCE;
  }
  
  private static EDFDXformM2M INSTANCE;
  
  private EDFDXformM2M() {
    querySpecifications.add(EDFD.instance());
    querySpecifications.add(EDFDAsset.instance());
    querySpecifications.add(Boundaries.instance());
    querySpecifications.add(BoundariesAssets.instance());
    querySpecifications.add(NodeElements.instance());
    querySpecifications.add(NodeElementsAssets.instance());
    querySpecifications.add(EEandDSElement.instance());
    querySpecifications.add(EEandDSAssetElement.instance());
    querySpecifications.add(EEElements.instance());
    querySpecifications.add(EEElement.instance());
    querySpecifications.add(AssetSource.instance());
    querySpecifications.add(DSElements.instance());
    querySpecifications.add(ProcessElements.instance());
    querySpecifications.add(ProcessElementsAssets.instance());
    querySpecifications.add(FlowElements.instance());
    querySpecifications.add(Assets.instance());
    querySpecifications.add(Responsibilities.instance());
    querySpecifications.add(ResponsibilityTypes.instance());
    querySpecifications.add(SourceOfFlow.instance());
    querySpecifications.add(TargetOfFlow.instance());
    querySpecifications.add(HighPriorityAsset.instance());
    querySpecifications.add(ConfidentialAsset.instance());
    querySpecifications.add(PublicAsset.instance());
    querySpecifications.add(ComparatorProcesses.instance());
  }
  
  public EDFD getEDFD() {
    return EDFD.instance();
  }
  
  public EDFD.Matcher getEDFD(final ViatraQueryEngine engine) {
    return EDFD.Matcher.on(engine);
  }
  
  public EDFDAsset getEDFDAsset() {
    return EDFDAsset.instance();
  }
  
  public EDFDAsset.Matcher getEDFDAsset(final ViatraQueryEngine engine) {
    return EDFDAsset.Matcher.on(engine);
  }
  
  public Boundaries getBoundaries() {
    return Boundaries.instance();
  }
  
  public Boundaries.Matcher getBoundaries(final ViatraQueryEngine engine) {
    return Boundaries.Matcher.on(engine);
  }
  
  public BoundariesAssets getBoundariesAssets() {
    return BoundariesAssets.instance();
  }
  
  public BoundariesAssets.Matcher getBoundariesAssets(final ViatraQueryEngine engine) {
    return BoundariesAssets.Matcher.on(engine);
  }
  
  public NodeElements getNodeElements() {
    return NodeElements.instance();
  }
  
  public NodeElements.Matcher getNodeElements(final ViatraQueryEngine engine) {
    return NodeElements.Matcher.on(engine);
  }
  
  public NodeElementsAssets getNodeElementsAssets() {
    return NodeElementsAssets.instance();
  }
  
  public NodeElementsAssets.Matcher getNodeElementsAssets(final ViatraQueryEngine engine) {
    return NodeElementsAssets.Matcher.on(engine);
  }
  
  public EEandDSElement getEEandDSElement() {
    return EEandDSElement.instance();
  }
  
  public EEandDSElement.Matcher getEEandDSElement(final ViatraQueryEngine engine) {
    return EEandDSElement.Matcher.on(engine);
  }
  
  public EEandDSAssetElement getEEandDSAssetElement() {
    return EEandDSAssetElement.instance();
  }
  
  public EEandDSAssetElement.Matcher getEEandDSAssetElement(final ViatraQueryEngine engine) {
    return EEandDSAssetElement.Matcher.on(engine);
  }
  
  public EEElements getEEElements() {
    return EEElements.instance();
  }
  
  public EEElements.Matcher getEEElements(final ViatraQueryEngine engine) {
    return EEElements.Matcher.on(engine);
  }
  
  public EEElement getEEElement() {
    return EEElement.instance();
  }
  
  public EEElement.Matcher getEEElement(final ViatraQueryEngine engine) {
    return EEElement.Matcher.on(engine);
  }
  
  public AssetSource getAssetSource() {
    return AssetSource.instance();
  }
  
  public AssetSource.Matcher getAssetSource(final ViatraQueryEngine engine) {
    return AssetSource.Matcher.on(engine);
  }
  
  public DSElements getDSElements() {
    return DSElements.instance();
  }
  
  public DSElements.Matcher getDSElements(final ViatraQueryEngine engine) {
    return DSElements.Matcher.on(engine);
  }
  
  public ProcessElements getProcessElements() {
    return ProcessElements.instance();
  }
  
  public ProcessElements.Matcher getProcessElements(final ViatraQueryEngine engine) {
    return ProcessElements.Matcher.on(engine);
  }
  
  public ProcessElementsAssets getProcessElementsAssets() {
    return ProcessElementsAssets.instance();
  }
  
  public ProcessElementsAssets.Matcher getProcessElementsAssets(final ViatraQueryEngine engine) {
    return ProcessElementsAssets.Matcher.on(engine);
  }
  
  public FlowElements getFlowElements() {
    return FlowElements.instance();
  }
  
  public FlowElements.Matcher getFlowElements(final ViatraQueryEngine engine) {
    return FlowElements.Matcher.on(engine);
  }
  
  public Assets getAssets() {
    return Assets.instance();
  }
  
  public Assets.Matcher getAssets(final ViatraQueryEngine engine) {
    return Assets.Matcher.on(engine);
  }
  
  public Responsibilities getResponsibilities() {
    return Responsibilities.instance();
  }
  
  public Responsibilities.Matcher getResponsibilities(final ViatraQueryEngine engine) {
    return Responsibilities.Matcher.on(engine);
  }
  
  public ResponsibilityTypes getResponsibilityTypes() {
    return ResponsibilityTypes.instance();
  }
  
  public ResponsibilityTypes.Matcher getResponsibilityTypes(final ViatraQueryEngine engine) {
    return ResponsibilityTypes.Matcher.on(engine);
  }
  
  public SourceOfFlow getSourceOfFlow() {
    return SourceOfFlow.instance();
  }
  
  public SourceOfFlow.Matcher getSourceOfFlow(final ViatraQueryEngine engine) {
    return SourceOfFlow.Matcher.on(engine);
  }
  
  public TargetOfFlow getTargetOfFlow() {
    return TargetOfFlow.instance();
  }
  
  public TargetOfFlow.Matcher getTargetOfFlow(final ViatraQueryEngine engine) {
    return TargetOfFlow.Matcher.on(engine);
  }
  
  public HighPriorityAsset getHighPriorityAsset() {
    return HighPriorityAsset.instance();
  }
  
  public HighPriorityAsset.Matcher getHighPriorityAsset(final ViatraQueryEngine engine) {
    return HighPriorityAsset.Matcher.on(engine);
  }
  
  public ConfidentialAsset getConfidentialAsset() {
    return ConfidentialAsset.instance();
  }
  
  public ConfidentialAsset.Matcher getConfidentialAsset(final ViatraQueryEngine engine) {
    return ConfidentialAsset.Matcher.on(engine);
  }
  
  public PublicAsset getPublicAsset() {
    return PublicAsset.instance();
  }
  
  public PublicAsset.Matcher getPublicAsset(final ViatraQueryEngine engine) {
    return PublicAsset.Matcher.on(engine);
  }
  
  public ComparatorProcesses getComparatorProcesses() {
    return ComparatorProcesses.instance();
  }
  
  public ComparatorProcesses.Matcher getComparatorProcesses(final ViatraQueryEngine engine) {
    return ComparatorProcesses.Matcher.on(engine);
  }
}
