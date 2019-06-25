package com.class04;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class tourExample extends CommonMethods {
	@BeforeTest(groups = "smoke")
	public void setUp() {
		String url = "http://newtours.demoaut.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
	}

	@Test(groups = "Regression")
	public void contactinfo() {
		sendText(driver.findElement(By.cssSelector("input[name='firstName']")), "NameTest");
		sendText(driver.findElement(By.cssSelector("input[name='lastName']")), "lastNameTest");
		sendText(driver.findElement(By.cssSelector("input[name='phone']")), "phoneTes");
		sendText(driver.findElement(By.cssSelector("input[name='userName']")), "userTest");

	}

	@Test(groups = { "smoke", "Regression" })
	public void maılıngınfo() {
		sendText(driver.findElement(By.cssSelector("input[name='address1']")), "NameTest");
		sendText(driver.findElement(By.cssSelector("input[name='city']")), "lastNameTest");
		sendText(driver.findElement(By.cssSelector("input[name='state']")), "phoneTes");
		sendText(driver.findElement(By.cssSelector("input[name='postalCode']")), "userTest");

	}

	@Test(groups = "smoke")
	public void userInformation() {
		sendText(driver.findElement(By.cssSelector("input#email")), "mustafa");
		sendText(driver.findElement(By.cssSelector("input[name='password']")), "Bahar");
		sendText(driver.findElement(By.cssSelector("input[name='confirmPassword']")), "Bahar");
		driver.findElement(By.cssSelector("input[name='register']")).click();
	}

	@AfterTest(groups = "Regression")
	public void teardown() {
		driver.close();
	}
}