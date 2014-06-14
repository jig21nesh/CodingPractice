package com.puzzels.mathtests;

import static org.junit.Assert.*;

import com.puzzels.math.SmallestMultiple;
import org.junit.Test;

public class SmallestMultipleTests {

	@Test
	public void shouldReturn2520WhenInputRangeIs1To10() {
		SmallestMultiple object = new SmallestMultiple();
		assertEquals(2520, object.getSmallestMultipleForGivenRange(1,10));
	}
	
	@Test
	public void shouldReturn232792560WhenInputRangeIs1To20() {
		SmallestMultiple object = new SmallestMultiple();
		assertEquals(232792560, object.getSmallestMultipleForGivenRange(1,20));
	}

}
