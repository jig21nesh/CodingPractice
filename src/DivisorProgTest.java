import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DivisorProgTest {

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
	public void test6(){
		DivisorProg p = new DivisorProg();
		assertEquals("1,2,3,", p.generateDivisor(6));
	}
	
	@Test
	public void test100(){
		DivisorProg p = new DivisorProg();
		assertEquals("1,2,4,5,10,20,25,50,", p.generateDivisor(100));
	}
	
	@Test
	public void test39(){
		DivisorProg p = new DivisorProg();
		assertEquals("1,3,13,", p.generateDivisor(39));
	}
	
	

}
