package StepDefination;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import junit.framework.Assert;

//import cucumber.api.PendingException;

public class statusCodeofAPIs {
	Response response;

	@Given("^Open Rates API url$")
	public void open_Rates_API(DataTable dt) throws Throwable {
		List<List<String>> list = dt.asLists(String.class);
		
	    //throw new PendingException();
		for(int i=1; i<list.size(); i++) { //i starts from 1 because i=0 represents the header
			//System.out.println(list.get(i).get("url")); 
			response = given().when().get(list.get(i).get(0));
			//System.out.println(list.get(i).get(1));
		}
	}

	@When("^Get the response of provided API$")
	public void get_the_response_of_provided_API() throws Throwable {
		int S1code =response.getStatusCode();
		System.out.println("Get the latest foreign exchange reference rates status code>>"+S1code);
	    //throw new PendingException();
	}

	@Then("^I verify the code in step$")
	public void i_verify_the_in_step() throws Throwable {
		 //List<List<String>> list = dt.asLists(String.class);
		//List<List<Integer>> list = dt.asLists(Integer.class);
		//for(int i=1; i<list.size(); i++) { 
		
		//Assert.assertEquals(list.get(i).get(0), response.getStatusCode());
		//ssert.assertEquals(list.get(i).get(0), response.getStatusCode());
		assertEquals("Incorrect status code",200, response.getStatusCode());
	    System.out.println("Latest API is up and running");
	    //throw new PendingException();
	}
}
/*
	@Given("^Open Rates API https://api\\.ratesapi\\.io/api/latest\\?symbols=USD,GBP$")
	public void open_Rates_API_https_api_ratesapi_io_api_latest_symbols_USD_GBP(String arg1) throws Throwable {
		response = given().when().get(arg1);
	   // throw new PendingException();
	}

	@Given("^Open Rates API https://api\\.ratesapi\\.io/api/latest\\?base=USD$")
	public void open_Rates_API_https_api_ratesapi_io_api_latest_base_USD() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^Open Rates API https://api\\.ratesapi\\.io/api/latest\\?base=USD&symbols=GBP$")
	public void open_Rates_API_https_api_ratesapi_io_api_latest_base_USD_symbols_GBP() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
*/


