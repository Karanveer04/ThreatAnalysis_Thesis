/**
 * Generated from platform:/resource/Viatra_Query/src/viatra/eDFDXformM2M.vql
 */
package viatra;

import eDFDFlowTracking.Element;
import eDFDFlowTracking.Flow;
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
 *         pattern sourceOfFlow(f : Flow, source : Element){
 *         	Flow.source(f, source);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SourceOfFlow extends BaseGeneratedEMFQuerySpecification<SourceOfFlow.Matcher> {
  /**
   * Pattern-specific match representation of the viatra.sourceOfFlow pattern,
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
    private Flow fF;
    
    private Element fSource;
    
    private static List<String> parameterNames = makeImmutableList("f", "source");
    
    private Match(final Flow pF, final Element pSource) {
      this.fF = pF;
      this.fSource = pSource;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("f".equals(parameterName)) return this.fF;
      if ("source".equals(parameterName)) return this.fSource;
      return null;
    }
    
    public Flow getF() {
      return this.fF;
    }
    
    public Element getSource() {
      return this.fSource;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("f".equals(parameterName) ) {
          this.fF = (Flow) newValue;
          return true;
      }
      if ("source".equals(parameterName) ) {
          this.fSource = (Element) newValue;
          return true;
      }
      return false;
    }
    
    public void setF(final Flow pF) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fF = pF;
    }
    
    public void setSource(final Element pSource) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSource = pSource;
    }
    
    @Override
    public String patternName() {
      return "viatra.sourceOfFlow";
    }
    
    @Override
    public List<String> parameterNames() {
      return SourceOfFlow.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fF, fSource};
    }
    
    @Override
    public SourceOfFlow.Match toImmutable() {
      return isMutable() ? newMatch(fF, fSource) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"f\"=" + prettyPrintValue(fF) + ", ");
      result.append("\"source\"=" + prettyPrintValue(fSource));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fF, fSource);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SourceOfFlow.Match)) {
          SourceOfFlow.Match other = (SourceOfFlow.Match) obj;
          return Objects.equals(fF, other.fF) && Objects.equals(fSource, other.fSource);
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
    public SourceOfFlow specification() {
      return SourceOfFlow.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SourceOfFlow.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SourceOfFlow.Match newMutableMatch(final Flow pF, final Element pSource) {
      return new Mutable(pF, pSource);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SourceOfFlow.Match newMatch(final Flow pF, final Element pSource) {
      return new Immutable(pF, pSource);
    }
    
    private static final class Mutable extends SourceOfFlow.Match {
      Mutable(final Flow pF, final Element pSource) {
        super(pF, pSource);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SourceOfFlow.Match {
      Immutable(final Flow pF, final Element pSource) {
        super(pF, pSource);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the viatra.sourceOfFlow pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern sourceOfFlow(f : Flow, source : Element){
   * 	Flow.source(f, source);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SourceOfFlow
   * 
   */
  public static class Matcher extends BaseMatcher<SourceOfFlow.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SourceOfFlow.Matcher on(final ViatraQueryEngine engine) {
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
    public static SourceOfFlow.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_F = 0;
    
    private static final int POSITION_SOURCE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SourceOfFlow.Matcher.class);
    
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
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SourceOfFlow.Match> getAllMatches(final Flow pF, final Element pSource) {
      return rawStreamAllMatches(new Object[]{pF, pSource}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SourceOfFlow.Match> streamAllMatches(final Flow pF, final Element pSource) {
      return rawStreamAllMatches(new Object[]{pF, pSource});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SourceOfFlow.Match> getOneArbitraryMatch(final Flow pF, final Element pSource) {
      return rawGetOneArbitraryMatch(new Object[]{pF, pSource});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Flow pF, final Element pSource) {
      return rawHasMatch(new Object[]{pF, pSource});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Flow pF, final Element pSource) {
      return rawCountMatches(new Object[]{pF, pSource});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Flow pF, final Element pSource, final Consumer<? super SourceOfFlow.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pF, pSource}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param pSource the fixed value of pattern parameter source, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SourceOfFlow.Match newMatch(final Flow pF, final Element pSource) {
      return SourceOfFlow.Match.newMatch(pF, pSource);
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Flow> rawStreamAllValuesOff(final Object[] parameters) {
      return rawStreamAllValues(POSITION_F, parameters).map(Flow.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Flow> getAllValuesOff() {
      return rawStreamAllValuesOff(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Flow> streamAllValuesOff() {
      return rawStreamAllValuesOff(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Flow> streamAllValuesOff(final SourceOfFlow.Match partialMatch) {
      return rawStreamAllValuesOff(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Flow> streamAllValuesOff(final Element pSource) {
      return rawStreamAllValuesOff(new Object[]{null, pSource});
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Flow> getAllValuesOff(final SourceOfFlow.Match partialMatch) {
      return rawStreamAllValuesOff(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Flow> getAllValuesOff(final Element pSource) {
      return rawStreamAllValuesOff(new Object[]{null, pSource}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Element> rawStreamAllValuesOfsource(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SOURCE, parameters).map(Element.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfsource() {
      return rawStreamAllValuesOfsource(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfsource() {
      return rawStreamAllValuesOfsource(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfsource(final SourceOfFlow.Match partialMatch) {
      return rawStreamAllValuesOfsource(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Element> streamAllValuesOfsource(final Flow pF) {
      return rawStreamAllValuesOfsource(new Object[]{pF, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfsource(final SourceOfFlow.Match partialMatch) {
      return rawStreamAllValuesOfsource(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for source.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Element> getAllValuesOfsource(final Flow pF) {
      return rawStreamAllValuesOfsource(new Object[]{pF, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected SourceOfFlow.Match tupleToMatch(final Tuple t) {
      try {
          return SourceOfFlow.Match.newMatch((Flow) t.get(POSITION_F), (Element) t.get(POSITION_SOURCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SourceOfFlow.Match arrayToMatch(final Object[] match) {
      try {
          return SourceOfFlow.Match.newMatch((Flow) match[POSITION_F], (Element) match[POSITION_SOURCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SourceOfFlow.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SourceOfFlow.Match.newMutableMatch((Flow) match[POSITION_F], (Element) match[POSITION_SOURCE]);
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
    public static IQuerySpecification<SourceOfFlow.Matcher> querySpecification() {
      return SourceOfFlow.instance();
    }
  }
  
  private SourceOfFlow() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SourceOfFlow instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SourceOfFlow.Matcher instantiate(final ViatraQueryEngine engine) {
    return SourceOfFlow.Matcher.on(engine);
  }
  
  @Override
  public SourceOfFlow.Matcher instantiate() {
    return SourceOfFlow.Matcher.create();
  }
  
  @Override
  public SourceOfFlow.Match newEmptyMatch() {
    return SourceOfFlow.Match.newEmptyMatch();
  }
  
  @Override
  public SourceOfFlow.Match newMatch(final Object... parameters) {
    return SourceOfFlow.Match.newMatch((eDFDFlowTracking.Flow) parameters[0], (eDFDFlowTracking.Element) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: viatra.SourceOfFlow (visibility: PUBLIC, simpleName: SourceOfFlow, identifier: viatra.SourceOfFlow, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: viatra.SourceOfFlow (visibility: PUBLIC, simpleName: SourceOfFlow, identifier: viatra.SourceOfFlow, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SourceOfFlow INSTANCE = new SourceOfFlow();
    
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
    private static final SourceOfFlow.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_f = new PParameter("f", "eDFDFlowTracking.Flow", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "Flow")), PParameterDirection.INOUT);
    
    private final PParameter parameter_source = new PParameter("source", "eDFDFlowTracking.Element", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/eDFDFlowTracking", "Element")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_f, parameter_source);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "viatra.sourceOfFlow";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("f","source");
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
          PVariable var_f = body.getOrCreateVariableByName("f");
          PVariable var_source = body.getOrCreateVariableByName("source");
          new TypeConstraint(body, Tuples.flatTupleOf(var_f), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "Flow")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_source), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "Element")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_f, parameter_f),
             new ExportedParameter(body, var_source, parameter_source)
          ));
          // 	Flow.source(f, source)
          new TypeConstraint(body, Tuples.flatTupleOf(var_f), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "Flow")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_f, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/eDFDFlowTracking", "Flow", "source")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/eDFDFlowTracking", "Element")));
          new Equality(body, var__virtual_0_, var_source);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
