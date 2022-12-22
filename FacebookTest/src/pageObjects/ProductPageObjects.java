package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import setUp.BasePage;

public class ProductPageObjects extends BasePage {

	public ProductPageObjects(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getLikeBtn() {
		return getDriver().findElement(By.xpath("//div[@aria-label='Like']//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xbxaen2 x1u72gb5 x1hr4nm9 x1r1pt67']"));
		
	}
	
	public WebElement getClickedLikeBtn() {
		return getDriver().findElement(By.cssSelector("div[aria-label='Liked']"));
		
	}
	

	

}
