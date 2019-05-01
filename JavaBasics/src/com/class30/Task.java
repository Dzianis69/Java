package com.class30;

import java.util.ArrayList;

/*
 * Create a generic ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
public class Task {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Dzianis");
		names.add("John");
		names.add("Muha");
		names.add("Cere");
		names.add("Paolo");
		if (names.isEmpty()) {
			System.out.println("names is emty");
		} else {
			for (String name : names) {
				System.out.println(name);
			}
		}
		System.out.println("names size is " + names.size());
		for (String name : names) {
			if (name.contains("Cere")) {
				System.out.println("names contains special Cere name");
			}
		}

	}
}