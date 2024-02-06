package com.fdmgroup.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fdmgroup.pages.DummyLogin;
import com.fdmgroup.pages.HomePage;
import com.fdmgroup.util.BaseTest;

public class DummyTest extends BaseTest{
	
	@BeforeMethod
	public void initial() {
		HomePage home = new HomePage(driver);
		//DummyLogin login = new DummyLogin(driver);
	//	login.setActivity();
		home.clickOnLoginButton();
	}
	
	@Test (dataProvider = "getData")
	public void LoginTest(String username, String password) {
		DummyLogin login = new DummyLogin(driver);
		
		login.setUsername(username);
		login.setPassword(password);
	}
	
	 // Same like scenario outline to pass multiple data for login to test
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {{"swapnil","fdm@12345"},{"Rinkal","fdm@12345"},{"Rahulan","123445"}};
	}

}
