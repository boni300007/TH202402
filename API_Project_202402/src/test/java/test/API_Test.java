package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import  io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_Test {

	@Test
	public void testGET_2() {
		
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		
		int statusCodeofGET = res.getStatusCode();
		Assert.assertEquals(statusCodeofGET, 200);
		System.out.println(res.getBody().asString());
		
	}
	
}
