package com.class9;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ask a user to input a leap year. Give the user 10 chances to enter a correct
		 * leap year. As soon as the user enters the correct leap year exit the loop.
		 */

		int year ;
		int leapYear;
		Scanner in = new Scanner(System.in);
		for (int i = 9; i >= 0; i--) {
		
			System.out.println("Input leap year please:");
			year = in.nextInt();
			
			if (year%4==0 ) {
				System.out.println("You won!!!");
				break;
			} else {
				System.out.println("You lost!!! AHAHAHAHAHAHAHAAHA!!!");
			}
			
			if (year%4!=0)
				System.out.println("You have " + i + " more chances");

		}

	}

}
