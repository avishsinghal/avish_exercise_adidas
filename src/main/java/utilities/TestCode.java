package utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestCode {

	public static void main(String[] args) {
		queryParameter();	
	}

	
	  public static void queryParameter() {
			
		  RestAssured.baseURI = "https://petstore.swagger.io/v2/pet/findByStatus";
	        Response response = null;
	        try {
	            response = RestAssured.given()
	                .when().queryParam("status", "available,sold")
	                .get();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 
	        System.out.println("Response :" + response.asString());
	        System.out.println("Status Code :" + response.getStatusCode()); 			
		}

	
}




      
