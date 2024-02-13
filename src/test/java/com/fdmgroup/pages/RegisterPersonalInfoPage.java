package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.util.AndroidActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterPersonalInfoPage extends AndroidActions {
	AndroidDriver driver;

	public RegisterPersonalInfoPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text=\"First Name\"]")
	private WebElement FirstNameTextbox;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text=\"Last Name\"]")
	private WebElement LastNameTextbox;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Date of Birth\"]")
	private WebElement DateOfBirth;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=\"Mobile Number\"]")
	private WebElement MobileNumberField;
	
	@AndroidFindBy(id = "android:id/button1")
	private WebElement clickOkayDOB;
	
	@AndroidFindBy(accessibility="Next")
	private WebElement NextButton;
	
	public void setFirstName(String firstName) {
		FirstNameTextbox.sendKeys(firstName);
	}
	public void setLastName(String lastName) {
		LastNameTextbox.sendKeys(lastName);
	}
	
	public void setDOB() {
		DateOfBirth.click();
		clickOkayDOB.click();
	}
	
	public void setMobileNumber(String number) {
		MobileNumberField.sendKeys(number);
	}
	
	public void clickOnNextButton() {
		NextButton.click();
	}
	
	

}
