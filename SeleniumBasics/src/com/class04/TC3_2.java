package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_2 {
	/*
	 * TC 1: Mercury Tours Registration: Open chrome browser Go to
	 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
	 * info Click Submit User successfully registered
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();;
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Brad");
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys("Marchand");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("3321234532");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("AssHole");
		driver.findElement(By.cssSelector("input[name*='dress1']")).sendKeys("244 78th street");
		driver.findElement(By.cssSelector("input[name*='city']")).sendKeys("New York");
		driver.findElement(By.cssSelector("input[name$='ate']")).sendKeys("New York");
		driver.findElement(By.cssSelector("input[name*='post']")).sendKeys("11209");
		driver.findElement(By.cssSelector("select[name]")).sendKeys("BELARUS");
		driver.findElement(By.cssSelector("input#email")).sendKeys("GFgfgfg@gmail.com");
		driver.findElement(By.cssSelector("input[name^='password']")).sendKeys("qwert12345");
		driver.findElement(By.cssSelector("input[name*='Password']")).sendKeys("qwert12345");
		driver.findElement(By.cssSelector("input[type^='i']")).click();

	}
}
