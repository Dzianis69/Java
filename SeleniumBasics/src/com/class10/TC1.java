package com.class10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TC1 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println(rows.size());

		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		System.out.println(cols.size());
for (WebElement r : rows) {
	System.out.println(r.getText());
}
System.out.println("-------------");
		for (WebElement col : cols) {
			System.out.print(col.getText()+" // ");
		}
System.out.println("------------------------");
		Iterator<WebElement> it = cols.iterator();
		while (it.hasNext()) {
			String text = it.next().getText();
			System.out.print(text);
		}
		driver.close();
	}

}
//TC 1: Table headers and rows verification
//
//Open chrome browser
//Go to “https://the-internet.herokuapp.com/”
//Click on “Click on the “Sortable Data Tables” link
//Verify tables consist of 4 rows and 6 columns
//Print name of all column headers
//Print data of all rows