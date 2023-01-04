package ResponseValidation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class RequestChainings extends JavaUtility {

	@Test
	public void chaining()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Jay");
		jobj.put("projectName","Airnnfje");
		jobj.put("status", "Completed");
		jobj.put("teamSize", 19);
		 
	Response resp = given()
		     .body(jobj)
		     .contentType(ContentType.JSON)
	   .when()
	         .post("/addProject");
	     //  resp.then().log().all();
	  String projID = resp.jsonPath().get("projectId");
	    System.out.println(projID);
	    given()
	    .pathParam("projectId", projID)
		.when()
		.delete("projects/{projectId}")
		.then()
		.log()
		.all()
		.statusCode(204);

		
	}
}
