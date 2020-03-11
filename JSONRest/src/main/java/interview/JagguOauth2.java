package interview;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JagguOauth2 {
	
	@Test
	public void test(){
		
		Response resp = RestAssured.given()
				.formParam("client_id", "jaggu")
				.formParam("client_secret", "6807e74d528b96855d19c8b1a46f3467")
				.formParam("grant_type", "client_credentials")
				.post("http://coop.apps.symfonycasts.com/token");
		String token = resp.jsonPath().getString("access_token");
		
		System.out.println(RestAssured.given().auth().oauth2(token).get("http://coop.apps.symfonycasts.com/api/me").getStatusCode());
		
	}

}
