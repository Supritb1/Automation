package Steps;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Putrequest {
	
	public static HashMap map= new HashMap();
	
	
	@BeforeClass
	public void beforePut(){
		
		map.put("name", "jonnybaby");
		map.put("salary", 45445);
		map.put("age", 55);
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update/15410";
		
	}
	
	@Test
	public void testPut(){
	 int status = given().body(map).when().put().thenReturn().getStatusCode();
		
		Assert.assertEquals(status, 200);
	 System.out.println(status);
		
		
	}

}
