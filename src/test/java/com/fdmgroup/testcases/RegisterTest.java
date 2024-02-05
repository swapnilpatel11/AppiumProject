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
		personalInfoPage.setEmail("abc123@abc.com");
		personalInfoPage.setUsername("abc12345");
		personalInfoPage.setPassword("Abc@12345");
		personalInfoPage.setConfirmPassword("Abc@12345");
		personalInfoPage.selectSecurityQuestion();
		personalInfoPage.setSecurityAnswer("abcd");
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
