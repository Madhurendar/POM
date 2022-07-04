package com.learnningautomation.utility;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetBrokenlinks {


	 String  link ;
	 List<WebElement>  brokenlinks;
      WebDriver driver ;


	public  GetBrokenlinks(WebDriver driver) throws URISyntaxException, IOException {
		
		this.driver =  driver ;

		

	}

	public  void getBrokenlinkUseCase() throws IOException {
		
		brokenlinks = driver.findElements(By.tagName("a"));


		int size = brokenlinks.size();
		System.out.println(size);

		for (int i =0 ; i<size ;i++ ) {

			link =	brokenlinks.get(i).getAttribute("href");

			URL url = new URL(link);

			HttpURLConnection Connection = (HttpURLConnection) url.openConnection();

			Connection.connect();

			Connection.getResponseCode();

			int statuscode = Connection.getResponseCode();

			if (statuscode >=400 ) {
				System.out.println("Link is broken" + link );
			}else {
				System.out.println("Link is not broken"+link);
			}



		}



	}


}
