package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {

	public WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	
	public By zoomOutButton = By.cssSelector("button[title = 'Zoom out']");
	public By iframe = By.tagName("iframe");
	public By outsideMap = By.partialLinkText("map");
	
	
	public void zoomMap(By locator) {
		WebElement iFrame =  driver.findElement(iframe);
		driver.switchTo().frame(iFrame);
		driver.findElement(locator).click();
	}
	
	
	public void redirectMap() {
		driver.findElement(outsideMap).click();
	}
}
