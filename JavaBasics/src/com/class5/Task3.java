package com.class5;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	int sales,comis;
	Scanner input =new Scanner(System.in);
	System.out.println("Print your sales for today");
	sales=input.nextInt();
	if(sales>0 && sales <=100) {
		
	comis=2;
	}else if(sales>100 && sales<=200) {
		comis=5;
	}else if(sales >200 && sales <=500) {
		comis =15;
	}else if(sales >500){
		comis=20;
	}else {
		comis=0;
	}
	System.out.println("Your commision is "+comis+" %");
}
}
