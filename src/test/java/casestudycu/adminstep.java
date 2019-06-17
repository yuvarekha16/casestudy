package casestudycu;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class adminstep {
	WebDriver driver;
	
	
	
	@Given("I wnat to enter username as {string}")
	public void i_wnat_to_enter_username_as(String string) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("SignIn")).click();
		 driver.findElement(By.cssSelector("input#userName")).sendKeys("Admin");
		 
		
	   
	}

	@And("I want to enter password as {string}")
	public void i_want_to_enter_password_as(String string) {
		driver.findElement(By.cssSelector("input#password")).sendKeys("password456");
	    
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {
		 driver.findElement(By.name("Login")).submit();
		 driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
		 Actions b=new Actions(driver);
			driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
			b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		    b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys("hp");
			driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys("$500");
			driver.findElement(By.xpath("//*[@id=\"quantityid\"]")).sendKeys("2");
			driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys("hp");
			driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("use it from anyplace anywhere");
			driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
			driver.findElement(By.linkText("SignOut")).click();
			WebDriverWait wait=new  WebDriverWait(driver,100); 
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
			driver.findElement(By.linkText("SignIn")).click();
			driver.findElement(By.cssSelector("input#userName")).sendKeys("Lalitha");
			driver.findElement(By.cssSelector("input#password")).sendKeys("password123");
			driver.findElement(By.name("Login")).submit();
			WebDriverWait wait1=new  WebDriverWait(driver,100); 
			driver.findElement(By.name("products")).sendKeys("Headphone");
		    wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"myInput\"]")));
			driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
			driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
			driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
			driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
			  WebDriverWait wa=new WebDriverWait(driver,50);
				 wa.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn")));
				 driver.findElement(By.cssSelector("#swit > div:nth-child(2) > div > label > i")).click();
				 driver.findElement(By.id("btn")).click();
					driver.findElement(By.name("username")).sendKeys("Lalitha");
					 driver.findElement(By.name("password")).sendKeys("password123");
					 driver.findElement(By.cssSelector("input[type='submit']")).submit();
					 driver.close();
	}

	@Given("I want to click on add product")
	public void i_want_to_click_on_add_product() {
		
		
		
	    
	}

	@Then("I enter fields on addproduct page")
	public void i_enter_fields_on_addproduct_page() {
	    
	}

	@Then("I click on signout button")
	public void i_click_on_signout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Lary added headphone to the cart")
	public void lary_added_headphone_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@And("checkout for payment")
	public void checkout_for_payment() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@And("fills transaction details")
	public void fills_transaction_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("the product is successfully ordered")
	public void the_product_is_successfully_ordered() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("select category name")
	public void select_category_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("select subcategory name")
	public void select_subcategory_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("i enter product name as {string}")
	public void i_enter_product_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("i enter price as {string}")
	public void i_enter_price_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("i enter quantity {string}")
	public void i_enter_quantity(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("i enter brand as {string}")
	public void i_enter_brand_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("i enter description as {string}")
	public void i_enter_description_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("click on addproduct button")
	public void click_on_addproduct_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



}
