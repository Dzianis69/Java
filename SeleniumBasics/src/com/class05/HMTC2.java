package com.class05;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMTC2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		WebElement month = driver.findElement(By.id("month"));
		Select obj = new Select(month);
		List<WebElement> months = obj.getOptions();
		System.out.println(months.size() + " is size of month");

		WebElement days = driver.findElement(By.id("day"));
		Select obj1 = new Select(days);
		List<WebElement> day = obj1.getOptions();
		System.out.println(day.size());

		WebElement years = driver.findElement(By.id("year"));
		Select obj2 = new Select(years);
		List<WebElement> year = obj2.getOptions();
		System.out.println(year.size());

		obj.selectByIndex(10);
		obj1.selectByIndex(20);
		obj2.selectByVisibleText("1990");

		Thread.sleep(3000);
		driver.quit();
	}

}

/*
 * TC 1: Facebook dropdown verification Open chrome browser Go to
 * “https://www.facebook.com” Verify: month dd has 12 month options day dd has
 * 31 day options year dd has 115 year options Select your date of birth Quit
 * browser
 */
