/**
 * Generated from platform:/resource/vit/src/vit/eDFDXformM2M.vql
 */
package vit;

import eDFDFlowTracking.Asset;
import eDFDFlowTracking.ExternalEntity;
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
 *         pattern EEElements(ee : ExternalEntity, a: Asset){
 *         	ExternalEntity.assets(ee, a);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EEElements extends BaseGeneratedEMFQuerySpecification<EEElements.Matcher> {
  /**
   * Pattern-specific match representation of the vit.EEElements pattern,
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
    private ExternalEntity fEe;
    
    private Asset fA;
    
    private static List<String> parameterNames = makeImmutableList("ee", "a");
    
    private Match(final ExternalEntity pEe, final Asset pA) {
      this.fEe = pEe;
      this.fA = pA;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("ee".equals(parameterName)) return this.fEe;
      if ("a".equals(parameterName)) return this.fA;
      return null;
    }
    
    public ExternalEntity getEe() {
      return this.fEe;
    }
    
    public Asset getA() {
      return this.fA;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ee".equals(parameterName) ) {
          this.fEe = (ExternalEntity) newValue;
          return true;
      }
      if ("a".equals(parameterName) ) {
          this.fA = (Asset) newValue;
          return true;
      }
      return false;
    }
    
    public void setEe(final ExternalEntity pEe) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEe = pEe;
    }
    
    public void setA(final Asset pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }
    
    @Override
    public String patternName() {
      return "vit.EEElements";
    }
    
    @Override
    public List<String> parameterNames() {
      return EEElements.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEe, fA};
    }
    
    @Override
    public EEElements.Match toImmutable() {
      return isMutable() ? newMatch(fEe, fA) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ee\"=" + prettyPrintValue(fEe) + ", ");
      result.append("\"a\"=" + prettyPrintValue(fA));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEe, fA);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EEElements.Match)) {
          EEElements.Match other = (EEElements.Match) obj;
          return Objects.equals(fEe, other.fEe) && Objects.equals(fA, other.fA);
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
    public EEElements specification() {
      return EEElements.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EEElements.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EEElements.Match newMutableMatch(final ExternalEntity pEe, final Asset pA) {
      return new Mutable(pEe, pA);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EEElements.Match newMatch(final ExternalEntity pEe, final Asset pA) {
      return new Immutable(pEe, pA);
    }
    
    private static final class Mutable extends EEElements.Match {
      Mutable(final ExternalEntity pEe, final Asset pA) {
        super(pEe, pA);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EEElements.Match {
      Immutable(final ExternalEntity pEe, final Asset pA) {
        super(pEe, pA);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the vit.EEElements pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern EEElements(ee : ExternalEntity, a: Asset){
   * 	ExternalEntity.assets(ee, a);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EEElements
   * 
   */
  public static class Matcher extends BaseMatcher<EEElements.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EEElements.Matcher on(final ViatraQueryEngine engine) {
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
    public static EEElements.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_EE = 0;
    
    private static final int POSITION_A = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EEElements.Matcher.class);
    
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
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EEElements.Match> getAllMatches(final ExternalEntity pEe, final Asset pA) {
      return rawStreamAllMatches(new Object[]{pEe, pA}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EEElements.Match> streamAllMatches(final ExternalEntity pEe, final Asset pA) {
      return rawStreamAllMatches(new Object[]{pEe, pA});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EEElements.Match> getOneArbitraryMatch(final ExternalEntity pEe, final Asset pA) {
      return rawGetOneArbitraryMatch(new Object[]{pEe, pA});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final ExternalEntity pEe, final Asset pA) {
      return rawHasMatch(new Object[]{pEe, pA});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final ExternalEntity pEe, final Asset pA) {
      return rawCountMatches(new Object[]{pEe, pA});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final ExternalEntity pEe, final Asset pA, final Consumer<? super EEElements.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEe, pA}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EEElements.Match newMatch(final ExternalEntity pEe, final Asset pA) {
      return EEElements.Match.newMatch(pEe, pA);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ee.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ExternalEntity> rawStreamAllValuesOfee(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EE, parameters).map(ExternalEntity.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ee.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ExternalEntity> getAllValuesOfee() {
      return rawStreamAllValuesOfee(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ee.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ExternalEntity> streamAllValuesOfee() {
      return rawStreamAllValuesOfee(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ee.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ExternalEntity> streamAllValuesOfee(final EEElements.Match partialMatch) {
      return rawStreamAllValuesOfee(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ee.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ExternalEntity> streamAllValuesOfee(final Asset pA) {
      return rawStreamAllValuesOfee(new Object[]{null, pA});
    }
    
    /**
     * Retrieve the set of values that occur in matches for ee.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ExternalEntity> getAllValuesOfee(final EEElements.Match partialMatch) {
      return rawStreamAllValuesOfee(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ee.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ExternalEntity> getAllValuesOfee(final Asset pA) {
      return rawStreamAllValuesOfee(new Object[]{null, pA}).collect(Collectors.toSet());
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
    public Stream<Asset> streamAllValuesOfa(final EEElements.Match partialMatch) {
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
    public Stream<Asset> streamAllValuesOfa(final ExternalEntity pEe) {
      return rawStreamAllValuesOfa(new Object[]{pEe, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final EEElements.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final ExternalEntity pEe) {
      return rawStreamAllValuesOfa(new Object[]{pEe, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected EEElements.Match tupleToMatch(final Tuple t) {
      try {
          return EEElements.Match.newMatch((ExternalEntity) t.get(POSITION_EE), (Asset) t.get(POSITION_A));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EEElements.Match arrayToMatch(final Object[] match) {
      try {
          return EEElements.Match.newMatch((ExternalEntity) match[POSITION_EE], (Asset) match[POSITION_A]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EEElements.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EEElements.Match.newMutableMatch((ExternalEntity) match[POSITION_EE], (Asset) match[POSITION_A]);
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
    public static IQuerySpecification<EEElements.Matcher> querySpecification() {
      return EEElements.instance();
    }
  }
  
  private EEElements() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EEElements instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EEElements.Matcher instantiate(final ViatraQueryEngine engine) {
    return EEElements.Matcher.on(engine);
  }
  
  @Override
  public EEElements.Matcher instantiate() {
    return EEElements.Matcher.create();
  }
  
  @Override
  public EEElements.Match newEmptyMatch() {
    return EEElements.Match.newEmptyMatch();
  }
  
  @Override
  public EEElements.Match newMatch(final Object... parameters) {
    return EEElements.Match.newMatch((eDFDFlowTracking.ExternalEntity) parameters[0], (eDFDFlowTracking.Asset) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: vit.EEElements (visibility: PUBLIC, simpleName: EEElements, identifier: vit.EEElements, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: vit) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: vit.EEElements (visibility: PUBLIC, simpleName: EEElements, identifier: vit.EEElements, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: vit) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EEElements INSTANCE = new EEElements();
    
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
    private static final EEElements.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_ee = new PParameter("ee", "eDFDFlowTracking.ExternalEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "ExternalEntity")), PParameterDirection.INOUT);
    
    private final PParameter parameter_a = new PParameter("a", "eDFDFlowTracking.Asset", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "Asset")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_ee, parameter_a);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "vit.EEElements";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ee","a");
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
          PVariable var_ee = body.getOrCreateVariableByName("ee");
          PVariable var_a = body.getOrCreateVariableByName("a");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ee), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "ExternalEntity")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "Asset")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ee, parameter_ee),
             new ExportedParameter(body, var_a, parameter_a)
          ));
          // 	ExternalEntity.assets(ee, a)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ee), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "ExternalEntity")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ee, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/eDFDFlowTracking", "Element", "assets")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "Asset")));
          new Equality(body, var__virtual_0_, var_a);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
