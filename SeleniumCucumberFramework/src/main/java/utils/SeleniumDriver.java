package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	public static final int timeout = 30;
	public static final int page_timeout = 50;

	private SeleniumDriver() {

		System.setProperty("webdriver.chrome.driver",
				"D:/Technical/Cucumber/Jars/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, timeout);
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(page_timeout, TimeUnit.SECONDS);
	}

	public static void openURL(String url) {
		driver.get(url);
	}

	public static void setDriver() {
			
			seleniumDriver = new SeleniumDriver();
		
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void teardown(){
		if(driver!=null){
			driver.close();
			driver.quit();
		}
		
		seleniumDriver = null;
	}
}
