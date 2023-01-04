package reqressCRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

public class CreateUserTest {

	@Test
	public void createUser()
	{
		//step1:create pre requities
//		JSONObject jobj=new JSONObject();
//		jobj.put("name", "morpheus");
//		jobj.put("job", "leader");
		
//		HashMap obj = new HashMap();
//		obj.put("name", "morpheus");
//		obj.put("job", "leader");

		File obj = new File(".\\src\\test\\resources\\Data.json");
		//Step2: send the request
		given()
		   .body(obj)
		   .contentType(ContentType.JSON)
		 .when()
		   .post("https://reqres.in/api/users")
		 .then()
		    .assertThat().statusCode(201)
		    .log().all();
		//Step3:validate the response
	}
}
