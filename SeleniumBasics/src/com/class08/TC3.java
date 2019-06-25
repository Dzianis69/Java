package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class TC3 extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("firefox", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement one = driver.findElement(By.name("one"));
		WebElement two = driver.findElement(By.name("two"));
		WebElement three = driver.findElement(By.name("three"));
		WebElement four = driver.findElement(By.name("four"));
		Actions action = new Actions(driver);
		action.moveToElement(one).clickAndHold().moveToElement(two).clickAndHold().moveToElement(three).clickAndHold()
				.moveToElement(four).build().perform();
		
		driver.quit();
		
	}

}

/*
 * Task Three Ahead to http://uitestpractice.com/Students/Index Click on the
 * Actions Click and hold on 1,2,3,4 boxes Close the browser
 * 
 */