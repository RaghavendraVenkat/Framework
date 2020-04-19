package pageActions;

import org.openqa.selenium.support.PageFactory;

import pageLocators.HomePageLocators;
import utils.ReusableFunctions;
import utils.SeleniumDriver;

public class HomePageAction extends ReusableFunctions{
	
	HomePageLocators homePageLocators = null;
	
	public HomePageAction(){
		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
	}
	
	
	public void searchCar(String make,String model){
		searchfromDropDown(homePageLocators.make,make);
		searchfromDropDown(homePageLocators.model,model);
	}
	
	public void clickOnShowMe(){
		clickBtn(homePageLocators.showMebtn);
	}

}
