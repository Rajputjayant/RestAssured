package crudOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

public class GetWithBdd {
   
	public void getOperation()
	{
		baseURI="http://localhost";
    	port=8084;
	}
}
