package ResponseValidation;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetAllResponseValidation {

	@Test
	public void getAllUsers()
	{
		String expData="eve.holt@reqres.in";
		baseURI="https://reqres.in";
		
		Response resp = when()
		                  .get("/api/users");
	                     	//  .then().log().all();
		List<Object> actData = resp.jsonPath().get("data");
		for (Object d : actData) 
		{
			String data = d.toString();
			if (data.contains(expData)) 
			{
				System.out.println(data+"data matched");
				break;
			} 
			else 
			{
                System.out.println("data not matched");
			}
			
		}
	}
}
