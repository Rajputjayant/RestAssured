package Assertion;


import org.testng.annotations.Test;

import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

import java.util.List;

public class GetOperationRequress {

	@Test
	public void getOpeartion()
	{
		String expd="charles.morris@reqres.in";
		 Response res = when()
		  .get("https://reqres.in/api/users");
//	   .then()
//		    .statusCode(200)
//		    .log().all();
		 List<Object> actd = res.jsonPath().get("data");
		 for (Object b : actd) 
		 {
			String data = b.toString();
			if(data.contains(expd))
			{
				System.out.println(data+"data matched");
				break;
			}
			
		 }
		  
	}
}
