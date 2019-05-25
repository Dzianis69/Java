package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	/*
	 * Asel Umurzakova (Instructor) [11:57 AM] TC 1: Swag Labs Positive login: Open
	 * chrome browser Go to “https://www.saucedemo.com/” Enter valid username and
	 * valid password and click login Verify robot icon is displayed Verify
	 * “Products” text is available next to the robot icon
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		boolean logo = driver.findElement(By.xpath("//div[@class='peek']")).isDisplayed();
		if (logo) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is NOT displayed");
		}
		WebElement element = driver.findElement(By.xpath("//div[@class='product_label']"));
		String test = element.getText();
		if (test.equals("Products")) {
			System.out.println("Products text  is avalaible");
		} else {
			System.out.println("Products text  is NOT avalaible");

		}
	/*
	 * import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {

		String userName="standard_user";
		String password="secret_sauce";
		
		System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com/");
		//login to the application
		driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys(password);
		driver.findElement(By.xpath("//input[starts-with(@value,'LOGI')]")).click();
		//logo verification
		boolean logo=driver.findElement(By.cssSelector("div.peek")).isDisplayed();
		
		if (logo) {
			System.out.println("Robot logo is displayed");
		}else {
			System.out.println("Robot logo is NOT displayed");
		}
		//verify product text
		WebElement product=driver.findElement(By.cssSelector("div.product_label"));
		boolean displayP=product.isDisplayed();
		String productText=product.getText();
		
		String expectedText="Products";
		
		if (displayP && productText.equals(expectedText)) {
			System.out.println("Element is displayed and texts is "+productText);
		}else {
			System.out.println("Element is NOT displayed OR textis NOT="+productText);
		}
		
		
	}
}
	 */
	}
}

