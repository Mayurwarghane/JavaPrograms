package com.velocity.java.collection;

import java.util.*;


public class CollectionOfMap {

	public static void main(String[] args) {
		

		ArrayList<String> computerlist = new ArrayList<>();
		computerlist.add("Tonge");
		computerlist.add("Nagrale");
		computerlist.add("Janwe");
		
		ArrayList<String> electricallist = new ArrayList<>();
		electricallist.add("Lichode");
		electricallist.add("Pise");
		electricallist.add("Bhalla");
		
		ArrayList<String> informationlist = new ArrayList<>();
		informationlist.add("Donald");
		informationlist.add("More");
		informationlist.add("Singh");

		HashMap<String, ArrayList<String>> hmDepartment = new HashMap<>();
		hmDepartment.put("COMPUTER TECHNOLOGY", computerlist);
		hmDepartment.put("ELECTRONICS AND TELECOMMUNICATION", electricallist);
		hmDepartment.put("INFORMATION TECHNOLOGY", informationlist);
		
		HashMap<String, HashMap<String, ArrayList<String>>> hmcollegename = new HashMap<>();
		hmcollegename.put("RCERT", hmDepartment);
		
		//for(String college:s) {
		Iterator<Map.Entry<String, HashMap<String, ArrayList<String>>>>itr=hmcollegename.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, HashMap<String, ArrayList<String>>>entry=itr.next();
			System.out.println("College>>"+entry.getKey()+"\nDepartment>>"+entry.getValue());
			
			
			
		//}
		}
		
	}

}
