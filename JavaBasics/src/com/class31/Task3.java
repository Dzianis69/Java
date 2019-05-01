package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
	/*
	 * Create an arrayList of drinks. If any drink has letter “a” or “e” replace it
	 * with water.
	 * Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> drinks = new ArrayList<String>();
drinks.add("vodka");
drinks.add("pina");
drinks.add("gin");
drinks.add("soda");
drinks.add("mojito");

for(int i = 0; i < drinks.size(); i++) {
	String s = drinks.get(i);
	if(s.contains("e") || s.contains("a")) {
		drinks.set(i, "water");
	}
}
System.out.println(drinks);

	}

}
