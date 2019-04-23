/**
 * Generated from platform:/resource/vit/src/vit/eDFDXformM2M.vql
 */
package vit;

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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
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
 *         pattern EDFD(edfd : EDFD){
 *         	EDFD(edfd);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EDFD extends BaseGeneratedEMFQuerySpecification<EDFD.Matcher> {
  /**
   * Pattern-specific match representation of the vit.EDFD pattern,
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
    private eDFDFlowTracking.EDFD fEdfd;
    
    private static List<String> parameterNames = makeImmutableList("edfd");
    
    private Match(final eDFDFlowTracking.EDFD pEdfd) {
      this.fEdfd = pEdfd;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("edfd".equals(parameterName)) return this.fEdfd;
      return null;
    }
    
    public eDFDFlowTracking.EDFD getEdfd() {
      return this.fEdfd;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("edfd".equals(parameterName) ) {
          this.fEdfd = (eDFDFlowTracking.EDFD) newValue;
          return true;
      }
      return false;
    }
    
    public void setEdfd(final eDFDFlowTracking.EDFD pEdfd) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEdfd = pEdfd;
    }
    
    @Override
    public String patternName() {
      return "vit.EDFD";
    }
    
    @Override
    public List<String> parameterNames() {
      return EDFD.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEdfd};
    }
    
    @Override
    public EDFD.Match toImmutable() {
      return isMutable() ? newMatch(fEdfd) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"edfd\"=" + prettyPrintValue(fEdfd));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEdfd);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EDFD.Match)) {
          EDFD.Match other = (EDFD.Match) obj;
          return Objects.equals(fEdfd, other.fEdfd);
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
    public EDFD specification() {
      return EDFD.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EDFD.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EDFD.Match newMutableMatch(final eDFDFlowTracking.EDFD pEdfd) {
      return new Mutable(pEdfd);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EDFD.Match newMatch(final eDFDFlowTracking.EDFD pEdfd) {
      return new Immutable(pEdfd);
    }
    
    private static final class Mutable extends EDFD.Match {
      Mutable(final eDFDFlowTracking.EDFD pEdfd) {
        super(pEdfd);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EDFD.Match {
      Immutable(final eDFDFlowTracking.EDFD pEdfd) {
        super(pEdfd);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the vit.EDFD pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern EDFD(edfd : EDFD){
   * 	EDFD(edfd);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EDFD
   * 
   */
  public static class Matcher extends BaseMatcher<EDFD.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EDFD.Matcher on(final ViatraQueryEngine engine) {
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
    public static EDFD.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_EDFD = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EDFD.Matcher.class);
    
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
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EDFD.Match> getAllMatches(final eDFDFlowTracking.EDFD pEdfd) {
      return rawStreamAllMatches(new Object[]{pEdfd}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EDFD.Match> streamAllMatches(final eDFDFlowTracking.EDFD pEdfd) {
      return rawStreamAllMatches(new Object[]{pEdfd});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EDFD.Match> getOneArbitraryMatch(final eDFDFlowTracking.EDFD pEdfd) {
      return rawGetOneArbitraryMatch(new Object[]{pEdfd});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final eDFDFlowTracking.EDFD pEdfd) {
      return rawHasMatch(new Object[]{pEdfd});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final eDFDFlowTracking.EDFD pEdfd) {
      return rawCountMatches(new Object[]{pEdfd});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final eDFDFlowTracking.EDFD pEdfd, final Consumer<? super EDFD.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEdfd}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEdfd the fixed value of pattern parameter edfd, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EDFD.Match newMatch(final eDFDFlowTracking.EDFD pEdfd) {
      return EDFD.Match.newMatch(pEdfd);
    }
    
    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<eDFDFlowTracking.EDFD> rawStreamAllValuesOfedfd(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EDFD, parameters).map(eDFDFlowTracking.EDFD.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<eDFDFlowTracking.EDFD> getAllValuesOfedfd() {
      return rawStreamAllValuesOfedfd(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for edfd.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<eDFDFlowTracking.EDFD> streamAllValuesOfedfd() {
      return rawStreamAllValuesOfedfd(emptyArray());
    }
    
    @Override
    protected EDFD.Match tupleToMatch(final Tuple t) {
      try {
          return EDFD.Match.newMatch((eDFDFlowTracking.EDFD) t.get(POSITION_EDFD));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EDFD.Match arrayToMatch(final Object[] match) {
      try {
          return EDFD.Match.newMatch((eDFDFlowTracking.EDFD) match[POSITION_EDFD]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EDFD.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EDFD.Match.newMutableMatch((eDFDFlowTracking.EDFD) match[POSITION_EDFD]);
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
    public static IQuerySpecification<EDFD.Matcher> querySpecification() {
      return EDFD.instance();
    }
  }
  
  private EDFD() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EDFD instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EDFD.Matcher instantiate(final ViatraQueryEngine engine) {
    return EDFD.Matcher.on(engine);
  }
  
  @Override
  public EDFD.Matcher instantiate() {
    return EDFD.Matcher.create();
  }
  
  @Override
  public EDFD.Match newEmptyMatch() {
    return EDFD.Match.newEmptyMatch();
  }
  
  @Override
  public EDFD.Match newMatch(final Object... parameters) {
    return EDFD.Match.newMatch((eDFDFlowTracking.EDFD) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: vit.EDFD (visibility: PUBLIC, simpleName: EDFD, identifier: vit.EDFD, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: vit) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: vit.EDFD (visibility: PUBLIC, simpleName: EDFD, identifier: vit.EDFD, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: vit) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EDFD INSTANCE = new EDFD();
    
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
    private static final EDFD.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_edfd = new PParameter("edfd", "eDFDFlowTracking.EDFD", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "EDFD")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_edfd);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "vit.EDFD";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("edfd");
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
          PVariable var_edfd = body.getOrCreateVariableByName("edfd");
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "EDFD")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_edfd, parameter_edfd)
          ));
          // 	EDFD(edfd)
          new TypeConstraint(body, Tuples.flatTupleOf(var_edfd), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "EDFD")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
