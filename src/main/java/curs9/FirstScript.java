package curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScript {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		ChromeOptions chOpt = new ChromeOptions();
		chOpt.addArguments("--remote-allow-origins=*");
		//driver =  new ChromeDriver(chOpt);
		driver =  new FirefoxDriver();
		driver.get("https://keybooks.ro/");


	}

	@Test
	public void openBrowser() throws InterruptedException {
		//firefox.get("https://keybooks.ro/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}
