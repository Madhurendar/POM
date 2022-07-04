package com.learnningautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() throws IOException {
		
		
		File Src = new File("./Config/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(Src);
			
			pro = new Properties();
			
			pro.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
	
		
	}
	}
	
	
	
	
   public String getBrowserName() {
		
	   
	   return pro.getProperty("Browser");
	}

   public String getStagingURL() {
	
	   
	   return pro.getProperty("URL");
}
   
   public String getRestURL() {
	   
	   return pro.getProperty("RestURL");
	   
}

}