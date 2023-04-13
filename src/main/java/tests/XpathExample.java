package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest {
	
	@Test(priority = 1)
	public void xpathExample() throws InterruptedException {
		JavascriptExecutor jse =  (JavascriptExecutor)driver;

		//css -->   li[class='menu_user_login']
		//xpath -->  //li[@class='menu_user_login']
		
		WebElement loginPopup = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", loginPopup);
		loginPopup.click();
		
		//OR
		WebElement userField = driver.findElement(By.xpath("//input[@id='log' or @name='log']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", userField);
		userField.sendKeys("TestUser");
		
		//AND
		WebElement passwordField =  driver.findElement(By.xpath("//input[@id='password' and @name='pwd']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", passwordField);
		passwordField.sendKeys("12345@67890");
		
		//index
		WebElement submitButton =  driver.findElement(By.xpath("(//input[@class='submit_button'])[1]"));
		submitButton.click();
		
		Thread.sleep(4000);
	}
	
	@Test(priority =2)
	public void xpathExample2() {
		JavascriptExecutor jse =  (JavascriptExecutor)driver;

		driver.findElement(By.xpath("//span[@class=\"user_name\"]")).click();
		
		driver.findElement(By.xpath("//a[contains(text() , 'Settings')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'orde')]")).click();
		
		WebElement order =  driver.findElement(By.xpath("//th[contains(@class, 'woocommerce-orders-table__header')]/span[contains(text(), 'Order')]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", order);

		WebElement order1720 = driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[contains(text(), '1720')]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red;')", order1720);

		//NOT
		WebElement orders =  driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell')][@data-title='Order']/a[not(contains(text(), '1720'))]"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red;')", orders);

	}
	
	

}
