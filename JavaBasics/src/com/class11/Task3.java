package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */
		int sum=0;
		int[] num= {22,33,21,44};
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);
	}

}
