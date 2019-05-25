package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveFromArrayListDups {

	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add("John");	
		aList.add("Jane");	
		aList.add("James");	
		aList.add("Jsmine");	
		aList.add("Jane");	
		aList.add("James");	
		System.out.println(aList);
		Set<String> hash = new HashSet(aList);
		System.out.println(hash);
				
	
	}
}
