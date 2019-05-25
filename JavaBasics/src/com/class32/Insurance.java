package com.class32;

/*
 * Create a class Insurance that will have an attribute as
 *  insuranceName and unimplemented behaviour as getQuote
 *   and cancelInsurance. Create 3 subclasses Car, Pet,
 *    Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in
 ArrayList. Using 1 reference variable access methods from different classes.
 */
public abstract class Insurance {
	public void Insuarence(String insuarenceName) {
		this.insuranceName = insuranceName;

	}

	public String insuranceName;

	public abstract void getQuote();
	public abstract void cancelInsurance();
}

class Car extends Insurance {
	public Car(String carModel) {
		this.carModel = carModel;
	}

	public String carModel;

	@Override
	public void getQuote() {
		System.out.println("Car method");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel car");
		
	}

}

class Pet extends Insurance {
	public Pet(String petType) {
		this.petType = petType;
	}

	public String petType;
	public void cancelInsurance() {
		System.out.println("Cancel Pet");
		
	}

	@Override
	public void getQuote() {
		System.out.println("Pet method");

	}

}

class Health extends Insurance {
	public Health(String healthName) {
		insuranceName = healthName;
	}
	public void cancelInsurance() {
		System.out.println("Cancel Health");
		
	}

	@Override
	public void getQuote() {
		System.out.println("Health method");

	}

}
