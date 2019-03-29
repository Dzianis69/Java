package com.class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quiz, mid, fin;
		Scanner input = new Scanner(System.in);
		System.out.println("What is quiz score?");
		quiz = input.nextInt();
		System.out.println("What is your mid term score?");
		mid = input.nextInt();
		System.out.println("What is your final score?");
		fin = input.nextInt();
		int avg = (quiz + fin + mid) / 3;
		if (avg > 90) {
			System.out.println(" your garde is A");
		}else if(avg<=90 && avg>=70) {
			System.out.println(" your garde is B");
		}else if(avg<=70 && avg >=50) {
			System.out.println(" your garde is C");
		}else if(avg<50) {
			System.out.println(" your garde is F");
		}else {
			System.out.println(" your garde is Stupido");
		}
	}

}
