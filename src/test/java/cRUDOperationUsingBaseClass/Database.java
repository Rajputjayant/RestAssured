package cRUDOperationUsingBaseClass;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;




import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import genericUtility.BaseClasswithReqSpec;
import genericUtility.IPathConstant;

public class Database extends BaseClasswithReqSpec {

	@Test
	public void database() throws Throwable
	{
		//String alpha = alphabet();
		JSONObject js=new JSONObject();
		js.put("createdBy", "Arun");
		js.put("projectName", "Acer"+jLib.randomalphabet());
		js.put("status", "created");
		js.put("teamSize", 10);
		Response res=
	               given()
	                .spec(requestSpec)
	                 .body(js)
	
	.when()
	.post(IPathConstant.createProject);
	String expdata = rLib .getJsonData(res,"projectId") ;
	System.out.println(expdata);
	String query="select * from projects";
	
	String act=dLib.excuteQueryGetData(query, 1, expdata);
	
	Assert.assertEquals(expdata,act);
		
}
}


