Feature: Application Login

	@GuestUser
	Scenario: GuestUser is able to Login Application
    Given User is on login page
    When User login into application with "Guest@test.com" and "User2"
    Then My Account page is displayed
    And Search Box is displayed
    
   @RegisterUser
  Scenario: User1 is able to Login Application
    Given User is on login page
    When User login into application with "User1@test.com" and "User1"
    Then My Account page is displayed
    And Search Box is displayed