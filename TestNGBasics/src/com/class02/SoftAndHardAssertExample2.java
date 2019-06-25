package com.class02;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.CommonMethods;

public class SoftAndHardAssertExample2 extends CommonMethods {
	@BeforeClass
	public void setup() {
		setUpDriver("firefox", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@Test(priority = 1)
	public void logIn() {
		String title = driver.getTitle();

		String expectedTitle = "OrangeHRM";

		Assert.assertEquals(title, expectedTitle);
		System.out.println("after hard assert");
	}

	@Test
	public void logo() {
		boolean logo = driver.findElement(By.cssSelector("img[src*='logo']")).isDisplayed();
		SoftAssert soft = new SoftAssert();

		soft.assertTrue(false);

		System.out.println("soft");
		soft.assertAll();
//		Assert.assertTrue(logo);
//		System.out.println("logo");

	}
}
