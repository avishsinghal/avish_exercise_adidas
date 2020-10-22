package utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiOperations {
	private HttpURLConnection conn;

	public ApiOperations(String Url) {
	
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
