package com.class02;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class priorityExampleTwo2 extends CommonMethods {

	@BeforeClass
	public  void setUp() {
		setUpDriver("chrome", "https://www.saucedemo.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Swag Labs")) {
			System.out.println(" this is right title");
		} else {
			System.out.println("this is wrong title");
		}
	}

	@Test(priority =1)
	public  void logIn() {
		sendText(driver.findElement(By.cssSelector("input.form_input")), "standard_user");
		sendText(driver.findElement(By.cssSelector("input#password")), "secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Test(priority =2)
	public static void mainPage() {
		String actual = driver.findElement(By.xpath("//div[text()='Products']")).getText();
		String expected = "Products";
		if (expected.equals(actual)) {
			System.out.println("expected matches actual text");
		} else {
			System.out.println("expected DOES NOT match actual text");
		}

	}

	@AfterClass
	public static void close() {
		driver.close();
	}
}
