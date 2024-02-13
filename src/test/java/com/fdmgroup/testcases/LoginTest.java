package com.fdmgroup.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.pages.UserHomePage;
import com.fdmgroup.util.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test
	public void LoginUser() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		UserHomePage userHomepage = new UserHomePage(driver);
		
		homePage.clickOnLoginButton();
		loginPage.setUsername(prop.getProperty("username"));
		loginPage.setPassword(prop.getProperty("password"));
		loginPage.clickOnLoginButton();
		Assert.assertEquals(userHomepage.welcomeText(),prop.getProperty("welcomeText"));
	}
	
	
	
	
	
}
