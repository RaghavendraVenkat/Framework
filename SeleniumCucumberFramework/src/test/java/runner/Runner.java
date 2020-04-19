package runner;

import java.io.File;

import org.testng.annotations.AfterClass;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/resources/features"},
		glue={"steps"},
		monochrome=true,
		plugin = {"pretty","html:target/report/","json:target/JsonReport"}
		)
public class Runner extends AbstractTestNGCucumberTests{
	
	
}
