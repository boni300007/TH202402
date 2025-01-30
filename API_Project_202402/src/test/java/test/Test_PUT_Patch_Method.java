package test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_PUT_Patch_Method {

	//@Test
	public void test_PUT_Method() {
		JSONObject request = new JSONObject();
		request.put("name", "Boni Amin");
		request.put("job", "Automation Tester");
		
		request.put("name", "Boni Amin 2");
		request.put("job", "Automation Tester 2");
		
		request.put("name", "Boni Amin 3 ");
		request.put("job", "Automation Tester 3");
		
		request.put("name", "Boni Amin 4 ");
		request.put("job", "Automation Tester 4.1");
		
		baseURI = "https://reqres.in/";
		given().body(request.toJSONString()).when().put("/api/users/2").then().statusCode(200).log().all();
	}
	
	@Test
	public void test_Patch_Method() {
		JSONObject request = new JSONObject();
		request.put("name", "Boni Amin");
		request.put("job", "Automation Tester");
		
		request.put("name", "Boni Amin 2");
		request.put("job", "Automation Tester 2");
		
		request.put("name", "Boni Amin 3 ");
		request.put("job", "Automation Tester 3");
		
		request.put("name", "Boni Amin 4 ");
		request.put("job", "Automation Tester 4.1");
		
		baseURI = "https://reqres.in/";
		given().body(request.toJSONString()).when().patch("/api/users/2").then().statusCode(200).log().all();
	}
	
}
