package com.puzzels.mathtests;

import static org.junit.Assert.*;

import com.puzzels.math.SumSquareDifference;
import org.junit.Test;

public class SumSquareDifferenceTests {

	@Test
	public void shouldReturn4WhenInputGiveIs2() {
		SumSquareDifference object = new SumSquareDifference();
		assertEquals(4, object.getSquareForGivenNumber(2));
	}
	
	@Test
	public void shouldReturn2640WhenTheRangeIs1to10(){
		SumSquareDifference object = new SumSquareDifference();
		assertEquals(2640, object.getDifferent(1, 10));
	}
	
	@Test
	public void shouldReturn251641500WhenTheRangeIs1to100(){
		SumSquareDifference object = new SumSquareDifference();
		assertEquals(25164150, object.getDifferent(1, 100));
	}

}
