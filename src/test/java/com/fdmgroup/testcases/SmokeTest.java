package com.fdmgroup.testcases;

import org.testng.annotations.Test;

import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.util.BaseTest;

public class SmokeTest extends BaseTest{
	
	@Test
	public void LoginSmokeTest() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnLoginButton();		
	}
	
	@Test
	public void RegisterSmokeTest() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		homePage.clickOnLoginButton();
		loginPage.clickOnRegisterButton();		
	}
	
	
	

}
