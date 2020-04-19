package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.CarListAction;
import pageActions.HomePageAction;

import utils.SeleniumDriver;

public class SearchForCar {
	
	HomePageAction homePageAction = new HomePageAction();
	CarListAction carListAction =  new CarListAction();
	
	
	@Given("^I am on carguides website$")
	public void i_am_on_carguides_website() throws Throwable {
		
		SeleniumDriver.openURL("https://www.carsguide.com.au/");
	}

	@When("^I select car of ([^\"]*) and ([^\"]*)$")
	public void i_select_car_of(String make, String model) throws Throwable {
		homePageAction.searchCar(make,model);

	}

	@When("^I click on Show me cars button$")
	public void i_click_on_Show_me_cars_button() throws Throwable {
		homePageAction.clickOnShowMe();
	}

	@Then("^I should be able to see a list of cars displayed with ([^\"]*)$")
	public void i_should_be_able_to_see_a_list_of_cars_displayed_with(String pageTitle) throws Throwable {
		carListAction.listTitle();
		carListAction.carList();
		
	}
	
	

}
