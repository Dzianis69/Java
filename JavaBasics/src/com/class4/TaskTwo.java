package com.class4;

import java.util.Scanner;

public class TaskTwo {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
			int age;
	System.out.println("How old are you?");
	age=input.nextInt();
	 if(age>=18) {
		 System.out.println("Good like with your test!");
	 }else {
		 System.out.println("I am sorry you are too yung but would you like to pass test for learnt permit?");
	 }
}
}
