package StepDefinitions;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.http.HttpStatus;
import org.json.JSONObject;
import org.json.XML;
import org.junit.Assert;

import com.mongodb.util.JSON;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import groovyjarjarantlr.collections.List;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.MyArray;
import utilities.XmlReader;

import com.google.gson.Gson;

public class DemoPetStore {

	private String domainURL;
	private String endPoint;
	private RequestSpecification request=  RestAssured.given();
	private Response response;
	private XmlReader xmlObj;
	
	@Given("^user domain \"([^\"]*)\"$")
	public void user_domain(String arg1) throws Throwable {
		domainURL = arg1;
	}

	@Given("^user add endPoint \"([^\"]*)\"$")
	public void user_add_endPoint(String arg1) throws Throwable {
		endPoint= arg1;
	}

	@When("^user get data with param \"([^\"]*)\" value \"([^\"]*)\"$")
	public void user_get_data_with_param_value(String arg1, String arg2) throws Throwable {
		request.queryParam(arg1, arg2 );
	}

	@Then("^user get response$")
	public void user_get_response() throws Throwable {
		response=request.when().get(domainURL+endPoint);
	}
	
	@Then("^user verify all results containing \"([^\"]*)\" and not containing \"([^\"]*)\"$")
	public void user_verify_all_results_containing_and_not_containing(String contain, String notContain) throws Throwable {
		String responseData=response.getBody().asString();   
        for(String data:contain.split(",")){
        	Assert.assertTrue(responseData.contains("\"status\":\""+data+"\""));
        }
        for(String dataNot:notContain.split(",")){        	
        	Assert.assertTrue(!responseData.contains(dataNot));
        } 
        hitjson();
	}

	public void hitjson(){
		 request.header("Content-Type", "application/json");
		 request.body("{  \"id\": 111,  \"category\": {    \"id\": 0,    \"name\": \"string\"  },  \"name\": \"doggie\",  \"photoUrls\": [    \"string\"  ],  \"tags\": [    {      \"id\": 0,      \"name\": \"hhjjhj\"    }  ],  \"status\": \"available\"}");
		 response = request.post(domainURL);
		  String responseData=response.getBody().asString(); 
		  System.out.println(response.getStatusCode());
		  System.out.println(responseData);
	}
	
}
