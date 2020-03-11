package Practice;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class GetAuth {
	
	@Test
	public void getAuth(){
		
		Response resp = given()
				.formParam("Client ID", "suppi")
				.formParam("Client Secret", "68aaa1f34f4edcbdf175acd858dc7f64")
				.formParam("grant_type", "authorization_code")
				.post("http://coop.apps.symfonycasts.com/token");
		
		//System.out.println(resp.jsonPath().prettify());
		
		System.out.println(resp.jsonPath().get("access_token"));
		
		
	}
	
	

}
