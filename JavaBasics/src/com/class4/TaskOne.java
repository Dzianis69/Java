package com.class4;

import java.util.Scanner;

public class TaskOne {
public static void main(String[] args) {
	int loan;
	Scanner input=new Scanner(System.in);
	
	System.out.println("How much money would you like to borrow?");
	loan=input.nextInt();
	
	if(loan<=200000) {
		System.out.println("You are lucky guy!!!");
	}else {
		System.out.println("I am sorry but you can steal it!!!");
	}
	
}
}
