package StepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DemoPetStore {

	private String domainURL;
	private String endPoint;
	private RequestSpecification request=  RestAssured.given();
	private Response response;
	
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
	}

	@When("^user hit request and validate response$")
	public void user_hit_request_and_validate_response() throws Throwable {
		request.header("Content-Type", "application/json");
		request.body("{  \"id\": 111,  \"category\": {    \"id\": 0,    \"name\": \"string\"  },  \"name\": \"doggie\",  \"photoUrls\": [    \"string\"  ],  \"tags\": [    {      \"id\": 0,      \"name\": \"hhjjhj\"    }  ],  \"status\": \"available\"}");
		response = request.post(domainURL);
		String responseData=response.getBody().asString(); 
		System.out.println(response.getStatusCode());
		System.out.println(responseData);
		Assert.assertTrue(response.getStatusCode()==200);
	}
	
	@Then("^user update pet to sold$")
	public void user_update_pet_to_sold() throws Throwable {
		request.header("Content-Type", "application/json");
		request.body("{  \"id\": 111,  \"category\": {    \"id\": 0,    \"name\": \"string\"  },  \"name\": \"doggie\",  \"photoUrls\": [    \"string\"  ],  \"tags\": [    {      \"id\": 0,      \"name\": \"hhjjhj\"    }  ],  \"status\": \"sold\"}");
		response = request.put(domainURL);
		String responseData=response.getBody().asString(); 
		System.out.println(response.getStatusCode());
		System.out.println(responseData);
		Assert.assertTrue(response.getStatusCode()==200);
	}
	@Then("^user delete pet id \"([^\"]*)\" from inventory$")
	public void user_delete_pet_id_from_inventory(String arg1) throws Throwable {
		request.header("Content-Type", "application/json");
		String url=domainURL+"/"+arg1;
		response = request.delete(url);
		String responseData=response.getBody().asString(); 
		System.out.println(response.getStatusCode());
		System.out.println(responseData);
		Assert.assertTrue(response.getStatusCode()==200);
	}

}
