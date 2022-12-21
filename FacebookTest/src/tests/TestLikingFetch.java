package tests;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.MainPageObjects;
import pageObjects.ProductPageObjects;
import setUp.TestInit;

public class TestLikingFetch extends TestInit {
	
	
	
	
  @Test
  public void likingFetch() {
	  
	  //For accessing page objects
	  LoginPageObjects loginPageObjects = new LoginPageObjects(getDriver());
	  MainPageObjects mainPageObjects = new MainPageObjects(getDriver());
	  ProductPageObjects productPageObjects = new ProductPageObjects(getDriver());

	  //Open Facebook
	  getDriver().get(getFBLoginPage());

	  //Login to account
	  loginPageObjects.getEmailEntry().sendKeys("taylormboegel+test@gmail.com");
	  loginPageObjects.getPasswordEntry().sendKeys("Thisisatestforfetch1!");
	  loginPageObjects.getLoginBtn().click();
	  
	  getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  
	  //Searching for Fetch Rewards
	  mainPageObjects.getSearchField().sendKeys("Fetch Rewards");
	  mainPageObjects.getSearchField().sendKeys(Keys.ENTER);
	  
	  getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  
	  //Selecting the Fetch page that I want
	  mainPageObjects.getFetchLink().click();
	  
	  //Wait until the page is appropriately loaded
	  Boolean waitForFetchPage = new WebDriverWait(getDriver(), Duration.ofSeconds(8))
				 .until(ExpectedConditions.urlContains("https://www.facebook.com/FetchRewards"));
	  
	  //Click the page-specific like button
	  productPageObjects.getLikeBtn().click();
	  getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  
	  //Verify that the page has been liked
	  Assert.assertEquals(true, productPageObjects.getClickedLikeBtn().isDisplayed());
	  
	  
  }
  
  
}
