package com.learningautomation.testcases;

import java.io.IOException;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.learningautomation.pages.BaseClass;
import com.learnningautomation.utility.GetBrokenlinks;

public class getBrokenlinksTest {
	
	public GetBrokenlinks brokenlink;

	
	
		public void getBrokenURL(WebDriver driver) throws URISyntaxException, IOException {
		
		brokenlink  = new GetBrokenlinks(driver);
		brokenlink.getBrokenlinkUseCase();
	}

}
