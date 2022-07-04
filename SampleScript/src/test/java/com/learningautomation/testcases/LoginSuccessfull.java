package com.learningautomation.testcases;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.learningautomation.pages.BaseClass;
import com.learningautomation.pages.Login;
import com.learnningautomation.utility.BrowserFactory;
import com.learnningautomation.utility.GetBrokenlinks;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSuccessfull  extends BaseClass{


	Login Lp;

	@Test(priority=1 , alwaysRun = true)
	public void LoginSuccessfull() throws InterruptedException, IOException, URISyntaxException {

		logger = report.createTest("Login Successfull for Mhe");
		Lp = new Login(driver);
		logger.info("enter email");
		Lp.enterEmail("madhurendar.ins@mheqa.com");
		Thread.sleep(10000);
		logger.info("enter password");
		Lp.enterPassword("Qa@123456");	
		logger.info("submit");
		Lp.Submit();	
		logger.pass("Login done ");
		brokenlinks.getBrokenURL(driver);
		

	}




}

