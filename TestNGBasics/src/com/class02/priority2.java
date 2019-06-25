package com.class02;

import org.testng.annotations.Test;

public class priority2 {

	@Test(priority = 1)
	public void first() {
		System.out.println("Method First");
	}

	@Test(priority = 2)
	public void second() {
		System.out.println("Method Second");
	}

	@Test
	public void third() {
		System.out.println("Method Third");
	}

	@Test
	public void fourth() {
		System.out.println("Method Fourth");
	}

}
