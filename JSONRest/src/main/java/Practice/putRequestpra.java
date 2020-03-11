package Practice;
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;


public class putRequestpra {
	
	@Test
	public void put(){
		
		
		HashMap map=new HashMap();
		map.put("name", "supppii");
		map.put("salary", 4556);
		map.put("age", 40);
		
		
		given().body(map)
		.when().post("http://dummy.restapiexample.com/api/v1/create")
		.then().log().all();
		 
		
	}
	

}
