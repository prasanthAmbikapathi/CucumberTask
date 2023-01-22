package org.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SwaggerDelete {
public static void main(String[] args) {
	RequestSpecification reqspec;
	
	reqspec = RestAssured.given();	
	
	reqspec=reqspec.pathParam("de", "2");
	
	
	Response response = reqspec.delete("https://reqres.in/api/users/{de}");
	int statusCode = response.getStatusCode();
	System.out.println(statusCode);
	
	
}
}
