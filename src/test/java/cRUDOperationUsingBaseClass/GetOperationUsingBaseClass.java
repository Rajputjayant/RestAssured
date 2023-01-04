package cRUDOperationUsingBaseClass;

import org.testng.annotations.Test;

import genericUtility.BaseClasswithReqSpec;
import genericUtility.IPathConstant;

import static io.restassured.RestAssured.*;

public class GetOperationUsingBaseClass extends BaseClasswithReqSpec {

	@Test
	public void getOperation()
	{
		given()
		   .spec(requestSpec)
		.when()
		   .get(IPathConstant.getProject)
		 .then()
		   .log().all().and().statusCode(200);
		
	}
}
