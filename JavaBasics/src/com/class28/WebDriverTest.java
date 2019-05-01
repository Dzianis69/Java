package com.class28;

public class WebDriverTest {
	public static void main(String[] args) {
		WebDriver obj = new FirefoxDriver();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElement();
		obj.openBrowser();

		obj = new ChromeDriver();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElement();
		obj.openBrowser();
	}
}
