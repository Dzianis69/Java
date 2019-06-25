package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class HMTC2 extends CommonMethods {

	public static void main(String[] args) {
//1
		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Order']")).click();
// 2
		driver.findElement(By.cssSelector("input[id*='Quantity']")).sendKeys("69");
		driver.findElement(By.cssSelector("input[id*='Name']")).sendKeys("Jo Tribiani");
		driver.findElement(By.cssSelector("input[id*='Box2']")).sendKeys("123 broadway");
		driver.findElement(By.cssSelector("input[id*='Box3']")).sendKeys("New York");
		driver.findElement(By.cssSelector("input[id*='Box4']")).sendKeys("New York");
		driver.findElement(By.cssSelector("input[id*='Box5']")).sendKeys("10001");
		List<WebElement> card = driver.findElements(By.cssSelector("input[type='radio']"));
		radio(card.get(1));
		driver.findElement(By.cssSelector("input[id*='Box6']")).sendKeys("1000111122223333");
		driver.findElement(By.cssSelector("input[id*='Box1']")).sendKeys("10/10");
		driver.findElement(By.cssSelector("a[id*='InsertButton']")).click();
//3
		driver.findElement(By.xpath("//a[text()='View all orders']")).click();

// 4

		boolean joIsDisp = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[2]"))
				.isDisplayed();

		if (joIsDisp) {
			String joTribiani = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[2]"))
					.getText();
			System.out.println(joTribiani + " is HERE !!!");
		} else {
			System.out.println("Jo Tribiani is NOT displayed.");
		}
// 5
		driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[13]")).click();
//6
		System.out.println(
				"Quanity is " + driver.findElement(By.cssSelector("input[id*='Quantity']")).getAttribute("value"));
		System.out.println("Name is " + driver.findElement(By.cssSelector("input[id*='Name']")).getAttribute("value"));
		System.out
				.println("Street is " + driver.findElement(By.cssSelector("input[id*='Box2']")).getAttribute("value"));
		System.out.println("City is " + driver.findElement(By.cssSelector("input[id*='Box3']")).getAttribute("value"));
		System.out.println("State is " + driver.findElement(By.cssSelector("input[id*='Box4']")).getAttribute("value"));
		System.out.println("ZIP is " + driver.findElement(By.cssSelector("input[id*='Box5']")).getAttribute("value"));
		System.out.println("Card Number TYPE is "
				+ driver.findElement(By.cssSelector("input[value='MasterCard']")).getAttribute("value"));
		System.out.println(
				"Card Number is " + driver.findElement(By.cssSelector("input[id*='Box6']")).getAttribute("value"));
		System.out.println(
				" EXP Card Number is " + driver.findElement(By.cssSelector("input[id*='Box1']")).getAttribute("value"));
//7
		driver.findElement(By.cssSelector("input[id*='Box2']")).clear();
		driver.findElement(By.cssSelector("input[id*='Box2']")).sendKeys("69 5th ave");
		driver.findElement(By.linkText("Update")).click();

// 8
		String newAddress = "69 5th ave";
		if (joIsDisp) {
			String joNewAddres = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[6]"))
					.getText();
			if (joNewAddres.equalsIgnoreCase(newAddress)) {
				System.out.println("Addres is update " + joNewAddres);
			} else {
				System.out.println("Address is NOT update!!!");
			}
		} else {
			System.out.println("Jo Tribiani is NOT displayed.");
		}
// 9
		driver.close();
	}

}
//1.
//Open browser and go to 
//“http://secure.smartbearsoftware.com/samples/testcomplete11WebOrders/login.aspx”
//2.
//Login to the application
//3.
//Create an Order
//4.
//Verify order of that person is displayed in the table “List of All 
//Orders”
//5.
//Click on edit of that specific order
//6.
//Verify each order details
//7.
//Update street address
//8.
//Verify in the table that street has been updated
//9.
//Close browser