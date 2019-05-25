package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		driver.findElement(By.xpath("//button[contains(@onclick,\"Confirm\")]")).click();
		Alert confAlert = driver.switchTo().alert();
		
		confAlert.dismiss();
		driver.findElement(By.xpath("//button[starts-with(@onclick,'myP')]")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("jufhdgsjhgfhsgf");
	
		promptAlert.accept();
		Thread.sleep(7000);
		
		driver.quit();

	}

}
/*
TC 1: JavaScript alert text verification
Open chrome browser
Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
Verify
alert box with text “I am an alert box!” is present
confirm box with text “Press a button!” is present
prompt box with text “Please enter your name” is present
Quit browser
*/