package Assertion;


import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;

import static io.restassured.RestAssured.*;

import java.util.regex.Matcher;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class PostOperationAssertionResponseBody extends JavaUtility {
	
	@Test
	public void assertionBodyPost()
	{
		String r = randomalphabet();
		String expd="Selenium"+r;
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Arun");
		jobj.put("projectName", "Selenium"+r);
		jobj.put("status", "Completed");
		jobj.put("teamSize", 143);
		
	             Response resp = given()
				   .body(jobj)
				   .contentType(ContentType.JSON)
				.when()
				  .post("/addProject");
	             
	         //   .then()
	            //  .body("projectName",Matchers.equalTo(expd));
	            
	            String actd = resp.jsonPath().get("projectName");
	            System.out.println(actd);
	            
	          System.out.println( resp.getStatusCode());
	           resp.getContentType();
	           
	           Assert.assertEquals(actd, expd);
	      //    resp.then().log().all();
	           resp.prettyPrint();
	           resp.then().log().body();
	           
	
		        
	}

}
