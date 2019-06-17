package andor;

import java.util.List;
import java.util.Map;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class example66 {
	

@Given("I enter url")
public void i_enter_url() {
	System.out.println("success");
}

@And("I enter username and password")
public void i_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    List<Map<String,String>> list=dataTable.asMaps(String.class, String.class);
    
    for(int i=0;i<list.size();i++) {
    	
    	System.out.println(list.get(i).get("username"));
    	System.out.println(list.get(i).get("password"));
    	
    }
}

@When("I click on login")
public void i_click_on_login() {
    System.out.println("success");
}

@Then("Home page is displayed")
public void home_page_is_displayed() {
	System.out.println("success");
   
}




}
