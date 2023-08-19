package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateNaviBar extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
    
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}

	@Test
	public void basePageNaviBar() throws IOException {
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("NavaigationBar Validated Successfully");

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}