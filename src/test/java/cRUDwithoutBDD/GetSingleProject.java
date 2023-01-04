package cRUDwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetSingleProject {

	@Test
	public void singleProject()
	{
		Response resp = RestAssured.get("http://localhost:8084/projects/TY_PROJ_602");
		System.out.println(resp.contentType());
		System.out.println(resp.getSessionId());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getTime());
		System.out.println(resp.getDetailedCookies());
		resp.then().log().all();
		resp.then().assertThat().statusCode(200);
		resp.then().assertThat().contentType(ContentType.JSON);
		System.out.println(resp.prettyPeek());
		System.out.println(resp.prettyPrint());
		
	}
}
