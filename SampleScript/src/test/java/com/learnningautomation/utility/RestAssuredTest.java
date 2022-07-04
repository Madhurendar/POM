package com.learnningautomation.utility;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class RestAssuredTest {

	
	
	Response rep;
	@Test

	public void getStatusCode() {

	   rep= RestAssured.get("https://reqres.in/api/users?page=2");
		
		int code = rep.getStatusCode();

		System.out.println("status code is  "+code);
	}

	
	@Test

	public void getCompleteBody() {
		
        rep= RestAssured.get("https://reqres.in/api/users?page=1");
		String completeBody = rep.asString();
		int code = rep.getStatusCode();
		
		System.out.println("status code is  "+code);
		System.out.println("Complete body is  "+completeBody);
	}

}


