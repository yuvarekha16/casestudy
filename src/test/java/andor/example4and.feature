

Feature: buy products in testmeapp
  I want to login in testmeapp



@smoke
  Scenario: Login successful
    Given I enters username as "yuvarekha"
    And I enters password as "yuva345"
    Then I clicked to  login
    
@UAT
Scenario: search product
    Given I want to search productname as "handbag"
    And I add a product to cart
    Then the product is added to cart
   
   
 @UAT @smoke
 Scenario: payment
    Given I ant to select the payment option
    And I entered bank name as "icici"
    Then I clicked to  proceed for payment
  
    
@smoke 
Scenario:logout successful
    And I ckicked on logout button
    