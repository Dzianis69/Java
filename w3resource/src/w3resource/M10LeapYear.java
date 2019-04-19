package w3resource;

import java.util.Scanner;

/*
 * Start off using the year you want to calculate.
See if it is evenly divisible by 4 (a whole number with no remainder).
See if the year is divisible by 100.
See if the year is divisible by 400.
 */
public class M10LeapYear {
	public static  int year;
	public boolean leapYear;

	public  boolean leapYear(int year) {
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			
					leapYear = true;
		}
		return leapYear;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Type a year ");
		 year = in.nextInt();
				M10LeapYear obj = new M10LeapYear();
			System.out.println("The year is leap. And it is "+obj.leapYear(year));	

		;
	}

}
