package Steps;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Practice {

	Response resp ;
	@Test
	public void tesT(){
		
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		
		HashMap map=new HashMap();
		map.put("FirstName", "ssesxx");
		map.put("LastName", "xxxssx");
		map.put("UserName", "vissxsdeo");
		map.put("Password", "sasxsmantha");
		map.put("Email", "sunnxssylo@gmail.com");
		
		 resp = given().body(map)
		.when()
		.post();
		
		System.out.println(resp.getStatusCode()+" "+resp.statusLine());
		System.out.println(resp.body().asString());
		System.out.println(resp.getHeaders());
		JsonPath path = resp.jsonPath();
		Assert.assertEquals(path.get("SuccessCode"), "OPERATION_SUCCESS");
		
	
		
		
	}
	
}
