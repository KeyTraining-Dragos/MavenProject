package curs11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectorExample extends BaseTest {

	
	//@Test
	public void cssSelectorTest() {
		
		//  #--->id
		//  #menu_user --> cauta orice element care are id="menu_user"
		// ul#menu_user --> cauta orice element UL care are id = "menu_user"
		// ul[id='menu_user']  --> cauta orice element UL care are id = "menu_user"
		
		// # == [id=]
		
		WebElement loginMenu = driver.findElement(By.cssSelector("#menu_user"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", loginMenu);
		
		// . --> class
		// .logo_slogan  --> cauta orice element care are class = logo_slogan
		// div.logo_slogan  --> cauta orice element DIV care are class = logo_slogan
		// div[class='logo_slogan']--> cauta orice element DIV care are class = logo_slogan
		WebElement logo = driver.findElement(By.cssSelector("div.logo_slogan"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", logo);
		
		
		//div.column-1_2 h3.sc_title
		//div[class = 'column-1_2'] h3.sc_title
		//div[class = 'column-1_2'] h3[class ='sc_title']
		WebElement inspireText = driver.findElement(By.cssSelector("div.column-1_2 h3.sc_title"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", inspireText);
				
	}
	
	@Test
	public void cssSelector2() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//h3[class='sc_title sc_title_regular sc_align_center margin_bottom_tiny']
		//CSS Wildcards
		//  * --> contains
		//h3[class*='sc_title_regular']
		WebElement bookTitle = driver.findElement(By.cssSelector("h3[class*='sc_title_reg']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", bookTitle);
		// ~ --> contains word
		WebElement bookTitle2 = driver.findElement(By.cssSelector("h3[class~='sc_title_regular']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')", bookTitle2);
		// ^ --> starts -with
		WebElement bookTitle3 = driver.findElement(By.cssSelector("a[href^='life']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')", bookTitle3);
		// $ --> ends -with
		WebElement bookTitle4 = driver.findElement(By.cssSelector("a[href$='nce']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')", bookTitle4);
	}
	
	
	
}
