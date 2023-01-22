package org.reqres;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.base.ReqBaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.an.E;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonRead extends ReqBaseClass {
	SoftAssert softAssert=new SoftAssert();
	@Test
	public void responseCode() {
		addHeader("accept", "application/json");
		Response response = requestType("GET", "https://reqres.in/api/users?page=2");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		softAssert.assertEquals(statusCode, 200, "StatusCode Verify");
		
	}
	@Test
	public void firstName() {

		addHeader("accept", "application/json");
		Response response = requestType("GET", "https://reqres.in/api/users?page=2");
		
		JsonPath path = response.jsonPath();
		Object object = path.get("data[4].first_name");
		String firstName=(String) object;
		
		softAssert.assertEquals(firstName, "George", "FirstName Verify");
		
	}
	@Test
	public void email() {
		addHeader("accept", "application/json");
		Response response = requestType("GET", "https://reqres.in/api/users?page=2");
		JsonPath path = response.jsonPath();
	
		Object MichaelEmail = path.get("data[0].email");
		String email=(String) MichaelEmail;
		
		softAssert.assertEquals(email, "michael.lawson@reqres.in", "email Verify");
	}
	@Test
	public void dataIds() {
		addHeader("accept", "application/json");
		Response response = requestType("GET", "https://reqres.in/api/users?page=2");
		
		JsonPath path = response.jsonPath();
	
		Object object2 = path.get("data.id");
		List<Integer>li=new ArrayList<Integer>();
		
		li.addAll((Collection<? extends Integer>) object2);
		int id1= li.get(0);
		int id2= li.get(1);
		int id3= li.get(2);
		int id4= li.get(3);
		int id5= li.get(4);
		int id6= li.get(5);
		softAssert.assertEquals(id1, "7", "verify id1");
		softAssert.assertEquals(id2, "8", "verify id2");
		softAssert.assertEquals(id3, "9", "verify id3");
		softAssert.assertEquals(id4, "10", "verify id4");
		softAssert.assertEquals(id5, "11", "verify id5");
		softAssert.assertEquals(id6, "12", "verify id6");
	}
	

}
