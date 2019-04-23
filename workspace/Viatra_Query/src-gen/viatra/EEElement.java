/**
 * Generated from platform:/resource/Viatra_Query/src/viatra/eDFDXformM2M.vql
 */
package viatra;

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
 *         pattern EEElement(ee : ExternalEntity){
 *         	ExternalEntity(ee);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EEElement extends BaseGeneratedEMFQuerySpecification<EEElement.Matcher> {
  /**
   * Pattern-specific match representation of the viatra.EEElement pattern,
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
    
    private static List<String> parameterNames = makeImmutableList("ee");
    
    private Match(final ExternalEntity pEe) {
      this.fEe = pEe;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("ee".equals(parameterName)) return this.fEe;
      return null;
    }
    
    public ExternalEntity getEe() {
      return this.fEe;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ee".equals(parameterName) ) {
          this.fEe = (ExternalEntity) newValue;
          return true;
      }
      return false;
    }
    
    public void setEe(final ExternalEntity pEe) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEe = pEe;
    }
    
    @Override
    public String patternName() {
      return "viatra.EEElement";
    }
    
    @Override
    public List<String> parameterNames() {
      return EEElement.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEe};
    }
    
    @Override
    public EEElement.Match toImmutable() {
      return isMutable() ? newMatch(fEe) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ee\"=" + prettyPrintValue(fEe));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEe);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EEElement.Match)) {
          EEElement.Match other = (EEElement.Match) obj;
          return Objects.equals(fEe, other.fEe);
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
    public EEElement specification() {
      return EEElement.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EEElement.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EEElement.Match newMutableMatch(final ExternalEntity pEe) {
      return new Mutable(pEe);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EEElement.Match newMatch(final ExternalEntity pEe) {
      return new Immutable(pEe);
    }
    
    private static final class Mutable extends EEElement.Match {
      Mutable(final ExternalEntity pEe) {
        super(pEe);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EEElement.Match {
      Immutable(final ExternalEntity pEe) {
        super(pEe);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the viatra.EEElement pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern EEElement(ee : ExternalEntity){
   * 	ExternalEntity(ee);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EEElement
   * 
   */
  public static class Matcher extends BaseMatcher<EEElement.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EEElement.Matcher on(final ViatraQueryEngine engine) {
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
    public static EEElement.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_EE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EEElement.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EEElement.Match> getAllMatches(final ExternalEntity pEe) {
      return rawStreamAllMatches(new Object[]{pEe}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EEElement.Match> streamAllMatches(final ExternalEntity pEe) {
      return rawStreamAllMatches(new Object[]{pEe});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EEElement.Match> getOneArbitraryMatch(final ExternalEntity pEe) {
      return rawGetOneArbitraryMatch(new Object[]{pEe});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final ExternalEntity pEe) {
      return rawHasMatch(new Object[]{pEe});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final ExternalEntity pEe) {
      return rawCountMatches(new Object[]{pEe});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final ExternalEntity pEe, final Consumer<? super EEElement.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEe}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEe the fixed value of pattern parameter ee, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EEElement.Match newMatch(final ExternalEntity pEe) {
      return EEElement.Match.newMatch(pEe);
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
    
    @Override
    protected EEElement.Match tupleToMatch(final Tuple t) {
      try {
          return EEElement.Match.newMatch((ExternalEntity) t.get(POSITION_EE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EEElement.Match arrayToMatch(final Object[] match) {
      try {
          return EEElement.Match.newMatch((ExternalEntity) match[POSITION_EE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EEElement.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EEElement.Match.newMutableMatch((ExternalEntity) match[POSITION_EE]);
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
    public static IQuerySpecification<EEElement.Matcher> querySpecification() {
      return EEElement.instance();
    }
  }
  
  private EEElement() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EEElement instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EEElement.Matcher instantiate(final ViatraQueryEngine engine) {
    return EEElement.Matcher.on(engine);
  }
  
  @Override
  public EEElement.Matcher instantiate() {
    return EEElement.Matcher.create();
  }
  
  @Override
  public EEElement.Match newEmptyMatch() {
    return EEElement.Match.newEmptyMatch();
  }
  
  @Override
  public EEElement.Match newMatch(final Object... parameters) {
    return EEElement.Match.newMatch((eDFDFlowTracking.ExternalEntity) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: viatra.EEElement (visibility: PUBLIC, simpleName: EEElement, identifier: viatra.EEElement, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: viatra.EEElement (visibility: PUBLIC, simpleName: EEElement, identifier: viatra.EEElement, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EEElement INSTANCE = new EEElement();
    
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
    private static final EEElement.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_ee = new PParameter("ee", "eDFDFlowTracking.ExternalEntity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "ExternalEntity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_ee);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "viatra.EEElement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ee");
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_ee), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "ExternalEntity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ee, parameter_ee)
          ));
          // 	ExternalEntity(ee)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ee), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "ExternalEntity")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
