import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GameTest {
	
	private Game g;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		g = new Game();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	private void rollMany(int n, int pins){
		for(int index = 0 ; index < n; ++index){
			g.roll(pins);
		}
	}

	@Test
	public void testGutterGame() {
		this.rollMany(20, 0);
		assertEquals(0, g.score());
	}
	
	
	@Test
	public void testAllOnes() {
		this.rollMany(20, 1);
		assertEquals(20, g.score());
	}
	
	@Test
	public void testOneSpare() {
		this.rollSpare();
		g.roll(3);
		rollMany(17, 0);
		assertEquals(16, g.score());
	}
	
	
	@Test
	public void testOneStrike() {
		g.roll(10);
		g.roll(3);
		g.roll(4);
		rollMany(16, 0);
		assertEquals(24, g.score());
	}
	
	private void rollSpare(){
		g.roll(5);
		g.roll(5);
	}
}

