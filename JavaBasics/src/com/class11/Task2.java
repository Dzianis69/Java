package com.class11;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (use 2 different loops).
		 */

		String[] countries = { "Belarus", "USA", "Canada", "Italy", "Austria" };
		
		
		for(int i=0;i<countries.length;i++) {
			if (countries[i].equals("Belarus")) {
				System.out.println("The capital of " + countries[i] + " is Minsk.");
			}
			if (countries[i].equals("USA")) {
				System.out.println("The capital of " + countries[i] + " Washington.");
			}
			if (countries[i].equals("Canada")) {
				System.out.println("The capital of " + countries[i] + " is Toronto.");
			}
			if (countries[i].equals("Italy")) {
				System.out.println("The capital of " + countries[i] + " is Rome.");

			}
			if (countries[i].equals("Austria")) {
				System.out.println("The capital of " + countries[i] + " is Vena.");

			}
		}
		
		
		System.out.println("-------------");
		
		
		
		
		for (String cou : countries) {
			System.out.println(cou);
			if (cou.equals("Belarus")) {
				System.out.println("The capital of " + cou + " is Minsk.");
			}
			if (cou.equals("USA")) {
				System.out.println("The capital of " + cou + " Washington.");
			}
			if (cou.equals("Canada")) {
				System.out.println("The capital of " + cou + " is Toronto.");
			}
			if (cou.equals("Italy")) {
				System.out.println("The capital of " + cou + " is Rome.");

			}
			if (cou.equals("Austria")) {
				System.out.println("The capital of " + cou + " is Vena.");

			}
		}
	}
}