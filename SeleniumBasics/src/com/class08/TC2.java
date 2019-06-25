package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class TC2 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.linkText("Actions")).click();
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		//action.clickAndHold(drag).moveToElement(drop).release(drag).perform();
		Thread.sleep(3000);
		driver.close();

	}
}
/*
 * Task Two Ahead to http://uitestpractice.com/Students/Index Click on the
 * Actions Handle the drag and drop Close the browser
 * 
 */