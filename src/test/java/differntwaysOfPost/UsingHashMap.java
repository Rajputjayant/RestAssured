package differntwaysOfPost;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.testng.annotations.Test;

import genericUtility.JavaUtility;
import io.restassured.http.ContentType;

public class UsingHashMap extends JavaUtility {

	@Test
	public void operationPost()
	{
		HashMap jobj = new HashMap();
		jobj.put("createdBy", "Jayant97");
		jobj.put("projectName", "RedBussss"+getRandomNumber());
		jobj.put("status", "On Going");
		jobj.put("teamSize", 766);
		baseURI="http://localhost";
		port=8084;
		given()
		  .body(jobj)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		.then()
		  .log().all()
		  .assertThat().statusCode(201)
		  .assertThat().statusLine("HTTP/1.1 201 ");
	}
}

