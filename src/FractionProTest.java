import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class FractionProTest {

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
	public void testGetNumeratorValidNumber() {
		FractionPro f = new FractionPro();
		try{
			assertEquals(1, f.getNumerator("1/5"));
		}catch(Exception e){
			
		}
		
	}
	
	@Test
	public void testGetNumeratorValidNumber23() {
		FractionPro f = new FractionPro();
		try{
			assertEquals(2, f.getNumerator("2/3"));
		}catch(Exception e){
			
		}
		
	}
	
	@Test
	public void testGetDenominatorValidNumber() {
		FractionPro f = new FractionPro();
		try{
			assertEquals(5, f.getDenominator("1/5"));
		}catch(Exception e){
			
		}
		
	}
	
	@Test
	public void testGetDenominatorValidNumber23() {
		FractionPro f = new FractionPro();
		try{
			assertEquals(3, f.getDenominator("2/3"));
		}catch(Exception e){
			
		}
		
	}
	
	@Test
	public void testDoesFractionNumberHasIntegerYes(){
		FractionPro f = new FractionPro();
		assertTrue(f.doesFractionNumberHasInteger("2,1/2"));
	}
	
	@Test
	public void testDoesFractionNumberHasIntegerNo(){
		FractionPro f = new FractionPro();
		assertFalse(f.doesFractionNumberHasInteger("1/2"));
	}
	
	
	@Test
	public void testGetIntFromFractionNumberYes() throws Exception{
		FractionPro f = new FractionPro();
		assertEquals(2,f.getIntFromFractionNumber("2,1/2"));
	}
	
	@Test(expected=Exception.class)
	public void testGetIntFromFractionNumberNo() throws Exception{
		FractionPro f = new FractionPro();
		f.getIntFromFractionNumber("1/2");
	}
	
	@Test
	public void testSumFractionNumber(){
		FractionPro f = new FractionPro();
		try{
			assertEquals("5/6",f.sumFractionNumber("2\n1/2\n1/3 "));
		}catch(Exception e){
			
		}
		
	}
	
	@Test
	public void testSumFractionNumberTwo(){
		FractionPro f = new FractionPro();
		try{
			assertEquals("1",f.sumFractionNumber("3\n1/3\n2/6\n3/9"));
		}catch(Exception e){
			
		}
		
	}

}
