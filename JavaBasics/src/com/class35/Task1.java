package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("What is your age");
		try {
		age = in.nextInt();
		
		}catch(InputMismatchException e) {
			System.out.println("Age");
			System.out.println(e.getMessage());
		}
		System.out.println("Your age is " + age);
	}

}
