package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pojo.PostAddProject;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectDataProvider extends PostAddProject {
    
	@Test(dataProvider = "Jayant")
	public void addProject(String createdBy,String projectName,String status, String teamSize)
	{
		baseURI="http://localhost";
		port=8084;
		PostAddProject poj=new PostAddProject(createdBy, projectName, status, teamSize);
		given()
		 .body(poj)
		 .contentType(ContentType.JSON)
		 .when()
		   .post("/addProject")
		   .then()
		   .assertThat().statusCode(201)
		   .contentType(ContentType.JSON)
		   .log().all();
		   
				
	}
	
	@DataProvider(name="Jayant")
	public Object[][] TestData()
	{
		Object[][] obj =new Object[2][4];
		obj[0][0]="kantra";
		obj[0][1]="TYSS";
		obj[0][2]="created";
		obj[0][3]=5;
		
		obj[1][0]="Bangalore";
		obj[1][1]="Mysore";
		obj[1][2]="Karnataka";
		obj[1][3]=12;
		return obj;
		
	}
}
