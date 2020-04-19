package steps;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class Hook {

	@Before
	public static void setup(){
		SeleniumDriver.setDriver();
	}
	
	@After
	public static void tearDown(Scenario scenario){
				
		WebDriver driver = SeleniumDriver.getDriver();
		if(scenario.isFailed()){
			byte[] scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(scr,"image/png");
		}
		
		SeleniumDriver.teardown();
	}
}
