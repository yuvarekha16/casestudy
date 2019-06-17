package example3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class example33 {
	@Given("I want to enter username {string} in the field")
	public void i_want_to_enter_username_in_the_field(String string) {
	   System.out.println("Username is "+string);
	}

	@When("I enter password {string} in the field")
	public void i_enter_password_in_the_field(String string) {
	    System.out.println("Password is "+string );
	}

	@Then("I click on the login")
	public void i_click_on_the_login() {
	    System.out.println("Login success");
	}
}
