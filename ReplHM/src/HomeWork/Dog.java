package HomeWork;

/*
 * 1. Complete the Dog.java class:

Include the following class variables:
* name=Tarzan 
* breed=Mutt 
* weight= 50.0
All class variables should be declared lowercase, also make mutt static

Write two constructors:
* The main constructor(with all parameters)
* A secondary constructor that takes in only Name and Weight (Breed defaults to "Mutt")

2. Test your code with the Main.java class:

Create a Dog object using both Constructors and print their fields/states to make sure it's correct.

Output:
1.The main constructor(with all parameters)=Tarzan Mutt 50.0

2.secondary constructor that takes in only Name and Weight (Breed defaults to "Mutt")
=Tarzan Mutt 50.0
 */
public class Dog {

	public String name;
	public double weight;
	static String breed = "Mutt";

	public Dog(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

}
