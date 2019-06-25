package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class TCOne extends CommonMethods {

	@BeforeClass
	public static void setUp() {
		setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");

	}

	@Test(priority = 1)
	public static void titleValidation() {
		String expected = "OrangeHRM";
		String actual = driver.getTitle();
		if (expected.equals(actual)) {
			System.out.println("Title is VALID");
		} else {
			System.out.println("Title is  NOT VALID");
		}
	}

	@Test(priority = 2)
	public static void logIn() {
		sendText(driver.findElement(By.cssSelector("input#txtUsername")), "Admin");
		sendText(driver.findElement(By.cssSelector("input#txtPassword")), "admin123");
		driver.findElement(By.cssSelector("input[name='Submit']")).submit();

	}

	@Test(priority = 3)
	public static void logInVerefication() {
		WebElement logInPage = driver.findElement(By.cssSelector("a#welcome"));
		boolean logInPageVer = logInPage.isDisplayed();
		if (logInPageVer || logInPage.isEnabled()) {
			System.out.println("Log In is verified");
		} else {
			System.out.println("Log In is verified");
		}
	}

	@AfterClass
	public void close() {
		driver.close();
	}
}

// TC 1: OrangeHRM Title Validation
//
// TC 2: OrangeHRM Successful Login
// https://opensource-demo.orangehrmlive.com/
// Please make sure to use the following:
// annotations:
//		@BeforeMethod
//		@AfterMethod
//		@Test
//
// What would you do if you do not want to execute any specific test case?
// What would you do if you want to execute any specific test case first?
