package curs10;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void softAssertion() {
		
		System.out.println("Soft assert start");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("Soft assert continues");
		sa.assertEquals(10, 16);
		sa.assertEquals("Text", "Nimic");
		System.out.println("Soft assert ends here");
		sa.assertAll();//mandatory
		
	}
	
	@Test
	public void hardAssertion() {
		System.out.println("hard assert start");
		assertTrue(false);
		
		System.out.println("hard assert continues");
		assertEquals(10, 16);
		assertEquals("Text", "Nimic");
		System.out.println("hard assert ends here");
	}
	
	
}
