package serilizationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSeleriazationAndDeSeleriazation.EmployeeDetailsPojo;

public class DeserializationOfEmpDetails {

	@Test
	public void deserializationOfEmpDetails() throws Throwable, Throwable, Throwable
	{
		//step1:- Create the object for object mapper
		ObjectMapper objm = new ObjectMapper();
		
		//step2:- read the value from object mapper
		EmployeeDetailsPojo e = objm.readValue(new File("./empdata.json"), EmployeeDetailsPojo.class);
		
		//fetch the required value from the 
	//	System.out.println(e.getEname());
		System.out.println(e.getEmail());
		e.setEname("Jaya");
		System.out.println(e.getEname());
	}
}
