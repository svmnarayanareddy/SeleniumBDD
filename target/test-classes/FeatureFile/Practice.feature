Feature: Application Login

//If we have same steps as pre req for all scenario we will use background keyword under feature file
Background:
Given User lands chrome browser
  #@User1
  #Scenario: User1 is able to Login Application
    #Given User is on login page
    #When User login into application with "User1@test.com" and "User1"
    #Then My Account page is displayed
    #And Search Box is displayed
    #
    #@User2
  #Scenario: User2 is able to Login Application
    #Given User is on login page
    #When User login into application with "User2@test.com" and "User2"
    #Then My Account page is displayed
    #And Search Box is displayed
    
    @ParameterizedTest
    Scenario Outline: User is able to Login Application
    Given User is on login page
    When User login into application with "<Username>" and "<Password>"
    Then My Account page is displayed
    And Search Box is displayed
    
    Examples:
    |Username				|Password		|
    |User1@test.com	|User1			|
    |User2@test.com	|User2			|
    
    
    @DataDriven @RegisterUser
    Scenario: User is able to fill address details
    Given User is on shipping page
    When User passing shipping details
    |	Manohar		|
    | Kamireddy	|
    | 9009009111|
    |	Test@yopmail.com	|
    |	Some random address	|
    Then Clicking on next page
    And Select ship method
