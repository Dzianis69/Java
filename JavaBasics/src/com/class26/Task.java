package com.class26;

public class Task {
	
private Task() {
	System.out.println("no para");
}
public Task(int a){
	this();
	System.out.println("para");
}
public static void main(String[] args) {
	Task obj = new Task(1);
	Student22 stu = new Student22("Jack"," 255 street");
	System.out.println(stu.adreess+" "+stu.name);
}
}
class Student22{
	 String name,adreess;
	public Student22(String name, String address) {
		this.name = name;
		this.adreess = address;
	}
}
