package org.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Swagger {
	public static void main(String[] args) {
		RequestSpecification reqspec;
		reqspec = RestAssured.given();
		
		 reqspec = reqspec.headers("accept","application/json");
		 reqspec  = reqspec.pathParam("pag", "2");
		 
		  Response response = reqspec.get("https://reqres.in/api/users/{pag}");
		  int statusCode = response.getStatusCode();
		  System.out.println(statusCode);
		  
		
		  String asString = response.asString();
		  System.out.println(asString);
		  
		  String asPrettyString = response.asPrettyString();
		  System.out.println(asPrettyString);
	}

}
