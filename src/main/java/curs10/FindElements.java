package curs10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FindElements extends BaseTest {
	
	
	@Test
	public void findElements() {
		
		List<WebElement> books = driver.findElements(By.cssSelector("h3[class*='sc_title']"));
		System.out.println(books.size());
		books.get(2).click();
		
		
		
	}

}
