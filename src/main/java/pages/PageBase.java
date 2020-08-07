package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	
	public JavascriptExecutor jsExecutor;
	public Select select;
	protected WebDriver driver;
	
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	protected static void clickButton(WebElement button) {
		button.click();
	}
	
	protected static void setTextElement(WebElement txtElement, String value) {
		txtElement.sendKeys(value);
		
	}
	
	public void scrollToBottom() {
		jsExecutor.executeScript("scrollBy(0,2500)");
		
	}
	
//select = new Select();
	//select.byvalue...
	



}
