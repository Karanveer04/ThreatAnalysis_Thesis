package org.xtext.example.mydsl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import com.google.common.collect.HashMultimap;
import eDFDFlowTracking.Asset;
import eDFDFlowTracking.Assumption;
import eDFDFlowTracking.DataStore;
import eDFDFlowTracking.EDFD;
import eDFDFlowTracking.Element;
import eDFDFlowTracking.ExternalEntity;
import eDFDFlowTracking.Flow;
import eDFDFlowTracking.Objective;
import eDFDFlowTracking.Process;
import eDFDFlowTracking.Value;

public class eSTRIDE {

	public static void main(String[] args) throws IOException {

		XtextParser parser = new XtextParser();

		File f = new File(
				"C:\\Users\\Karan\\Git Projects\\Thesis\\ArchitecturalThreatAnalysis\\runtime\\xText\\src\\eDFD.mydsl");
		eDFDFlowTracking.EDFD contents = (EDFD) parser.parse(URI.createFileURI(f.toString()));
		/*
		 * for(int i = 0; i < contents.getAsset().size(); i++) { //
		 * System.out.println(contents.getAsset().get(i) + " "+
		 * contents.getAsset().get(i).getValue().get(0).getPriority()); //
		 * System.out.println(contents.getAsset().get(i)); }
		 * 
		 * for(int i = 0; i < contents.getElements().size(); i++) { //
		 * System.out.println(contents.getElements().get(i)); }
		 */
		retrieveEDFDObject eDFD = new retrieveEDFDObject();

		ArrayList<String> stride_categories = new ArrayList<>();
		stride_categories.add("Spoofing");
		stride_categories.add("Tampering");
		stride_categories.add("Repudiation");
		stride_categories.add("Information Disclosure");
		stride_categories.add("Denial of Service");
		stride_categories.add("Elevation of Privilege");

		ArrayList<String> security_objectives = new ArrayList<>();
		security_objectives.add("Authentication");
		security_objectives.add("Integrity");
		security_objectives.add("Accountability");
		security_objectives.add("Confidentiality");
		security_objectives.add("Availability");
		security_objectives.add("Authorization");

		HashMap<String, String> eSTRIDE_table = new HashMap<>();
		eSTRIDE_table.put(stride_categories.get(0), security_objectives.get(0));
		eSTRIDE_table.put(stride_categories.get(1), security_objectives.get(1));
		eSTRIDE_table.put(stride_categories.get(2), security_objectives.get(2));
		eSTRIDE_table.put(stride_categories.get(3), security_objectives.get(3));
		eSTRIDE_table.put(stride_categories.get(4), security_objectives.get(4));
		eSTRIDE_table.put(stride_categories.get(5), security_objectives.get(5));

//		System.out.println(Collections.singletonList(eSTRIDE_table));

		Set<Flow> suggestionList = new HashSet<>();

		HashMultimap<String, String> strideMap = HashMultimap.create();

		ArrayList<ExternalEntity> externalEntities = eDFD.getListsOfExternal(contents);
		ArrayList<Process> processes = eDFD.getListsOfProcess(contents);
		ArrayList<DataStore> dataStores = eDFD.getListsOfDataStore(contents);
		for (int i = 0; i < externalEntities.size(); i++) { // External Entities
			strideMap.put(externalEntities.get(i).getName(), stride_categories.get(0));
			strideMap.put(externalEntities.get(i).getName(), stride_categories.get(2));
		}

		for (int i = 0; i < processes.size(); i++) { // Process
			strideMap.put(processes.get(i).getName(), stride_categories.get(0));
			strideMap.put(processes.get(i).getName(), stride_categories.get(1));
			strideMap.put(processes.get(i).getName(), stride_categories.get(2));
			strideMap.put(processes.get(i).getName(), stride_categories.get(3));
			strideMap.put(processes.get(i).getName(), stride_categories.get(4));
			strideMap.put(processes.get(i).getName(), stride_categories.get(5));
		}

		for (int i = 0; i < dataStores.size(); i++) { // Data Store
			strideMap.put(dataStores.get(i).getName(), stride_categories.get(1));
			strideMap.put(dataStores.get(i).getName(), stride_categories.get(2)); // ??
			strideMap.put(dataStores.get(i).getName(), stride_categories.get(3));
			strideMap.put(dataStores.get(i).getName(), stride_categories.get(4));
		}

		for (Element element : contents.getElements()) { // Flows
			for (Flow flow : element.getOutflows()) {
				strideMap.put(flow.getName(), stride_categories.get(1));
				strideMap.put(flow.getName(), stride_categories.get(3));
				strideMap.put(flow.getName(), stride_categories.get(4));
			}
		}

		System.out.println("STRIDE MAP: " + Collections.singletonList(strideMap));

//------Data Bundling Process---------------------------      
		for (Element ee : contents.getElements()) { // Get all elements
			for (Flow flow : ee.getOutflows()) { // Get all outflows for those elements
				for (Flow matchFlow : ee.getOutflows()) { // Get all outflows for the same element to compare

					boolean toBundle = true;

					if (flow != matchFlow && flow.getTarget().equals(matchFlow.getTarget())) { // Check if flows have
																								// same target
						if (!flow.getAssets().isEmpty() && !matchFlow.getAssets().isEmpty()) { // Check if Assets are
																								// empty
							for (Value value : flow.getAssets().get(0).getValue()) { // Add only if the asset priority
																						// is low or medium
//								System.out.println("1st value: " + value);
//								System.out.println("1st priority: " + value.getPriority());

								if (value.getPriority().getName().equals("H")) {
									toBundle = false;
								}
							}
							for (Value value : matchFlow.getAssets().get(0).getValue()) {
								if (value.getPriority().getName().equals("H")) {
									toBundle = false;
								}
							}
							if (toBundle && flow.getChannel() == matchFlow.getChannel()) {
								suggestionList.add(flow);
								suggestionList.add(matchFlow);
							}
						}
					}
				}
			}
		}

//		System.out.println(suggestionList.size());
//		System.out.println(suggestionList.toString());
		/*
		 * for (Flow temp : suggestionList) {
		 * System.out.println("Flows that can be bundled: " + temp.getName()); }
		 */
//------------------------------------------------
		
		
//------eSTRIDE----------------------------------- 
		System.out.println();
		for (int i = 0; i < contents.getElements().size(); i++) { // go through elements
			if (!contents.getElements().get(i).getAssets().isEmpty()) { // check if assets are not empty for elements

				if (!contents.getElements().get(i).getAssets().get(0).getValue().isEmpty()) { // check if values are not
																								// empty for assets
					for (int j = 0; j < contents.getElements().get(i).getAssets().size(); j++) {
						
						for (int k = 0; k < contents.getElements().get(i).getAssets().get(j).getValue().size(); k++) {
							System.out.println(
									"\n Element: " + contents.getElements().get(i).getName() +
									"\n Assets Name: " + contents.getElements().get(i).getAssets().get(j).getName() +
									"\n  Asset Objective: "+ contents.getElements().get(i).getAssets().get(j).getValue().get(k).getObjective() +
									"\n  Asset Priority: "+ contents.getElements().get(i).getAssets().get(j).getValue().get(k).getPriority() );// get k
																														
						}
					}
				}
			}
//		System.out.println();

//		for(int i = 0 ; i < contents.getAsset().size() ; i++) {
//			if(!contents.getAsset().isEmpty()) {
//				System.out.println("Assets: " + contents.getAsset() + " Values: " + contents.getAsset().get(i).getValue() +
//						" Objective " + contents.getAsset().get(i).getValue().get(i).getObjective() + " Priority " + contents.getAsset().get(i).getValue().get(i).getPriority());
//			}
		}
//-------------------------------------------------------------------

//------Process Folding----------------------------------------------
		Set<Process> suggestionListPr = new HashSet<>();
		Set<Process> suggestionListObj = new HashSet<>();
		Set<Process> suggestionListPrFlow = new HashSet<>();
		Set<Process> suggestionListAssumptionNot = new HashSet<>();

		for (Process p : processes) { // Get Inflows too
			boolean isCritical = false;
			if (!p.getAssets().isEmpty()) {
				for (Asset as : p.getAssets()) {
					for (Value v : as.getValue()) {
						if (v.getPriority().getName().equals("H")) {
							System.out.println("NO Folding possible");
							isCritical = true;
						}
					}
				}
			}

			if (isCritical == false) {
				for (int i = 0; i < processes.size(); i++) {
					ArrayList<Flow> srcTar = new ArrayList<>();
					for (Flow outflow : p.getOutflows()) {// check for priorities of flows that dont go to process
						if (outflow.getTarget().get(0).getName().equals(processes.get(i).getName())) { // Target check
																										// and get flows
																										// between
																										// source and
																										// target, check
																										// if
																										// Process.get(i)
																										// is critical
							srcTar.add(outflow);
							// Outflow check for carrying assets
							Iterator<Asset> iterator = outflow.getAssets().iterator();
							while (iterator.hasNext()) {
								for (Value val : iterator.next().getValue()) {
									// Get first process and check surrounding assumptions that are assigned,
									// if ass = true, check, if ass = false, Make an assumption

									if (!p.getAssumption().isEmpty()) {
										Iterator<Assumption> assumptionIt = p.getAssumption().iterator();
										while (assumptionIt.hasNext()) {
											for (Objective obj : assumptionIt.next().getObjective()) {
												// Check assumption objective value == assets objective value,
												// suggestion list
												if (obj.getName().equals(val.getObjective().getName())) {
													suggestionListObj.add(p); // Objectives Matched
												}
												suggestionListAssumptionNot.add(p); // Objectives do not match
											}
										}
									} else {
										suggestionListPr.add(p); // No assumption made
									}

								}
							}
						}
					}
					// Check flows have same channel then suggestion
					boolean isSame = true;
					for (int j = 0; j < srcTar.size(); j++) {
						if (srcTar.get(j).getChannel().getName() != srcTar.get(0).getChannel().getName()) {
							isSame = false;
							break;
						}
					}
					if (isSame == true) {
						Collection<Process> pr = new ArrayList<>();
						pr.add(processes.get(i));
						pr.add(p);
						suggestionListPrFlow.addAll(pr);
					}
				}
			}
		}
//--------------------------------------------------------------------------
	}
}

