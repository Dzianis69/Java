package com.class5;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean credit = true;
		int balance = 1000;
		int a = 0;

		if (credit == true) {
			System.out.println("Check the balance");

			if (balance >= 1000) {
				System.out.println("u good");
		/*		if (a > 1) {
					System.out.println("really");
				}else {
					System.out.println("aaaaaa");
				}*/
			} else {
				System.out.println("no");
			}
		} else {
			System.out.println("do u wanna credit card?");
		}
	}

}
