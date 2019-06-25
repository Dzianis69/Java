package com.OrangeHRM.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.utils.BaseClass;

public class AddEmployeePage extends BaseClass {

	@FindBy(id = "firstName")

	public WebElement firstName;

	@FindBy(id = "middleName")

	public WebElement middleName;

	@FindBy(id = "lastName")

	public WebElement lastName;

	@FindBy(id = "employeeId")

	public WebElement employeeId;

	@FindBy(xpath = "//div[@id='location_inputfileddiv']//input")

	public WebElement location;

	@FindBy(xpath = "//div[@id='location_inputfileddiv']//ul")

	public WebElement locationList;

	@FindBy(xpath = "//input[@id='chkLogin']")

	public WebElement createLoginDetails;

	@FindBy(id = "systemUserSaveBtn")

	public WebElement saveBtn;

	@FindBy(xpath = "//span[@id='pim.navbar.employeeName']")

	public WebElement empCheck;

	@FindBy(xpath = "//label[@for='hasLoginDetails']")
	public WebElement details;
	
	@FindBy(css = "input#username")
	public WebElement userName;
	
	@FindBy(css = "input#password")
	public WebElement pasword;
	
	@FindBy(css = "input#confirmPassword")
	public WebElement confPass;
	
	@FindBy(css = "select#essRoleId")
	public WebElement essRole;
	
	
	@FindBy(css = "select#supervisorRoleId")
	public WebElement supervisorRole;
	
	
	@FindBy(xpath="//form[@id='pimAddEmployeeForm']//label")

    public List<WebElement> addEmpLabels;

	

	public AddEmployeePage() {

		PageFactory.initElements(driver, this);

	}

}