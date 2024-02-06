package com.fdmgroup.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.util.AndroidActions;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DummyLogin extends AndroidActions {
	AndroidDriver driver;

	public DummyLogin(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Username\"]")
	private WebElement usernameField;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
	private WebElement passwordField;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Register\"]")
	private WebElement RegisterButton;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Login\"])[2]")
	private WebElement LoginButton;
	
	public void setUsername(String username) {
		usernameField.sendKeys(username);
	}
	
	public void setPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		LoginButton.click();
	}
	
	public void setActivity() {
		Activity activity = new Activity("com.anonymous.bankingappreactnative","com.anonymous.bankingappreactnative.MainActivity"); 
		driver.startActivity(activity);
	}
//	public void setActivity() {
//		Activity activity = new Activity("com.anonymous.bankingappreactnative","com.anonymous.bankingappreactnative.MainActivity"); 
//		 driver.currentActivity();
//	}
	
//	public void setActivity() { 
//		 Activity activity = new Activity("com.anonymous.bankingappreactnative","com.anonymous.bankingappreactnative.MainActivity");
//		 driver.startActivity(activity);
//	
//	}
	
}
