package interview;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class GetMethod {
	
	@Test
	public void test(){
		
		
		 String body = given().when().get("http://dummy.restapiexample.com/api/v1/employees").getBody().asString();
		 System.out.println(body);
		
		;
		
		
		
	}
	
	
	
//	
//	   "id": "22",
//       "employee_name": "Yuri Berry",
//       "employee_salary": "675000",
//       "employee_age": "40",
//       "profile_image": ""
   

}
