package Multipart;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class UploadFile1 {

	@Test
	public void multipart()
	{
		File f = new File(".\\src\\test\\resources\\food.png");
		given()
		  .multiPart("file", f, "Multipart/formdata")
		 .when()
		    .post("https://the-internet.herokuapp.com/upload")
		    .thenReturn()
		     .then()
		      .log().all();
		
	}
}
