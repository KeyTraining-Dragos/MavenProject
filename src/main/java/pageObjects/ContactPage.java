package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.Log;


public class ContactPage {

	public WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	
	public By zoomOutButton = By.cssSelector("button[title = 'Zoom out']");
	public By iframe = By.tagName("iframe");
	public By outsideMap = By.partialLinkText("map");
	public By nameFiled =  By.cssSelector("input[name='your-name']");

	
	
	public void zoomMap(By locator) {
		Log.info("Called method <ZoomMap>");
		WebElement iFrame =  driver.findElement(iframe);
		Log.info("Called locator " + locator);
		driver.switchTo().frame(iFrame);
		driver.findElement(locator).click();
	}
	
	
	public void redirectMap() {
		driver.findElement(outsideMap).click();
	}
}
