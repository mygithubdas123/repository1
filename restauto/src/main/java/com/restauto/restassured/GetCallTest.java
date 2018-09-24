package com.restauto.restassured;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class GetCallTest {

	public GetCallTest() {
		// TODO Auto-generated constructor stub
	}
	
	 public void getCall() {
		  System.out.println("........... 1.  ..........");
			Response res=   given().
					get("http://services.groupkt.com/state/get/IND/all");
			System.out.println("response = " + res.asString());
			
			System.out.println(" ............... 2    ......");
			
	 }

}
