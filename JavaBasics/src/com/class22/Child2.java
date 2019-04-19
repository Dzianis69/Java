package com.class22;

public class Child2 extends Parent {
public void canSwim() {
	System.out.println("Child 2 can swim");
}
public static void main(String[] args) {
	Child2 child2 = new Child2();
	System.out.println("Child 2 eyes  "+child2.eyeColor);
	System.out.println("child 2 hair "+child2.hairColor);
	System.out.println("child 2 has "+child2.nose+" nose");
	child2.canSwim();
	child2.sing();
	
}
}
