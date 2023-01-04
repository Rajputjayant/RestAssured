package reqresCRUDOperation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUser {

	public static void main(String[] args) {
		//step1:create pre requities
		
		//step2: send the request
		Response resp = RestAssured.get("https://reqres.in/api/users");
		//step3:validate the response
		ValidatableResponse val = resp.then();
		val.log().all();
	}
}
