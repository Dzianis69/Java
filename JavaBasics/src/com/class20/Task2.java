package com.class20;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("What is your score?");
int score=in.nextInt();
Task2 obj=new Task2();
System.out.println("Your grade is "+getGrade(score));
int a=1;
int d=1;
int b=++a;
int c=d++;
System.out.println(b);
System.out.println(c);
	}

	 static char getGrade(int score) {
		 char gr=0;
		if (score > 90) {
			gr= 'A';
		}
		if (score >= 80 && score <= 90) {
			gr=  'B';
		}
		if (score >= 70 && score < 80) {
			gr=  'C';
		}
		if (score > 50 && score<70) {
			gr=  'D';
		}
		if (score <= 50) {
			gr=  'F';
		}
		return gr;
	}
}
/*public static void main(String[] args) {
		
		Student obj=new Student();
		char myGrade=obj.getGrade(91);
		System.out.println("My grade at Syntax is "+myGrade);

		
		myGrade=obj.getGrade(59);
		System.out.println("My grade at Syntax is "+myGrade);
	}

	char getGrade(int score) {
		char grade;
		
		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}
}*/
