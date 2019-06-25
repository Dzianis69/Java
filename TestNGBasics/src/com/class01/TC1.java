package com.class01;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class TC1 extends CommonMethods{

	@BeforeMethod
	public void setUp() {
		setUpDriver("chrome", "https://www.saucedemo.com/index.html");
		WebElement logo = driver.findElement(By.cssSelector("div.login_logo"));
		if(logo.isDisplayed()) {
			System.out.println("SwagLab is presented");
		}else {
			System.out.println("Logo is NOT verified");
		}
	}
	@Test
	public void logInAndProductsVerification() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		WebElement products = driver.findElement(By.xpath("//div[@class='product_label']"));
		if(products.isDisplayed()) {
			if(products.getText().equalsIgnoreCase("products")) {
			System.out.println("Products verified");
			}
		}else {
			System.out.println("Products is NOT verified");
		}
	}
	@AfterMethod
	public void logOutAndClose() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		//WebElement menu = driver.findElement(By.xpath("//button[text()='Open Menu']"));
		//wait.until(ExpectedConditions.visibilityOf(menu));
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		
		WebElement logOut = driver.findElement(By.cssSelector("a#logout_sidebar_link"));
		wait.until(ExpectedConditions.elementToBeClickable(logOut));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#logout_sidebar_link")));
		driver.findElement(By.cssSelector("a#logout_sidebar_link")).click();
		driver.close();
	}
	
}

	

//TC 1: Swag Lab Title and Login Verification
//
//@BeforeMethod should contain navigation to the URL and title verification
//
//@Test should contain steps to login and “Products” word verification
//
//@AfterMethod should logOut from the application and close the browser