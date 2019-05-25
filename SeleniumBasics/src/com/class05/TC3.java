package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {
	/*
	 * TC 1: Amazon link count: Open chrome browser Go to “https://www.amazon.com/”
	 * Using Iterator get text of each link Get number of links that has text
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> link = links.iterator();
		int count = 0;
		while (link.hasNext()) {
			String text = link.next().getText();
			if (!text.isEmpty()) {
				count++;
			}
		}
		System.out.println("There are " + count + " links with text on amazon.com");
		driver.quit();
		/*
		 * public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Syntax/Selenium/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.com/");
		//capture all links
		List <WebElement> links=driver.findElements(By.tagName("a"));
		int count=0;
		
		Iterator<WebElement> linksIt=links.iterator();
		while(linksIt.hasNext()) {
			String linkText=linksIt.next().getText();
			if (!linkText.isEmpty()) {
				System.out.println(linkText);
				count++;
			}
		}
		System.out.println("Total # of links with text "+count);
		driver.quit();
	}
}
		 */
	}

}
