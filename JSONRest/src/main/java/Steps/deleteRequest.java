package Steps;

import static io.restassured.RestAssured.when;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class deleteRequest {

	@BeforeClass
	public void beforeDelete() {

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/delete/1";
	}

	@Test
	public void deleteMethod() {

		when().delete().then().statusCode(200).log().all();
		// .body(".success.text", equalTo("successfully! deleted Records"));

	}

}
