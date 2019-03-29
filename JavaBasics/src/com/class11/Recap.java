package com.class11;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] studentNames= {"Shaban","Bilial","Mehmet","Zaki","Samir","Frank"};
		for(int i=0;i<=studentNames.length-1;i++) {
			System.out.println(studentNames[i]);
		}
		System.out.println("__________");
		for(String student : studentNames) {
		System.out.println(student);
		}

	}

}
