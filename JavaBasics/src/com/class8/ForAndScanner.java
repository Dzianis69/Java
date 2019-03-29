package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int largest = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {

			System.out.println("Enret first number");
			a = input.nextInt();
			System.out.println("Enter second num");
			b = input.nextInt();
			if (a > b) {
				largest = a;
			} else if (b > a) {
				largest = b;
			} else {
				System.out.println(a + " is equal to " + b);
			}
			System.out.println(largest+" it larger");
		}
	
	}

}
