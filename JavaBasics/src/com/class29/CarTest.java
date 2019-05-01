package com.class29;

public class CarTest {
	public static void main(String[] args) {
		Truck obj = new Truck(300, "white", 12350);
		System.out.println(obj.calculateSalePrice());
		Sedan obj1 = new Sedan(21, "blue", 6900);
		System.out.println(obj1.calculateSalePrice());
		
	}

}
