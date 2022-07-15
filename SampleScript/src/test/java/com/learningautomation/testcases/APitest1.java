package com.learningautomation.testcases;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;




public class APitest1 {

public static void main(String[] args) {
		
	given()
	.param("name", "12")
	.auth().none().
	
	 when()
	.get("https://reqres.in/api/users").
	
	 then()
	 .statusCode(200)
     .body("total", equalTo(12)).and().body("page",equalTo(2));
	
	/*rep.getTime();
	rep.getTimeIn(TimeUnit.SECONDS);
	System.out.println(rep.time());
	rep.timeIn(TimeUnit.SECONDS); 
	System.out.println(rep.timeIn(TimeUnit.SECONDS));   */
}	
	
}
