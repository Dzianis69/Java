package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
	/*
	 * Create an arraylist of cars and retrieve all the values using 4 different
	 * ways.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> cars = new ArrayList<String>();
cars.add("Toyota");
cars.add("Audi");
cars.add("BMW");
cars.add("Jeep");


for(int i =0; i<cars.size(); i++) {
	System.out.println(cars.get(i));
}
System.out.println("______");
for(String car : cars) {
	System.out.println(car);
}
System.out.println("_______");
	
Iterator <String> iterator = cars.iterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
System.out.println("_______");

int c = 0;
while(cars.size() > c) {
	System.out.println(cars.get(c));
	c++;
}
}
}