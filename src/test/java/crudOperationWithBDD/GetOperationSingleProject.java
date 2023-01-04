package crudOperationWithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetOperationSingleProject {

	@Test
	public void operationGetSingleProject()
	{
		baseURI="http://localhost";
		port=8084;
		
		when()
		   .get("http://localhost:8084/projects/TY_PROJ_604")
		.then()
		   .log().all()
		   .assertThat().statusCode(200)
		   .assertThat().contentType(ContentType.JSON)
		   .assertThat().statusLine("HTTP/1.1 200 ");
		   
	}
}
