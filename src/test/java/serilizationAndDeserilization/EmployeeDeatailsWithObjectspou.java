package serilizationAndDeserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSeleriazationAndDeSeleriazation.EmployeeDeatailsWithObject;
import pojoClassForSeleriazationAndDeSeleriazation.Spouse;

public class EmployeeDeatailsWithObjectspou {

	@Test
	public void employeeDeatailsWithObject() throws Throwable, Throwable, Throwable
	{
		String[] email= {"abc@gmail.com","xyz@gmail.com"};
		int[] mob= {123,456};
		Spouse sp = new Spouse("Xyz","Ty008", "gk@gmail.com", 46376, "Delhi");
	//	Spouse sp1 = new Spouse("Pinky","Ty007", "ge@gmail.com", 46373, "Del");
        EmployeeDeatailsWithObject e = new EmployeeDeatailsWithObject("jay", "ty99", email, mob, "pune",sp);
        ObjectMapper objm = new ObjectMapper();
        objm.writeValue(new File("./spouseobject.json"), e);
		
		
		
	}
}
