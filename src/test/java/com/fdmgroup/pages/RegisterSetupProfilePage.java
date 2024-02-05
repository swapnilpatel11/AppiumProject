package com.fdmgroup.pages;

import org.openqa.selenium.WebElement;

import com.fdmgroup.util.BaseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterSetupProfilePage extends BaseTest {
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text=\"Email Address\"]")
	private WebElement EmailTextbox;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Username\"]")
	private WebElement PasswordTextbox;
	
	
	
	
	public RegisterSetupProfilePage(AndroidDriver driver) {
        super();
    }
}
