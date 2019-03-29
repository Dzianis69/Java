package com.class6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char oper;
double a,b;
double result = 0;
Scanner input=new Scanner(System.in);
System.out.println("Please enter your number one");
a=input.nextInt();
System.out.println("Please enter your number two");
b=input.nextInt();
System.out.println("Enter math operation what you would like to ptrfom");
oper=input.next().charAt(0);

switch(oper) {
case '+':
	result=a+b;
	break;
case '-':
	result=a-b;
	break;
case '*':
	result=a*b;
	break;
case '/':
	result=a/b;
	break;
	default:
		System.out.println("not corect operator");
}
System.out.println("The result of "+a+" and "+b+" is "+result);
	}

}
