package cRUDwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutOperation extends JavaUtility{

	@Test
	public void putOperation()
	{
		JSONObject jobj = new JSONObject();
		jobj.put( "createdBy" ,"Dinesh");
		jobj.put( "projectName", "IndianRailway"+getRandomNumber());
		jobj.put("status", "Not Completed");
		jobj.put( "teamSize", 234);
		
		RequestSpecification resSpec = RestAssured.given();
		resSpec.body(jobj);
		resSpec.contentType(ContentType.JSON);
		Response resp= resSpec.put("http://localhost:8084/projects/TY_PROJ_405");
		//validation
		System.out.println(resp.getContentType());
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
		resp.then().assertThat().contentType(ContentType.JSON);
		
	}
}
