package com.class4;

import java.util.Scanner;

public class ScannerClas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any number");
		int x = input.nextInt();
		System.out.println("Your number is " + x);
		System.out.println("Do you like rain?");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		System.out.println(answer+"? I like it too!!!");
	

		
		

	}

}
