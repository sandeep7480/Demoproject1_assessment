package StepDefination;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class FutureDateResponse {
	Response response;
	ResponseBody body;
	
	@Given("^Enter below FutureDates Rates APIs with \"([^\"]*)\"$")
	public void enter_below_FutureDates_Rates_APIs_with(String futureurl) throws Throwable {
		
		response = given().when().get(futureurl);
		body = response.getBody();
		String futureurlresponse = body.asString();

	}
	
	@When("^I get Future Date Rates APIs JSONresponse as (\\d+)$")
	public void futureDateRates_APIs_JSONResponse_as(int arg1) throws Throwable {
		assertEquals("Incorrect status code", arg1, response.getStatusCode());

	}

	@Then("^I get Rates APIs matching JSON response \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_get_Rates_APIs_matching_JSON_response_and(String futureurl1, String currenturl) throws Throwable {
		
		response = given().when().get(futureurl1);
		body = response.getBody();
		String futureurlresponse = body.asString();
		
		response = given().when().get(currenturl);
		body = response.getBody();
		String currenturlresponse = body.asString();
		Assert.assertEquals(futureurlresponse, currenturlresponse);
		//log.info("Rates API future date response is matching with current Date Rates APIs response");
       System.out.println("Rates API future date response is matching with current Date Rates APIs response");
	}

}
