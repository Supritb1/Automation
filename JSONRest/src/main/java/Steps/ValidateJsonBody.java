package Steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.response.ValidatableResponse;

public class ValidateJsonBody {
	
	
	@Test
	public void validateJson(){
		
		 String body = given()
	.formParam("client_id", "Suprit Ballurgi")
	.formParam("Client Secret", "aca166f33bf5858a6d7787dc08ffbab2")
	.formParam("grant_type", "client_credentials")
	.formParam("Redirect URI", "http://suprit-ballurgi.com/")
		.when()
		.post("http://coop.apps.symfonycasts.com/token")
		.getBody().asString();
		 
		 System.out.println(body);
		
		
		
		
		
	
	}


}
