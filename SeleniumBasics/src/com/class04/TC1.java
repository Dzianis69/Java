package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@data-testid,'royal_e')]")).sendKeys("denisbahovich@outlook.com");
		driver.findElement(By.xpath("//input[contains(@data-testid,'royal_p')]")).sendKeys("qwert12345");
		driver.findElement(By.xpath("//input[contains(@value,'Lo')]")).click();

	}

}
