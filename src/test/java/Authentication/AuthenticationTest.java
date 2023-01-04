package Authentication;

import org.testng.annotations.Test;

import genericUtility.JavaUtility;


import static io.restassured.RestAssured.*;

public class AuthenticationTest extends JavaUtility {

	@Test
	public void preamtiveAuth()
	{
	   given()
	       .auth().preemptive().basic("rmgyantra", "rmgy@9999")
	   .when()
	       .get("/projects/TY_PROJ_602")
	   .then()
	       .assertThat().statusCode(200)
	       .log().all();
	}
	
//	@Test
//	public void digestiveAuth(){
//			given()
//					.auth().digest("rmgyantra", "rmgy@9999")
//			.when()
//					.get("http://localhost:8084/login")
//			.then()
//					.assertThat().log().all();
//					
//	}
}
