package Practice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class post {

	@Test
	public void posting() {

		given().formParam("client_id", "Suprit Ballurgi").formParam("client_secret", "aca166f33bf5858a6d7787dc08ffbab2")
				.formParam("grant_type", "client_credentials")
				// .formParam("", "")
				// .formParam("", "")
				.when().post("http://coop.apps.symfonycasts.com/token").then().log().all();
		//
	}

}
