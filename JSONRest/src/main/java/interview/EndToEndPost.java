package interview;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class EndToEndPost {
	//HashMap map=new HashMap();
	
	@Test
	public void test(){
		
		
		
		
		
		RestAssured.basePath="http://dummy.restapiexample.com/api/v1";
		//RestAssured.basePath="/register";
		
		
		JSONObject map=new JSONObject();
		
		map.put("name", "gjonnybaby");
		map.put("salary", 5445);
		map.put("age", 51);
		
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		request.body(map.toJSONString());
		Response resp = request.request(Method.POST,"/create");
		
		String body = resp.getBody().asString();
		
		System.out.println(body);
		
		
		
	}

}
