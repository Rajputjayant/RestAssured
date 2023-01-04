package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pojo.PostAddProject;
import genericUtility.ExcelUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectUsingExcel extends PostAddProject {

	@Test(dataProvider = "Jayant")
	public void addProjectExcel(String createdBy,String projectName,String status, String teamSize)
	{
		baseURI="http://localhost";
		port=8084;
		PostAddProject po=new PostAddProject(createdBy,projectName,status,teamSize);
		given()
		 .body(po)
		 .contentType(ContentType.JSON)
		 .when()
		   .post("/addProject")
		   .then()
//		   .assertThat().statusCode(201)
		   .contentType(ContentType.JSON)
		   .log().all();
		 
	}
	
	@DataProvider(name="Jayant")
	public Object[][] getData() throws Throwable
	{
		ExcelUtility elib=new ExcelUtility();
		Object[][] value = elib.readMultipleData("Sheet1");
		return value;
	}
}
