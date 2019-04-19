package com.class22;

/*
 * Write a java program of Class Students that takes 
 * students name and 3 subject grades. Inside your class 
 * also have a method to Calculate Average Grade. Test Student
 *  class for 5 different students with different marks. Your
 *   program should print an average mark of each students name.
 */
public class Students {
	public String name;
	int Math, English, Logic;

	public void getAv() {
		int average = (Math + English + Logic) / 3;
		System.out.println("My name is " + name + " and my average is " + average);
	}

	public Students(String name, int Math, int English, int Logic) {
		this.name = name;
		this.Math = Math;
		this.English = English;
		this.Logic = Logic;
	}

}
