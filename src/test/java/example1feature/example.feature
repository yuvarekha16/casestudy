
Feature: Admin Login
  This is for admin login


  Scenario: Admin login successful
    Given Admin enters adminid "yuva" in  the field
    And Admin enters password "yuva@123" 
    When he clicked on login button
    Then the homepage is displayed 
   
  