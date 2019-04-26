package viatra;


import java.io.File;
import java.util.Collection;
import java.util.logging.XMLFormatter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.xml.sax.helpers.XMLFilterImpl;

import viatra.AssetSource.Match;
import viatra.Assets.Matcher;

/**
 * @author Abel Hegedus
 * @author Istvan Rath
 *
 */
public class estride {

public static void main (String [] args) {
	 File modelPath = new File( "Viatra_Query\\eDFD.mydsl");
	 URI fileURI = URI.createPlatformPluginURI("Viatra_Query/eDFD.mydsl", false);//org.eclipse.emf.common.util.URI.createFileURI("Viatra_Query/eDFD.mydsl");//URI.createFileURI(modelPath.getAbsolutePath());
	 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("dsl", new ResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(fileURI, true);
		final StringBuilder results = new StringBuilder();
		if (resource != null) {
				// get all matches of the pattern
				// initialization
				// phase 1: (managed) ViatraQueryEngine
				ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(resource));
				// phase 2: the matcher its elf
				Matcher matcher = Matcher.on(engine);
				// get all matches of the pattern
				Collection<viatra.Assets.Match> matches = matcher.getAllMatches();
				for (IPatternMatch match : matches) {
					results.append(match.prettyPrint()+"; ");
				}
				if(matches.size() == 0) {
					results.append("Empty match set");
				}
				results.append("\n");
				// using a match processor
		} else {
			System.out.println("fuck");
		}
	
	}
    protected Resource loadModel(String modelPath) {
        URI fileURI = URI.createFileURI(modelPath);
        return loadModel(fileURI);
    }
    
	protected Resource loadModel(URI fileURI) {
		// Loads the resource
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(fileURI, true);
		return resource;
	}
	
	protected void prettyPrintMatches(StringBuilder results, Collection<? extends IPatternMatch> matches) {
		for (IPatternMatch match : matches) {
			results.append(match.prettyPrint()+"; ");
		}
		if(matches.size() == 0) {
			results.append("Empty match set");
		}
		results.append("\n");
	}
	
	
	public String executeDemo(String modelPath) {
		final StringBuilder results = new StringBuilder();
		Resource resource = loadModel(modelPath);
		if (resource != null) {
			try {
				// get all matches of the pattern
				// initialization
				// phase 1: (managed) ViatraQueryEngine
				ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(resource));
				// phase 2: the matcher itself
				Matcher matcher = Matcher.on(engine);
				// get all matches of the pattern
				Collection<viatra.Assets.Match> matches = matcher.getAllMatches();
				prettyPrintMatches(results, matches);
				// using a match processor
			
	} catch(Exception x) {x.fillInStackTrace();}
	
	
	
}
		return modelPath;
	}
	
	
}