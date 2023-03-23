package curs10;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AssertionExample {

	String expectedTitle = "Test";
	String actualTile = "Altceva";
	
	@Test
	public void checkTitle() {
		
		if(expectedTitle.equals(actualTile)) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
		
	}
	@Test
	public void checkTitle2() {
		assertEquals(expectedTitle, actualTile);
	}
	
	
}
