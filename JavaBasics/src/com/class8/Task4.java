package com.class8;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Entre 2 numbers");
		int startNumber = input.nextInt();
		int endNumber = input.nextInt();
		if (startNumber < endNumber) {

			for (int i = startNumber; i <= endNumber; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("I wont run your code");
		}

	}
}