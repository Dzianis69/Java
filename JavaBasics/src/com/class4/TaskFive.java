package com.class4;

import java.util.Scanner;

public class TaskFive {
public static void main(String[] args) {
	int yearsWork,sallary;
	double eligYears=5;
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("How long are you working in our company?");
	yearsWork=input.nextInt();
	
	
	if(yearsWork<eligYears) {
		System.out.println("You will not get bonus");
		
		
	}else{
		System.out.println("You will  get bonus");
		System.out.println("What is your anual salary?");
		sallary=input.nextInt();
		if (sallary >= 50000) {
			System.out.println("your bonus is 5000");
		} else {
			System.out.println("Your bonus is 3000");
		}
	}
	}
}
