import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PrimeFactorsTest {

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
	public void testOne() {
		assertEquals(this.list(), PrimeFactors.generate(1));
	}
	
	
	@Test
	public void testTwo(){
		assertEquals(this.list(2), PrimeFactors.generate(2));
	}
	
	@Test
	public void testThree(){
		assertEquals(this.list(3), PrimeFactors.generate(3));
	}
	
	@Test
	public void testFour(){
		assertEquals(this.list(2,2), PrimeFactors.generate(4));
	}
	
	@Test
	public void testFive(){
		assertEquals(this.list(2,3), PrimeFactors.generate(6));
	}
	
	@Test
	public void testSix(){
		assertEquals(this.list(2,2,2), PrimeFactors.generate(8));
	}
	
	@Test
	public void testSeven(){
		assertEquals(this.list(3,3), PrimeFactors.generate(9));
	}
	
	private List<Integer> list(int... ints){
		List<Integer> list = new ArrayList<Integer>();
		for(int i : ints){
			list.add(i);
		}
		return list;
	}
}
