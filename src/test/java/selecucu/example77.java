package selecucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class example77 {
	WebDriver driver;
	

	
	@Given("I enters username")
	public void i_enters_username() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.cssSelector("input#userName")).sendKeys("Lalitha");
	    
	}

	@And("I enters password")
	public void i_enters_password() {
		driver.findElement(By.cssSelector("input#password")).sendKeys("password123");
	    
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {
		  driver.findElement(By.name("Login")).submit(); 
	    
	}


}
