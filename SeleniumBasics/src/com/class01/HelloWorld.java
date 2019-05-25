
package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

    public static void main(String[] args) {
      /*  System.setProperty("webdriver.chrome.driver", "\\Users\\Dzianis\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.get("http://facebook.com");
		driver.get("http://amazon.com");
		*/
    	
    	System.setProperty("webdriver.gecko.driver", "\\Users\\Dzianis\\Selenium\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
    	driver.get("http://facebook.com");
    	driver.get("http://amazon.com");
    }
}