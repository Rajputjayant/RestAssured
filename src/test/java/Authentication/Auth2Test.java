package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Auth2Test {

	@Test
	public void auth()
	{
	  Response resp = given()
			           .formParam("client_id", "sdet433")
			           .formParam("client_secret","4892084f56ee5e0c9eda9d1dff0f02cb")
			           .formParam("grant_type", "client_credentials")
			           .formParam("redirect_uri", "https://jayant.com")
//			         
			           
			   .when()
			   .post("http://coop.apps.symfonycasts.com/token");
	     System.out.println(resp);
		 String token = resp.jsonPath().get("access_token");
		 given()
	 		.auth().oauth2(token)
	 		.pathParam("USER_ID", 4158)
	 .when()
	 		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
	 	.then().log().all();	
			           
			           
                       		           
			           
	}
}
