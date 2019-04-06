package com.class17_2;

import java.util.Scanner;

public class Tsk5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a guessing game where the user has to guess a secret number between 1
		 * and 20. After every guess input, the program tells the user whether their
		 * number was too large or too small. The program will keep asking the user to
		 * enter the number until he finds the correct number. When the correct answer
		 * is found the system should display "Congratulations!!. You got it!".
		 */
		int winnerNum = 19;
		int num ;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Choose number from 1 to 20!");
			num = in.nextInt();
			if (num > winnerNum)	    System.out.println("To large number");
			if (num < winnerNum)        System.out.println("Too small number");
			if (num > 20 || num < 1) 	System.out.println("Please choose correct number");
			
		} while (num != 19);

		System.out.println("Congratulations!!!");

	}

}
