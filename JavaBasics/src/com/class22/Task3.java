package com.class22;

public class Task3 {
	public String name;
	/*
	 * 3. Write a program that will have a private default constructor class and
	 * create 2 objects of this class: 1 - inside same class; 2 - from outside the
	 * class
	 */
	private Task3(String name) {
		this.name=name;
	}
	public static void main(String[] args) {
	Task3 obj = new Task3("Dzianis");
	System.out.println(obj.name);
	}
}
