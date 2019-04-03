package com.class16;

public class Car {

	String make, model, color;
	int door, wheels;

	void drive() {
System.out.println("Car in drive");
	}
void reverse () {
	System.out.println("Car can reverse");
}
void stop() {
	System.out.println("Car can stop");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.make = "Honda";
		car1.model = "Civic";
		car1.color = "Black";
		car1.door = 4;
		car1.wheels = 4;
		car1.drive();
		car1.reverse();
		car1.stop();

		Car car2 = new Car();
		car2.make = "Tesla";
		car2.model = "x";
		car2.color = "Blue";
		car2.door = 4;
		car2.wheels = 4;

		System.out.println("My car is " + car2.color + " " + car2.make + " " + car2.model);
		System.out.println(car1.wheels);
		car2.drive();
		car2.reverse();
		car2.stop();
	}

}
