package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.saucedemo.com/");
		/*Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("problem_user");;
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");;
		Thread.sleep(2000);
		driver.findElement(By.className("btn_action")).click();;
		Thread.sleep(2000);
		driver.quit();
		*/
		
		driver.navigate().to("http://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("deniska2-2008@mail.ru");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("aaa20101990den");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		//driver.quit();
		
	}

}
