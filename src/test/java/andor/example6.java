package andor;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		plugin= {"pretty","html:src/test/java/andor/cucumber-reports"}
		
		)


public class example6 {

}
