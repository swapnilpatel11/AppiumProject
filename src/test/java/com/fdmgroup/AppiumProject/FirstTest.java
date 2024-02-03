package com.fdmgroup.AppiumProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.fdmgroup.util.BaseTest;

import io.appium.java_client.AppiumBy;

public class FirstTest extends BaseTest {
	
	@Test
	public void registerUser() {
		
		// Home Page
	//	driver.findElement(By.xpath("//android.widget.TextView[@text=\"LOGIN/REGISTER\"]")).click();
		
		driver.findElement(AppiumBy.accessibilityId(", LOGIN/REGISTER")).click();
		
		// Login Page
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Register\"]")).click();
		
		// Register Page - Setup Profile
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Email Address\"]")).sendKeys("abc123@abc.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Username\"]")).sendKeys("abc12345");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Password\"]")).sendKeys("Abc@12345");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Confirm Password\"]")).sendKeys("Abc@12345");
		
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Select an option.\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"What is your pet's name?\"]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Security Answer\"]")).sendKeys("abcd");
		
		// scroll 
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Next\"));"));
		
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		// Register Page - Add Personal Info
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"First Name\"]")).sendKeys("Abc");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Last Name\"]")).sendKeys("abcd");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Date of Birth\"]")).click();
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Mobile Number\"]")).sendKeys("12345678901");
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		// Register - Add Address
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Address\"]")).sendKeys("130 Adelaide St W");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Address Line 2\"]")).sendKeys("2100");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"City\"]")).sendKeys("Toronto");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Province (Ex. ON)\"]")).sendKeys("ON");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Postal Code\"]")).sendKeys("L6W1A1");
		driver.findElement(AppiumBy.accessibilityId("Finish")).click();
		
	}

}
