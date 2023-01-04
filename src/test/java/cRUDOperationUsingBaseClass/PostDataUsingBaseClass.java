package cRUDOperationUsingBaseClass;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.BaseClasswithReqSpec;
import genericUtility.IPathConstant;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostDataUsingBaseClass extends BaseClasswithReqSpec {

	@Test
	public void postOperation()
	{  
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Ramu");
		jobj.put("projectName", "RedCar"+jLib.randomnumber());
		jobj.put("status", "Not Completed");
		jobj.put("teamSize", 420);
		
		given()
		  .spec(requestSpec)
		  .body(jobj)
		//  .contentType(ContentType.JSON)
		  .when()
		     .post(IPathConstant.createProject)
		  .then()
		    .log().all()
		    .and().statusCode(201);
		   // .statusLine("HTTP/1.1 201");
	}
}
