package com.class5;

import java.util.Scanner;

public class Task7 {
	  public static void main(String[] args) {
	        // Program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)
	        int a,b,c;
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Please enter first number: ");
	        a=scan.nextInt();
	        System.out.println("Please enter second number: ");
	        b=scan.nextInt();
	        System.out.println("Please enter third number: ");
	        c=scan.nextInt();
	        if (a!=b&&b!=c) {
	            if (a>b&&b>c) {
	                System.out.println("The largest number is: "+a);
	            }else if (b>a&&b>c) {
	                System.out.println("The largest number is: "+b);
	            }else {
	                System.out.println("The largest number is: "+c);
	            }
	        }else {
	            System.out.println("Please enter the distinct numbers");
	    }
	    }

	}