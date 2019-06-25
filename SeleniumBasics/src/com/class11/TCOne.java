package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.CommonMethods;

public class TCOne extends CommonMethods {

	public static void main(String[] args) {
		String url = "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload";
		setUpDriver("chrome", url);
		
		String filePath = "C:\\Users\\Dzianis\\Desktop\\picard-facepalm1.jpg";
		driver.findElement(By.cssSelector("input[type='file']")).sendKeys(filePath);
		driver.findElement(By.cssSelector("button[type='button']")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		if(alertText.equalsIgnoreCase("File Uploaded!")) {
			System.out.println("File is uploaded");
		}else {
			System.out.println("File is NOT uploaded");
		}
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		
		File file = screen.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file, new File ("screenshot/Selfscreen/1.png"));
		System.out.println("Screenshot is taken");
		}catch(IOException e) {
			System.out.println("Screenshot is NOT taken");
		}
		
		//driver.close();
		
	}

}
