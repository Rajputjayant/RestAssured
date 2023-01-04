package crudOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PutOperationUsingBody {

	@Test
	public void putOperation()
	{
		baseURI="http://localhost";
		port=8084;
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Dinesh");
		jobj.put("projectName", "Qspider");
		jobj.put("status", "On Going");
		jobj.put("teamSize", 143);
		
		given()
		 .contentType(ContentType.JSON)
		 .body(jobj)
		.when()
		   .put("projects/TY_PROJ_402")
	    .then()
	       .assertThat().statusCode(200)
	       .assertThat().contentType(ContentType.JSON)
	       .assertThat().statusLine("HTTP/1.1 200 ")
	       .log().all();
	      
		
		 
	}
}
