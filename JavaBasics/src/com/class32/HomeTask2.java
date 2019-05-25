package com.class32;

import java.util.Arrays;

public class HomeTask2 {
/*
 * Create an array of Strings and using Arrays class  class sort the values of that array of Strings.
 */
	public static void main(String[] args) {
	String [] arr =  {"Goal", "ball", "puck", "twopuck"};
	Arrays.sort(arr);
	for(String s: arr) {
		System.out.println(s);
	}
	
	}

}
