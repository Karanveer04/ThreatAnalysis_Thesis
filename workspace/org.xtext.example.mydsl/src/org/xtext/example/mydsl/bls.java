package org.xtext.example.mydsl;

import java.awt.List;
import java.io.File; 
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.AssetElements;
import org.xtext.example.mydsl.services.MyDslGrammarAccess.EDFDElements;

import com.google.common.collect.HashMultimap;

import eDFDFlowTracking.Asset;
import eDFDFlowTracking.DataStore;
import eDFDFlowTracking.EDFD;
import eDFDFlowTracking.ExternalEntity;
import eDFDFlowTracking.Flow;
import eDFDFlowTracking.Process;

public class bls {
	
	public static void main(String[] args) throws IOException {
		
		XtextParser parser = new XtextParser();
         
        File f = new File("C:/Users/a296793/Desktop/nnw/ArchitecturalThreatAnalysis-feature/workspace/Viatra_Query/eDFD.mydsl");
        EObject e = parser.parse(URI.createFileURI(f.toString()));
        
        retrieve n = new retrieve();
        
        ArrayList<String> stride_categories = new ArrayList<>();
        stride_categories.add("Spoofing");
        stride_categories.add("Tampering");
        stride_categories.add("Repudiation");
        stride_categories.add("Information Disclosure");
        stride_categories.add("Denial of Service");

    //    System.out.println(flow.get(0));
       // HashMap<String, String> strideMap= new HashMap();
        HashMultimap<String,String> St = HashMultimap.create();
       
        for(int i = 0; i < n.getListsOfExternal(e).size(); i++) {	// External Entities
        	St.put(n.getListsOfExternal(e).get(i).getName(), stride_categories.get(0));
        	St.put(n.getListsOfExternal(e).get(i).getName(), stride_categories.get(2));
        }
        
        for(int i = 0; i < n.getListsOfProcess(e).size() ; i++) {	// Process
        	St.put(n.getListsOfProcess(e).get(i).getName(), stride_categories.get(0));
        	St.put(n.getListsOfProcess(e).get(i).getName(), stride_categories.get(1));
        	St.put(n.getListsOfProcess(e).get(i).getName(), stride_categories.get(2));
        	St.put(n.getListsOfProcess(e).get(i).getName(), stride_categories.get(3));
        	St.put(n.getListsOfProcess(e).get(i).getName(), stride_categories.get(4));
        }
        
        for(int i = 0; i < n.getListsOfDataStore(e).size() ; i++) {	// Data Store
        	St.put(n.getListsOfDataStore(e).get(i).getName(), stride_categories.get(1));
        	St.put(n.getListsOfDataStore(e).get(i).getName(), stride_categories.get(2)); // ??
        	St.put(n.getListsOfDataStore(e).get(i).getName(), stride_categories.get(3));
        	St.put(n.getListsOfDataStore(e).get(i).getName(), stride_categories.get(4));
        }
        
        for(int i = 0 ; i < n.getFlowsOfProcess(n.getListsOfProcess(e)).size() ; i ++) {
        	St.put(n.getFlowsOfProcess(n.getListsOfProcess(e)).get(i).getName(), stride_categories.get(1));
        	St.put(n.getFlowsOfProcess(n.getListsOfProcess(e)).get(i).getName(), stride_categories.get(3));
        	St.put(n.getFlowsOfProcess(n.getListsOfProcess(e)).get(i).getName(), stride_categories.get(4));
        }
        
        for(int i = 0 ; i < n.getFlowsOfExternal(n.getListsOfExternal(e)).size() ; i ++) {
        	St.put(n.getFlowsOfExternal(n.getListsOfExternal(e)).get(i).getName(), stride_categories.get(1));
        	St.put(n.getFlowsOfExternal(n.getListsOfExternal(e)).get(i).getName(), stride_categories.get(3));
        	St.put(n.getFlowsOfExternal(n.getListsOfExternal(e)).get(i).getName(), stride_categories.get(4));
        }
        
        for(int i = 0 ; i < n.getFlowsOfData(n.getListsOfDataStore(e)).size() ; i ++) {
        	St.put(n.getFlowsOfData(n.getListsOfDataStore(e)).get(i).getName(), stride_categories.get(1));
        	St.put(n.getFlowsOfData(n.getListsOfDataStore(e)).get(i).getName(), stride_categories.get(3));
        	St.put(n.getFlowsOfData(n.getListsOfDataStore(e)).get(i).getName(), stride_categories.get(4));
        }
        
        // check outgoing flows for same Targets
        // Take first element and its flows     element->flow
        // nested loop for checking same targets
        Set<Flow> Suggestions = new HashSet<>();
        for(int i = 0; i < n.getListsOfExternal(e).size(); i++) {
        	for(int j = 0 ; j < n.getListsOfExternal(e).get(i).getOutflows().size() ; j++) {
        		for(int k = j+1 ; k < n.getListsOfExternal(e).get(i).getOutflows().size() ; k++) {
        		if(n.getFlowsOfExternal(n.getListsOfExternal(e)).get(j).getTarget().equals(n.getFlowsOfExternal(n.getListsOfExternal(e)).get(k).getTarget())) {
        			//System.out.println("match" + n.getFlowsOfExternal(n.getListsOfExternal(e)).get(j));
        			Suggestions.add(n.getFlowsOfExternal(n.getListsOfExternal(e)).get(j));
        			Suggestions.add(n.getFlowsOfExternal(n.getListsOfExternal(e)).get(k));
        		}
        		else {
        		//	System.out.println("not match");
        		}
        	}
        }
        }
        
        for(int i = 0; i < n.getListsOfProcess(e).size(); i++) {
        	for(int j = 0 ; j < n.getListsOfProcess(e).get(i).getOutflows().size() ; j++) {
        		for(int k = j+1 ; k < n.getListsOfProcess(e).get(i).getOutflows().size() ; k++) {
        		if(n.getFlowsOfProcess(n.getListsOfProcess(e)).get(j).getTarget().equals(n.getFlowsOfProcess(n.getListsOfProcess(e)).get(k).getTarget())) {
        			//System.out.println("match" + n.getFlowsOfExternal(n.getListsOfExternal(e)).get(j));
        			Suggestions.add(n.getFlowsOfProcess(n.getListsOfProcess(e)).get(j));
        			Suggestions.add(n.getFlowsOfProcess(n.getListsOfProcess(e)).get(k));
        		}
        		else {
        			//System.out.println("not match");
        		}
        	}
        }
        }
        
        for(int i = 0; i < n.getListsOfDataStore(e).size(); i++) {
        	for(int j = 0 ; j < n.getListsOfDataStore(e).get(i).getOutflows().size() ; j++) {
        		for(int k = j+1 ; k < n.getListsOfDataStore(e).get(i).getOutflows().size() ; k++) {
        		if(n.getFlowsOfData(n.getListsOfDataStore(e)).get(j).getTarget().equals(n.getFlowsOfData(n.getListsOfDataStore(e)).get(k).getTarget())) {
        			//System.out.println("match" + n.getFlowsOfExternal(n.getListsOfExternal(e)).get(j));
        			Suggestions.add(n.getFlowsOfData(n.getListsOfDataStore(e)).get(j));
        			Suggestions.add(n.getFlowsOfData(n.getListsOfDataStore(e)).get(k));
        		}
        		else {
        		//	System.out.println("not match");
        		}
        	}
        }
        }
        
        System.out.println(Suggestions.size());
        System.out.println(Suggestions.iterator().next().getSource().getAssets());
      //  System.out.println(Suggestions.toString());
        
        //store in the Suggestion list the flows that matches the target and their assets

        // 
        
        System.out.println(Collections.singletonList(St));
        System.out.println("loadAppCode: " + St.get("loadAppCode"));
		/*
		 * System.out.println(); System.out.println(as.get(1).getName() +
		 * "Assetssadasdasdas"); System.out.println("Asset Name: " + as.get(0).getName()
		 * + ", Asset Source " + as.get(0).getSource().getName() + ",Asset targets " +
		 * as.get(0).getTargets().get(0).getName()); System.out.println(pr.size() +
		 * "Processes"); for(int i = 0 ; i < pr.get(0).getOutflows().size(); i++) {
		 * System.out.println(pr.get(0).getOutflows().get(i)); }
		 * System.out.println(pr.get(0).getOutflows().size());
		 * System.out.println(et.size() + "external entities");
		 * System.out.println(dt.size() + "Data store");
		 */
	}
}

