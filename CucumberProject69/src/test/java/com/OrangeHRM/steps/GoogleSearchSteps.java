package com.OrangeHRM.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchSteps {

	WebDriver driver;

	@Given("I navigated to the Google")
	public void i_navigated_to_the_Google() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://www.google.com/");
	}

	@When("I type search item")
	public void i_type_search_item() {
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("iphone");
	}

	@When("I click on search button")
	public void i_click_on_search_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
	}

	@Then("I see search result")
	public void i_see_search_result() {
		boolean verify = driver.findElement(By.xpath("//span[text()='See Apple iPhone Mobile Phones']")).isDisplayed();
		
		if (verify) {
			System.out.println("passed");
		} else {
			System.out.println("missed");
		}
		driver.close();
	}

}
