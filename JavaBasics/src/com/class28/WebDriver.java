package com.class28;

/*
 * Create a WebDriver Interface that will have the following
 *  unimplemented behaviour: openBrowser(), closeBrowser(), 
 *  maximizeWindow(), findElement(). Create 2 classes that 
 *  implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
}

class ChromeDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Open");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Close");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize");

	}

	@Override
	public void findElement() {
		System.out.println("Find");

	}

}
class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Open Fire");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Fire");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize Fire");

	}

	@Override
	public void findElement() {
		System.out.println("Find Fire");

	}

}

