package w3resource;

import java.util.Scanner;

public class Method6 {
/*
 * 6. Write a Java method to compute the sum of the digits in an integer. Go to the editor
Test Data:
Input an integer: 25
Expected Output:

The sum is 7 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Type a number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(num % 10);
		System.out.println(getSumDigits(num));
	}
public static int getSumDigits(int num) {
	int sum=0;
	int reminder;
	while(num > 0) {
	reminder = num % 10;
	sum = reminder + sum;
	num = num / 10;
	}
	return sum;
}
	
}