package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample2 extends BaseTest{

	@Test
	public void xpathExample() {
		
		//parent
		driver.findElement(By.xpath("//a[contains(@class, 'popup_link')]/parent::li[@class='menu_user_login']")).click();
		
		//descendant si child
		////ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]/child::div[contains(@class, 'login_field')/child::input[@id='log']]
		WebElement username = driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::form[contains(@class, 'popup_form')]/child::div[contains(@class, 'login_field')]/child::input[@id='log']"));
		username.sendKeys("TestUser");
	
		driver.findElement(By.xpath("//ul[@id='menu_user']/descendant::input[@id='password']")).sendKeys("12345@67890");
		
		//following sibling
		driver.findElement(By.xpath("//div[contains(@class, 'login_field')]/following-sibling::div[contains(@class, 'remember_field')]/input ")).click();
	
		//preceding
		driver.findElement(By.xpath("//form[contains(@class, 'login_form')]/preceding::input[@class='submit_button']")).click();
		
	}
	
	
}
