package com.syntax.testcases;

import org.testng.annotations.Test;

import com.syntax.pages.LoginPage;

import com.syntax.utils.BaseClass;

import com.syntax.utils.CommonMethods;

public class LoginPageTest extends BaseClass {

	@Test

	public void loginToOrangeHRM() {

		LoginPage login = new LoginPage();

		CommonMethods.sendText(login.username, "Admin");

		CommonMethods.sendText(login.password, "ICi@5KjPt8");

		CommonMethods.click(login.btnLogin);

	}

}
