import static org.junit.Assert.*;

import org.junit.Test;


public class RomanToNumeralTest {

	RomanToNumeral converter = new RomanToNumeral();
	
	@Test
	public void testI() {
		assertEquals(1, converter.RomanToNumeral("I"));
	}
	
	@Test
	public void testII() {
		assertEquals(2, converter.RomanToNumeral("II"));
	}

	@Test
	public void testV() {
		assertEquals(5, converter.RomanToNumeral("V"));
	}
	
	@Test
	public void testVI() {
		assertEquals(6, converter.RomanToNumeral("VI"));
		
	}
	
	@Test
	public void testX() {
		assertEquals(10, converter.RomanToNumeral("X"));
		
	}
	
	@Test
	public void testXI() {
		assertEquals(11, converter.RomanToNumeral("XI"));
		
	}
	
	@Test
	public void testCI() {
		assertEquals(101, converter.RomanToNumeral("CI"));
		
	}
	
	@Test
	public void testMCCLIX() {
		assertEquals(1259, converter.RomanToNumeral("MCCLIX"));
		
	}
	
	@Test
	public void testhello() {
		assertEquals(-1000, converter.RomanToNumeral("hello"));
		
	}

	
	@Test
	public void testMCL() {
		assertEquals(1150, converter.RomanToNumeral("MCL"));
		
	}
	
	@Test
	public void testIV() {
		assertEquals(4, converter.RomanToNumeral("IV"));
		
	}
	
	@Test
	public void testCD() {
		assertEquals(400, converter.RomanToNumeral("CD"));
		
	}

	

}
