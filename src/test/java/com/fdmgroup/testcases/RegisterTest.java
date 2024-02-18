package com.fdmgroup.testcases;

import org.testng.annotations.Test;

import com.fdmgroup.pages.HomePage;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.pages.RegisterAddAddressPage;
import com.fdmgroup.pages.RegisterPersonalInfoPage;
import com.fdmgroup.pages.RegisterSetupProfilePage;
import com.fdmgroup.util.BaseTest;

public class RegisterTest extends BaseTest {
	
	
	@Test (groups = {"UserData"})
	public void RegisterUserTest() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		RegisterSetupProfilePage registerPage1 = new RegisterSetupProfilePage(driver);
		RegisterPersonalInfoPage registerPage2 = new RegisterPersonalInfoPage(driver);	
		RegisterAddAddressPage registerPage3 = new RegisterAddAddressPage(driver);
		
		homePage.clickOnLoginButton();
		loginPage.clickOnRegisterButton();
		registerPage1.setEmail(prop.getProperty("email") );
		registerPage1.setUsername(prop.getProperty("username"));
		registerPage1.setPassword(prop.getProperty("password"));
		registerPage1.setConfirmPassword(prop.getProperty("confirmPassword"));
		registerPage1.selectSecurityQuestion();
		registerPage1.setSecurityAnswer(prop.getProperty("securityAnswer"));
		registerPage1.clickOnNextButton();
		
		registerPage2.setFirstName(prop.getProperty("firstName"));
		registerPage2.setLastName(prop.getProperty("lastName"));
		registerPage2.setDOB();
		registerPage2.setMobileNumber(prop.getProperty("mobilenumber"));
		registerPage2.clickOnNextButton();
		
		registerPage3.setAddressline1(prop.getProperty("addLine1"));
		registerPage3.setAddressline2(prop.getProperty("addLine2"));
		registerPage3.setCity(prop.getProperty("city"));
		registerPage3.setProvince(prop.getProperty("province"));
		registerPage3.setPostalCode(prop.getProperty("postalcode"));
		registerPage3.clickOnFinish();
		
	}
	
}
