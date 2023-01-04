package reqresCRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUpateTest {

	@Test
	public void updateUser()
	{
		//step1:create pre requities
		JSONObject jobj = new JSONObject();
		jobj.put("name", "morpheus");
		jobj.put("job", "zion resident");
		//step2:send the resquest
		RequestSpecification respSpec = RestAssured.given();
		respSpec.body(jobj);
		respSpec.contentType(ContentType.JSON);
		Response response = respSpec.put("https://reqres.in/api/users/2");
		//step3:validate the response
	    System.out.println(response.getStatusCode());
		response.asString();
		ValidatableResponse val = response.then();
		val.assertThat().log().all();
		val.statusCode(200);
		
		
	}
}
