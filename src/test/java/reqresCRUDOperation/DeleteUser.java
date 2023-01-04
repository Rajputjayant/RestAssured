package reqresCRUDOperation;

import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteUser {

	@Test
	public void deleteUser()
	{
		//Step1: create pre requities
		//Step2: send the request
		Response resp = RestAssured.delete("https://reqres.in/api/users/2");
		//Step3:validate the response
		resp.then().log().all();
	}
}
