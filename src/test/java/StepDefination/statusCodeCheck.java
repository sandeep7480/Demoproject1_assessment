/*********************************************************************************************************************************
 Author:Sandeep Dhote
 Creaated on :24-Apr-2020
 Description:Code is created for usecases1 to get an response or latest response of Rates API
 *********************************************************************************************************************************/

package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
//import static org.hamcrest.Matchers.*;
//import static org.junit.Assert.assertEquals;

public class statusCodeCheck {
	String latest="https://api.ratesapi.io/api/latest";
	String Symbol="https://api.ratesapi.io/api/latest?symbols=USD,GBP";
	String Base="https://api.ratesapi.io/api/latest?base=USD";
	String Symbol_Base="https://api.ratesapi.io/api/latest?base=USD&symbols=GBP";
	//="https://api.ratesapi.io/api/latest";
	Response response;
	//Scenario-1
	@Given("^Open latest Rates API url$")
	public void openlatesturl() throws Throwable {
	
		response = given().when().get(latest);

	}

	@When("^Send request to get API availability$")
	public void latesturlavailability() throws Throwable {
		int S1code =response.getStatusCode();
		System.out.println("Get the latest foreign exchange reference rates status code>>"+S1code);
		
		
	}

	@Then("^I Should get sucess status of the latest API$")
	public void latestURL_response() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Incorrect status code",200, response.getStatusCode());
	    System.out.println("Latest API is up and running");
	}
	//Scenario-2
	@Given("^Open Symbol Rates API url$")
	public void openSymbolURL() throws Throwable {
	
		response = given().when().get(Symbol);

	}

	@When("^Send request to get API availability for Symbol$")
	public void send_request_to_get_API_availability() throws Throwable {
		int S2code =response.getStatusCode();
		System.out.println("Latest Foreign Exchange Rates with Symbols status code>>"+S2code);
		
		
	}

	@Then("^I Should get sucess status of the Symbol API$")
	public void i_Should_get_sucess_status_of_the_response() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Incorrect status code", 200, response.getStatusCode());
	    System.out.println("API with Symbol is up and running");
	}
	
	//Scenario-3
		@Given("^Open Base Rates API url$")
		public void openBaselURL() throws Throwable {
		
			response = given().when().get(Base);

		}

		@When("^Send request to get API availability for Base$")
		public void send_Base_API() throws Throwable {
			int S3code =response.getStatusCode();
			System.out.println("Latest Foreign Exchange Rates with Base status code>>"+S3code);
			
			
		}

		@Then("^I Should get sucess status of the Base API$")
		public void Base_API_Response() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			assertEquals("Incorrect status code", 200, response.getStatusCode());
		    System.out.println("API with Symbol is up and running");
		}

		//Scenario-4
				@Given("^Open Symbol_Base Rates API url$")
				public void openSymbol_BaselURL() throws Throwable {
				
					response = given().when().get(Base);

				}

				@When("^Send request to get API availability for Symbol_Base$")
				public void send_Symbol_Base_API() throws Throwable {
					int S4code =response.getStatusCode();
					System.out.println("Latest Foreign Exchange Rates with Symbol_Base status code>>"+S4code);
					
					
				}

				@Then("^I Should get sucess status of the Symbol_Base API$")
				public void Symbol_Base_API_Response() throws Throwable {
				    // Write code here that turns the phrase above into concrete actions
					assertEquals("Incorrect status code", 200, response.getStatusCode());
				    System.out.println("API with Symbol is up and running");
				}
}
