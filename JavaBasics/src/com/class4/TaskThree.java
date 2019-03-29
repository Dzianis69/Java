package com.class4;

import java.util.Scanner;

public class TaskThree {
public static void main(String[] args) {
	int tempF,tempC;
	String country;
	Scanner input=new Scanner(System.in);
	System.out.println("What is your country?");
	country=input.nextLine();
	System.out.println("What is the wheather in "+country+"?");
	tempF=input.nextInt();
	tempC=(tempF-32)*5/9;
	System.out.printf("The temperature in %s is the %s in F and %s in C",country,tempF,tempC);
	
}
}
