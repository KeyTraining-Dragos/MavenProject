package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	public By loginLink = By.linkText("Login");
	public By contactsLink = By.linkText("CONTACTS");
	public By shopLink = By.linkText("BOOKS");
	//driver.findElement(By.linkText("Login")).click();
	// indentificare element                  + actiune pe element
	//metoda findElemenet + locator (By.linkText("Login"))
	//driver.findElement(locator) ==> locator == loginLink
	//driver.findElement(loginLink)
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	//MenuPage menu = new MenuPage(driver);
	//menu.navigateTo(menu.loginlink);
	//menu.navigateTo(menu.contactsLink);


}
