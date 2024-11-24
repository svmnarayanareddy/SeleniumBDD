package StepDefinitions;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("GuestUser")
	public void Guest() {
		System.out.println("Guest user Logged in");
	}
	
	@Before("RegisterUser")
	public void Register() {
		System.out.println("Register user Logged in");
	}
}
