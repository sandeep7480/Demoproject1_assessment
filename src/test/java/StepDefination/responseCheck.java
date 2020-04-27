package StepDefination;

import cucumber.api.java.en.Given;

public class responseCheck {
	@Given("^I got the response$")
	public void responsecheck(){
		System.out.println("We are getting correct response");
	}

}
