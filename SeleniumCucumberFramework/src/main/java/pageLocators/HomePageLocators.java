package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

	@FindBy(how=How.ID,using="makes")
	public WebElement make;
	
	@FindBy(how=How.ID,using="models")
	public WebElement model;
	
	@FindBy(id="search-submit")
	public WebElement showMebtn;
}
