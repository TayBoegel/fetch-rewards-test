package setUp;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
	
	private WebDriver driver;
	
	private String FBLoginPage = "https://facebook.com";
	
	
	@BeforeMethod
	public void openweb() {
		
		//This disables notification pop-ups
		Map<String, Object> prefs = new HashMap<String, Object>();
		  prefs.put("profile.default_content_setting_values.notifications", 2);
		  ChromeOptions options = new ChromeOptions();
		  options.setExperimentalOption("prefs", prefs);
		  
		//This opens the notification-free browser
		setDriver(new ChromeDriver(options));
		
		//This maximizes the browser so it's easier to locate elements
		getDriver().manage().window().maximize();
		
	}


	@AfterMethod
	public void closeweb() {
		//This closes the browser after the test is run
		getDriver().close();
	}
	
	
	//Getters and setters for the driver and URLs to use on the testing pages
	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}


	public String getFBLoginPage() {
		return FBLoginPage;
	}


	public void setFBLoginPage(String fBLoginPage) {
		FBLoginPage = fBLoginPage;
	}
	

}
