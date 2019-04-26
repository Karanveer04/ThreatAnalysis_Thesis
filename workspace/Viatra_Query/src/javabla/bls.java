package javabla;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;

import eDFDFlowTracking.EDFD;

public class bls {
	
	
	
	public static void main(String[] args) throws IOException {
		
//		File File = new File("/Users/Margit/git/Thesis/ArchitecturalThreatAnalysis/workspace/Viatra_Query/eDFD.mydsl");
		
		XtextParser parser = new XtextParser();
        HashMap<File, EDFD> dfds = new HashMap<>();
        
        File f = new File("/Users/Margit/git/Thesis/ArchitecturalThreatAnalysis/workspace/Viatra_Query/eDFD.mydsl");
//        for (File f : new File("instances").listFiles()) {
            if (f.toString().endsWith(".mydsl")) {
        
        System.out.println(f.toString());
                dfds.put(f, (EDFD) parser.parse(URI.createFileURI(f.toString())));
            }
//        }
//        dfds.put(f, (EDFD) parser.parse(URI.createFileURI(f.toString())));
	}
}
