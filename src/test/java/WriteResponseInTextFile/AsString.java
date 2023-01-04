package WriteResponseInTextFile;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class AsString {
  
	@Test
	 public void As() throws Throwable
	 {
		
		Response resp = given()
		 .pathParam("projectId", "TY_PROJ_1224")
		 .contentType(ContentType.JSON)
		 
	   .when()
	      .get("http://localhost:8084/projects/{projectId}");
	     // .then().log().body();
	      String st = resp.asString();
	      byte[] by = st.getBytes();
	      
	      File f = new File("./src/test/resources/OutputFileForasString.json");
	     // Files.writeFile(st, f);
	     Files.write(by, f);
	 }
	
	@Test
	public void usingInputStream() throws IOException
	{
		Response res =given()
				        .pathParam("projectId", "TY_PROJ_602")
				        .contentType(ContentType.JSON)
				       .when()
				           .get("http://localhost:8084/projects/{projectId}");
		             InputStream st =res.asInputStream();
		             byte[] inp = new byte[st.available()];
		             st.read(inp);
		             File fp = new File("./src/test/resources/OutputFileinputStream1.json");
		             Files.write(inp, fp);
	}			
	}
	


