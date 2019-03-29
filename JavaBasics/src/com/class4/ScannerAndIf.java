package com.class4;

import java.util.Scanner;

public class ScannerAndIf {
	public static void main(String[] args) {

		int num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Print first number");
		num1 = input.nextInt();
		System.out.println("Print second number");
		num2 = input.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + "  is bigger number");

		} else if (num1 == num2) {
System.out.println("numbers are equal");
		} else {
			System.out.println(num1 + " is smaller number");
		}
	}

}
