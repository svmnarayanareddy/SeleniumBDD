package StepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("Called Given");
	}

	//Regex concept (.+) for all expressions we will use.
	//^ start and $ at end will provide.
	@When("^User login into application with (.+) and (.+)$")
	public void user_login_into_application_with_and(String Username, String Password) {
		System.out.println("Username: "+ Username+ "Password: " + Password);
	}

	@Then("My Account page is displayed")
	public void my_account_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Called Then");
	}

	@Then("Search Box is displayed")
	public void search_box_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Search Box is displayed");
	}
	
	//Passing Ship Details.
	@Given("User is on shipping page")
	public void user_is_on_shipping_page() {
		 System.out.println("User is on Shipping Deatils page");
	}
	@When("User passing shipping details")
	public void user_passing_shipping_details(List<String> Details) {
		
		for(int i=0; i<Details.size();i++) {
		 System.out.println(i);
		}
	}
	@Then("Clicking on next page")
	public void clicking_on_next_page() {
		System.out.println("Clicking on Next button");
	}
	@Then("Select ship method")
	public void select_ship_method() {
		System.out.println("Successfully Clicked");
	}
	@Given ("User lands chrome browser")
	public void LunchBrowser() {
		System.out.println("***********");
		System.out.println("Browser Luched sucessfully");
	}
	
}
