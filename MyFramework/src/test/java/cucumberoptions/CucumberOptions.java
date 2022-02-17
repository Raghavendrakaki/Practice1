package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(features = "src\\test\\java\\features",glue = "stepdefinations")
public class CucumberOptions extends AbstractTestNGCucumberTests {

	
}
