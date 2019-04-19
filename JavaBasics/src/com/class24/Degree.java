package com.class24;

public class Degree {
public void getDegree() {
	System.out.println("I got degree");
}
}
 class Undergraduate extends Degree{
	public void getDegree() {
		System.out.println("I am undergraduated");
	}
}
 class Postgraduate extends Undergraduate{
	public void getDegree() {
		System.out.println("I am postgraduate");
	}

 }
 