class retrieveEDFDObject {

	public ArrayList<Asset> getListsOfAssets(EObject e) {

		ArrayList<Asset> assets = new ArrayList<>();
		for (int i = 0; i < e.eContents().size(); i++) {
			try {
				assets.add((Asset) e.eContents().get(i));
			} catch (Exception es) {
				// TODO: handle exception
			}
		}
		return assets;
	}

	public ArrayList<Process> getListsOfProcess(EObject e) {

		ArrayList<Process> processes = new ArrayList<>();
		for (int i = 0; i < e.eContents().size(); i++) {
			try {
				processes.add((Process) e.eContents().get(i));
			} catch (Exception es) {
				// TODO: handle exception
			}
		}
		return processes;
	}

	public ArrayList<ExternalEntity> getListsOfExternal(EObject e) {

		ArrayList<ExternalEntity> externalEntities = new ArrayList<>();
		for (int i = 0; i < e.eContents().size(); i++) {
			try {
				externalEntities.add((ExternalEntity) e.eContents().get(i));
			} catch (Exception es) {
				// TODO: handle exception
			}
		}
		return externalEntities;
	}

	public ArrayList<DataStore> getListsOfDataStore(EObject e) {

		ArrayList<DataStore> dataStores = new ArrayList<>();
		for (int i = 0; i < e.eContents().size(); i++) {
			try {
				dataStores.add((DataStore) e.eContents().get(i));
			} catch (Exception es) {
				// TODO: handle exception
			}
		}
		return dataStores;
	}

