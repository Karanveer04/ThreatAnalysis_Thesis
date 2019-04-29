package viatra;

import java.io.File;
import java.io.IOException;
import java.nio.charset.MalformedInputException;

import javax.imageio.spi.RegisterableService;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;


public class retrieve {
		public static void main(String [] args) throws IOException {
			
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new ResourceFactoryImpl());
			File file = new File("/Users/Karan/Desktop/Thesis/test/eDFD.mydsl");
//			System.out.println(file.toURL());
			
//			URI fileURI = URI.createPlatformPluginURI("Viatra_Query/eDFD.mydsl", true);
			
//			URI ya = URI.createPlatformResourceURI("/Viatra_Query/eDFD.mydsl", false);
//			EcorePlugin.getPlatformResourceMap();
//			EcorePlugin.computePlatformURIMap(true);
//			URI ya = URI.createPlatformResourceURI("/xText/src/eDFD.mydsl", false);
//			System.out.println(ya);
			
			EcorePlugin.getPlatformResourceMap().put
		    ("Viatra_Query", URI.createURI("file:///C:/Users/Margit/git/Thesis/ArchitecturalThreatAnalysis/workspace/Viatra_Query/eDFD.mydsl/"));

			
			URI ya = URI.createPlatformResourceURI("Viatra_query/eDFD.mydsl", true);
			
//			ResourcesPlugin.getWorkspace().getRoot();
//			org.eclipse.core.resources.ResourcesPlugin.getWorkspace(); 
//			org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot();
//			URI ne = EcorePlugin.resolvePlatformResourcePath("platform:/resource/xText/src/eDFD.mydsl");
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(ya, true);
			
			System.out.println(resource);
			System.out.println(resource.getContents().get(0));
			
			/*
			ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(resource));
			
			//	AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(scope)
			Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
			resourceSet = injector.getInstance(XtextResourceSet.class);
			
		    //getResourceSet().addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
			
			
			
			EObject topElement = resource.getContents().get(0);
			System.out.println(resource);
			
			engine.toString();
			*/
		}		
		


}
