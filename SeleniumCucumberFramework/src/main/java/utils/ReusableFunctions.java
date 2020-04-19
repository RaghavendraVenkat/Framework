package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableFunctions {

	public void searchfromDropDown(WebElement element,String text){
		
		Select select = new Select(element);
		select.selectByValue(text);
	}
	
	public void clickBtn(WebElement element){
		element.click();
	}
	
	public String getText(WebElement element){
		return element.getText().toString();
	}
	
	
}
