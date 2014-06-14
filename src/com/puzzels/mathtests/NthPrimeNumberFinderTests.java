package com.puzzels.mathtests;

import static org.junit.Assert.*;

import com.puzzels.math.NthPrimeNumberFinder;
import org.junit.Test;

public class NthPrimeNumberFinderTests {

	@Test
	public void shouldReturn2WhenTheGivenNthNumberIs1() {
		NthPrimeNumberFinder object = new NthPrimeNumberFinder();
		assertEquals(2, object.getNthPrimeNumber(1));
	}
	
	@Test
	public void shouldReturn13WhenTheGivenNthNumberIs6() {
		NthPrimeNumberFinder object = new NthPrimeNumberFinder();
		assertEquals(13, object.getNthPrimeNumber(6));
	}
	
	
	@Test
	public void shouldReturn104743WhenTheGivenNthNumberIs10001() {
		NthPrimeNumberFinder object = new NthPrimeNumberFinder();
		assertEquals(104743, object.getNthPrimeNumber(10001));
	}
}
