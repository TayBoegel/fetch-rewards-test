package setUp;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
private static WebDriver driver;
	
	public BasePage(WebDriver driver) {BasePage.setDriver(driver); }

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		BasePage.driver = driver;
	}

}
