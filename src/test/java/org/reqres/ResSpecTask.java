package org.reqres;

import org.base.ReqBaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ResSpecTask extends ReqBaseClass {
@Test
public void listUser() {
	addHeader("accept", "application/json");
	addQueryParam("page", "2");
	 Response response = requestType("GET", "https://reqres.in/api/users?page=2");
	 
	int responseCode = getStatusCode(response);
	System.out.println(responseCode);
	
	String resBodyAsPrettyString = getResBodyAsPrettyString(response);
	System.out.println(resBodyAsPrettyString);

}
@Test
	public void registerUnSuccessful() {
		addHeader("accept", "application/json");
		addBody("{\r\n" + 
				"    \"email\": \"sydney@fife\"\r\n" + 
				"}");
		
	Response response = requestType("POST", "https://reqres.in/api/register");
	
	int responseCode = getStatusCode(response);
	System.out.println(responseCode);
	
	String resBodyAsPrettyString = getResBodyAsPrettyString(response);
	System.out.println(resBodyAsPrettyString);
	}

@Test
	public void update() {
		addHeader("accept", "application/json");
		addPathParam("page", "2");
		Response response = requestType("PUT", "https://reqres.in/api/users/{page}");
		
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		
		String resBodyAsPrettyString = getResBodyAsPrettyString(response);
		System.out.println(resBodyAsPrettyString);
		
}
@Test
public void delete() {
	addHeader("accept", "application/json");
	addPathParam("page", "2");
	Response response = requestType("DELETE", "https://reqres.in/api/users/{page}");
	
	int statusCode = getStatusCode(response);
	System.out.println(statusCode);
	
	String resBodyAsPrettyString = getResBodyAsPrettyString(response);
	System.out.println(resBodyAsPrettyString);
	
	
}



















}
