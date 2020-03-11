package interview;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Auth2 {


	@Test
	public void test(){
		
		
		Response resp = given().formParam("client_id", "suprit")
		.formParam("client_secret", "1b5e9c014fb51c65e2eace3c92f0274f")
		.formParam("grant_type", "client_credentials")
		.post("http://coop.apps.symfonycasts.com/token");
		
		
		String token=resp.jsonPath().getString("access_token");
		System.out.println("token is  = "+token);
		
		given().auth().oauth2(token).when().post("http://coop.apps.symfonycasts.com/api/597/chickens-feed")
		.then().log().all();
		
		
		
		
	}
	
	
}
