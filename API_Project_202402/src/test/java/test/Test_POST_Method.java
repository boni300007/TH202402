package test;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class Test_POST_Method {

	@Test
	public void testPost() {
		
		JSONObject request = new JSONObject();
		request.put("name", "Boni Amin");
		request.put("job", "Automation Tester");
		
		request.put("name", "Boni Amin 2");
		request.put("job", "Automation Tester 2");
		
		request.put("name", "Boni Amin 3 ");
		request.put("job", "Automation Tester 3");
		
		request.put("name", "Boni Amin 4.1 ");
		request.put("job", "Automation Tester 4");
		
		
		baseURI = "https://reqres.in/";
		given().body(request.toJSONString()).when().post("/api/users?page=2").then().statusCode(201).log().all();
		
		
	}
	
	
	
}
