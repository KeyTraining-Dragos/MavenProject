package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	//locatori
	public By username = By.id("log");
	public By password = By.id("password");
	public By loginButton = By.cssSelector("input[class='submit_button']");
	public By successMessage = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By closePopUp = By.cssSelector("a[class='popup_close']");
	
	public void loginInApp(String user, String pass) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	
	public boolean successMsgisDisplayed() {
		return driver.findElement(successMessage).isDisplayed();
	}
	
	public void closeLoginPopUp() {
		driver.findElement(closePopUp).click();
	}
	
}
