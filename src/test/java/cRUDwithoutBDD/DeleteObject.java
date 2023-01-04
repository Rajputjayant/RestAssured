package cRUDwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteObject {

	@Test
	public void deleteObject()
	{
		Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_2402");
		response.then().log().all();
		response.then().assertThat().statusCode(204);
	}
}
