package com.class4;

public class NestedIfCondition {
public static void main(String[] args) {
	int age= 67;
	int aligbleAge=16;
	int retirement=64;
	if(age>aligbleAge) {
		System.out.println("You can work");
		if(age<retirement) {
			System.out.println("Wait a litlle bit to retire");
			
		}else {
			System.out.println("You are pensionero!");
		}
	}else {
		System.out.println("You are too yung to work");
		
			;
		
	}

	
}
}
