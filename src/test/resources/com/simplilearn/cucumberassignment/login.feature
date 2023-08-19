#Author: clair@example.com
#Date: 18th August, 2023
#Description: This feature is to validate the client login flow
#Keywords: login, email, password

Feature: Validate the login flow for the Client management app

  Scenario: Validate the login is successful with user credentials
  	Given the user is on the login page
  	When the user enters email and password in the form
  	And the user clicks on the login button
  	Then the user will be navigated to the home page
  	
  	
