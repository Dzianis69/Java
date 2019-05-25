package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://parabank.parasoft.com/parabank/register.htm;jsessionid=AAB2947740CC5719D94E7FCB012E7441");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.firstName")).sendKeys("Den");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.address.street")).sendKeys("255 79th");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.address.city")).sendKeys("new york");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.address.state")).sendKeys("NY");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("11209");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("3476342292");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.ssn")).sendKeys("1135511");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.username")).sendKeys("SexMachine");
		Thread.sleep(1000);
		driver.findElement(By.id("customer.password")).sendKeys("1135511");
		Thread.sleep(1000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("1135511");
		Thread.sleep(1000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
