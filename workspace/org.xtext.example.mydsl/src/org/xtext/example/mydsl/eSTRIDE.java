package org.xtext.example.mydsl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import com.google.common.collect.HashMultimap;
import eDFDFlowTracking.Flow;
import eDFDFlowTracking.Process;

public class eSTRIDE {

	public static void main(String[] args) throws IOException {

		BundlingAndFolding bundle = new BundlingAndFolding();
		eSTRIDEMap estride = new eSTRIDEMap();

		File f = new File(
				"C:\\Users\\Karan\\Git Projects\\Thesis\\ArchitecturalThreatAnalysis\\runtime\\xText\\src\\eDFD.mydsl");

		Set<Flow> suggestionList = new HashSet<>();

//------Data Bundling Process---------------------------      
		suggestionList = bundle.FlowBundle(f);

		for (Flow temp : suggestionList) {
			System.out.println("Flows that can be bundled: " + temp.getName());
		}
		System.out.println();

//------eSTRIDE----------------------------------- 
		HashMultimap<String, String> eSTRIDETable = estride.mapToeSTRIDE(f);

//------Process Folding----------------------------------------------
		ArrayList<ArrayList<Process>> finalPair = new ArrayList<ArrayList<Process>>();
		finalPair = bundle.ProcessFold(f);

//----PRINTING----
//-------------------------Process Folding Suggestions------------------------------------------------		
		System.out.println(String.format("%25s %25s", "Process Folding Suggestions", "|"));
		System.out.println(String.format("%s", "-----------------------------------------------------"));
		for (int i = 0; i < finalPair.size(); i++) {
			System.out.println(String.format("%-25s %25s", finalPair.get(i).get(i).getName(),
					finalPair.get(i).get(i + 1).getName()));
		}
		System.out.println();
		System.out.println();
//-------------------------------eSTRIDE Threat Table-------------------------------------------
		System.out.println("eSTRIDE Threat Table: ");
		System.out.println();
		System.out.println(String.format("%25s %25s %70s %50s", "Entity", "|", "STRIDE Category", "|"));
		System.out.println(String.format("%s",
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));

		for (String key : eSTRIDETable.keySet()) {
			System.out.println(String.format("%-25s %25s %-70s %50s", key, "|", eSTRIDETable.get(key), "|"));
		}
	}
}
