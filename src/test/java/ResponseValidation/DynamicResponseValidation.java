package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import genericUtility.JavaUtility;


import static io.restassured.RestAssured.*;

public class DynamicResponseValidation extends JavaUtility {

	@Test
	public void dynamicValidation()
	{
	   when()
	       .get("/projects")
	       .then()
	       .log().body()
	       //.assertThat().body(("[1].projectName"), Matchers.equalTo("Sdet44"))
	       .body("projectName", Matchers.hasItems("Delhi","Sdet44","wb"));
	       
	
	}
}
