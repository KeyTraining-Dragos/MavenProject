package curs12;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ImplictWait extends BaseTest {

	
	@Test
	public void testWait() throws InterruptedException {
		//in linkul de mai jos , elementul exista in pagina si este hidden
		//astfel IMPLICT WAIT il gaseste si nu se activeaza (nu asteapta)
		//driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

		//in linkul de mai jos, elementul NU exista in pagina 
		//astfel IMPLICT WAIT nu il gaseste si se activeaza (il asteapta)
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		//Thread.sleep(10000);//bad practice
		WebElement finish = driver.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finish.getText(), "Hello World!");
	}
	
	
}
