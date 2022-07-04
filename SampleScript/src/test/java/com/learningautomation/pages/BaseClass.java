package com.learningautomation.pages;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learningautomation.testcases.getBrokenlinksTest;
import com.learnningautomation.utility.BrowserFactory;
import com.learnningautomation.utility.ConfigDataProvider;
import com.learnningautomation.utility.ExcelDataProvider;
import com.learnningautomation.utility.GetBrokenlinks;
import com.learnningautomation.utility.RestAssuredTest;

public class BaseClass {
	
	
	public WebDriver driver;
	public ExtentReports report ;
	public ExtentTest logger;
	public ExcelDataProvider ExcelReader ;
	public ConfigDataProvider Config;
	public RestAssuredTest rest;
	public getBrokenlinksTest brokenlinks;
	
	
	
	
	
	@BeforeSuite
	public void SetupSuite() throws IOException, URISyntaxException {
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/Mheducation.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
	//	ExcelReader = new ExcelDataProvider();
		Config = new ConfigDataProvider();
		rest =new RestAssuredTest();
		brokenlinks =new getBrokenlinksTest();
			
		
	}
	
	
	@BeforeClass()
	public void startApplication() throws InterruptedException, URISyntaxException, IOException {
		
		
		
		driver =BrowserFactory.startApplication(driver,Config.getBrowserName() , Config.getStagingURL());
		
		

}

	@AfterClass
	public void tearDown() {
		BrowserFactory.teardown(driver);
		report.flush();
		
	}
	
}