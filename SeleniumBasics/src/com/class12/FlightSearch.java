package com.class12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

/* TC 12356 - search flight verification
 * Step 1: navigate to URL
 * Step 2: enter details
 * Step 3 verify search is successful
 */

public class FlightSearch extends CommonMethods {

	String browser = "chrome";
	String url = "https://www.aa.com/homePage.do";

	@BeforeMethod
	public void setUp() {
		setUpDriver(browser, url);
	}

	@Test
	public void searchFlight() throws InterruptedException {
		// enter to and from
		sendText(driver.findElement(By.name("originAirport")), "DCA");
		sendText(driver.findElement(By.name("destinationAirport")), "JFK");
		// click on calendar icon
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']/following-sibling::button")).click();
		// grab element that holds month & year
		WebElement depMonth = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));

		while (!depMonth.getText().contains("October")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			// if we wont perform this action we will get
			// StaleElementReferenceException: stale element reference: element is not
			// attached to the page document
			depMonth = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));
		}
		// capturing all cell and then loop and search for specific date
		List<WebElement> depCells = driver
				.findElements(By.xpath("//div[contains(@class, 'group-first')]/table/tbody/tr/td"));
		for (WebElement cell : depCells) {
			if (cell.getText().equals("18")) {
				cell.click();
				break;
			}
		}

		driver.findElement(By.xpath("//input[@id='aa-returningFrom']/following-sibling::button")).click();
		WebElement arriveDate = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));
		
			
		 while (!arriveDate.getText().contains("December")) {
			 driver.findElement(By.xpath("//a[@title='Next']")).click();
				arriveDate = driver.findElement(By.xpath("//div[contains(@class, 'ui-corner-left')]/div"));
		 }

		List<WebElement> arriveCell = driver
				.findElements(By.xpath("//div[contains(@class,'group-last')]/table/tbody/tr/td"));
		for (WebElement ar : arriveCell) {
			if (ar.getText().equals("24")) {
				ar.click();
				break;
			}
		}
		System.out.println(driver.findElement(By.cssSelector("input#aa-returningFrom")).getAttribute("value"));

	}

//	
//	@AfterMethod
//	public void quit() {
//		driver.quit();
//	}

}
