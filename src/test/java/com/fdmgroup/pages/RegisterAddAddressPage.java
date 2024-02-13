package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.util.AndroidActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterAddAddressPage extends AndroidActions{
	AndroidDriver driver;

	public RegisterAddAddressPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text=\"Address\"]" )
	private WebElement addressLine1Field;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text=\"Address Line 2\"]" )
	private WebElement addressLine2Field;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text=\"City\"]" )
	private WebElement cityField;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Province (Ex. ON)\"]")
	private WebElement provinceField;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Postal Code\"]")
	private WebElement postalCodeField;
	
	@AndroidFindBy(accessibility ="Finish")
	private WebElement finishButton;
	
	public void setAddressline1(String addline1) {
		addressLine1Field.sendKeys(addline1);
	}
	
	public void setAddressline2(String addLine2) {
		addressLine2Field.sendKeys(addLine2);
	}
	
	public void setCity(String city) {
		cityField.sendKeys(city);
	}
	
	public void setProvince(String province) {
		provinceField.sendKeys(province);
	}
	
	public void setPostalCode(String postalCode) {
		postalCodeField.sendKeys(postalCode);
	}
	
	public void clickOnFinish() {
		finishButton.click();
	}
	

}
