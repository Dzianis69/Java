package HomeWork;

/*
 *  1. Complete the Car.java class:

Include the following class variables:
* make
* model
* numberOfDoors
* topSpeed
* price
All class variables should be declared case sensitive

Write four constructors:
* The first constructor(with all parameters)
* A secondary constructor that does not include numberOfDoors, which should default to 4
* A third constructor that does not include make and model; both default to "unknown"
* A fourth constructor that does not include topSpeed and price; default to 90 and 0 respectively.

2. Test your code with the Main.java class:
Create several Car objects using all Constructors and print their fields/states to make sure it's correct. print your objects with variables in your output each object


Output: 
Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
 */
public class Car {
	String make = "unknown";
	 String model = "unknown";
	   int numberOfDoors = 4;
	   int topSpeed = 90;
	  double price = 0.0;


//1
	 public Car(String make, String model, int numbersOfDoors, int topSpeed, double price) {
	this.make = make;
	this.model = model;
	this.numberOfDoors = numberOfDoors;
	this.topSpeed = topSpeed;
	this.price = price;
}
//2
	 public Car(String make, String model, int topSpeed, double price) {
			this.make = make;
			this.model = model;
	this.topSpeed = topSpeed;
	this.price = price;
}
	 //3
	 public Car(int numbersOfDoors, int topSpeed, double price) {
			this.topSpeed = topSpeed;
			this.price = price;
}
	 //4
	 public Car(String make, String model, int numbersOfDoors) {
			this.make = make;
			this.model = model;
			this.numberOfDoors = numberOfDoors;
			
		}
	 
}
