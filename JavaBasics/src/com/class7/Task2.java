package com.class7;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int a=1;
Scanner input=new Scanner(System.in);

while(a<=3) {
	System.out.println("Enter your name");
	name=input.nextLine();
	System.out.println("You are doing great "+name);
	a++;
}
	}

}
	