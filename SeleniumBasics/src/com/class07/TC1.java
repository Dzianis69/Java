package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "\\Users\\Dzianis\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Switchto");
		/*
		 * 1 way
		
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.cssSelector("input#name")).sendKeys("Dzianis");
		2 way
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		 driver.switchTo().frame(frame);
		 driver.findElement(By.cssSelector("input#name")).sendKeys("Dzianis1");
		*/
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Booooo");
		//driver.close();
	}

}
