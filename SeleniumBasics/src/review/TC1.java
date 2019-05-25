package review;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TC1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
		List<WebElement> list = driver.findElements(By.xpath("//input[contains(@id,'exp-')]"));

		for (WebElement eli : list) {
			eli.click();
			if (eli.isEnabled()) {
				eli.click();
			} else {
				System.out.println("WRONG " + eli);
			}
		}
		Thread.sleep(3000);
		Iterator<WebElement> it = list.iterator();
// if is Enabled to use
		while (it.hasNext()) {
			it.next().click();
	
		}
		Thread.sleep(3000);
		driver.close();
	}
	

}
