package com.class29;

/*
 * Create a Class Car that would have the following fields: 
 * regularPrice and color and method calculateSalePrice() which should be returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has field
 as weight and has its own implementation of  calculateSalePrice() method 
 in which returned price calculated as following: if weight>2000 then returned 
 price should include 10%discount, otherwise 20%discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
 if length of sedan is >20 feet then returned price should include 5%discount, otherwise 10%discount
 */
public class Car {
	Car(){
		
	}

	double regularPrice;
	String color;

	public Car(String color, double regularPrice) {
		this.color = color;
		this.regularPrice = regularPrice;
	}

	public double calculateSalePrice() {

		return regularPrice;
	}
}

class Sedan extends Car {

	public Sedan(int length, String color, double regularPrice) {
		super(color, regularPrice);
		this.length = length;
	}

	private int length;

	public double calculateSalePrice() {
		if (length >= 20) {
			regularPrice -= regularPrice * 0.05;
		} else {
			regularPrice -= regularPrice * 0.1;
		}
		return regularPrice;

	}
}

class Truck extends Car {
	Truck(int a){
		
	}
	Truck(){
		
		super();
		
	}
	public Truck(int weight, String color, double regularPrice) {
		super(color, regularPrice);
		this.weight = weight;
	}

	private int weight;

	public double calculateSalePrice() {
		if (weight >= 2000) {
			regularPrice -= regularPrice * 0.1;
		} else {
			regularPrice -= regularPrice * 0.2;
		}
		return regularPrice;
	}
}