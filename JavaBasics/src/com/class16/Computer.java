package com.class16;

public class Computer {

	int screen, ram;
	String os,brand;
	boolean mouse, keyboard;

	void watchMovie() {
		System.out.println("We can watch movie on a computer "+brand);
	}

	void doJavaCoding() {
		System.out.println("We can do Java coding on our computer "+brand);
	}

	void playMusic() {
		System.out.println("We can play music on our copmuter "+brand);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer comp1 = new Computer();

		comp1.keyboard = true;
		comp1.mouse = true;
		comp1.os = "Windows";
		comp1.ram = 16;
		comp1.screen = 13;
		comp1.brand="Dell";
		
		comp1.watchMovie();
		comp1.doJavaCoding();
		comp1.playMusic();

		Computer comp2 = new Computer();
		comp2.keyboard = true;
		comp2.mouse = true;
		comp2.os = "Mac Os";
		comp2.ram = 12;
		comp2.screen = 15;
		comp2.brand="Apple";
		
		comp2.watchMovie();
		comp2.doJavaCoding();
		comp2.playMusic();

	}

}
