package Steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Postrequest {
	
	
	public static HashMap map=new HashMap();
	
	@BeforeTest
	public void beforePost(){
		
		map.put("FirstName", "spwqkqq");
		map.put("LastName", "baldakq");
		map.put("UserName", "Tetadjqa");
		map.put("Password", "Tst12a5qd3");
		map.put("Email", "saaqp@gmail.com");
		
//		RestAssured.baseURI="http://restapi.demoqa.com/customer";
//		RestAssured.basePath="/register";
//		
	}
	
	
	@Test
	public void testPost(){
		
	given()
	.contentType("application/json")
	.body(map)
	.when()
	.post("http://restapi.demoqa.com/customer/register")
	.then()
	.statusCode(201)
	.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
	.log().all();
		
		
	}

}
