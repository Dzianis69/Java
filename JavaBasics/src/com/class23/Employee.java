package com.class23;

public class Employee {
	 int salary;
protected int salary1;
	public static String department="IT";
	public void getPaid() {
		System.out.println("Employee get's paid " + salary);
	}
	public static void work() {
		System.out.println("eMPLOYEE WORKS IN "+department+" department");
		
	}
	protected void getRun() {
		System.out.println("Can run");
	}
	
}
