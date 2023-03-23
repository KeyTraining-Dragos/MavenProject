package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	
public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		ChromeOptions chOpt = new ChromeOptions();
		chOpt.addArguments("--remote-allow-origins=*");
		//driver =  new ChromeDriver(chOpt);
		driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
}
