package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TC2 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("Tester");
		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[id*='login']")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr[1]/th"));
		System.out.println(cols.size());

		String verName = "Susan McLaren";

          for(int i =1; i<=rows.size();i++){
	String rowText =  driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]")).getText();

				if (rowText.contains(verName)) {
					System.out.println(verName + " is Present");
					driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td[1]")).click();
					break;
				}
			}
		}

}


//TC 1: Table headers and rows verification
//1.Open chrome browser
//2.Go to 
//“http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
//3.Login to the application
//4.Verify customer “Susan McLaren” is present in the table
//5.Click on customer details
//6.Update customers last name 
//7.Verify updated customers name is displayed in table
//8.Close browser