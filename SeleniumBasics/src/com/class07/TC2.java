package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.CommonMethods;

public class TC2 extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		//driver.findElement(By.cssSelector("a[text()='Git Log']")).click();
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		boolean verify = driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if(verify==true) {
			System.out.println("Verified");
			driver.switchTo().defaultContent();
			driver.quit();
		}else {
			System.out.println("WRONG");
		}
//driver.close();
		// driver.switchTo().frame("IF1");
		// driver.findElement(By.xpath("")).

	}

}
/*
 * TC 1: ToolsQA Frame verification Open chrome browser Go to
 * �https://www.toolsqa.com/iframe-practice-page/� Click on �Blogs� link inside
 * first frame Verify element �Interactions� is present in second frame Navigate
 * to Home Page Quit browser CommonMethods.setUpDriver("chrome",
 * "https://www.toolsqa.com/iframe-practice-page/");
 * driver.switchTo().frame("IF1");
 * driver.findElement(By.xpath("//a[text()='Git Log']")).click();
 * driver.switchTo().defaultContent(); driver.switchTo().frame(1); boolean inter
 * = driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
 * if(inter==true) { driver.switchTo().defaultContent(); driver.close(); }
 * 
 */