package Steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class PathParam {

	@org.testng.annotations.Test
	public void test() {

		 Response res = given().pathParam("id", 24947).when().get("http://dummy.restapiexample.com/api/v1/employee/{id}");
				
		 System.out.println("code = "+res.getStatusCode());
		 System.out.println("StatusLine  = "+res.getStatusLine());
		 System.out.println("Cookies are = "+res.getCookie("PHPSESSID"));
		 //System.out.println(res.getBody().asString().contains("employee_name"));
		 
		 
		 
		 
	}

}
