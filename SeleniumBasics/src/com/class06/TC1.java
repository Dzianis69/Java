package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		

		WebElement departmentDD = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(departmentDD);
		List<WebElement> departmentsDD = select.getOptions();
		System.out.println(departmentsDD.size());
		for (WebElement dep : departmentsDD) {
			System.out.println(dep.getText());
		}
		select.selectByVisibleText("Computers");
		driver.close();
	}

}
/*
 * TC 1: Amazon Department List Verification Open chrome browser Go to
 * “http://amazon.com/” Verify how many department options available. Print each
 * department Select Computers Quit browser
 */
