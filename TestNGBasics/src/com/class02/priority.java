package com.class02;

import org.testng.annotations.Test;

public class priority {
	@Test(priority=1)
public void first() {
		System.out.println("first test annotations");
	}
	@Test
public void second() {
		System.out.println("second test annotations");
	}
	@Test(priority=3)
public void third() {
		System.out.println("third test annotations");
	}
	@Test(priority=4)
public void fourth () {
		System.out.println("fourth test annotations");
	}
}
