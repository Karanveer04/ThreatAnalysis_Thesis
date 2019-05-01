package org.xtext.example.mydsl;

import java.io.File; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import com.google.common.collect.HashMultimap;
import eDFDFlowTracking.Asset;
import eDFDFlowTracking.DataStore;
import eDFDFlowTracking.EDFD;
import eDFDFlowTracking.Element;
import eDFDFlowTracking.ExternalEntity;
import eDFDFlowTracking.Flow;
import eDFDFlowTracking.Process;
public class eSTRIDE {
	
	public static void main(String[] args) throws IOException {
		
		XtextParser parser = new XtextParser();
         
		File f = new File("/Users/Karan/Git Projects/Thesis/ArchitecturalThreatAnalysis/workspace/Viatra_Query/eDFD.mydsl");
		eDFDFlowTracking.EDFD contents = (EDFD) parser.parse(URI.createFileURI(f.toString()));
        
		for(int i = 0; i < contents.getAsset().size(); i++) {
	//		System.out.println(contents.getAsset().get(i) + " "+ contents.getAsset().get(i).getValue().get(0).getPriority());
		//	System.out.println(contents.getAsset().get(i));
		}
		
		for(int i = 0; i < contents.getElements().size(); i++) {
		//	System.out.println(contents.getElements().get(i));
		}
		retrieveEDFDObject eDFD = new retrieveEDFDObject();
        
        ArrayList<String> stride_categories = new ArrayList<>();
        stride_categories.add("Spoofing");
        stride_categories.add("Tampering");
        stride_categories.add("Repudiation");
        stride_categories.add("Information Disclosure");
        stride_categories.add("Denial of Service");
        
        Set<Flow> suggestionList = new HashSet<>();

        HashMultimap<String,String> strideMap = HashMultimap.create();
        
        ArrayList<ExternalEntity> externalEntities = eDFD.getListsOfExternal(contents);
        ArrayList<Process> processes = eDFD.getListsOfProcess(contents);
        ArrayList<DataStore> dataStores = eDFD.getListsOfDataStore(contents);
//        ArrayList<Flow> flow_process = eDFD.getFlowsOfProcess(processes);
//        ArrayList<Flow> flow_externalEntities = eDFD.getFlowsOfExternal(externalEntities);
//        ArrayList<Flow> flow_dataStores = eDFD.getFlowsOfData(dataStores);
        
        for(int i = 0; i < externalEntities.size(); i++) {	// External Entities	
        	strideMap.put(externalEntities.get(i).getName(), stride_categories.get(0));
        	strideMap.put(externalEntities.get(i).getName(), stride_categories.get(2));
        }
        
        for(int i = 0; i < processes.size() ; i++) {	// Process
        	strideMap.put(processes.get(i).getName(), stride_categories.get(0));
        	strideMap.put(processes.get(i).getName(), stride_categories.get(1));
        	strideMap.put(processes.get(i).getName(), stride_categories.get(2));
        	strideMap.put(processes.get(i).getName(), stride_categories.get(3));
        	strideMap.put(processes.get(i).getName(), stride_categories.get(4));
        }
        
        for(int i = 0; i < dataStores.size() ; i++) {	// Data Store
        	strideMap.put(dataStores.get(i).getName(), stride_categories.get(1));
        	strideMap.put(dataStores.get(i).getName(), stride_categories.get(2)); // ??
        	strideMap.put(dataStores.get(i).getName(), stride_categories.get(3));
        	strideMap.put(dataStores.get(i).getName(), stride_categories.get(4));
        }
 /*      
        for(int i = 0 ; i < flow_process.size() ; i ++) { // Flows Process
        	strideMap.put(flow_process.get(i).getName(), stride_categories.get(1));
        	strideMap.put(flow_process.get(i).getName(), stride_categories.get(3));
        	strideMap.put(flow_process.get(i).getName(), stride_categories.get(4));
        }
        
        for(int i = 0 ; i < flow_externalEntities.size() ; i ++) {  //Flows EE
        	strideMap.put(flow_externalEntities.get(i).getName(), stride_categories.get(1));
        	strideMap.put(flow_externalEntities.get(i).getName(), stride_categories.get(3));
        	strideMap.put(flow_externalEntities.get(i).getName(), stride_categories.get(4));
        }
        
        for(int i = 0 ; i < flow_dataStores.size() ; i ++) {  //Flows DataStore
        	strideMap.put(flow_dataStores.get(i).getName(), stride_categories.get(1));
        	strideMap.put(flow_dataStores.get(i).getName(), stride_categories.get(3));
        	strideMap.put(flow_dataStores.get(i).getName(), stride_categories.get(4));
        }
*/        
        for(Element element: contents.getElements()) {
        	for(Flow flow : element.getOutflows()) {
        		strideMap.put(flow.getName(), stride_categories.get(1));
        		strideMap.put(flow.getName(), stride_categories.get(3));
        		strideMap.put(flow.getName(), stride_categories.get(4));
        	}
        }
        
        System.out.println(Collections.singletonList(strideMap));
        // Check outgoing flows for same Targets
        // Take first element and its flows     element->flow
        // Nested loop for checking same targets
        
        for(Element ee: contents.getElements()) {
        	for(Flow flow : ee.getOutflows()) {
        		for(Flow matchFlow : ee.getOutflows()) {
        			if(flow != matchFlow && flow.getTarget().equals(matchFlow.getTarget())) {
        			//	if(!flow.getAssets().isEmpty() && !matchFlow.getAssets().isEmpty()){
        					suggestionList.add(flow);
        					suggestionList.add(matchFlow);
            				// TODO: Find Asset Values to bundle low and medium 
        			//	}
        			}
        		}
        	}
        }
        
        System.out.println(suggestionList.size());
 		System.out.println(suggestionList.toString());        
    //  store in the Suggestion list the flows that matches the target and their assets
 		
	}
}

