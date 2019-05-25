package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		

		int a=10;
		int b=0;
				
		System.out.println(a/b);//new ArithmeticException
		
		//if person is >18 yo --> issue dr licence else --> throw an exception

		//checkAgeEligibility(17);
		//twoNumDiv(10, 0);
		checkUserNameLength("A");
		
	}
	
	public static void checkAgeEligibility(int age) {
		
		if (age>=18) {
			System.out.println("Congratilations on your driver license");
		}else {
			throw new ArithmeticException("You are not eligible to get driver license");
		}
		
	}
	
	public static void twoNumDiv(int a, int b) {
		
		if (b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("We cannoot divide by zero");
		}
	}
	
	public static void checkUserNameLength(String userName) {
		if (userName.length()>3) {
			System.out.println("Username is accepted");
		}else {
			throw new NullPointerException("Username must be longer than 3 characters");
		}
	}
	// create an exception: when user it trying to withdraw larger amount that the balance 
	//throw an exception saying "You do not have enough money"
	
}
