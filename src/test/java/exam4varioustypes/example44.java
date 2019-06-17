package exam4varioustypes;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class example44 {
	
	
	@Given("enter username as {string}")
	public void enter_username_as(String string) {
		System.out.println(string);
	   
	}
	@Given("enter password as {string}")
	public void enter_password_as(String string) {
		System.out.println(string);
	    
	}

	@Then("I click to login")
	public void i_click_to_login() {
		
		System.out.println("successful");
	    
	}

}
