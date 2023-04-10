package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObjects.ContactPage;
import pageObjects.MenuPage;
import pageObjects.ShopPage;
import utils.BaseTest;

public class NavigationExample extends BaseTest {

	//@Test
	public void navigateTest() {	
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);		
		ShopPage shop = new ShopPage(driver);
		assertTrue(driver.findElement(shop.addToCartButton).isDisplayed());		
		menu.navigateTo(menu.contactsLink);	
		ContactPage contact = new ContactPage(driver);
		assertTrue(driver.findElement(contact.iframe).isDisplayed());
		
	}
	
	@Test
	public void navigateTest2() {
		app.menu.navigateTo(app.menu.shopLink);
		assertTrue(driver.findElement(app.shop.addToCartButton).isDisplayed());
		app.menu.navigateTo(app.menu.contactsLink);
		assertTrue(driver.findElement(app.contact.iframe).isDisplayed());
	
	}
	
}
