package com.class14;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Lets go fishing!";
		String str1 = str.replaceAll("[ ]", "");
		System.out.println(str1);

		String str2 = "HVDV  786bh   f73%7jf  hj^&^hdjhd%";
		String str3 = str2.replaceAll("[a-z A-Z0-9]", "");
		System.out.println(str3 + " " + str3.length());

		String a = "Is it saturday! Is it raining! Do we have a Java Class today?";

		String[] b = a.split("[!]");
		for(String c:b) {
			System.out.println(c);
		}
		System.out.println(" b length is " + b.length+" sentences");
	}

}
