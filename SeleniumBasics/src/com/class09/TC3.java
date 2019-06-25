package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class TC3 extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p#message")));
		WebElement text = driver.findElement(By.cssSelector("input[style='width: 30%;']"));
		if(text.isDisplayed()) {
			System.out.println(text.getAttribute("value"));
			System.out.println("verified  is present");
		}else {
			System.out.println("NOT verifid");
		}
		driver.quit();
	}

}
//TC 3: Verify element is enabled
//1.
//Open chrome browser
//2.
//Go to “https://the-internet.herokuapp.com/”
//3.
//Click on “Click on the “Dynamic Controls” link
//4.
//Click on enable button
//5.
//Enter “Hello” and verify text is entered successfully
//6.
//Close the browser


/*public class Task3 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		
		String text="Dynamic Controls";
		driver.findElement(By.linkText(text)).click();
		
		String buttonXpath="//button[text()='Enable']";
		driver.findElement(By.xpath(buttonXpath)).click();
		
		//1 way
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
//		
//		String textToEnter="Sunday";
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textToEnter);
//		
//		String returnedText=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
//		//compare entered and returned text
//		if (returnedText.equals(textToEnter)) {
//			System.out.println("Text is entered");
//		}else {
//			System.out.println("Text "+textToEnter+" is NOT entered");
//		}
		
		//2way
		//identify the element and then pass it to the exp conditions
		WebElement el=driver.findElement(By.xpath("//input[@type='text']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(el));
		
		String textToEnter="Hi";
		el.sendKeys(textToEnter);
		
		String value=el.getAttribute("value");
		System.out.println(value);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
*/