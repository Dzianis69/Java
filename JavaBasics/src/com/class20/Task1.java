package com.class20;

public class Task1 {
	String userName, lastName, emailType, emailAdress;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 obj = new Task1();
		obj.createMail();
		System.out.println(obj.createMail2("Vinny", "Pooh", "@outlook.com"));
	}

	public void createMail() {
		userName = "Harry";
		lastName = "Potter";
		emailType = "@gmail.com";
		System.out.println(userName + lastName + emailType);
	}

	String createMail2(String a, String b, String c) {
		return a + b + c;
	}
}
/*
	public static void main(String[] args) {
		/* 1. 
		 * Create a method createEmail(). 
		 * Based on provided users name, lastName and email type, 
		 * your method should return complete email Address;
		 * johnsnow@gmail.com
		 * johnsnow@yahoo.com
		
		Task obj=new Task();
		String email=obj.createEmail("John", "Snow", "gmail");
		System.out.println(email);
		
		email=obj.createEmail("Bob", "Snow", "outlook");
		System.out.println(email);
	}
	//return type methodName
	String createEmail(String name, String lastName, String emailType) {

		String email = name + lastName + "@" + emailType + ".com";
		return email.toLowerCase();
	}
	/*Create  class Student that will have a method getGrade
	 * your method should accept the score of a student and return a grade
	 * score > 90 - A
	 * score >80 - B
	 * score >70 - C
	 * score > 50 - D
	 * anything else - F
	 */

