package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class TC1 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));

		WebElement el = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		if (el.isDisplayed() && el.getText().equalsIgnoreCase("Hello World!")) {
			;
			System.out.println("element with text “Hello World!” is displayed " + el.getText());
		} else {
			System.out.println("element with text “Hello World!'is  NOT displayed ");
		}
		driver.quit();
	}

}
//TC 1: Verify element is present
//Open chrome browser
//Go to “https://the-internet.herokuapp.com/”
//Click on “Click on the “Dynamic Loading” link
//Click on “Example 1...” and click on “Start”
//Verify element with text “Hello World!” is displayed
//Close the browser