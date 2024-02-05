package com.fdmgroup.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.util.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends AndroidActions {
	AndroidDriver driver;

	// Need to create constructor for give knowledge about driver
	public HomePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); // Constructor will be call first when we call
																			// it from object
	}
	
	// Locators 
//	@AndroidFindBy(id = "your_id")
//	@AndroidFindBy(className = "your_class")
//	@AndroidFindBy(xpath = "your_xpath")
//	@AndroidFindBy(accessibility = "your_accessibility_id")
//	@AndroidFindBy(uiAutomator = "your_ui_automator_expression")

	@AndroidFindBy(accessibility = ", LOGIN/REGISTER")
	private WebElement LoginRegisterButton;

	public void clickOnLoginButton() {
		LoginRegisterButton.click();
	}

}
