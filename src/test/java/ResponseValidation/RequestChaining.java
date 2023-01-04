package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChaining {

	@Test
	public void requestChainingTestGetAndDelete()
	{
		 baseURI="https://reqres.in/";
		//step1: create a pre requities
         
		//step2: send the request--------------1 api
		 Response resp = when()
                 .get("/api/users");
            //   .then().log().all();
          
		//step3: capture the response usinh json path
		 int id = resp.jsonPath().get("data[2].id");
		 System.out.println(id);
		//step4: provide the response variable to another request----2 api
		 when()
		   .delete("/api/users"+id)
		.then()
		   .assertThat().statusCode(204)
		   .log().all();
	}
}
