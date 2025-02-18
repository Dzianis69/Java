package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.linkText("Select")).click();

		WebElement countries1 = driver.findElement(By.cssSelector("select#countriesSingle"));
		Select select = new Select(countries1);
		List<WebElement> country = select.getOptions();
		System.out.println(country.size());
		select.selectByVisibleText("United states of America");

		WebElement countries2 = driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select select1 = new Select(countries2);
		List<WebElement> country1 = select1.getOptions();
		System.out.println(country1.size());
		if (select1.isMultiple()) {
			for(int i = 0; i<country1.size();i++) {
				select1.selectByIndex(i);
			}
		}
		select1.deselectByVisibleText("China");

		Thread.sleep(3000);
		driver.quit();
	}

}
/*
 * TC 2: Select and Deselect values Open chrome browser Go to
 * �http://uitestpractice.com/� Click on �Select� tab Verify how many options
 * available in the first drop down and then select �United states of America�
 * Verify how many options available in the second drop down and then select
 * all. Deselect China from the second drop down Quit browser
 *
 *
 *
 *package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(�webdriver.chrome.driver�, �/Users/Syntax/Selenium/chromedriver�);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get(�http://uitestpractice.com/�);
        driver.findElement(By.linkText(�Select�)).click();
        //working with Single DD
        WebElement countriesDD=driver.findElement(By.id(�countriesSingle�));
    
        CommonMethods.selectValueFromDD(countriesDD, �United states of America�);
        
        //working with muplitple DD
        WebElement multDD=driver.findElement(By.cssSelector(�select#countriesMultiple�));
        Select select=new Select(multDD);
        List<WebElement> optionList=select.getOptions();
        int ddSize=optionList.size();
        System.out.println(�# of options in multiple countries dd=�+ddSize);
        // check if we can select multiple options
        if(select.isMultiple()) {
            for(int i=0; i<ddSize; i++) {
                select.selectByIndex(i);
                Thread.sleep(1000);
            }
            //another way
            for (WebElement option: optionList) {
                option.click();
                Thread.sleep(1000);
            }
        }    
        
        Thread.sleep(2000);
        driver.quit();
    }
}*/