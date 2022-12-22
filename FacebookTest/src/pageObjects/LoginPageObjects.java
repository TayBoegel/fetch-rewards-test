package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import setUp.BasePage;

public class LoginPageObjects extends BasePage {
	

	public LoginPageObjects(WebDriver driver) {
		super(driver);
	}
	
	
	public WebElement getEmailEntry() {
		return getDriver().findElement(By.id("email"));
		
	}
	
	public WebElement getPasswordEntry() {
		return getDriver().findElement(By.id("pass"));
		
	}
	
	public WebElement getLoginBtn() {
		return getDriver().findElement(By.name("login"));
		
	}

}