class retrieve{
	
	public ArrayList<Asset> getListsOfAssets(EObject e) {
		
		ArrayList<Asset> as = new ArrayList<>();
		for(int i = 0 ; i < e.eContents().size() ; i++) {
        	try {
        	as.add((Asset) e.eContents().get(i));
        	}
        	catch (Exception es) {
				// TODO: handle exception
        	}
		}
		return as;
		
	}
	
	public ArrayList<Process> getListsOfProcess(EObject e) {
		
		ArrayList<Process> as = new ArrayList<>();
		for(int i = 0 ; i < e.eContents().size() ; i++) {
        	try {
        	as.add((Process) e.eContents().get(i));
        	}
        	catch (Exception es) {
				// TODO: handle exception
        	}
		}
		return as;
		
	}
	
	
	public ArrayList<ExternalEntity> getListsOfExternal(EObject e) {
		
		ArrayList<ExternalEntity> as = new ArrayList<>();
		for(int i = 0 ; i < e.eContents().size() ; i++) {
        	try {
        	as.add((ExternalEntity) e.eContents().get(i));
        	}
        	catch (Exception es) {
				// TODO: handle exception
        	}
		}
		return as;
		
	}
	
	public ArrayList<DataStore> getListsOfDataStore(EObject e) {
		
		ArrayList<DataStore> as = new ArrayList<>();
		for(int i = 0 ; i < e.eContents().size() ; i++) {
        	try {
        	as.add((DataStore) e.eContents().get(i));
        	}
        	catch (Exception es) {
				// TODO: handle exception
        	}
		}
		return as;
		
	}
	
	public ArrayList<Flow> getFlowsOfProcess(ArrayList<Process> pr){
		
		ArrayList<Flow> flow = new ArrayList<>();
		 for(int i = 0 ; i < pr.size() ; i++) {
	        	for(int j = 0 ; j < pr.get(i).getOutflows().size() ; j++) {
	        	flow.add((Flow) pr.get(i).getOutflows().get(j));
	        }
	        }
		 return flow;
	}
	
	public ArrayList<Flow> getFlowsOfExternal(ArrayList<ExternalEntity> pr){
		
		ArrayList<Flow> flow = new ArrayList<>();
		 for(int i = 0 ; i < pr.size() ; i++) {
	        	for(int j = 0 ; j < pr.get(i).getOutflows().size() ; j++) {
	        	flow.add((Flow) pr.get(i).getOutflows().get(j));
	        }
	        }
		 return flow;
	}
	
	public ArrayList<Flow> getFlowsOfData(ArrayList<DataStore> pr){
		
		ArrayList<Flow> flow = new ArrayList<>();
		 for(int i = 0 ; i < pr.size() ; i++) {
	        	for(int j = 0 ; j < pr.get(i).getOutflows().size() ; j++) {
	        	flow.add((Flow) pr.get(i).getOutflows().get(j));
	        }
	        }
		 return flow;
	}
}
