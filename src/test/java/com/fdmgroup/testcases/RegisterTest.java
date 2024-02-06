package com.fdmgroup.testcases;

import org.testng.annotations.Test;

import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.pages.RegisterPersonalInfoPage;
import com.fdmgroup.util.BaseTest;

public class RegisterTest extends BaseTest {
	
	
	@Test (groups = "All")
	public void RegisterUserTest() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		RegisterPersonalInfoPage personalInfoPage = new RegisterPersonalInfoPage(driver);
		
		
		homePage.clickOnLoginButton();
		loginPage.clickOnRegisterButton();
		personalInfoPage.setEmail(prop.getProperty("email") );
		personalInfoPage.setUsername(prop.getProperty("username"));
		personalInfoPage.setPassword(prop.getProperty("password"));
		personalInfoPage.setConfirmPassword(prop.getProperty("confirmPassword"));
		personalInfoPage.selectSecurityQuestion();
		personalInfoPage.setSecurityAnswer(prop.getProperty("securityAnswer"));
		personalInfoPage.clickOnNextButton();
		
	}
	
	@Test (groups = "Smoke")
	public void LoginSmokeTest() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnLoginButton();		
	}
	
	@Test (groups = "Regression")
	public void RegisterSmokeTest() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		homePage.clickOnLoginButton();
		loginPage.clickOnRegisterButton();		
	}
	
}
