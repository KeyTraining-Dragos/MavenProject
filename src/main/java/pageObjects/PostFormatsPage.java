package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostFormatsPage {

	public WebDriver driver;
	
	public PostFormatsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By searchField = By.cssSelector("input[title='Search for:']");
	
}
