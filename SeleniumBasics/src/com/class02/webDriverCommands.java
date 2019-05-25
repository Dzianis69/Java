package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("google")) {
			System.out.println("this is right title");
		} else {
			System.out.println("sorry it is not a title");
		}
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		String title2 = driver.getTitle();
		if (title2.equalsIgnoreCase("Facebook - Log In or Sign Up")) {
			System.out.println("this is right title");
		} else {
			System.out.println("sorry it is not a title");

		}
	}
}
