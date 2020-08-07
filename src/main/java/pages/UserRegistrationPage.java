package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "gender-female")
	WebElement genderRdoBtn;

	@FindBy(id = "FirstName")
	WebElement fnTxtBox;

	@FindBy(id = "LastName")
	WebElement lnTxtBox;

	@FindBy(id = "Email")
	WebElement emailTxtBox;

	@FindBy(id = "Password")
	WebElement passwordTxtBox;

	@FindBy(id = "ConfirmPassword")
	WebElement confirmPasswordTxtBox;

	@FindBy(id = "register-button")
	WebElement registerBtn;
	
	//@FindBy(linkText = "Your registration completed")
	@FindBy(className = "result")
	public WebElement successMessage;
	
	@FindBy(linkText = "Log out")
	public WebElement logoutLink;
	
	@FindBy(linkText = "My account")
	WebElement myAccountLink;
	

	public void userRegistration(String firstName, String lastName, String email, String password) {
		clickButton(genderRdoBtn);
		setTextElement(fnTxtBox,firstName);
		setTextElement(lnTxtBox, lastName);
		setTextElement(emailTxtBox, email);
		setTextElement(passwordTxtBox ,password);
		setTextElement(confirmPasswordTxtBox,password);
		clickButton(registerBtn);
		
	}
	
	public void userLogout() {
		clickButton(logoutLink);
	}
	
	public void openMyAccountPage() {
		clickButton(myAccountLink);
	}









}
