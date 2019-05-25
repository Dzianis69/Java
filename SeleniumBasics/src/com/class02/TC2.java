package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.http.Syntax;

public class TC2 {
	/*
	 * TC 2: Syntax Page URL Verification: Open chrome browser Navigate to
	 * “https://www.syntaxtechs.com/” Navigate to “https://www.google.com/” Navigate
	 * back to Syntax Technologies Page Refresh current page Verify url contains
	 * “Syntax”
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.syntaxtechs.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		String url = driver.getTitle();

		if (url.contains("Syntax")) {
			System.out.println("url contains Syntax");
		} else {
			System.out.println("url does not contain Syntax");
		}
		driver.close();
	}

}
