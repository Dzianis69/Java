package com.class12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Accept username, password and confirm password and check following
		 * requirements:
		 * 
		 * Username and Password cannot be empty, if so→ message=”Username and Password
		 * cannot be empty”. Password should be minimum 8 characters, if less →
		 * message=”Password is too short”. Password cannot contain username if so, →
		 * message=”Password cannot contain username”. Password should match confirmed
		 * password, if not → message “Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */
		
		
		String [] input= {"Username","Password","Confirm Password"};
		
		Scanner in=new Scanner(System.in);
		System.out.println(" Create your Username");
		input[0]=in.nextLine();
		System.out.println("Create your Password");
		input[1]=in.nextLine();
		System.out.println("Confirm your password");
		input[2]=in.nextLine();
		if(input[0].isEmpty() || input[1].isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}else if(input[1].length()<8) {
			System.out.println("Password is too short");
		}else if(input[0].equals(input[1])) {
			System.out.println("Password cannot contain username");
		}else if(!(input[1].equals(input[2]))){
			System.out.println("Passwords do not match");
			
		}else {
			System.out.println("Your username and password has been created");
		}
	}

}
