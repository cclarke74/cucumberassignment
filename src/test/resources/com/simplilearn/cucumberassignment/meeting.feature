#Author: clair@example.com
#Date: 18th August, 2023
#Description: This feature is for a client to book an appointment
#Keywords: appointment

Feature: Books an appointment for a client

	Scenario: Allows a client to book an appointment for a meeting
		Given a client has logged in and has been directed to the meeting schedule
		When a client chooses an appointment time
		And the time is available
		Then the client will receive confirmation the appointment is booked
		

