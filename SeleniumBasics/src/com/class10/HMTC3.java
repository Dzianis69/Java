package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class HMTC3 extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "http://uitestpractice.com/");
		WebElement el = driver.findElement(By.xpath("//a[text()='Form']"));
		click(el);
		el = driver.findElement(By.cssSelector("input#firstname"));
		sendText(el, "Dzianis");
		el = driver.findElement(By.cssSelector("input#lastname"));
		sendText(el, "Sky");
		List<WebElement> radio = driver.findElements(By.cssSelector("input[type='radio']"));
		radio(radio.get(0));
		List<WebElement> checkBox = driver.findElements(By.cssSelector("input[type='checkbox']"));
		checkBox(checkBox.get(1));
		WebElement country = driver.findElement(By.cssSelector("select#sel1"));
		selectValueFromDD(country, "Belarus");
		WebElement calendar = driver.findElement(By.cssSelector("input#datepicker"));
		click(calendar);
		sendText(calendar, "20/10/1990");
		WebElement phone = driver.findElement(By.cssSelector("input#phonenumber"));
		sendText(phone, "347634328");
		WebElement userName = driver.findElement(By.cssSelector("input#username"));
		sendText(userName, "Jonny");
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		sendText(email, "dzianis69@outlook.com");
		WebElement comment = driver.findElement(By.cssSelector("textarea#comment"));
		sendText(comment, "Nothing");
		WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));
		sendText(pass, "vhjbhjsbsvh");
		WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
		click(submit);
		Thread.sleep(3000);
		driver.quit();

	}
}
//TC 1: Users Application Form Fill
//1..
//Open chrome browser
//2.
//Go to “http://uitestpractice.com/”
//3.
//Click on “Forms” link
//4.
//Fill out the entire form
//5.
//Close the browser
//MUST USE Functions: 