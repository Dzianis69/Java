package com.class32;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Create an HashSet of cities and add duplicates into it.
    Retrieve all values from hashset in 2 different ways.
    Retrieve all values in alphabetical order.
 */
public class HomeWork3 {
	public static void main(String[] args) {
		HashSet<String> city = new Set<String>();
		city.add("Minsk");
		city.add("Minsk");
		city.add("Lvov");
		city.add("NY");
		city.add("Vilnuis");
		city.add("Vilnuis");
		city.add("Drezden");

		for (String s : city) {
			System.out.print(s + " ");

		}
		System.out.println();
		Iterator<String> itr = city.iterator();
		while (itr.hasNext()) {
			String it = itr.next();
			System.out.print(it + " ");
		}
		Collections.sort(city);
		for (String s : city) {
			System.out.print(s + " ");

		}
		System.out.println();
		Iterator<String> itr1 = city.iterator();
		while (itr.hasNext()) {
			String it = itr.next();
			System.out.print(it + " ");
		}
	}
}
