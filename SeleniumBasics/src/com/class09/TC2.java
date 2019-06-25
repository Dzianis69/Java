package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class TC2 extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add']")));
		WebElement add = driver.findElement(By.xpath("//button[text()='Add']"));
		add.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

		WebElement text = driver.findElement(By.id("message"));
		String expectedText = "It's back!";

		if (text.getText().equalsIgnoreCase(expectedText)) {
			System.out.println("Text " + text.getText() + " is present");
		} else {
			System.out.println("Text " + text.getText() + " is NOT present");

		}

		driver.quit();

	}

}
//TC 2: Verify element is clickable
//1.
//Open chrome browser
//2.
//Go to “https://the-internet.herokuapp.com/”
//3.
//Click on “Click on the “Dynamic Controls” link
//4.
//Select checkbox and click Remove
//5.
//Click on Add button and verify “It's back!” text is displayed
//6.
//Close the browser