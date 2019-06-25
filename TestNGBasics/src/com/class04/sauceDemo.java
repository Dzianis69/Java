package com.class04;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class sauceDemo extends CommonMethods {
	@BeforeMethod(alwaysRun = true, groups = "smoke")
	public void setUp() {
		setUpDriver("chrome", "https://www.saucedemo.com/");
	}

	@Test(groups = "smoke")
	public void logIn1() {
		sendText(driver.findElement(By.id("user-name")), "standard_user");
		sendText(driver.findElement(By.id("password")), "secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
	}

	@Test(groups = "regression")
	public void logIn2() {
		sendText(driver.findElement(By.id("user-name")), "problem_user");
		sendText(driver.findElement(By.id("password")), "secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}

	@AfterMethod( alwaysRun = true)
	public void close() {
		driver.close();
	}
}
//Identify Priority of Test Cases
//https://www.saucedemo.com/
//
//TC 1: Saucedemo Username1(tag the groups - Smoke)
//Step 1: Open browser and navigate to Saucedemo
//Step 2: Enter username standard_user and enter password secret_sauce and click login button
//Step 3: Verify user successfully logged in
//
//TC 2: Saucedemo Username2(tag the groups - Regression)
//Step 1: Open browser and navigate to Saucedemo
//Step 2: Enter username problem_user and enter password secret_sauce and click login button
//Step 3: Verify user successfully logged in
//
//
//Note: Create BeforeMethod and AfterMethod annotations to open browser and logout from the application. Create a xml file and include smoke.