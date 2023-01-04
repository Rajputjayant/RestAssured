package serilizationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSeleriazationAndDeSeleriazation.EmployeeDetailsUsingTwoArray;

public class SerilizationOfEmpDetailsUsingTwoArray {

	@Test
	public void serilizationOfEmpDetailsUsingTwoArray() throws Throwable, Throwable, Throwable
	{
		// Create the object for pojo class
		String[] Email= {"dinesh@gmail.com","vk@gmail.com"};
		int[] mob= {123,345};
		EmployeeDetailsUsingTwoArray emp = new EmployeeDetailsUsingTwoArray("Jayant", "TY008", Email, mob, "Mumbai");
		// create the object for object mapper
		ObjectMapper objm = new ObjectMapper();
	    // write the value to json file 
	    objm.writeValue(new File("./empdatatwoarray.json"), emp);
	}
}
