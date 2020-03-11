package Steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Headers;

public class Weather {
	
	@Test
	public void getWeatherDetails(){
		
		 Map<String, String> coo = given()
		.auth().preemptive().basic("ToolsQA", "TestPassword")
		.when()
		.get("http://restapi.demoqa.com/authentication/CheckForAuthentication").cookies();
		
		 for(Map.Entry map : coo.entrySet()){
			 System.out.println(map.getKey()+" "+map.getValue());
		 }
		
		
		
		
	
	}

}
