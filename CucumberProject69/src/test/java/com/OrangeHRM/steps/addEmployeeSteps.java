package com.OrangeHRM.steps;

import org.junit.Assert;
import org.openqa.selenium.remote.html5.AddLocationContext;

import com.OrangeHRM.pages.AddEmployeePage;
import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;
import com.OrangeHRM.utils.CommonMethods;
import com.OrangeHRM.utils.ConfigReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class addEmployeeSteps extends CommonMethods {

	LoginPage login;
	HomePage home;
	AddEmployeePage addEmpl;

//	@Given("I navigate to OrangeHRM")
//	public void i_navigate_to_OrangeHRM() {
//		setUp();
//	}

	@Given("I logged into OrangeHrm")
	public void i_logged_into_OrangeHrm() {
		login = new LoginPage();
		login.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
	}

	@When("I click on PIM link")
	public void i_click_on_PIM_link() {
		home = new HomePage();
		home.PIM.click();

	}

	@When("I click on add employe link")
	public void i_click_on_add_employe_link() {

		home.addEmployee.click();
	}

	@When("I provide employee details {string} and {string} and {string} and {string}")
	public void i_provide_employee_details_and_and_and(String name, String mname, String lname, String location) {
		addEmpl = new AddEmployeePage();
		sendText(addEmpl.firstName, name);
		sendText(addEmpl.middleName, mname);
		sendText(addEmpl.lastName, lname);
		click(addEmpl.location);
		selectList(addEmpl.locationList, location);
	}

	@Then("I click on save buttun")
	public void i_click_on_save_buttun() throws InterruptedException {
		Thread.sleep(3000);
		click(addEmpl.saveBtn);
	}

	@Then("I see employe add successfully {string} and {string}")
	public void i_see_employe_add_successfully_and(String name, String lname) {
		waitForElementBeClickable(addEmpl.empCheck, 20);
		String result = addEmpl.empCheck.getText();
		Assert.assertEquals(result, name + " " + lname);
	}

//	@Then("I close browser")
//	public void i_close_browser() {
//		driver.close();
//	}
	@When("I provide firstname,midlename, lastname and location")
	public void i_provide_firstname_midlename_lastname_and_location() {
		addEmpl= new AddEmployeePage();
	    sendText(addEmpl.firstName, "David");
	    sendText(addEmpl.middleName,"spice");
	    sendText(addEmpl.lastName, "Beckham");
	    click(addEmpl.location);
	   selectList(addEmpl.locationList, "HQ");
	   
	}

	@When("I click on create login details")
	public void i_click_on_create_login_details() {
	   click(addEmpl.details);
		
		
	}// Write code here that turn

	@When("I provide all mandatory fields")
	public void i_provide_all_mandatory_fields()  {
		
	    addEmpl.userName.clear();
		sendText(addEmpl.userName, "vvianis1");
		addEmpl.pasword.clear();
	    sendText(addEmpl.pasword, "Dzianis13@@");
	    sendText(addEmpl.confPass, "Dzianis13@@");
	    click(addEmpl.essRole);
	    selectValueFromDD(addEmpl.essRole, "Default ESS");
	   click(addEmpl.supervisorRole);
	    selectValueFromDD(addEmpl.supervisorRole, "Default Supervisor");
	}

	@When("I click on save button")
	
	public void i_click_on_save_button() {
		waitForElementBeClickable(addEmpl.saveBtn,20);
		click(addEmpl.saveBtn);
	}

	@Then("I see employee is added successfully")
	public void i_see_employee_is_added_successfully() {
		waitForElementBeClickable(addEmpl.empCheck, 20);
		String result = addEmpl.empCheck.getText();
		Assert.assertEquals(result, "David Beckham");
	}

}
