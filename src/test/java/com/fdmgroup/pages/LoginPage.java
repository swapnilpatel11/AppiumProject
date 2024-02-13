package com.fdmgroup.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.util.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends AndroidActions{
	AndroidDriver driver;

	public LoginPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Register\"]")
	private WebElement RegisterButton;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Username\"]")
	private WebElement UsernameField;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Password\"]")
	private WebElement PasswordField;
	
	@AndroidFindBy(accessibility="Login")
	private WebElement LoginButton;

	public void clickOnRegisterButton() {
		RegisterButton.click();
	}
	
	public void setUsername(String username) {
		UsernameField.sendKeys(username);
	}
	
	public void setPassword(String password) {
		PasswordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		LoginButton.click();
	}
	
}
