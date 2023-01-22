package org.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SwaggerPost {
	public static void main(String[] args) {
		RequestSpecification reqspec;
		
		reqspec = RestAssured.given();
		
		
		reqspec= reqspec.queryParam("page", "2");
	
		
	reqspec = reqspec.body("{\r\n" + 
			"    \"name\": \"morpheus\",\r\n" + 
			"    \"job\": \"leader\"\r\n" + 
			"}");
	Response response = reqspec.post("https://reqres.in/api/users");
	
	int statusCode = response.getStatusCode();
	
	System.out.println(statusCode);
	
	String string = response.asString();
	System.out.println(string);
	
	String prettyString = response.asPrettyString();
	System.out.println(prettyString);
	
	}

}
