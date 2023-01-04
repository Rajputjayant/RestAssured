package crudOperationWithBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class DeleteOperationWithBDDTest {
  
	@Test
	public void deleteOperation()
	{
	   baseURI="http://localhost";
	   port=8084;
	   when()
	       .delete("/projects/TY_PROJ_604")
	   .then()
	       .assertThat().contentType(ContentType.JSON)
	       .assertThat().statusCode(204)
	       .log().all();
	}
}