class retrieveEDFDObject {
	
	public ArrayList<Asset> getListsOfAssets(EObject e) {
		
		ArrayList<Asset> assets = new ArrayList<>();
		for(int i = 0 ; i < e.eContents().size() ; i++) {
        	try {
        	assets.add((Asset) e.eContents().get(i));
        	}
        	catch (Exception es) {
				// TODO: handle exception
        	}
		}
		return assets;		
	}
	
	public ArrayList<Process> getListsOfProcess(EObject e) {
		
		ArrayList<Process> processes = new ArrayList<>();
		for(int i = 0 ; i < e.eContents().size() ; i++) {
        	try {
        	processes.add((Process) e.eContents().get(i));
        	}
        	catch (Exception es) {
				// TODO: handle exception
        	}
		}
		return processes;		
	}
	
	
	public ArrayList<ExternalEntity> getListsOfExternal(EObject e) {
		
		ArrayList<ExternalEntity> externalEntities = new ArrayList<>();
		for(int i = 0 ; i < e.eContents().size() ; i++) {
        	try {
        	externalEntities.add((ExternalEntity) e.eContents().get(i));
        	}
        	catch (Exception es) {
				// TODO: handle exception
        	}
		}
		return externalEntities;	
	}
	
	public ArrayList<DataStore> getListsOfDataStore(EObject e) {
		
		ArrayList<DataStore> dataStores = new ArrayList<>();
		for(int i = 0 ; i < e.eContents().size() ; i++) {
        	try {
        	dataStores.add((DataStore) e.eContents().get(i));
        	}
        	catch (Exception es) {
				// TODO: handle exception
        	}
		}
		return dataStores;		
	}
	
	public ArrayList<Flow> getFlowsOfProcess(ArrayList<Process> list){
		
		ArrayList<Flow> flowsOfProcess = new ArrayList<>();
		 for(int i = 0 ; i < list.size() ; i++) {
	        	for(int j = 0 ; j < list.get(i).getOutflows().size() ; j++) {
	        	flowsOfProcess.add((Flow) list.get(i).getOutflows().get(j));
	        }
	        }
		 return flowsOfProcess;
	}
	
	public ArrayList<Flow> getFlowsOfExternal(ArrayList<ExternalEntity> list){
		
		ArrayList<Flow> flowsOfExternalEntities = new ArrayList<>();
		 for(int i = 0 ; i < list.size() ; i++) {
	        	for(int j = 0 ; j < list.get(i).getOutflows().size() ; j++) {
	        	flowsOfExternalEntities.add((Flow) list.get(i).getOutflows().get(j));
	        }
	        }
		 return flowsOfExternalEntities;
	}
	
	public ArrayList<Flow> getFlowsOfData(ArrayList<DataStore> list){
		
		ArrayList<Flow> flowsOfData = new ArrayList<>();
		 for(int i = 0 ; i < list.size() ; i++) {
	        	for(int j = 0 ; j < list.get(i).getOutflows().size() ; j++) {
	        	flowsOfData.add((Flow) list.get(i).getOutflows().get(j));
	        }
	        }
		 return flowsOfData;
	}

	public ArrayList<Flow> getFlowsOfElement(ArrayList<eDFDFlowTracking.Element> list){
		
		ArrayList<Flow> flowsOfElement = new ArrayList<>();
		for(int i = 0 ; i < list.size() ; i++) {
	        	for(int j = 0 ; j < list.get(i).getOutflows().size() ; j++) {
	        	flowsOfElement.add((Flow) list.get(i).getOutflows().get(j));
	        	}
	        }
		 return flowsOfElement;
	}

	
}
