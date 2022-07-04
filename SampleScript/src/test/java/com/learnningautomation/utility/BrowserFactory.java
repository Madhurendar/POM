package com.learnningautomation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	
	
	
	public static WebDriver startApplication(WebDriver ldriver , String browserName, String URL) {
		
		
		if(browserName.contains("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			ldriver = new ChromeDriver();
			
		}
		else if (browserName.contains("FireFox")){
			
			WebDriverManager.chromedriver().setup();
		    ldriver = new FirefoxDriver();
			
			
			
		}
		else if (browserName.contains("IE")) {
				
			
			WebDriverManager.chromedriver().setup();
			ldriver = new InternetExplorerDriver();
	}
		
		else {
			System.out.println("We do not support other browser");
		
		}
		
		
		ldriver.get(URL);
		ldriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		ldriver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		ldriver.manage().window().maximize();
		
		return ldriver;
		
		
}
	
	public static void teardown(WebDriver ldriver) {
	
		ldriver.quit();
	}
}