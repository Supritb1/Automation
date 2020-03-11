package interview;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;
public class Getcall {

	

	@Test
	public void test(){
		
		
		 ResponseBody resp = given().queryParam("q", "Landon,UK")
		.queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
		.get("https://samples.openweathermap.org/data/2.5/weather").getBody();
		 
		
		 
		Object result = resp.jsonPath().get("sys.id");
		  
		System.out.println(result);
		
		
		
	}

}
