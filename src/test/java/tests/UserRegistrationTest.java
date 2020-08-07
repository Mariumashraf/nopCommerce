package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase{
	
	HomePage homePage;
	UserRegistrationPage userRegistrationPage;
	LoginPage loginPage;
	@Test(priority = 1, alwaysRun = true)
	public void UserCanRegisterSuccessfully() {
		homePage = new HomePage(driver);
		homePage.openRegistrationPage();
		userRegistrationPage = new UserRegistrationPage(driver);
		userRegistrationPage.userRegistration("Marinsusmnm", "Asmdshrnaft", "meros1dj22311@yahoo.com", "merso0#tester");
		Assert.assertTrue(userRegistrationPage.successMessage.getText().contains("Your registration completed"));
	}
	
	@Test(dependsOnMethods = {"UserCanRegisterSuccessfully"})
	public void RegisteredUserCanLogout() {
		
		userRegistrationPage.userLogout();
		
	}
	
	@Test(dependsOnMethods = {"RegisteredUserCanLogout"})
	public void RegisteredUserCanLogin() {
		homePage.openLoginPage();
		loginPage = new LoginPage(driver);
		loginPage.UserLogin("meros1dj22311@yahoo.com", "merso0#tester");
		Assert.assertTrue(userRegistrationPage.logoutLink.getText().equals("Log out"));
	}
}

