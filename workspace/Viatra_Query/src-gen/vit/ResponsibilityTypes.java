/**
 * Generated from platform:/resource/vit/src/vit/eDFDXformM2M.vql
 */
package vit;

import eDFDFlowTracking.ResponsibilityType;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
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
 *         pattern ResponsibilityTypes(rt : ResponsibilityType){
 *         	ResponsibilityType(rt);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ResponsibilityTypes extends BaseGeneratedEMFQuerySpecification<ResponsibilityTypes.Matcher> {
  /**
   * Pattern-specific match representation of the vit.ResponsibilityTypes pattern,
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
    private ResponsibilityType fRt;
    
    private static List<String> parameterNames = makeImmutableList("rt");
    
    private Match(final ResponsibilityType pRt) {
      this.fRt = pRt;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("rt".equals(parameterName)) return this.fRt;
      return null;
    }
    
    public ResponsibilityType getRt() {
      return this.fRt;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("rt".equals(parameterName) ) {
          this.fRt = (ResponsibilityType) newValue;
          return true;
      }
      return false;
    }
    
    public void setRt(final ResponsibilityType pRt) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRt = pRt;
    }
    
    @Override
    public String patternName() {
      return "vit.ResponsibilityTypes";
    }
    
    @Override
    public List<String> parameterNames() {
      return ResponsibilityTypes.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fRt};
    }
    
    @Override
    public ResponsibilityTypes.Match toImmutable() {
      return isMutable() ? newMatch(fRt) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"rt\"=" + prettyPrintValue(fRt));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fRt);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ResponsibilityTypes.Match)) {
          ResponsibilityTypes.Match other = (ResponsibilityTypes.Match) obj;
          return Objects.equals(fRt, other.fRt);
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
    public ResponsibilityTypes specification() {
      return ResponsibilityTypes.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ResponsibilityTypes.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pRt the fixed value of pattern parameter rt, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ResponsibilityTypes.Match newMutableMatch(final ResponsibilityType pRt) {
      return new Mutable(pRt);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRt the fixed value of pattern parameter rt, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ResponsibilityTypes.Match newMatch(final ResponsibilityType pRt) {
      return new Immutable(pRt);
    }
    
    private static final class Mutable extends ResponsibilityTypes.Match {
      Mutable(final ResponsibilityType pRt) {
        super(pRt);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ResponsibilityTypes.Match {
      Immutable(final ResponsibilityType pRt) {
        super(pRt);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the vit.ResponsibilityTypes pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern ResponsibilityTypes(rt : ResponsibilityType){
   * 	ResponsibilityType(rt);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ResponsibilityTypes
   * 
   */
  public static class Matcher extends BaseMatcher<ResponsibilityTypes.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ResponsibilityTypes.Matcher on(final ViatraQueryEngine engine) {
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
    public static ResponsibilityTypes.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_RT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ResponsibilityTypes.Matcher.class);
    
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
     * @param pRt the fixed value of pattern parameter rt, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ResponsibilityTypes.Match> getAllMatches(final ResponsibilityType pRt) {
      return rawStreamAllMatches(new Object[]{pRt}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pRt the fixed value of pattern parameter rt, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ResponsibilityTypes.Match> streamAllMatches(final ResponsibilityType pRt) {
      return rawStreamAllMatches(new Object[]{pRt});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRt the fixed value of pattern parameter rt, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ResponsibilityTypes.Match> getOneArbitraryMatch(final ResponsibilityType pRt) {
      return rawGetOneArbitraryMatch(new Object[]{pRt});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pRt the fixed value of pattern parameter rt, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final ResponsibilityType pRt) {
      return rawHasMatch(new Object[]{pRt});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pRt the fixed value of pattern parameter rt, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final ResponsibilityType pRt) {
      return rawCountMatches(new Object[]{pRt});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pRt the fixed value of pattern parameter rt, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final ResponsibilityType pRt, final Consumer<? super ResponsibilityTypes.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pRt}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pRt the fixed value of pattern parameter rt, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ResponsibilityTypes.Match newMatch(final ResponsibilityType pRt) {
      return ResponsibilityTypes.Match.newMatch(pRt);
    }
    
    /**
     * Retrieve the set of values that occur in matches for rt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ResponsibilityType> rawStreamAllValuesOfrt(final Object[] parameters) {
      return rawStreamAllValues(POSITION_RT, parameters).map(ResponsibilityType.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for rt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ResponsibilityType> getAllValuesOfrt() {
      return rawStreamAllValuesOfrt(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for rt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ResponsibilityType> streamAllValuesOfrt() {
      return rawStreamAllValuesOfrt(emptyArray());
    }
    
    @Override
    protected ResponsibilityTypes.Match tupleToMatch(final Tuple t) {
      try {
          return ResponsibilityTypes.Match.newMatch((ResponsibilityType) t.get(POSITION_RT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ResponsibilityTypes.Match arrayToMatch(final Object[] match) {
      try {
          return ResponsibilityTypes.Match.newMatch((ResponsibilityType) match[POSITION_RT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ResponsibilityTypes.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ResponsibilityTypes.Match.newMutableMatch((ResponsibilityType) match[POSITION_RT]);
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
    public static IQuerySpecification<ResponsibilityTypes.Matcher> querySpecification() {
      return ResponsibilityTypes.instance();
    }
  }
  
  private ResponsibilityTypes() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ResponsibilityTypes instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ResponsibilityTypes.Matcher instantiate(final ViatraQueryEngine engine) {
    return ResponsibilityTypes.Matcher.on(engine);
  }
  
  @Override
  public ResponsibilityTypes.Matcher instantiate() {
    return ResponsibilityTypes.Matcher.create();
  }
  
  @Override
  public ResponsibilityTypes.Match newEmptyMatch() {
    return ResponsibilityTypes.Match.newEmptyMatch();
  }
  
  @Override
  public ResponsibilityTypes.Match newMatch(final Object... parameters) {
    return ResponsibilityTypes.Match.newMatch((eDFDFlowTracking.ResponsibilityType) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: vit.ResponsibilityTypes (visibility: PUBLIC, simpleName: ResponsibilityTypes, identifier: vit.ResponsibilityTypes, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: vit) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: vit.ResponsibilityTypes (visibility: PUBLIC, simpleName: ResponsibilityTypes, identifier: vit.ResponsibilityTypes, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: vit) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ResponsibilityTypes INSTANCE = new ResponsibilityTypes();
    
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
    private static final ResponsibilityTypes.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_rt = new PParameter("rt", "eDFDFlowTracking.ResponsibilityType", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "ResponsibilityType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_rt);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "vit.ResponsibilityTypes";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("rt");
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
          PVariable var_rt = body.getOrCreateVariableByName("rt");
          new TypeConstraint(body, Tuples.flatTupleOf(var_rt), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "ResponsibilityType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_rt, parameter_rt)
          ));
          // 	ResponsibilityType(rt)
          new TypeConstraint(body, Tuples.flatTupleOf(var_rt), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "ResponsibilityType")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
