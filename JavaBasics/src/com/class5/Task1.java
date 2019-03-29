package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double height1,height2 ;
Scanner input=new Scanner(System.in);
System.out.println(" What is your height1 in inches?");
height1=input.nextDouble();
System.out.println(" What is your height2 in inches?");
height2=input.nextDouble();
if (height1>0 && height1<= 5) {
	System.out.println(" u r short");
}else if(height1>5 && height1<=6) {
	System.out.println("u r medium");
}else {
	System.out.println(" u r tall");
}
if (height2>0 && height2<= 5) {
	System.out.println(" u r short");
}else if(height2>5 && height2<=6) {
	System.out.println("u r medium");
}else {
	System.out.println(" u r tall");
}
	}

}
