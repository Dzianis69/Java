package com.class21;

public class Employee {
	public static String CEO = "Sumair";
	public int salary;
	public String eID;
	public  static int count ;

	public static void main(String[] args) {
		
		Employee obj1 = new Employee();
		count++;
		Employee obj2 = new Employee();
		count++;
		obj1.salary=100;
		obj2.salary=200;
		obj1.eID="Jimmy1";
		obj2.eID="Jason2";

		System.out.println(obj1.salary+" "+obj1.eID+" "+CEO);
		System.out.println(obj2.salary+" "+obj2.eID+" "+CEO);
		System.out.println(count);
		
	}
}
