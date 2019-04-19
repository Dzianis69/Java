package com.class24;

public class StaticOverload {
 public static void getOverload() {
	 System.out.println("Dzianis");
 }
 public static void getOverload(String str) {
	 System.out.println(str);
}
 public static void getOverload(int s) {
	 System.out.println(s);
}
 public static void main(String[] args) {
	 getOverload();
	 getOverload(23);
	 getOverload("Whats up ");
}
}