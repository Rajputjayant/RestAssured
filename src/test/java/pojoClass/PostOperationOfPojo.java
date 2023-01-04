package pojoClass;

import org.testng.annotations.Test;

import Pojo.PostAddProject;
import Pojo.ProjectAddPojo;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostOperationOfPojo extends PostAddProject {

	@Test
	public void postOperationPojo()
	{
//		baseURI="http://localhost";
//		port=8084;
//	   
//		 given()
//		   .body(poj)
//		   .contentType(ContentType.JSON)
//		   .when()
//		    .post("/addProject")
//		    .then()
//		      .assertThat().contentType(ContentType.JSON)
//		      .assertThat().statusCode(201)
//		      .log().all();
		   
				
	}
}
