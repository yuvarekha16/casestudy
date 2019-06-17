package example1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumlogin {
	
	
	@Given("I want to enter uername")
	public void i_want_to_enter_uername() {
		System.out.println("yuvarekha");
	  
	}

	@And("I want to enter password")
	public void i_want_to_enter_password() {
		System.out.println("yuva@123");
		  
		
	   
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		System.out.println("successfull login");
		  
	}

	@Then("the homepage is displayed")
	public void the_homepage_is_displayed() {
		System.out.println("homepage is diplayed");
		  
	    
	}
	@When("signout is clicked")
	public void signout_is_clicked() {
	    System.out.println("signout succesful");
	}


}
