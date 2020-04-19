package pageLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarListLocators {

	@FindBy(how=How.XPATH,using="//h1[@class='listing-search-title']")
	public WebElement title;
	
	@FindBy(how=How.XPATH,using="//h5[@class='carListing--textHeading']")
	public List<WebElement> carList;
}
