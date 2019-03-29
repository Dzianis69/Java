package com.class5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Print number one");
		a=input.nextDouble();
		System.out.println("Enter second number");
		b=input.nextDouble();
		System.out.println("Your number three is ");
		c=input.nextDouble();
		
		if(a>=b && a>=c) {
			System.out.println("The largest number is " +a);
		}else if(b>=c && b>=a) {
			System.out.println("The largest number is " +b);
		}else {
			System.out.println("The largest number is " +c);
		}
	}


}
