package com.class24;

public class PrivateOverloading {
private void getOverload() {
	System.out.println("Yo");
}
private void getOverload(String w) {
	System.out.println(w);
}
private void getOverload(int c) {
	System.out.println(c);
}
public static void main(String[] args) {
	PrivateOverloading obj = new PrivateOverloading();
	obj.getOverload();
	obj.getOverload(69);
	obj.getOverload("Yeaaaah");
}
}
