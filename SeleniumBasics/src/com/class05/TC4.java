package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {
	/*
	 * Check all Years of Experience radio buttons are clickable
	 * ----------------------------------------------- Check all Automation Tools
	 * checkboxes are clickable and keep “Selenium WebDriver” option as selected
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		WebElement element = driver.findElement(By.cssSelector("label.control-label"));
		System.out.println(element.isEnabled());
		System.out.println(element.isDisplayed());
		System.out.println(element.isSelected());
		List<WebElement> exp = driver.findElements(By.name("exp"));
		for (WebElement expY : exp) {
			if (expY.isEnabled()) {
				expY.click();

			}
		}

	

		List<WebElement> tools = driver.findElements(By.name("tool"));
		System.out.println(tools.size());
		String expextedTool = "Selenium WebDriver";
		for (WebElement tool : tools) {
			if (tool.isEnabled()) {
				tool.click();
				if (!tool.getAttribute("value").equals(expextedTool)) {
					tool.click();
				}
			}

		}
		
	}

}
