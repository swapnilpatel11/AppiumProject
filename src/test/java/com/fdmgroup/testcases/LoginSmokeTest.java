package com.fdmgroup.testcases;

import org.testng.annotations.Test;

import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.util.BaseTest;

public class LoginSmokeTest extends BaseTest{
	
	@Test (groups={"Smoke"})
	public void LoginTest() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnLoginButton();		
	}
	
}
