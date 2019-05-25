package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("denisbahovich@outlook.com");
		driver.findElement(By.name("pass")).sendKeys("qwert12345");
		driver.findElement(By.partialLinkText("Forgot")).click();;
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.id("u_0_2")).click();
	}

}
