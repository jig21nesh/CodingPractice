import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StringCalcTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddStringMethod() {
		StringCalc c = new StringCalc();
		//assertEquals(0, c.add(""));
	}
	
	@Test
	public void testAddStringForNullInputString(){
		StringCalc c = new StringCalc();
		assertEquals(0, c.add(""));
	}
	
	@Test
	public void testAddStringForOneInputString(){
		StringCalc c = new StringCalc();
		assertEquals(1, c.add("1"));
	}
	
	@Test
	public void testAddStringForTwoInputString(){
		StringCalc c = new StringCalc();
		assertEquals(3, c.add("1,2"));
	}
	
	@Test
	public void testAddStringForNInputString(){
		StringCalc c = new StringCalc();
		assertEquals(12, c.add("1,2,4,3,2"));
	}
	
	@Test
	public void testAddStringForNewLineInputString(){
		StringCalc c = new StringCalc();
		assertEquals(6, c.add("1\n2,3"));
	}
	
	@Test
	public void testAddStringForInvalidInputString(){
		StringCalc c = new StringCalc();
		assertEquals(1, c.add("1,\n"));
	}
	
	@Test
	public void testAddStringForSpecialInputString(){
		StringCalc c = new StringCalc();
		assertEquals(3, c.add("//;\n1;2"));
	}
	
	
	@Test
	public void testAddStringForOverLimitInputString(){
		StringCalc c = new StringCalc();
		assertEquals(1, c.add("1,2000"));
	}
	
	@Test
	public void testAddStringForSpecialDelInputString(){
		StringCalc c = new StringCalc();
		assertEquals(3, c.add("//;;;\n1;;;2"));
	}
	
	
	@Test
	public void testAddStringForSpecialDel2InputString(){
		StringCalc c = new StringCalc();
		assertEquals(3, c.add("//:;;;\n1:;;;2"));
	}
}
