package crudOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostOperationAssertionResponseBody {

	@Test
	public void assertionBodyPost()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Arun");
		jobj.put("projectName", "Selenium");
		jobj.put("status", "Completed");
		jobj.put("teamSize", 143);
		  
	   
	}

	
}
