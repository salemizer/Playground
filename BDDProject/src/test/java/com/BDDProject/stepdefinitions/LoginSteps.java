package com.BDDProject.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class LoginSteps {

	private boolean isLoginPage;
	private boolean credentialsAreValid;
	private boolean isRedirectedToHomepage;
	
	
//	 the user is on the login page
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		isLoginPage= true;
		if(isLoginPage) {
			System.out.println("isLoginPage= " + isLoginPage);
		}
	}

//	the user enters a valid username "user1"
	@When("the user enters a valid username {string}")
	public void the_user_enters_a_valid_username(String username) {
		if(isLoginPage) {
			credentialsAreValid= true;
			isRedirectedToHomepage= true;
			System.out.println("credentialsAreValid= " + credentialsAreValid);
		}
			
	}
	
   @Then("the user is redirected to the homepage")
	public void the_user_is_redirected_to_the_homepage() {
	    assertTrue(isRedirectedToHomepage);
	 }
}
