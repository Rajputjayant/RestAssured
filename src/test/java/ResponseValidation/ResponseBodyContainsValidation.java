package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;

import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

import static io.restassured.RestAssured.*;

public class ResponseBodyContainsValidation extends JavaUtility  {

	@Test
	public void validDation()
	{
		Response resp=when()
				        .get("/projects")
				       .then()
				          .statusCode(200)
				          .log().body()
				          .extract().response();
	 String st = resp.asString();
	 Assert.assertEquals(st.contains("3"), true );
	}
}
