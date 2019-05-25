package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[contains(@type,'te')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[starts-with(@data-test,'p')]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[starts-with(@value,'L')]")).click();

	}

}
