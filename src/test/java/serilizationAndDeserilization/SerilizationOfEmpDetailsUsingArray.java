package serilizationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSeleriazationAndDeSeleriazation.EmpDetailsUsingArray;

public class SerilizationOfEmpDetailsUsingArray {

	
		@Test
		public void serilizationOfEmpDetailusingarray() throws Throwable, Throwable, Throwable
		{
			// Create the object for pojo class
			String[] Email= {"jk@gmail.com","sk@gmail.com"};
			EmpDetailsUsingArray emp = new EmpDetailsUsingArray("Akash", "Ty008", Email, 123, "NewDelhi");
			// create the object for object mapper
			ObjectMapper objm = new ObjectMapper();
			// write the value to json file 
			objm.writeValue(new File("./empdataonearray.json"), emp);
		}

	}


