package com.fdmgroup.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	static ExtentReports extent;

	public static ExtentReports getReporterObject() {
		String path = System.getProperty("user.dir")+"//reports//index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Native App IDB Result");
		reporter.config().setDocumentTitle("Test Result");
		
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Swapnil Patel");
	
	//	extent.flush();
		return extent;
	}

}
