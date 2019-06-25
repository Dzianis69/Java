package com.OrangeHRM.steps;

import org.junit.Assert;
import org.openqa.selenium.interactions.SendKeysAction;

import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;
import com.OrangeHRM.utils.BaseClass;
import com.OrangeHRM.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {
	LoginPage login;

	

	@Given("I see OrangeHrm Logo")
	public void i_see_OrangeHrm_Logo() {
		login = new LoginPage();
		boolean isDisplayed = login.logo.isDisplayed();
		Assert.assertTrue(isDisplayed);

	}

	@When("I enter enter user name and password")
	public void i_enter_enter_user_name_and_password() {
		sendText(login.userName, "Admin");
		sendText(login.password, "ICi@5KjPt8");

	}

	@When("I click login button")
	public void i_click_login_button() {
		click(login.loginBtn);
	}

	@Then("I successfully loged on")
	public void i_successfully_loged_on() {
		HomePage home = new HomePage();
		Assert.assertTrue(home.dashboardText.isDisplayed());
	}



	@When("I enter enter invalid user name and password")
	public void I_enter_enter_invalid_user_name_and_password() {
		sendText(login.userName, "Test");
		sendText(login.password, "Test123");
	}

	@Then("I see error message is displayed")
	public void I_see_error_message_is_displayed() {
		Assert.assertTrue(login.message.isDisplayed());
		String errorText = login.message.getText().trim();
		Assert.assertEquals("Invalid Credentials", errorText);
	}
}
