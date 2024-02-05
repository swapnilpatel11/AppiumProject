package com.fdmgroup.pages;

import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.util.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterAddAddressPage extends AndroidActions{
	AndroidDriver driver;

	public RegisterAddAddressPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	

}
