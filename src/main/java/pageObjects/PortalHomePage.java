package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PortalHomePage {
	public WebDriver driver;
	By searchBox = By.name("query");

	public PortalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public boolean getsearchBox() {

	return driver.findElement(searchBox).isDisplayed();
	}

}
