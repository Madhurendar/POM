package com.learningautomation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver ;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="login-email") WebElement  email ;
	@FindBy(id="login-password") WebElement  Password;
	@FindBy(id="login-submit-btn") WebElement Login;
	
	
	public void enterEmail(String remail) {
		
		email.sendKeys(remail);
		
	}
	
   public void enterPassword(String rPass) {
		
	   Password.sendKeys(rPass);
		
	}

   public void Submit() 
   {
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	   wait.until(ExpectedConditions.visibilityOf(Login));
	   
	   Login.click();
	
}
	
	
	
}