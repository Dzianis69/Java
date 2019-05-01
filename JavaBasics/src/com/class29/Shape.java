package com.class29;

/*
 * 1. Create an Interface ‘Shape’ with undefined methods as calculateArea()
 *  and calculatePerimiter(). Create 2 child classes: Circle & Square that 
 *  should have an implementation of area and perimeter calculation. Test your code.
 */
public interface Shape {
	void calculateArea(double r);

	void calculatePerimiter(double d);
}

class Circle implements Shape {

	@Override
	public void calculateArea(double r) {
		System.out.println("Area of circle is " + Math.PI * (r * r));

	}

	@Override
	public void calculatePerimiter(double d) {

		System.out.println("Perimeter of circle is " + 2 * (Math.PI * d));
	}

}

class Square implements Shape {

	@Override
	public void calculateArea(double r) {
		System.out.println("Area of square is " + r * r);

	}

	@Override
	public void calculatePerimiter(double d) {

		System.out.println("Perimeter of square is " + (d + d + d + d));
	}
}
