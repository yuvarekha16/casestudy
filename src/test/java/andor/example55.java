package andor;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class example55 {
	

@Given("I enters username as {string}")
public void i_enters_username_as(String string) {
	System.out.println(string);
    
}

@And("I enters password as {string}")
public void i_enters_password_as(String string) {
	System.out.println(string);
    ;
}

@Then("I clicked to  login")
public void i_clicked_to_login() {
	System.out.println("Login success");
    
}


@Given("I ant to select the payment option")
public void i_ant_to_select_the_payment_option() {
	System.out.println("Login success");
    
}

@And("I entered bank name as {string}")
public void i_entered_bank_name_as(String string) {
	System.out.println(string);
}

@Then("I clicked to  proceed for payment")
public void i_clicked_to_proceed_for_payment() {
	System.out.println("pament success");
    
}




@And("I ckicked on logout button")
public void i_ckicked_on_logout_button() {
	System.out.println("Logout success");
   
}



}
