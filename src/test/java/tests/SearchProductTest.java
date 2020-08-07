package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchProductTest extends TestBase{
	SearchPage searchPage;
	ProductDetailsPage productDetailsPage;
	String productName = "Apple MacBook Pro 13-inch" ;
	
	@Test
	public void UserCanSearchForProducts() {
		searchPage = new SearchPage(driver);
		productDetailsPage = new ProductDetailsPage(driver);
		searchPage.productSearch(productName);
		searchPage.openProductDetailsPage();
		Assert.assertTrue(productDetailsPage.prodctNamebreadCrumb.getText().equalsIgnoreCase(productName));
	//	Assert.assertEquals(productDetailsPage.prodctNamebreadCrumb.getText(), productName);
		
		
	}

}
