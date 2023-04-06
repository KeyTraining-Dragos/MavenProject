package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MenuPage;
import utils.BaseTest;

public class DataProviderExample extends BaseTest {
	
	@DataProvider
	public Object[][] loginTestData(){
		
		Object[][] data = new Object[3][3];
		data[0][0] = "TestUser";
		data[0][1] = "12345@67890";
		data[0][2] = true;
		
		
		data[1][0] = "user Gresit";
		data[1][1] = "parola gresita";
		data[1][2] = false;
		
		data[2][0] = "test.test";
		data[2][1] = "test.test@123";
		data[2][2] = true;
		
		return data;
	}
	

	@Test(dataProvider = "loginTestData")
	public void loginTest(String username, String password, boolean success) {
		MenuPage menu =  new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp(username, password);
		if(success) {
			menu.logoutFromApp();

		}else if(!success) {
			login.closeLoginPopUp();
		}
	}
	
}
