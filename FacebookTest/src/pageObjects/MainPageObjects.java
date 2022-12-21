package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import setUp.BasePage;

public class MainPageObjects extends BasePage{

	public MainPageObjects(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getSearchField() {
		return getDriver().findElement(By.xpath("//div[@role='banner']//input[@aria-label='Search Facebook']"));
		
	}
	
	public WebElement getFetchLink() {
		return getDriver().findElement(By.xpath("//a[@aria-label='Fetch, Verified account']"));
		
	}

}
