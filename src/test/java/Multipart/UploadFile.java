package Multipart;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class UploadFile {

	@Test
	public void multipartOperation()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Akash");
		jobj.put("projectName", "java");
		jobj.put("status", "on-going");
		jobj.put("teamSize", 14);
		
		File f = new File("./uploadphoto.png");
	//	given()
	//	  .body(jobj)
		//  .contentType(ContentType.JSON)
		  
		  
	}
}
