package com.class32;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Asel Umurzakova (Instructor) [10:31 PM]
For Saturday please complete the following tasks:
1. Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.

2. Create an array of Strings and using Arrays class  class sort the values of that array of Strings.

3. Create an HashSet of cities and add duplicates into it.
    Retrieve all values from hashset in 2 different ways.
    Retrieve all values in alphabetical order.
 */
public class HomeTask1 {
	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Shell");
		alist.add("Bob");
		alist.add("Tema");
		alist.add("Max");
		alist.add("Dan");
		for (String s : alist) {
			System.out.println(s);
		}
		System.out.println("---------------");
		Collections.sort(alist);
		for (String s : alist) {
			System.out.println(s);
		}
	}
}
