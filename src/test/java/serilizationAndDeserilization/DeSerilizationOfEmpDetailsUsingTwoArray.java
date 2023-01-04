package serilizationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSeleriazationAndDeSeleriazation.EmployeeDetailsUsingTwoArray;

public class DeSerilizationOfEmpDetailsUsingTwoArray {

	@Test
	public void deSerilizationOfEmpDetailsUsingTwoArray() throws Throwable, Throwable, Throwable
	{
		ObjectMapper objm = new ObjectMapper();
		EmployeeDetailsUsingTwoArray e = objm.readValue(new File("./empdatatwoarray.json"), EmployeeDetailsUsingTwoArray.class);
		 e.setAddress("DElhi");
	     System.out.println(e.getAddress());
	     System.out.println(e.getEid());
	     System.out.println(e.getClass());
	}
}
