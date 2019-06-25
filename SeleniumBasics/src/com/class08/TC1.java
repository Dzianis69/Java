package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class TC1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setUpDriver("firefox", " http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		driver.findElement(By.name("click")).click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		Actions action = new Actions(driver);

		action.doubleClick(driver.findElement(By.xpath("//button[text()='Double Click Me !']"))).perform();
		alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
/*
 * Task One Ahead to http://uitestpractice.com/Students/Index Click on the
 * Actions Click on the click me ! Handle the alert and click okay Double Click
 * Double Click Me ! Handle the alert and click okay Close the browser
 * 
 */