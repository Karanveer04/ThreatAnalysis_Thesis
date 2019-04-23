/**
 * Generated from platform:/resource/vit/src/vit/eDFDXformM2M.vql
 */
package vit;

import eDFDFlowTracking.Asset;
import eDFDFlowTracking.TrustZone;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern BoundariesAssets(a : Asset, tb: TrustZone){
 *         	TrustZone.elements.assets(tb, a);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class BoundariesAssets extends BaseGeneratedEMFQuerySpecification<BoundariesAssets.Matcher> {
  /**
   * Pattern-specific match representation of the vit.BoundariesAssets pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Asset fA;
    
    private TrustZone fTb;
    
    private static List<String> parameterNames = makeImmutableList("a", "tb");
    
    private Match(final Asset pA, final TrustZone pTb) {
      this.fA = pA;
      this.fTb = pTb;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("a".equals(parameterName)) return this.fA;
      if ("tb".equals(parameterName)) return this.fTb;
      return null;
    }
    
    public Asset getA() {
      return this.fA;
    }
    
    public TrustZone getTb() {
      return this.fTb;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("a".equals(parameterName) ) {
          this.fA = (Asset) newValue;
          return true;
      }
      if ("tb".equals(parameterName) ) {
          this.fTb = (TrustZone) newValue;
          return true;
      }
      return false;
    }
    
    public void setA(final Asset pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }
    
    public void setTb(final TrustZone pTb) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTb = pTb;
    }
    
    @Override
    public String patternName() {
      return "vit.BoundariesAssets";
    }
    
    @Override
    public List<String> parameterNames() {
      return BoundariesAssets.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fA, fTb};
    }
    
    @Override
    public BoundariesAssets.Match toImmutable() {
      return isMutable() ? newMatch(fA, fTb) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"a\"=" + prettyPrintValue(fA) + ", ");
      result.append("\"tb\"=" + prettyPrintValue(fTb));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fA, fTb);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof BoundariesAssets.Match)) {
          BoundariesAssets.Match other = (BoundariesAssets.Match) obj;
          return Objects.equals(fA, other.fA) && Objects.equals(fTb, other.fTb);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public BoundariesAssets specification() {
      return BoundariesAssets.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static BoundariesAssets.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static BoundariesAssets.Match newMutableMatch(final Asset pA, final TrustZone pTb) {
      return new Mutable(pA, pTb);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static BoundariesAssets.Match newMatch(final Asset pA, final TrustZone pTb) {
      return new Immutable(pA, pTb);
    }
    
    private static final class Mutable extends BoundariesAssets.Match {
      Mutable(final Asset pA, final TrustZone pTb) {
        super(pA, pTb);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends BoundariesAssets.Match {
      Immutable(final Asset pA, final TrustZone pTb) {
        super(pA, pTb);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the vit.BoundariesAssets pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern BoundariesAssets(a : Asset, tb: TrustZone){
   * 	TrustZone.elements.assets(tb, a);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see BoundariesAssets
   * 
   */
  public static class Matcher extends BaseMatcher<BoundariesAssets.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static BoundariesAssets.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static BoundariesAssets.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_A = 0;
    
    private static final int POSITION_TB = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(BoundariesAssets.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<BoundariesAssets.Match> getAllMatches(final Asset pA, final TrustZone pTb) {
      return rawStreamAllMatches(new Object[]{pA, pTb}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<BoundariesAssets.Match> streamAllMatches(final Asset pA, final TrustZone pTb) {
      return rawStreamAllMatches(new Object[]{pA, pTb});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<BoundariesAssets.Match> getOneArbitraryMatch(final Asset pA, final TrustZone pTb) {
      return rawGetOneArbitraryMatch(new Object[]{pA, pTb});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Asset pA, final TrustZone pTb) {
      return rawHasMatch(new Object[]{pA, pTb});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Asset pA, final TrustZone pTb) {
      return rawCountMatches(new Object[]{pA, pTb});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Asset pA, final TrustZone pTb, final Consumer<? super BoundariesAssets.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pA, pTb}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public BoundariesAssets.Match newMatch(final Asset pA, final TrustZone pTb) {
      return BoundariesAssets.Match.newMatch(pA, pTb);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Asset> rawStreamAllValuesOfa(final Object[] parameters) {
      return rawStreamAllValues(POSITION_A, parameters).map(Asset.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Asset> streamAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Asset> streamAllValuesOfa(final BoundariesAssets.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Asset> streamAllValuesOfa(final TrustZone pTb) {
      return rawStreamAllValuesOfa(new Object[]{null, pTb});
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final BoundariesAssets.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final TrustZone pTb) {
      return rawStreamAllValuesOfa(new Object[]{null, pTb}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for tb.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<TrustZone> rawStreamAllValuesOftb(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TB, parameters).map(TrustZone.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for tb.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TrustZone> getAllValuesOftb() {
      return rawStreamAllValuesOftb(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for tb.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<TrustZone> streamAllValuesOftb() {
      return rawStreamAllValuesOftb(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for tb.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<TrustZone> streamAllValuesOftb(final BoundariesAssets.Match partialMatch) {
      return rawStreamAllValuesOftb(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for tb.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<TrustZone> streamAllValuesOftb(final Asset pA) {
      return rawStreamAllValuesOftb(new Object[]{pA, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for tb.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TrustZone> getAllValuesOftb(final BoundariesAssets.Match partialMatch) {
      return rawStreamAllValuesOftb(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for tb.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TrustZone> getAllValuesOftb(final Asset pA) {
      return rawStreamAllValuesOftb(new Object[]{pA, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected BoundariesAssets.Match tupleToMatch(final Tuple t) {
      try {
          return BoundariesAssets.Match.newMatch((Asset) t.get(POSITION_A), (TrustZone) t.get(POSITION_TB));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BoundariesAssets.Match arrayToMatch(final Object[] match) {
      try {
          return BoundariesAssets.Match.newMatch((Asset) match[POSITION_A], (TrustZone) match[POSITION_TB]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected BoundariesAssets.Match arrayToMatchMutable(final Object[] match) {
      try {
          return BoundariesAssets.Match.newMutableMatch((Asset) match[POSITION_A], (TrustZone) match[POSITION_TB]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<BoundariesAssets.Matcher> querySpecification() {
      return BoundariesAssets.instance();
    }
  }
  
  private BoundariesAssets() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static BoundariesAssets instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected BoundariesAssets.Matcher instantiate(final ViatraQueryEngine engine) {
    return BoundariesAssets.Matcher.on(engine);
  }
  
  @Override
  public BoundariesAssets.Matcher instantiate() {
    return BoundariesAssets.Matcher.create();
  }
  
  @Override
  public BoundariesAssets.Match newEmptyMatch() {
    return BoundariesAssets.Match.newEmptyMatch();
  }
  
  @Override
  public BoundariesAssets.Match newMatch(final Object... parameters) {
    return BoundariesAssets.Match.newMatch((eDFDFlowTracking.Asset) parameters[0], (eDFDFlowTracking.TrustZone) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: vit.BoundariesAssets (visibility: PUBLIC, simpleName: BoundariesAssets, identifier: vit.BoundariesAssets, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: vit) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: vit.BoundariesAssets (visibility: PUBLIC, simpleName: BoundariesAssets, identifier: vit.BoundariesAssets, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: vit) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final BoundariesAssets INSTANCE = new BoundariesAssets();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final BoundariesAssets.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_a = new PParameter("a", "eDFDFlowTracking.Asset", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "Asset")), PParameterDirection.INOUT);
    
    private final PParameter parameter_tb = new PParameter("tb", "eDFDFlowTracking.TrustZone", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "TrustZone")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_a, parameter_tb);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "vit.BoundariesAssets";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a","tb");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_a = body.getOrCreateVariableByName("a");
          PVariable var_tb = body.getOrCreateVariableByName("tb");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "Asset")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_tb), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "TrustZone")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_a),
             new ExportedParameter(body, var_tb, parameter_tb)
          ));
          // 	TrustZone.elements.assets(tb, a)
          new TypeConstraint(body, Tuples.flatTupleOf(var_tb), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "TrustZone")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tb, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/eDFDFlowTracking", "TrustZone", "elements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "Element")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/eDFDFlowTracking", "Element", "assets")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "Asset")));
          new Equality(body, var__virtual_1_, var_a);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
