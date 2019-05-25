package review;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class TC2 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "http://facebook.com");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Paolo");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bagio");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("ilonadzamagarova@outlook.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("zaqwsxcde");
		driver.findElement(By.id("month")).click();
		Select select =new Select( driver.findElement(By.id("month")));
		select.selectByVisibleText("Oct");
		select = new Select(driver.findElement(By.cssSelector("select#day")));
		select.selectByIndex(19);
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1969");
		driver.findElement(By.cssSelector("input[value='2']")).click();
	}

}
