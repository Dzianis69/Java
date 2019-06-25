package com.class03;

import org.testng.annotations.Test;

public class GroupsExample {
	@Test(groups = { "Smoke" })
	public void one() {
		System.out.println("one");
	}

	@Test(groups = { "Regression" })
	public void two() {
		System.out.println("two");
	}

	@Test(groups = { "Smoke" })
	public void three() {
		System.out.println("three");
	}

	@Test(groups = { "Regression" })
	public void four() {
		System.out.println("four");
	}
}
