package reqresCRUDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest {

	@Test
	public void createUser()
	{
		//  1. create pre requisites -body
		JSONObject jobj =new JSONObject();
		jobj.put("name", "morpheus");
		jobj.put("job", "leader");
		//  2. send the request
		RequestSpecification request = RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		Response Res = request.post("https://reqres.in/api/users");
		//  3. validate the response
		System.out.println(Res.getStatusCode());
//		System.out.println(Res.asString());
//		Res.prettyPrint();
//		Res.prettyPeek();
		ValidatableResponse response = Res.then();
		response.log().all();
	}
}
