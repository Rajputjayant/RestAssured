package cRUDwithoutBDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddNewProject extends JavaUtility {

	@Test
	public void addNewProject()
	{
		//create json body using json simple
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Jayant12");
		jobj.put("projectName", "TestYantra1"+getRandomNumber());
		jobj.put("status", "On Going");
		jobj.put("teamSize", 544);
		
		//Pre request  for the request
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.body(jobj);
		reqSpec.contentType(ContentType.JSON);
		
		//Action
		Response response = reqSpec.post("http://localhost:8084/addProject");
		
		//validation
		System.out.println(response.getContentType());
		System.out.println(response.getSessionId());
		System.out.println(response.getTime());
		
		response.then().log().all();
		response.then().assertThat().statusCode(201);
		response.then().assertThat().contentType(ContentType.JSON);
	}
}
