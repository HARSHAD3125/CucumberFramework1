package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/Customers.feature",
		glue= "stepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"html:target/cucumber-reports/reports1.html"}
		)


//"pretty","html:target/cucumber-reports/reports1.html"
//plugin = {"pretty","json:target/cucumber-reports/reports1.json"}
//"pretty","junit:target/cucumber-reports/reports_xmal.xml"
public class Run {
   //This class will be empty
}
