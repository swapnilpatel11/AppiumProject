package com.fdmgroup.util;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.fdmgroup.pages.HomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public Properties   prop;
//	public HomePage homePage;

//	@BeforeMethod
	@BeforeClass (alwaysRun=true)
	public void ConfigureAppium() throws MalformedURLException, IOException {
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("C:\\Users\\Swapn\\eclipse-workspace\\AppiumProject\\src\\test\\java\\com\\fdmgroup\\util\\data.properties");
//		String ipAddress = System.getProperty("ipAddress")!=null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
//		System.out.println(ipAddress);
//		prop.load(fis);
		loadProperties();
		String ipAddress = prop.getProperty("ipAddress");
		String port = prop.getProperty("port");
		String deviceName = prop.getProperty("AndroidDeviceName");

		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\Swapn\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress(ipAddress).usingPort(Integer.parseInt(port)).build();

		service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(deviceName);
		options.setApp("C:\\Users\\Swapn\\eclipse-workspace\\AppiumProject\\src\\test\\java\\resources\\IDB Preview.apk");

		driver = new AndroidDriver(new URL("http://"+ipAddress+":"+port), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//homePage = new HomePage(driver);
	}
	public void loadProperties() {
       prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Swapn\\eclipse-workspace\\AppiumProject\\src\\test\\java\\resources\\data.properties");
            prop.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//	@AfterMethod
	@AfterClass (alwaysRun=true)
	public void tearDown() {
		driver.quit();
		service.stop(); // stop service
	}

}
