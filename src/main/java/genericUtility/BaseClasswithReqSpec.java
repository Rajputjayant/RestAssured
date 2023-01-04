package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.mysql.cj.jdbc.Driver;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClasswithReqSpec {

	public JavaUtility jLib=new JavaUtility();
	public RestAssuredLibrary rLib=new RestAssuredLibrary();
	public DataBaseUtility dLib=new DataBaseUtility();
	public ExcelUtility eLib=new ExcelUtility();


	public RequestSpecification requestSpec;
	public ResponseSpecification responseSpec;
	
	Connection con =null;
	
	@BeforeSuite
	public void dbConfig() throws SQLException
	{
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
        		 
	}
	@BeforeClass
	public void bcConfig()
	{
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.setBaseUri("http://localhost");
		builder.setPort(8084);
		builder.setContentType(ContentType.JSON);
		requestSpec =builder.build();
	}
	
	@AfterSuite
	public void asConfig() throws Throwable
	{
	    con.close();
		ResponseSpecBuilder builder1=new ResponseSpecBuilder();
		
		responseSpec =builder1.expectContentType(ContentType.JSON).build();
		
	}
	
	
	
}
