package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
	
	public By logoutButton = By.cssSelector("li[class='menu_user_logout']>a");
	public By blogLink = By.linkText("BLOG");
	public By postFormatsLink = By.linkText("Post Formats");
	
	public void hoverElement(By locator) {
		WebElement element =  driver.findElement(locator);
		Actions action =  new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	public void logoutFromApp() {
		driver.findElement(logoutButton).click();
	}
	
	
	//MenuPage menu = new MenuPage(driver);
	//menu.navigateTo(menu.loginlink);
	//menu.navigateTo(menu.contactsLink);


}
