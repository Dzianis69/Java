package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	/*
	 * TC 2: Mercury Tours Registration: Open chrome browser Go to
	 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
	 * info Click Submit User successfully registered (Create 2 scripts using
	 * different locators)
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys("Denis");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("Bahovich");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("3476342228");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("denisbahovich@outlook.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1")).sendKeys("245 44th street");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("Brooklyn");
		Thread.sleep(1000);
		driver.findElement(By.name("state")).sendKeys("NY");
		Thread.sleep(1000);
		driver.findElement(By.name("postalCode")).sendKeys("11209");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("AKJAKJAHJAHAJ");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("qwert12345");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmPassword")).sendKeys("qwert12345");
		Thread.sleep(1000);
		driver.findElement(By.name("register")).click();

	}

}
