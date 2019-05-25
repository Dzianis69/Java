package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nhl.com");
		System.out.println(driver.getTitle());
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
	}

}
