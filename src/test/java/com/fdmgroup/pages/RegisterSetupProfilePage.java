package com.fdmgroup.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.fdmgroup.util.AndroidActions;
import com.fdmgroup.util.BaseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterSetupProfilePage extends AndroidActions {
	AndroidDriver driver;
	public RegisterSetupProfilePage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text=\"Email Address\"]")
	private WebElement EmailTextBox;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Username\"]")
	private WebElement UsernameTextBox;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
	private WebElement PasswordTextBox;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Confirm Password\"]")
	private WebElement ConfirmPasswordTextBox;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Select an option.\"]")
	private WebElement SecurityQuestionDropdown;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"What is your pet's name?\"]")
	private WebElement PetNameOption;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Security Answer\"]")
	private WebElement SecurityAnswerTextBox;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Next\"]")
	private WebElement NextButton;
	
	
	
	public void setEmail(String email) {
		EmailTextBox.sendKeys(email);
	}
	
	public void setUsername(String username) {
		UsernameTextBox.sendKeys(username);
	}
	
	public void setPassword(String password) {
		PasswordTextBox.sendKeys(password);
	}
	
	public void setConfirmPassword(String password) {
		ConfirmPasswordTextBox.sendKeys(password);
	}
	
	public void selectSecurityQuestion() {
		SecurityQuestionDropdown.click();
		PetNameOption.click();
	}
	
	public void setSecurityAnswer(String answer) {
		SecurityAnswerTextBox.sendKeys(answer);
	}
	
	public void clickOnNextButton() {
		scrollToText("Next");
		NextButton.click();
	}
	
	
	
	
	
}
