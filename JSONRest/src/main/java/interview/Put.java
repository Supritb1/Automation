package interview;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;



public class Put {
	
	
	@Test
	public void test(){
		
		HashMap<Object, Object> map=new HashMap<Object, Object>();
	
		
//		JSONObject requestParams = new JSONObject();
//		map.put("name", "Zion123"); 
//		map.put("age", 2);
//		map.put("salary", 22000);
//		given().body(map).when().post("http://dummy.restapiexample.com/api/v1/create").then().log().all();
		//given().when().delete("http://dummy.restapiexample.com/api/v1/delete/46").then().log().all();
		given().when().get("http://dummy.restapiexample.com/api/v1/employees").then().log().all();
		
	}

}
