package com.learningautomation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learningautomation.pages.BaseClass;

import io.restassured.response.ResponseBody;

public class RestAssuredtestcase extends BaseClass{



	@Test
	public void getstatusCodeforRestURL() {


		rest.getStatusCode();
		rest.getCompleteBody();


	}

}
