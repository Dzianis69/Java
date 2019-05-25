package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
/*
 * TC 2: Swag Labs Negative login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter invalid username and password and click login
Verify error message contains: “Username and password do not match any user in this service”
 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("ffdgdddd");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[type='submit']")).submit();
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3"));
		String message = element.getText();
		if(message.contains("Username and password do not match any user in this service")) {
			System.out.println("Error message contains "+message);
		}else {
		System.out.println("Error message DOES NOT contain "+message);
		}
		driver.quit();
	}

}
