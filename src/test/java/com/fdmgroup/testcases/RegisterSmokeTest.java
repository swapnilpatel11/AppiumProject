package com.fdmgroup.testcases;

import org.testng.annotations.Test;

import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.util.BaseTest;

public class RegisterSmokeTest extends BaseTest{
	
	@Test (groups={"Smoke"})
	public void RegisterTest() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		homePage.clickOnLoginButton();
		loginPage.clickOnRegisterButton();		
	}
	

}
