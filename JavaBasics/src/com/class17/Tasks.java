package com.class17;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a method that will take 2 parameters as a numbers and prints which
		 * number is larger.
		 * 
		 * Create a method that will take a number and prints whether the number is even
		 * or odd.
		 * 
		 * Create a method that will print whether given String is palindrome or not.
		 */
		Tasks obj = new Tasks();
		obj.largerst(233, 489578);
		obj.oddEven(69);
		obj.palidrome("Lol");

	}

	void largerst(int a, int b) {
		if (a > b)
			System.out.println(a + " is largest");
		if (a < b)
			System.out.println(b + " is largest");
		else
			System.out.println("a and b are equal");
	}

	void oddEven(int a) {
		if (a % 2 == 0)
			System.out.println(a + " is even");
		if (a % 2 == 1)
			System.out.println(a + " is odd");
	}

	void palidrome(String a) {
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {

			b += a.charAt(i);
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println(a + " is palindrome");
		} else {
			System.out.println(a + " is not palidrome ");
		}
	}
}
