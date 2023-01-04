package cRUDOperationUsingBaseClass;

import org.testng.annotations.Test;

import genericUtility.BaseClasswithReqSpec;
import genericUtility.IPathConstant;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetSingleProject extends BaseClasswithReqSpec {

	@Test
	public void getSingleProj() throws Throwable
	{
	  String projId = eLib.readDataFromExcel("Sheet2", 4, 0);
	  given()
	     .spec(requestSpec)
	     .pathParam("ID", projId)
	   .when()
	     .get(IPathConstant.getSingleProject+"{ID}")
	     .then()
	        .assertThat().contentType(ContentType.JSON)
	        .log().all();
	     
	}
}
