package com.fdmgroup.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.appium.java_client.AppiumDriver;

public class AppiumUtils {
	
	public String getScreenshotPath(String testcaseName, AppiumDriver driver) throws IOException {
		// 1. Capture and place in folder
		// Take screenshot as File we have various format as well
		File source = driver.getScreenshotAs(OutputType.FILE);
		// Coping screenshot to local destination
		String destinationFile = System.getProperty("user.dir")+"//reports//"+testcaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
		
		
		// 2. extent report pick file and attach to report
	}
	
}
