package com.class9;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Print the following pattern:
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 */

		for (int i = 1; i < 6; i++) {
			for (int a = 1; a <= i; a++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (int c = 1; c <= 4; c++) {

			for (int b = 4; b >= c; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
