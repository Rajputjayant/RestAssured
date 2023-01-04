package differntwaysOfPost;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class operationPost {
    @Test
	public void uploadFile()
	{
		File file = new File(".\\src\\test\\resources\\Qsp.json");
		baseURI="http://localhost";
		port=8084;
		
		given()
		  .body(file)
		  .contentType(ContentType.JSON)
		  .when()
		  .post("/addProject")
		  .then()
		      .statusCode(201)
		    .log().all();
	}
}
