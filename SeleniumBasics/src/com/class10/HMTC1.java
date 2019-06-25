package com.class10;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class HMTC1 extends CommonMethods{

	public static void main(String[] args) {
		// 1-2
		setUpDriver("chrome", "https://jqueryui.com/");
		//3
		driver.findElement(By.linkText("Datepicker")).click();
		

	}

}
//1.
//Open chrome browser
//2.
//Go to “https://jqueryui.com/”
//3.
//Click on “Datepicker”
//4.
//Select August 10 of 2019
//5.
//Verify date “08/10/2019” has been entered succesfully
//6.
//Close browser