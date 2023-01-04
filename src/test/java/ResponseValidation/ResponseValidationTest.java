package ResponseValidation;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ResponseValidationTest {
     
	@Test
	public void respBodyValidation()
	{
		String expData="leader";
		baseURI="https://reqres.in";
		//step1:create pre requities
		JSONObject jobj=new JSONObject();
		jobj.put("name", "morpheus");
		jobj.put("job", "leader");
		//Step2: send the request and capture the response
		Response resp = given()
		                  .body(jobj)
		                  .contentType(ContentType.JSON)
		                  .when()
		                   .post("/api/users");
		//write json path using jasonpath() and validate
		String actData = resp.jsonPath().get("job");
		System.out.println(actData);
		resp.then().log().all();
		Assert.assertEquals(expData, actData);// validating exp data with actual data
	}
}
