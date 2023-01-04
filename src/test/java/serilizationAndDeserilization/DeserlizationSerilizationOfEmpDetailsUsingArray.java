package serilizationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSeleriazationAndDeSeleriazation.EmpDetailsUsingArray;

public class DeserlizationSerilizationOfEmpDetailsUsingArray {
    
	@Test
	public void deserlizationSerilizationOfEmpDetailsUsing() throws Throwable, Throwable, Throwable
	{
		// create the object for object mapper
		ObjectMapper objm = new ObjectMapper();
		//read the value from object mapper 
		EmpDetailsUsingArray e = objm.readValue(new File("./empdataonearray.json"), EmpDetailsUsingArray.class);
		
		//fetch the required value from the 
		System.out.println(e.getEmail());
		System.out.println(e.getPhoneNo());
		System.out.println(e.getEname());
		System.out.println(e.getEid());
	//	System.out.println(e.getAddress());
	}
}
