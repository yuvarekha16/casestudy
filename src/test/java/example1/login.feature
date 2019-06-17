
Feature: TestMe sign In
  I want to signIn to TestMe app

 @smoke
  Scenario: successful signIn
    Given I want to enter uername
    And I want to enter password
    When I click on login button
    Then the homepage is displayed
    
    @UAT
    Scenario: Signout successful
    When signout is clicked
    
