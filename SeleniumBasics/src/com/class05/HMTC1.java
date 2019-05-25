package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMTC1 {
	/*
	 * TC 1: Tools QA check all elements Open chrome browser Go to
	 * “https://www.toolsqa.com/automation-practice-form/” Fill out: First Name Last
	 * Name Check that sex radio buttons are enabled and select “Male” Check all
	 * Years of Experience radio buttons are clickable Date Select both checkboxes
	 * for profession Check all Automation Tools checkboxes are clickable and keep
	 * “Selenium WebDriver” option as selected Quit browser
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");

		driver.findElement(By.name("firstname")).sendKeys("Adolf");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Putin");

		List<WebElement> element = driver.findElements(By.name("sex"));
		System.out.println(element.size());
		for (WebElement sex : element) {
			if (sex.isEnabled()) {
				sex.click();
			}
		}
		driver.findElement(By.xpath("//input[@value='Male']")).click();

		List<WebElement> years = driver.findElements(By.name("exp"));
		System.out.println(years.size());

		for (WebElement year : years) {
			if (year.isEnabled()) {
				year.click();
			} else {
				System.out.println("Yaer button is not clickeble " + year);
			}
		}
		driver.findElement(By.id("datepicker")).sendKeys("11/22/1969");

		List<WebElement> prof = driver.findElements(By.name("profession"));
		System.out.println(prof.size());

		for (WebElement pro : prof) {
			if (pro.isEnabled()) {
				pro.click();
			} else {
				System.out.println(pro + " is not clickble");
			}
		}

		List<WebElement> tools = driver.findElements(By.name("tool"));
		System.out.println(tools.size());
		String s = "Selenium Webdriver";
		for (WebElement tool : tools) {
			if (tool.isEnabled()) {
				tool.click();
				if (!tool.getAttribute("value").equals(s)) {
					tool.click();
				}
			} else {
				System.out.println(tool + " is Not click click");
			}
		}

		Thread.sleep(3000);
		driver.close();
	}

}
