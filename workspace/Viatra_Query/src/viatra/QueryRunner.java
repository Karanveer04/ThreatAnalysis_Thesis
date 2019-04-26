package viatra;

import viatra.*;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.xtext.resource.*;
import org.eclipse.xtext.*;
import org.xtext.example.mydsl.MyDslStandaloneSetup;

import com.google.inject.Injector;

import org.eclipse.viatra.query.runtime.registry.IDefaultRegistryView;
import org.eclipse.viatra.query.runtime.registry.IQuerySpecificationRegistry;
import org.eclipse.viatra.query.runtime.registry.QuerySpecificationRegistry;


public class QueryRunner {
	
	private XtextResourceSet resourceSet;

private EMFScope initializeModelScope() {
	
//	setupParser();
	//XtextResourceSet resourceSet = new XtextResourceSet();
	//URI uri = URI.createURI("src/YourDSLFile"); // your input textual file
	
//	File f = new File("/Users/Margit/git/Thesis/ArchitecturalThreatAnalysis/workspace/Viatra_Query/eDFD.mydsl");
	
	Resource xtextResource = resourceSet.getResource(URI.createFileURI("/Users/Margit/git/Thesis/ArchitecturalThreatAnalysis/workspace/Viatra_Query/eDFD.mydsl"), true);//org.eclipse.emf.common.util.URI.createFileURI("Viatra_Query/eDFD.mydsl"), true);

//	File File = new File("/Users/Margit/git/Thesis/ArchitecturalThreatAnalysis/workspace/Viatra_Query/eDFD.mydsl");
	
	return new EMFScope(xtextResource);
}

//private void setupParser() {
//	//Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
//	//Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
//	//resourceSet = injector.getInstance(XtextResourceSet.class);
//	getResourceSet().addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
//}

private ViatraQueryEngine prepareQueryEngine(EMFScope scope) {
	// Access managed query engine
    ViatraQueryEngine engine = ViatraQueryEngine.on(scope);

    // Initialize all queries on engine
	EDFDXformM2M.instance().prepare(engine);

	return engine;
}

private void printAllMatches(ViatraQueryEngine engine ) {
	// Access pattern matcher
	Assets.Matcher matcher = Assets.Matcher.on(engine);
	// Get and iterate over all matches
	for (Assets.Match match : matcher.getAllMatches()) {
		// Print all the matches to the standard output
		System.out.println(match.getA());
	}
}

/**
 * @return the resourceSet
 */
public XtextResourceSet getResourceSet() {
	return resourceSet;
}

public static void main(String[] args) {
	
	MyDslStandaloneSetup.doSetup();
	QueryRunner me = new QueryRunner();
	
	
//	me.setupParser();
//	
	EMFScope trial = me.initializeModelScope();
	
	System.out.println(trial);
	ViatraQueryEngine bleh = me.prepareQueryEngine(trial);
//
	bleh.getCurrentMatchers();
	
	me.printAllMatches(bleh);
	
	System.out.println(bleh);
	
	
	
	
	
	//IQuerySpecificationRegistry registry = QuerySpecificationRegistry.getInstance();
	//access default view
	//IDefaultRegistryView defaultView = registry.getDefaultView();
	
	}


}