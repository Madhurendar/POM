package com.learningautomation.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnningautomation.utility.BrowserFactory;
import com.learnningautomation.utility.ConfigDataProvider;
import com.learnningautomation.utility.ExcelDataProvider;

public class BaseClass {
	
	
	public WebDriver driver;
	public ExtentReports report ;
	public ExtentTest logger;
	public ExcelDataProvider ExcelReader ;
	public ConfigDataProvider Config;
	
	
	
	@BeforeSuite
	public void SetupSuite() throws IOException {
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/Mheducation.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		ExcelReader = new ExcelDataProvider();
		Config = new ConfigDataProvider();
		
		
		
	}
	
	
	@BeforeClass()
	public void startApplication() throws InterruptedException {
		
		driver =BrowserFactory.startApplication(driver,Config.getBrowserName() , Config.getStagingURL());
		

}

	@AfterClass
	public void tearDown() {
		BrowserFactory.teardown(driver);
		report.flush();
		
	}
	
}