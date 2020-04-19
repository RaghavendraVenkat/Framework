package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/resources/features"},
		glue={"steps"},
		monochrome=true,
		plugin = {"pretty","html:target/report/"}
		)
public class Runner extends AbstractTestNGCucumberTests{
	
}
