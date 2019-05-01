package com.class31;

import java.util.ArrayList;
import java.util.Iterator;



/*
 * Create an arrayList of words. Remove every word that ends with “e”.
 */
public class Task2 {
public static void main(String[] args) {
	ArrayList<String> words = new ArrayList<String>();
	words.add("water");
	words.add("juece");
	words.add("pink");
	words.add("blue");
	words.add("red");
	Iterator <String> it = words.iterator();
	while(it.hasNext()) {
		String word = it.next();
		if(word.endsWith("e")) {
			it.remove();
		}
	
		
	
}
	System.out.println(words);
	}
}
