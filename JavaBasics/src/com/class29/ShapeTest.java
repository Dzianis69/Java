package com.class29;

public class ShapeTest {
public static void main(String[] args) {
	Shape obj = new Square();
	obj.calculateArea(11);
	obj.calculatePerimiter(10);
	obj = new Circle();
	obj.calculateArea(10);
	obj.calculatePerimiter(20);
}
}
