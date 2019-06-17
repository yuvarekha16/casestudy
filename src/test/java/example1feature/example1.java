package example1feature;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class example1 {
	
	
	@Given("Admin enters adminid {string} in  the field")
	public void admin_enters_adminid_in_the_field(String x) {
		
		System.out.println(x);
	    
	}

	@And("^Admin enters password \"([^\"]*)\"$")
	public void adminenterspassword(String y) {
		
		System.out.println(y);
	    
	}
		
		
	    
	

	@When("he clicked on login button")
	public void he_clicked_on_login_button() {
		
		System.out.println("successfull");
	    
	}

	@Then("the homepage is displayed")
	public void the_homepage_is_displayed() {
		
		System.out.println("displayed");
	   
	}



}
