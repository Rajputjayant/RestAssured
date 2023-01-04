package cRUDwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddNewProjects extends JavaUtility {

	@Test
	public void addNewProjects()
	{
		//create json body using json simple
				JSONObject jobj = new JSONObject();
				jobj.put("createdBy", "Jayant");
				jobj.put("projectName", "TestYantra12"+getRandomNumber());
				jobj.put("status", "On Going");
				jobj.put("teamSize", 5);
				
				//Pre request  for the request
				RequestSpecification reqSpec = RestAssured.given();
				reqSpec.body(jobj);
				reqSpec.contentType(ContentType.JSON);
				Response response = reqSpec.post("http://localhost:8084/addProject");
				System.out.println(response.contentType());
				System.out.println(response.getSessionId());
				System.out.println(response.getStatusCode());
				System.out.println(response.getTime());
				System.out.println(response.getDetailedCookies());
				response.then().assertThat().statusCode(201);
				response.then().log().all();
				response.then().assertThat().contentType(ContentType.JSON);
				
				
	}
}
