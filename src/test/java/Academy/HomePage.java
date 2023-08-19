package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassWordPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password) throws IOException {

		driver.get("http://qaclickacademy.com");
		/*
		 * 2 ways to access the method of other class a)inheritance b)creating object of
		 * that class
		 */
		LandingPage l = new LandingPage(driver);
		LoginPage lp=l.getLogin();
		// LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPass().sendKeys(password);
		lp.getLogin().click();
	//	log.info(text);
		ForgotPassWordPage fp=lp.getForgotPass();
		fp.getEmail().sendKeys("abcd");
		fp.getInstructions().click();

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

	@DataProvider
	public Object[][] getData() {
		/*
		 * Row stands for how many different set data types (like +ve ,-ve)should run
		 * columns stands for how many values per each test 3 = 0,1,2 (total 3 type )
		 */
		Object[][] data = new Object[2][2];
		data[0][0] = "nonrestricteduser@gamil.com";
		data[0][1] = "1234";
	//	data[0][2]="NonRestricted User";

		data[1][0] = "restricteduser@gamil.com";
		data[1][1] = "5678";
    //    data[1][2]= "Restricted User";
		return data;

	}

}