package com.simplilearn.cucumberassignment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    System.out.println("STEP1: Given");
	}

	@When("the user enters email and password in the form")
	public void the_user_enters_email_and_password_in_the_form() {
		System.out.println("STEP2: When");
	}

	@And("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		System.out.println("STEP3: And");
	}

	@Then("the user will be navigated to the home page")
	public void the_user_will_be_navigated_to_the_home_page() {
		System.out.println("STEP4: Then");
	}

}
