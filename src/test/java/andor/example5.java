package andor;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		tags= {"@smoke","@UAT"},
	    plugin= {"pretty","html:src/test/java/example5/cucumber-reports"}
		
		
		
		)
public class example5 {

}
