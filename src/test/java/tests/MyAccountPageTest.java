package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountPageTest extends TestBase {
	HomePage homePage;
	UserRegistrationPage userRegistrationPage;
	MyAccountPage myAccountPage;
	LoginPage loginPage;

	
	String oldPassword = "merso0#12345" ;
	String newPassword = "1234679jkjk" ;
	
	String firstName = "meroo" ;
	String lastName = "hassan" ;
	String email = "merd22snkk311@yahoo.com" ;
	
	@Test(priority = 1)
	public void UserCanRegisterSuccessfully() {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		userRegistrationPage = new UserRegistrationPage(driver);
		userRegistrationPage.userRegistration(firstName, lastName, email, oldPassword);
		Assert.assertTrue(userRegistrationPage.successMessage.getText().contains("Your registration completed"));
	}
	
	@Test (priority = 2)
	public void RegisteredUserCanChangePassword() {
		myAccountPage = new MyAccountPage(driver);
		userRegistrationPage.openMyAccountPage();
		myAccountPage.openChangePPasswordLink();
		myAccountPage.changePassword(oldPassword, newPassword);
		Assert.assertTrue(myAccountPage.resultLb.getText().contains("Password was changed"));
		
	}
	
	@Test(priority = 3)
	public void RegisteredUserCanLogout() {
		
		userRegistrationPage.userLogout();
		
	}
	
	@Test(priority = 4)
	public void RegisteredUserCanLogin() {
		homePage.openLoginPage();
		loginPage = new LoginPage(driver);
		loginPage.UserLogin(email, newPassword);
		Assert.assertTrue(userRegistrationPage.logoutLink.getText().equals("Log out"));
	}

}
