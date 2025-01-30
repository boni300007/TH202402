package test;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Test_Delete_Method {

	@Test
	public void test_Delete() {
		baseURI = "https://reqres.in/";
		when().delete("/api/users?page=2").then().statusCode(204);
	}
}