	public ArrayList<Flow> getFlowsOfProcess(ArrayList<Process> list) {

		ArrayList<Flow> flowsOfProcess = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).getOutflows().size(); j++) {
				flowsOfProcess.add((Flow) list.get(i).getOutflows().get(j));
			}
		}
		return flowsOfProcess;
	}

	public ArrayList<Flow> getFlowsOfExternal(ArrayList<ExternalEntity> list) {

		ArrayList<Flow> flowsOfExternalEntities = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).getOutflows().size(); j++) {
				flowsOfExternalEntities.add((Flow) list.get(i).getOutflows().get(j));
			}
		}
		return flowsOfExternalEntities;
	}

	public ArrayList<Flow> getFlowsOfData(ArrayList<DataStore> list) {

		ArrayList<Flow> flowsOfData = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).getOutflows().size(); j++) {
				flowsOfData.add((Flow) list.get(i).getOutflows().get(j));
			}
		}
		return flowsOfData;
	}
	/*
	 * public ArrayList<Flow> getFlowsOfElement(ArrayList<eDFDFlowTracking.Element>
	 * list) {
	 * 
	 * ArrayList<Flow> flowsOfElement = new ArrayList<>(); for (int i = 0; i <
	 * list.size(); i++) { for (int j = 0; j < list.get(i).getOutflows().size();
	 * j++) { flowsOfElement.add((Flow) list.get(i).getOutflows().get(j)); } }
	 * return flowsOfElement; }
	 */

}
