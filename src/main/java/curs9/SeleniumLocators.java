package curs9;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLocators {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		ChromeOptions chOpt = new ChromeOptions();
		chOpt.addArguments("--remote-allow-origins=*");
		//driver =  new ChromeDriver(chOpt);
		driver =  new FirefoxDriver();
		driver.get("https://keybooks.ro/");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(priority = 1)
	public void linkTextLocator() {
		//<a href="https://keybooks.ro/shop/">Books</a>
		WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
		booksLink.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	}
	
	@Test(priority = 2)
	public void partialLinkTextLocator() {
		WebElement cookingBook =  driver.findElement(By.partialLinkText("Cooking"));
		cookingBook.click();
	}
	
	@Test(priority=3)
	public void classNameLocator() {
		WebElement searchIcon =  driver.findElement(By.className("icon-search"));
		searchIcon.click();
	}
	
	@Test(priority=4)
	public void nameLocator() {
		WebElement searchField = driver.findElement(By.name("s"));
		searchField.sendKeys("TEST");
	}
	
}
