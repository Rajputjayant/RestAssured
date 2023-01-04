package crudOperationWithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetOperation {
    @Test
    public void operationGet()
    {
    	baseURI="http://localhost";
    	port=8084;
    	when()
    	    .get("/projects")
    	 .then()
    	    .log().all()
    	    .assertThat().statusCode(200)
    	    .assertThat().contentType(ContentType.JSON)
    	    .assertThat().statusLine("HTTP/1.1 200 ");
    	
    }
}
