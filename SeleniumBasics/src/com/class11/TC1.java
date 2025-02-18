package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class TC1 extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");

		String file = "C:\\Users\\Dzianis\\Downloads\\132.PNG";
		driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(file);
		driver.findElement(By.cssSelector("button.gwt-Button")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		if (alertText.equals("File uploaded!")) {
			TakesScreenshot screen = (TakesScreenshot) driver;
			File pic = screen.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(pic, new File("screenshot/TheInternet/TC1.png"));
				System.out.println("screenshot is  taken");
			} catch (IOException e) {
				e.printStackTrace();
				
				System.out.println("screenshot is NOT taken");
			}
		} else {
			System.out.println("Pic is NOT uploaded");
		}
		driver.close();
	}

}
//TC 1: Upload file and Take Screenshot
//
//Navigate to �http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload�
//Upload file
//Verify file got successfully uploaded and take screenshot

//public class Task1 extends CommonMethods{
//	
//	static String expected="File uploaded!";
//	
//	public static void main(String[] args) {
//		String url="http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
//		setUpDriver("chrome",url);
//        
//		takeScreenshot("WebTool", "Login");
//		
//		String filePath="/Users/Syntax/Downloads/car.jpg";
//		driver.findElement(By.cssSelector("input.gwt-FileUpload")).sendKeys(filePath);
//		
//		takeScreenshot("WebTool", "Upload1");
//		
//        driver.findElement(By.cssSelector("button.gwt-Button")).click();
//        
//        String textActual=getAlertText();
//        
//        if (textActual.equals(expected)) {
//        	System.out.println("File is uploaded");
//        }else {
//        	System.out.println("File is NOT uploaded");
//        }
//        
//        acceptAlert();
//        
//        TakesScreenshot ts=(TakesScreenshot)driver;
//        File scr=ts.getScreenshotAs(OutputType.FILE);
//        
//        try {
//			FileUtils.copyFile(scr, new File("screenshots/WebTool/Upload.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("Unable to take screesnhot");
//		}
//        
//        driver.quit();
//	}
//}