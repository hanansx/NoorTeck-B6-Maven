package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
features = "src/test/resources/OrangeHRM/MercuryRegister.feature", 
glue = {"com.noorteck.qa.steps"},
plugin = {"pretty", "html:target/cucumber-report.html"},
monochrome = true
)



public class XYZRunner {

	
}
