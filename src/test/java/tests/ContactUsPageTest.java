package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsPageTest extends TestBase {
	HomePage homePage;
	ContactUsPage contactUsPage;
	
	String fullName = "Marium Ashraf" ;
	String email = "mariam@ashraf.net" ;
	String message = "Hii" ;
	
	@Test
	public void UserCanUseContactUs() {
		homePage = new HomePage(driver);
		homePage.openContactUsPage();
		contactUsPage = new ContactUsPage(driver);
		contactUsPage.contactUs(fullName, email, message);
		Assert.assertTrue(contactUsPage.successMessag.getText().contains("Your enquiry has been successfully sent to the store owner."));
		
	}

}
