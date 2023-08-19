package com.simplilearn.cucumberassignment;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MeetingSteps {
	@Given("a client has logged in and has been directed to the meeting schedule")
	public void a_client_has_logged_in_and_has_been_directed_to_the_meeting_schedule() {
		System.out.println("STEP1: Given");
	}

	@When("a client chooses an appointment time")
	public void a_client_chooses_an_appointment_time() {
		System.out.println("STEP2: When");
	}

	@And("the time is available")
	public void the_time_is_available() {
		System.out.println("STEP3: And");
	}

	@Then("the client will receive confirmation the appointment is booked")
	public void the_client_will_receive_confirmation_the_appointment_is_booked() {
		System.out.println("STEP4: Then");
	}

}
