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

public class ValidateTitle extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void openBrowser() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialised");
	}

	@Test
	public void textCheck() throws IOException {

		//driver.get("http://qaclickacademy.com");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to HomePage");
		LandingPage l = new LandingPage(driver);
		// System.out.println(l.getTitle().getText());
		// this method wont fail even title mismatch so need assertions here
		String actual = l.getTitle().getText();
		Assert.assertEquals(actual, "FEATURED COURSES123");
		log.info("Successfully validated Text Message");
		// Assert.assertTrue(false);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();

	}
}
