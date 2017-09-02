package com.restauto.restassured;


import java.util.Arrays;
import java.util.List;

import io.restassured.response.Response ;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.testng.annotations.Test;



public class TestClass1 {
	
	
 //  Test
  public void test1() {
	  System.out.println("........... 1.  ..........");
		Response res=   given().
				get("http://services.groupkt.com/state/get/IND/all");
		System.out.println("response = " + res.asString());
		
		System.out.println(" ............... 2    ......");
		 
		 res.then().body("RestResponse.result.name",   hasItems("Andhra Pradesh", "Bihar")).log().all();
				 	
  }
  
  

  //  Test
   public void f() {
 	  System.out.println("........... 1.  ..........");
 		Response res=   given().
 				get("http://services.groupkt.com/state/get/IND/all");
 		System.out.println("response = " + res.asString());
 		
 		System.out.println(" ............... 2    ......");
 		
 		
 		
 	
// 		 given().
// 			get("http://services.groupkt.com/state/get/IND/all").
// 		 then().body("RestResponse.result.name",   hasItems("Andhra Pradesh", "Bihar")).log().all();
 		 
 		 res.then().body("RestResponse.result.name",   hasItems("Andhra Pradesh", "Bihar")).log().all();
 		 
 		 
 		
 		 System.out.println(" ............... 3    ......"); 
 		 
 		List<Object> l =  res.jsonPath().getList("RestResponse.result.name");
 		
 	//	 System.out.println(" l =" + l)	;
 		 
 	 //    assertThat(Arrays.asList("foo", "bar", "food"),  contains("foo", "food"));
 		 
 /*	
 				 given().
 					get("http://services.groupkt.com/state/get/IND/all").
 				 then().body("RestResponse.result.name", contains(l));
 		 
 		          res. then().body("RestResponse.result.name", contains("Andhra Pradesh",  "Bihar")).log().all();
 	*/
 				 System.out.println(" ............... 4    ......");
 	
// 				 given().
// 					get("http://services.groupkt.com/state/get/IND/all").
// 				 then().body(contains("Andhra Pradesh",  "Bihar") ).log().all();
 			
 	//			 res.then().body(contains("Andhra Pradesh",  "Bihar") ).log().all();
 					
 		
 	  System.out.println(" ............... 5    ......");
 				 
 				 given().
 				 when().
 					get("http://services.groupkt.com/state/get/IND/all").
 				 then().statusCode(200)
 				 .log().all();
 				 
       System.out.println(" ............... 6    ......");
 				 res.then().statusCode(200).log().all();
 				 	 
 				 		 
 		
 				 
 				 
 				 
 				 	
   }
   
  
  
  @Test
  public void testXml() {
	  System.out.println("........... 1.  ..........");
		Response res=   given().
				get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10/");
		System.out.println("response = " + res.asString());
		
      res.then().body("CUSTOMER.ID" , equalTo("10"));
      
      System.out.println("........... 2.  ..........");
		
      res.then().body("CUSTOMER.ID" , equalTo("10")).body("CUSTOMER.FIRSTNAME" , equalTo("Sue")).log().all();
      System.out.println("........... 3   ..........");
      res.then().body("CUSTOMER.text()",  equalTo("10SueFuller135 Upland Pl.Dallas")).log().all();
		
	  
  }
 
  
  
}
