package com.OrangeHRM.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;

	public static void setUp() {
		ConfigReader.readProperty(ConstantReader.PROPERTIES_FILE_PATH);
		String browser = ConfigReader.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ConstantReader.WEB_DEIVER_PATH_CHROME);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ConstantReader.WEB_DEIVER_PATH_FIREFOX);
			driver = new FirefoxDriver();
		} else {
			System.err.println("Please set right browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();;

		driver.get(ConfigReader.getProperty("url"));
	}

	public static void tearDown() {

		driver.quit();

	}
}
