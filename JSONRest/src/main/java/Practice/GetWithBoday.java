package Practice;

import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class GetWithBoday {

	
	@Test
	public void getBody(){


		Response rep = given()
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Delhi");
		
		
	Headers  head = rep.getHeaders();
	
	
		
		System.out.println(head.getValue("Content-Type"));
		
		
	}
	
	
}
