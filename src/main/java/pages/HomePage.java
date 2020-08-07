package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		jsExecutor = (JavascriptExecutor) driver;
	}
	
	@FindBy(linkText = "Register")
	WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	WebElement loginLink;
	
	@FindBy(linkText = "Contact us")
	WebElement contactUsLinkElement;
	
	
	
	
	
	public void openRegistrationPage() {
		//registerLink.click();
		clickButton(registerLink);
		
	}
	public void openLoginPage() {
		clickButton(loginLink);
		
	}
	
	public void openContactUsPage() {
		scrollToBottom();
		clickButton(contactUsLinkElement);
	}
	
	

}
