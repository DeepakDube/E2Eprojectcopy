package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	/*
	 * here u created but has no life i.e where r u telling this driver have
	 * knowledge of initialize C browser
	 */
	By email = By.id("user_email");
	By pass = By.id("user_password");
	By login = By.xpath("//input[@name='commit']");
	By forgotPassword=By.xpath("//a[normalize-space()='Forgot Password?']");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);

	}

	public WebElement getPass() {
		return driver.findElement(pass);

	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public ForgotPassWordPage getForgotPass() {
		driver.findElement(forgotPassword).click();
		/*ForgotPassWordPage fp=new ForgotPassWordPage(driver);
		return fp;*/
	return	new ForgotPassWordPage(driver);
		
		
	}
}
