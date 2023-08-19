
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassWordPage {
	public WebDriver driver;

	By fogEmail = By.xpath("//input[@id='user_email']");
	By sendInstru = By.cssSelector("input[value='Send Me Instruction']");

	public ForgotPassWordPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(fogEmail);
	}
	
	public WebElement getInstructions() {
		return driver.findElement(sendInstru);
	}

}
