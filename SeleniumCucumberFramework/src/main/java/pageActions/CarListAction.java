package pageActions;

import java.util.ListIterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageLocators.CarListLocators;
import utils.ReusableFunctions;
import utils.SeleniumDriver;

public class CarListAction extends ReusableFunctions{

	CarListLocators carListLocators = null;
	
	public CarListAction(){
		
		this.carListLocators = new CarListLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carListLocators);
	}
	
	public void listTitle(){
		String title = getText(carListLocators.title);
		System.out.println(title);
		Assert.assertEquals(title, carListLocators.title.getText().toString());
	}
	
	public void carList(){
		ListIterator<WebElement> carList = carListLocators.carList.listIterator();
		while(carList.hasNext()){
			System.out.println(carList.next().getText().toString());
		}
	}
}
