package cRUDwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetallProjectTest {

	@Test
	public void get()
	{
//		RequestSpecification req = RestAssured.given();
//		 Response resp = req.get("http://localhost:8084/projects");
//		resp.then().log().all();
//		resp.then().assertThat().statusCode(200);
		
		Response resq = RestAssured.get("http://localhost:8084/projects");
		resq.then().log().all();
	}
}
