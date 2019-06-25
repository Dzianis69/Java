package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.syntax.utils.BaseClass;

public class addLocationPage extends BaseClass{

	@FindBy(xpath="//i[text()='add']")
	WebElement addLoc;
	
	
	

	
	
}

//Test Case: Add Location
//1. Login to OrangeHRM
//2. From Admin --> Organization select Locations
//3. Add 5 different locations by providing complete required details (Use data provider)
//4. Save location and verify it has been successfully saved.