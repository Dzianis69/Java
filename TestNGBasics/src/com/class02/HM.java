package com.class02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class HM extends CommonMethods {

	@BeforeClass
	public void setUp() {
		String url = "https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url);
		String urlTitle = driver.getTitle();
		String expected = "OrangeHRM";
		Assert.assertEquals(urlTitle, expected);
		System.out.println("Actual title matches with EXPECTED title");
	}

	@Test
	public void logIn() {
		sendText(driver.findElement(By.cssSelector("input#txtUsername")), "Admin");
		sendText(driver.findElement(By.id("txtPassword")), "admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		WebElement logInVerify = driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
		boolean resultOfLogIn = logInVerify.isDisplayed();
		Assert.assertTrue(resultOfLogIn);
		System.out.println("Log In was succeful!");
	}

	@Test(priority = 1)
	public void employeeAdd() {

		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		driver.findElement(By.name("btnAdd")).click();

	}

	@Test(priority = 2)
	public void employeeDetails() {

		sendText(driver.findElement(By.cssSelector("input#firstName")), "Jo");
		sendText(driver.findElement(By.name("lastName")), "Tribiani");
		driver.findElement(By.cssSelector("input#employeeId")).clear();
		sendText(driver.findElement(By.cssSelector("input#employeeId")), "00699");
		sendText(driver.findElement(By.id("photofile")), "C:\\Users\\Dzianis\\Desktop\\Dzi.jpg");
		driver.findElement(By.cssSelector("input#btnSave")).click();
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		driver.findElement(By.xpath("//a[text()='2']")).click();
	}

	@Test(priority = 3)
	public void employeeAddVerify() {
		List<WebElement> employeesR = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		String idExprcted = "00699";
		for (WebElement empR : employeesR) {
			String rowText = empR.getText();
			if (rowText.contains(idExprcted)) {
				System.out.println("Jo Tribiani is ADDED");
				break;
			}

		}
	}

	@AfterClass
	public void close() {
		driver.close();
	}
}

//	Identify Priority of Test Cases
//
//	TC 1: OrangeHRM Verify Successful Login
//	Step 1: Open browser and navigate to OrangeHRM
//	Step 2: Enter valid UID and valid PWD and click login button
//	Step 3: Verify user successfully logged in
//
//	TC 2: OrangeHRM Add Employee
//		Step 1: Click on PIM link and Add Employee
//		Step 2: Provide Details and Save
//		Step 3: Verify Employee is added 
//
//	TC 3: OrangeHRM Verify Employee Details
//		Step 1: Click on PIM link and Employee List
//		Step 2: Search for employee by it id
//		Step 3: Verify Employee details are displayed 
//
//	Note: Create BeforeClass and AfterClass annotations to open browser and logout from the application
//	Collapse
//
//
//
//	10:14 PM
//	@all please review this before next class
//	10:14 PM
//	Untitled 
//	Test case grouping in TestNG
//	Including and excluding groups
//	Dependencies in TestNG
