

Feature: Testme Application
  I want to login to testmeapp

 
 
 
 Scenario:Registration
 Given I enters username
 Given I enters firstname
 Given I enters lastname
 Given I enters password
 Given I enters Confirmpassword
 And I enters gender
 And I enters email_address
 And I enters mobile_number
 And I enters dob
 And I enters address
 Given i choose security question
 And I enters answer
 Then I Click on Register
 
 
 
 
  Scenario: Login succesful
    Given I enters username
    And I enters password
    Then I click on login button
    
  