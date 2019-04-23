/**
 * Generated from platform:/resource/Viatra_Query/src/viatra/eDFDXformM2M.vql
 */
package viatra;

import eDFDFlowTracking.DataStore;
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
 *         pattern DSElements(ds : DataStore){
 *         	DataStore(ds);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DSElements extends BaseGeneratedEMFQuerySpecification<DSElements.Matcher> {
  /**
   * Pattern-specific match representation of the viatra.DSElements pattern,
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
    private DataStore fDs;
    
    private static List<String> parameterNames = makeImmutableList("ds");
    
    private Match(final DataStore pDs) {
      this.fDs = pDs;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("ds".equals(parameterName)) return this.fDs;
      return null;
    }
    
    public DataStore getDs() {
      return this.fDs;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ds".equals(parameterName) ) {
          this.fDs = (DataStore) newValue;
          return true;
      }
      return false;
    }
    
    public void setDs(final DataStore pDs) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDs = pDs;
    }
    
    @Override
    public String patternName() {
      return "viatra.DSElements";
    }
    
    @Override
    public List<String> parameterNames() {
      return DSElements.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDs};
    }
    
    @Override
    public DSElements.Match toImmutable() {
      return isMutable() ? newMatch(fDs) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ds\"=" + prettyPrintValue(fDs));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fDs);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DSElements.Match)) {
          DSElements.Match other = (DSElements.Match) obj;
          return Objects.equals(fDs, other.fDs);
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
    public DSElements specification() {
      return DSElements.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DSElements.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDs the fixed value of pattern parameter ds, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DSElements.Match newMutableMatch(final DataStore pDs) {
      return new Mutable(pDs);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDs the fixed value of pattern parameter ds, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DSElements.Match newMatch(final DataStore pDs) {
      return new Immutable(pDs);
    }
    
    private static final class Mutable extends DSElements.Match {
      Mutable(final DataStore pDs) {
        super(pDs);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DSElements.Match {
      Immutable(final DataStore pDs) {
        super(pDs);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the viatra.DSElements pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern DSElements(ds : DataStore){
   * 	DataStore(ds);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see DSElements
   * 
   */
  public static class Matcher extends BaseMatcher<DSElements.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DSElements.Matcher on(final ViatraQueryEngine engine) {
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
    public static DSElements.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_DS = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DSElements.Matcher.class);
    
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
     * @param pDs the fixed value of pattern parameter ds, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DSElements.Match> getAllMatches(final DataStore pDs) {
      return rawStreamAllMatches(new Object[]{pDs}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pDs the fixed value of pattern parameter ds, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DSElements.Match> streamAllMatches(final DataStore pDs) {
      return rawStreamAllMatches(new Object[]{pDs});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDs the fixed value of pattern parameter ds, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DSElements.Match> getOneArbitraryMatch(final DataStore pDs) {
      return rawGetOneArbitraryMatch(new Object[]{pDs});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDs the fixed value of pattern parameter ds, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DataStore pDs) {
      return rawHasMatch(new Object[]{pDs});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDs the fixed value of pattern parameter ds, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DataStore pDs) {
      return rawCountMatches(new Object[]{pDs});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDs the fixed value of pattern parameter ds, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DataStore pDs, final Consumer<? super DSElements.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDs}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDs the fixed value of pattern parameter ds, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DSElements.Match newMatch(final DataStore pDs) {
      return DSElements.Match.newMatch(pDs);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ds.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DataStore> rawStreamAllValuesOfds(final Object[] parameters) {
      return rawStreamAllValues(POSITION_DS, parameters).map(DataStore.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ds.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataStore> getAllValuesOfds() {
      return rawStreamAllValuesOfds(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ds.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DataStore> streamAllValuesOfds() {
      return rawStreamAllValuesOfds(emptyArray());
    }
    
    @Override
    protected DSElements.Match tupleToMatch(final Tuple t) {
      try {
          return DSElements.Match.newMatch((DataStore) t.get(POSITION_DS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DSElements.Match arrayToMatch(final Object[] match) {
      try {
          return DSElements.Match.newMatch((DataStore) match[POSITION_DS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DSElements.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DSElements.Match.newMutableMatch((DataStore) match[POSITION_DS]);
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
    public static IQuerySpecification<DSElements.Matcher> querySpecification() {
      return DSElements.instance();
    }
  }
  
  private DSElements() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DSElements instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DSElements.Matcher instantiate(final ViatraQueryEngine engine) {
    return DSElements.Matcher.on(engine);
  }
  
  @Override
  public DSElements.Matcher instantiate() {
    return DSElements.Matcher.create();
  }
  
  @Override
  public DSElements.Match newEmptyMatch() {
    return DSElements.Match.newEmptyMatch();
  }
  
  @Override
  public DSElements.Match newMatch(final Object... parameters) {
    return DSElements.Match.newMatch((eDFDFlowTracking.DataStore) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: viatra.DSElements (visibility: PUBLIC, simpleName: DSElements, identifier: viatra.DSElements, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: viatra.DSElements (visibility: PUBLIC, simpleName: DSElements, identifier: viatra.DSElements, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final DSElements INSTANCE = new DSElements();
    
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
    private static final DSElements.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_ds = new PParameter("ds", "eDFDFlowTracking.DataStore", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "DataStore")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_ds);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "viatra.DSElements";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ds");
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
          PVariable var_ds = body.getOrCreateVariableByName("ds");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ds), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "DataStore")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ds, parameter_ds)
          ));
          // 	DataStore(ds)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ds), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "DataStore")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
