package example1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags= {"@UAT"},
		monochrome=true,
		plugin= {"pretty","html:src/test/java/example1/cucumber-reports"}
		)

public class login {

}
