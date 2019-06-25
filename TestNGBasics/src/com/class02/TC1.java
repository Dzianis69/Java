package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class TC1 extends CommonMethods {
	@BeforeMethod
	public void navigation() {
		setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
//		boolean title = driver.findElement(By.cssSelector("div#divLogo")).isEnabled();
//		if (title) {
//			WebElement titleEl = driver.findElement(By.cssSelector("div#divLogo"));
//			System.out.println("Title is valid and it is " + titleEl.getAttribute("value"));
//		} else {
//			System.out.println("Titel is NOT VALID");
//		}
	}

	@Test(priority = 1)
	public void titleValidation() {

		String title = driver.getTitle();
		if (title.equals("OrangeHRM")) {
			System.out.println("Title is valid and it is " + title);
		} else {
			System.out.println("Title is NOT valid and it is " + title);
		}
	}

	@Test(priority = 2)
	public void logIn() throws InterruptedException {

		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Submit']")).submit();
	}

//	@Test(priority = 3)
//	public static void logInVerefication() {
//		WebElement logInPage = driver.findElement(By.cssSelector("div#branding"));
//		boolean logInPageVer = logInPage.isDisplayed();
//		if (logInPageVer || logInPage.isEnabled()) {
//			System.out.println("Log In is verified");
//		} else {
//			System.out.println("Log In is verified");
//		}
//	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}
//TC 1: OrangeHRM Title Validation
//
//TC 2: OrangeHRM Successful Login 
//https://opensource-demo.orangehrmlive.com/
//Please make sure to use the following:
// annotations:
//	@BeforeMethod
//	@AfterMethod
//	@Test
//
//What would you do if you do not want to execute any specific test case?
//What would you do if you want to execute any specific test case first?
//
//
//public class SmartbearsoftwareExample  extends CommonMethods {

//	@BeforeClass
//
//	public void setUp() {
//
//		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//
//	}
//
//	@Test(priority = 1)
//
//	public void loginScreenTitle() {
//
//		String loginScreenTitle = driver.getTitle();
//
//		String exptitle = "Web Orders Login";
//
//		if (loginScreenTitle.equals(exptitle)) {
//
//			System.out.println("this is the right title");
//
//		}
//
//		else {
//
//			System.out.println("this is the wrong  title");
//
//		}
//
//	}
//
//	@Test(priority = 2)
//
//	public void login() {
//
//		sendText(driver.findElement(By.xpath("//input[contains(@id,'username')]")), "Tester");
//
//		sendText(driver.findElement(By.xpath("//input[contains(@id,'password')]")), "test");
//
//		driver.findElement(By.xpath("//input[contains(@id,'login_button')]")).click();
//
//	}
//
//	@Test(priority = 3)
//
//	public void webOrders() {
//
//		WebElement webOrderTitle = driver.findElement(By.xpath("//h1[text()='Web Orders']"));
//
//		if (webOrderTitle.isDisplayed()) {
//
//			System.out.println("webOrderTitle is Displayed");
//
//		}
//
//		else {
//
//			System.out.println("webOrderTitle is not Displayed");
//
//		}
//
//	}
//
//	@AfterClass
//
//	public void closed() {
//
//		driver.close();
//
//	}
//
//}
