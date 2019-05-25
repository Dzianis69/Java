package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	/*
	 * TC 1: Amazon Page Title Verification: Open chrome browser Go to
	 * “https://www.amazon.com/” Verify Title “Amazon.com: Online Shopping for
	 * Electronics, Apparel, Computers, Books, DVDs & more” is displayed
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.amazon.com");
		System.out.println(driver.getTitle());
		String title = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
			System.out.println("Title is verified : "+title);
		}else {
		System.out.println("Title is not correct");
		}
		driver.close();
	}

}
