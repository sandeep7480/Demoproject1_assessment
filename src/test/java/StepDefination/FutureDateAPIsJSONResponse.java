package StepDefination;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Map;

import org.apache.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import FunctionLibrary.ResponseDate;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class FutureDateAPIsJSONResponse {
	private SoftAssertions softAssertions;
	Response response;
	ResponseBody body;
	public static Logger log = Logger.getLogger(FutureDateAPIsJSONResponse.class);

	@Given("^Enter below FutureDates Rates APIs with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void futureDateRatesAPIs_JSONresponsecheck(String futureurl,String currenturl) {
        
		softAssertions = new SoftAssertions();
		response = given().when().get(futureurl);
		body = response.getBody();
		String futureurlresponse = body.asString();
		
		response = given().when().get(currenturl);
		body = response.getBody();
		String currenturlresponse = body.asString();
		Assert.assertEquals(futureurlresponse, currenturlresponse);
		log.info("Rates API future date response is matching with current Date Rates APIs response");
		

	}

	@When("^I get Future Date Rates APIs JSONresponse as (\\d+)$")
	public void futureDateRates_APIs_JSONResponse_as(int arg1) throws Throwable {
		assertEquals("Incorrect status code", arg1, response.getStatusCode());

	}
	

	@Then("^I get Rates APIs matching JSON response$")
	public void futureDateRates_APIs_JSONResponseCheck() {

		// Get response body
		/*ResponseBody body = response.getBody();
		// Get response body as string
		String responseStringValue = body.asString();
		// Validate body if it has spefic values
		log.info(responseStringValue);*/

		//String base = response.jsonPath().getString("base");
		/*	response = given().when().get(futureurl);
		body = response.getBody();
		String futureurlresponse = body.asString();
		
		response = given().when().get(currenturl);
		body = response.getBody();
		String currenturlresponse = body.asString();
		
		
		
		String resdate = response.jsonPath().getString("date");
		Map<String, String> rates = response.jsonPath().getMap("rates");

		log.info("responsedate >" + resdate);
		if(!(futureurl.matches(resdate))){
			
			//Assert.assertTrue(url.contains(resdate));
			Assert.assertNotEquals(futureurl, resdate);
	        log.info("Date provided in API endpoint is "+ futureurl + " and date recieved from response is " +  resdate);
		}
		else{
			log.info("Date provided in URL is past date");
			
		}

		ResponseDate responsedate = new ResponseDate();
		responsedate.datecheck(resdate);
		log.info("futureurlresponse");
		log.info("currenturlresponse");
		Assert.assertEquals(futureurlresponse, currenturlresponse);
		log.info("Future Date Rate APIs response matches with current date Rates APIsresponse");
		log.info("Future dated APIs response body is correct");
        */
		log.info("matching data");
	}
 
}
