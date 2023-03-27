package curs11;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class IsSelectedExample extends BaseTest{

	@Test
	public void isSelectedTest() {
		
		driver.findElement(By.cssSelector("li[class='menu_user_login']>a")).click();
		WebElement rememberMe = driver.findElement(By.cssSelector("li div[class*='popup_form_field'] input#rememberme"));
		
		System.out.println(rememberMe.isSelected());
		//assertTrue(rememberMe.isSelected());
		
		rememberMe.click();
		System.out.println(rememberMe.isSelected());
		assertTrue(rememberMe.isSelected());
		
		
	}
	
	
}
