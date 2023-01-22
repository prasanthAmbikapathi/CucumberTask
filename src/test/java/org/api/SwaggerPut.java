package org.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SwaggerPut {
	public static void main(String[] args) {
		RequestSpecification reqSpec;
		reqSpec = RestAssured.given();
		reqSpec.pathParam("pa", "2");
		Response response = reqSpec.put("https://reqres.in/api/users/{pa}");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		String asString = response.asString();
		System.out.println(asString);
		
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
		
		
	}
}
