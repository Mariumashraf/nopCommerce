package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductAutoSTest extends TestBase {
	String productName = "Apple MacBook Pro 13-inch" ;

	SearchPage searchPage;
	ProductDetailsPage productDetailsPage;
	
	@Test
	public void UserCanSearchWithAutoS() {
		searchPage = new SearchPage(driver);
		searchPage.ProudctSearchAutoSuggest("MacB");
		productDetailsPage = new ProductDetailsPage(driver);
		Assert.assertEquals(productDetailsPage.prodctNamebreadCrumb.getText(), productName);
		
		
	}

}
