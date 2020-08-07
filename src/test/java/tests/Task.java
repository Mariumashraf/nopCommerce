package tests;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "F:\\workspace\\nopCommerce\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		
	}
	
	@Test
	public void checkFields() {
		WebElement emailField = driver.findElement(By.id("email-input"));
		WebElement passwordField  = driver.findElement(By.id("password-input"));
		WebElement loginButton  =  driver.findElement(By.id("login-button"));
      Assert.assertTrue(emailField.isDisplayed());
      Assert.assertTrue(passwordField.isDisplayed());
      Assert.assertTrue(loginButton.isDisplayed());

      
      
	}
	/*@Test
	public void loginWithValidCerdentials() {
		driver.findElement(By.id("email-input")).sendKeys("login@codility.com");
        driver.findElement(By.id("password-input")).sendKeys("password");
      driver.findElement(By.id("login-button")).click();
      WebElement successMessage = driver.findElement(By.xpath("//div[@class='message success']"));
	Assert.assertTrue(successMessage.getText().equals("Welcome to Codility"));
      
      

	}*/
	
	/*@Test
	public void loginWithInvalidCerdentials() {
		driver.findElement(By.id("email-input")).sendKeys("unknown@codility.com");
        driver.findElement(By.id("password-input")).sendKeys("password");
      driver.findElement(By.id("login-button")).click();
      WebElement errorMessage = driver.findElement(By.xpath("//div[@class='message error']"));
	Assert.assertTrue(errorMessage.getText().equals("You shall not pass! Arr!"));
      
      

	}*/
	
	/*@Test
	public void checkEmailValidation() {
		driver.findElement(By.id("email-input")).sendKeys("codility.com");
        driver.findElement(By.id("password-input")).sendKeys("password");
      driver.findElement(By.id("login-button")).click();
      WebElement validationMessage = driver.findElement(By.xpath("//div[@class='validation error']"));
	Assert.assertTrue(validationMessage.getText().equals("Enter a valid email"));
		
	}*/
	
	/*@Test
	public void checkEmptyCredentials() {
		driver.findElement(By.id("email-input"));
        driver.findElement(By.id("password-input"));
      driver.findElement(By.id("login-button")).click();
      WebElement emailErrorMessage = driver.findElement(By.xpath("//div[contains(text(),'Email is required')]"));
	Assert.assertTrue(emailErrorMessage.getText().equals("Email is required"));
	  WebElement passwordErrorMessage = driver.findElement(By.xpath("//div[contains(text(),'Password is required')]"));
		Assert.assertTrue(passwordErrorMessage.getText().equals("Password is required"));
		
	}*/
	
	/*@Test
	public void checkEmptyEmail() {
		driver.findElement(By.id("email-input"));
        driver.findElement(By.id("password-input")).sendKeys("password");
      driver.findElement(By.id("login-button")).click();
      WebElement emailErrorMessage = driver.findElement(By.xpath("//div[contains(text(),'Email is required')]"));
	Assert.assertTrue(emailErrorMessage.getText().equals("Email is required"));
	}*/
	
	/*@Test
	public void checkEmptyPassword() {
		driver.findElement(By.id("email-input")).sendKeys("login@codility.com");
        driver.findElement(By.id("password-input"));
      driver.findElement(By.id("login-button")).click();
	  WebElement passwordErrorMessage = driver.findElement(By.xpath("//div[contains(text(),'Password is required')]"));
		Assert.assertTrue(passwordErrorMessage.getText().equals("Password is required"));
	
	}*/
	
	
	
	
	
	
	
	
	

}
