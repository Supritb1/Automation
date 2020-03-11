package Practice;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class GetMethod {
	
	
	@Test
	public void get(){
	
		 
		  Object res = given().when()
		 .get("http://restapi.demoqa.com/utilities/weather/city/Delhi")
		.then().assertThat().header("Content-Type", equalTo("text/html; charset=UTF-8"));
		 
		//System.out.println(res);
		  
		  
		  
		  
		 
//		 System.out.println(res.getStatusCode());
//		System.out.println(res.getStatusLine());
//		JsonPath path = res.getBody().jsonPath();
//		
//		System.out.println(path.get("employee_name"));
	}

}
