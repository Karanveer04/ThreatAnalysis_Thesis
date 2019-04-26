package viatra;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;

import viatra.Assets.Matcher;

public class Boom {
		public static void main(String [] args) {
			
		 	URI fileURI = URI.createFileURI("/Users/Margit/git/Thesis/ArchitecturalThreatAnalysis/workspace/Viatra_Query/eDFD.mydsl");
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mydsl", new ResourceFactoryImpl());
		//	EPackage.Registry.INSTANCE.put("www.example.org/eDFDFlowTracking", );
			System.out.println(EPackage.Registry.INSTANCE.getEPackage("www.example.org/eDFDFlowTracking"));
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(fileURI,true); //new ResourceFactoryImpl().createResource(fileURI);
			
			final StringBuilder results = new StringBuilder();
			
			System.out.println(resource.getAllContents());

			if (resource != null) {
							ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(resource));
							Matcher matcher = Matcher.on(engine);
							Collection<viatra.Assets.Match> matches = matcher.getAllMatches();
							for (IPatternMatch match : matches) {
								results.append(match.prettyPrint()+"; ");
							}
							if(matches.size() == 0) {
								results.append("Empty match set");
							}
							results.append("\n");
			} else {
						System.out.println("bleh");
					}
		}
}
