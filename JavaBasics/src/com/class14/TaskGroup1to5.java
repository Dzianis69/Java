package com.class14;

public class TaskGroup1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable?
		 * 
		 * 2.Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array?
		 * 
		 * 3. Find out how many alpha characters present in a string?
		 * 
		 * 4.How to find out the part of the string from a string? What is substring?
		 * Find number of words in string?
		 * 
		 * 5. Write a java program to reverse String? Reverse a string word by word?
		 */

		// 1
		int c = 2;
		int d = 3;
		c = d + c;
		d = c - d;
		c = c - d;
		System.out.println(c);
		System.out.println(d);

		String a = "lox";
		String b = "pidr";
		System.out.println(a.replace("pidr", "lox"));
		System.out.println(b.replace("11", "10"));
		// 2
		int[] v = { 1, 2, 55, 32, 6, 34, 81 };
		int largest = v[0];
		int second = v[0];
		int min = 0;
		for(int num:v) {
			if(num<min) {
				min=num;
			}if(num>largest) {
				largest=num;
			}
		}
				 for(int num1:v) {
			           if(num1>second && num1<largest) {
			               second=num1;	
	}
				 }
		System.out.println(largest);
		System.out.println(second);
		System.out.println(min);

		// 3
		String str2 = "HVDV  786bh   f73%7jf  hj^&^hdjhd%";
		String str3 = str2.replaceAll("[a-z A-Z0-9]", "");
		System.out.println(str3 + " " + str3.length());
		// 4,5
		String str = "What is going on?";
		System.out.println(str.substring(5, 8));
		String[] words = str.split("[ ]");
		System.out.println("there are " + words.length + " words in string");
	
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			
		}
		System.out.println();
for(int i=words.length-1;i>=0;i--) {
}


	}
		}
	
