package reqressCRUDOperationWithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllUserTest {

	@Test
	 public void getAllUsers()
	 {
		baseURI="https://reqres.in";
		//step1:create pre requities
		
		//Step2: send the request
		when()
		    .get("/api/users")
		.then()
		     .log().all();
		
		//Step3:validate the response
	 }
}
