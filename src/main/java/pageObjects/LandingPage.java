package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	/*
	 * here u created but has no life i.e where r u telling this driver have
	 * knowledge of initialize C browser
	 */
	By login = By.cssSelector("a[href='https://rahulshettyacademy.com/sign_in/']");
	By title = By.cssSelector("div[class='text-center'] h2");
	By naviBar = By.cssSelector(".navbar-collapse.collapse");
	By popup = By.xpath("//button[text()='NO THANKS']");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public LoginPage getLogin() {
		driver.findElement(login).click();
		// LoginPage lp=new LoginPage(driver);
		return new LoginPage(driver);

	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNavigationBar() {
		return driver.findElement(naviBar);
	}

	public int getpopupSize() {
		return driver.findElements(popup).size();	}

	public WebElement getpopup() {
		return driver.findElement(popup);
	}

}
