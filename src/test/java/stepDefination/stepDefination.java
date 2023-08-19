package stepDefination;

import java.io.IOException;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.base;

public class stepDefination extends base {

	@Given("Initialize the  Browser with Chrome")
	public void initialize_the_browser_with_chrome() throws IOException {
		driver = initializeDriver();
	}

	@Given("Naviagte to {string} site")
	public void naviagte_to_site(String string) {
		driver.get(string);
	}

	@Given("Click on Login link in HomePage  to land SignIn Page")
	public void click_on_login_link_in_home_page_to_land_sign_in_page() {
		LandingPage l = new LandingPage(driver);
		// LoginPage lp= l.getLogin();
		if (l.getpopupSize()> 0) {
			l.getpopup().click();
		}

	}

	/*@When("User Enters {string} and {string} and logs in")
	public void user_enters_and_and_logs_in(String string, String string2) {
		LandingPage l = new LandingPage(driver);
		LoginPage lp = l.getLogin();
		lp.getEmail().sendKeys(string);
		lp.getPass().sendKeys(string2);
		lp.getLogin().click();
	}*/

	@Then("Veify that user is successfully logged in")
	public void veify_that_user_is_successfully_logged_in() {

	/*	PortalHomePage p = new PortalHomePage(driver);
		Assert.assertTrue(p.getsearchBox());  */

		System.out.println("User is logged in");
	}
	
	@When("^User Enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LandingPage l = new LandingPage(driver);
		LoginPage lp = l.getLogin();
		lp.getEmail().sendKeys(username);
		lp.getPass().sendKeys(password);
		lp.getLogin().click();
    }
	
	@And("^close the browser$")
    public void close_the_browser() throws Throwable {
        driver.quit();
    }
	
}
