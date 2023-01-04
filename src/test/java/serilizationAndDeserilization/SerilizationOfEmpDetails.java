package serilizationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSeleriazationAndDeSeleriazation.EmployeeDetailsPojo;

public class SerilizationOfEmpDetails {

	@Test
	public void serilizationOfEmpDeatails() throws Throwable, Throwable, Throwable
	{
		// Create the object for pojo class
		EmployeeDetailsPojo emp = new EmployeeDetailsPojo("Jayant", "Ty007", "js@gmail.com",123456, "Banglore");
		// create the object for object mapper
		ObjectMapper objm = new ObjectMapper();
		// write the value to json file 
		objm.writeValue(new File("./empdata.json"), emp);
	}
}
