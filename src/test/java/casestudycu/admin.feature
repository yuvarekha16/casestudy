
Feature: Login  Testmeapp
  I want to login to testmeapp

  Scenario:signIn to TestMeApp
     Given I wnat to enter username as "Admin"
     And   I want to enter password as "password456"
     Then  I click on login button
   


     Scenario: add product to testmeapp
      Given I want to click on add product
        And I enter fields on addproduct page
         Then I click on signout button
    
    
       Scenario:user added one product to cart and performs payment
      When Lary added headphone to the cart
      And checkout for payment
      And  fills transaction details
      Then the product is successfully ordered
      
      
   Scenario:Admin add another product
     Given select category name
     Given select subcategory name
     And i enter product name as "jabra 11"
     And i enter price as "$300"
     And i enter quantity "10"
     And i enter brand as "jabra"
     And i enter description as "Head Phone suitable for office"
     Then click on addproduct button

