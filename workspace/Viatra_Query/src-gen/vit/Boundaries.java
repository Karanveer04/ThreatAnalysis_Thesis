/**
 * Generated from platform:/resource/vit/src/vit/eDFDXformM2M.vql
 */
package vit;

import eDFDFlowTracking.EDFD;
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
 *         pattern Boundaries(tb: TrustZone, edfd: EDFD){
 *         	EDFD.trustzones(edfd, tb);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Boundaries extends BaseGeneratedEMFQuerySpecification<Boundaries.Matcher> {
  /**
   * Pattern-specific match representation of the vit.Boundaries pattern,
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
    private TrustZone fTb;
    
    private EDFD fEdfd;
    
    private static List<String> parameterNames = makeImmutableList("tb", "edfd");
    
    private Match(final TrustZone pTb, final EDFD pEdfd) {
      this.fTb = pTb;
      this.fEdfd = pEdfd;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("tb".equals(parameterName)) return this.fTb;
      if ("edfd".equals(parameterName)) return this.fEdfd;
      return null;
    }
    
    public TrustZone getTb() {
      return this.fTb;
    }
    
    public EDFD getEdfd() {
      return this.fEdfd;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("tb".equals(parameterName) ) {
          this.fTb = (TrustZone) newValue;
          return true;
      }
      if ("edfd".equals(parameterName) ) {
          this.fEdfd = (EDFD) newValue;
          return true;
      }
      return false;
    }
    
    public void setTb(final TrustZone pTb) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTb = pTb;
    }
    
    public void setEdfd(final EDFD pEdfd) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEdfd = pEdfd;
    }
    
    @Override
    public String patternName() {
      return "vit.Boundaries";
    }
    
    @Override
    public List<String> parameterNames() {
      return Boundaries.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTb, fEdfd};
    }
    
    @Override
    public Boundaries.Match toImmutable() {
      return isMutable() ? newMatch(fTb, fEdfd) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"tb\"=" + prettyPrintValue(fTb) + ", ");
      result.append("\"edfd\"=" + prettyPrintValue(fEdfd));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fTb, fEdfd);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Boundaries.Match)) {
          Boundaries.Match other = (Boundaries.Match) obj;
          return Objects.equals(fTb, other.fTb) && Objects.equals(fEdfd, other.fEdfd);
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
    public Boundaries specification() {
      return Boundaries.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Boundaries.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Boundaries.Match newMutableMatch(final TrustZone pTb, final EDFD pEdfd) {
      return new Mutable(pTb, pEdfd);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Boundaries.Match newMatch(final TrustZone pTb, final EDFD pEdfd) {
      return new Immutable(pTb, pEdfd);
    }
    
    private static final class Mutable extends Boundaries.Match {
      Mutable(final TrustZone pTb, final EDFD pEdfd) {
        super(pTb, pEdfd);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Boundaries.Match {
      Immutable(final TrustZone pTb, final EDFD pEdfd) {
        super(pTb, pEdfd);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the vit.Boundaries pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern Boundaries(tb: TrustZone, edfd: EDFD){
   * 	EDFD.trustzones(edfd, tb);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Boundaries
   * 
   */
  public static class Matcher extends BaseMatcher<Boundaries.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Boundaries.Matcher on(final ViatraQueryEngine engine) {
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
    public static Boundaries.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_TB = 0;
    
    private static final int POSITION_EDFD = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Boundaries.Matcher.class);
    
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
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Boundaries.Match> getAllMatches(final TrustZone pTb, final EDFD pEdfd) {
      return rawStreamAllMatches(new Object[]{pTb, pEdfd}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Boundaries.Match> streamAllMatches(final TrustZone pTb, final EDFD pEdfd) {
      return rawStreamAllMatches(new Object[]{pTb, pEdfd});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Boundaries.Match> getOneArbitraryMatch(final TrustZone pTb, final EDFD pEdfd) {
      return rawGetOneArbitraryMatch(new Object[]{pTb, pEdfd});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TrustZone pTb, final EDFD pEdfd) {
      return rawHasMatch(new Object[]{pTb, pEdfd});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TrustZone pTb, final EDFD pEdfd) {
      return rawCountMatches(new Object[]{pTb, pEdfd});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TrustZone pTb, final EDFD pEdfd, final Consumer<? super Boundaries.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTb, pEdfd}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTb the fixed value of pattern parameter tb, or null if not bound.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Boundaries.Match newMatch(final TrustZone pTb, final EDFD pEdfd) {
      return Boundaries.Match.newMatch(pTb, pEdfd);
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
    public Stream<TrustZone> streamAllValuesOftb(final Boundaries.Match partialMatch) {
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
    public Stream<TrustZone> streamAllValuesOftb(final EDFD pEdfd) {
      return rawStreamAllValuesOftb(new Object[]{null, pEdfd});
    }
    
    /**
     * Retrieve the set of values that occur in matches for tb.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TrustZone> getAllValuesOftb(final Boundaries.Match partialMatch) {
      return rawStreamAllValuesOftb(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for tb.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TrustZone> getAllValuesOftb(final EDFD pEdfd) {
      return rawStreamAllValuesOftb(new Object[]{null, pEdfd}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EDFD> rawStreamAllValuesOfedfd(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EDFD, parameters).map(EDFD.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFD> getAllValuesOfedfd() {
      return rawStreamAllValuesOfedfd(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFD> streamAllValuesOfedfd() {
      return rawStreamAllValuesOfedfd(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for edfd.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFD> streamAllValuesOfedfd(final Boundaries.Match partialMatch) {
      return rawStreamAllValuesOfedfd(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for edfd.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFD> streamAllValuesOfedfd(final TrustZone pTb) {
      return rawStreamAllValuesOfedfd(new Object[]{pTb, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFD> getAllValuesOfedfd(final Boundaries.Match partialMatch) {
      return rawStreamAllValuesOfedfd(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFD> getAllValuesOfedfd(final TrustZone pTb) {
      return rawStreamAllValuesOfedfd(new Object[]{pTb, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Boundaries.Match tupleToMatch(final Tuple t) {
      try {
          return Boundaries.Match.newMatch((TrustZone) t.get(POSITION_TB), (EDFD) t.get(POSITION_EDFD));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Boundaries.Match arrayToMatch(final Object[] match) {
      try {
          return Boundaries.Match.newMatch((TrustZone) match[POSITION_TB], (EDFD) match[POSITION_EDFD]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Boundaries.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Boundaries.Match.newMutableMatch((TrustZone) match[POSITION_TB], (EDFD) match[POSITION_EDFD]);
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
    public static IQuerySpecification<Boundaries.Matcher> querySpecification() {
      return Boundaries.instance();
    }
  }
  
  private Boundaries() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Boundaries instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Boundaries.Matcher instantiate(final ViatraQueryEngine engine) {
    return Boundaries.Matcher.on(engine);
  }
  
  @Override
  public Boundaries.Matcher instantiate() {
    return Boundaries.Matcher.create();
  }
  
  @Override
  public Boundaries.Match newEmptyMatch() {
    return Boundaries.Match.newEmptyMatch();
  }
  
  @Override
  public Boundaries.Match newMatch(final Object... parameters) {
    return Boundaries.Match.newMatch((eDFDFlowTracking.TrustZone) parameters[0], (eDFDFlowTracking.EDFD) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: vit.Boundaries (visibility: PUBLIC, simpleName: Boundaries, identifier: vit.Boundaries, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: vit) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: vit.Boundaries (visibility: PUBLIC, simpleName: Boundaries, identifier: vit.Boundaries, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: vit) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Boundaries INSTANCE = new Boundaries();
    
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
    private static final Boundaries.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_tb = new PParameter("tb", "eDFDFlowTracking.TrustZone", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "TrustZone")), PParameterDirection.INOUT);
    
    private final PParameter parameter_edfd = new PParameter("edfd", "eDFDFlowTracking.EDFD", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "EDFD")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_tb, parameter_edfd);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "vit.Boundaries";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("tb","edfd");
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
          PVariable var_tb = body.getOrCreateVariableByName("tb");
          PVariable var_edfd = body.getOrCreateVariableByName("edfd");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tb), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "TrustZone")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "EDFD")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_tb, parameter_tb),
             new ExportedParameter(body, var_edfd, parameter_edfd)
          ));
          // 	EDFD.trustzones(edfd, tb)
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "EDFD")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/eDFDFlowTracking", "EDFD", "trustzones")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "TrustZone")));
          new Equality(body, var__virtual_0_, var_tb);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
