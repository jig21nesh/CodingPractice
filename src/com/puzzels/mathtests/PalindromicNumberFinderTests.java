package com.puzzels.mathtests;

import static org.junit.Assert.*;

import com.puzzels.math.PalindromicNumberFinder;
import org.junit.Test;

public class PalindromicNumberFinderTests {

	@Test
	public void testPalindromicNumberGeneratedBy2LengthNumbers() {
		PalindromicNumberFinder finder = new PalindromicNumberFinder();
		int expected = 9009;
		int lengthOfNumbersFromWhichItGeneratedPalindromicNumber = 2;
		assertEquals(expected, finder.getPalindromicNumberFinder(lengthOfNumbersFromWhichItGeneratedPalindromicNumber));
	}
	
	@Test
	public void shouldReturnTrueWhenInputIs2Given() {
		PalindromicNumberFinder finder = new PalindromicNumberFinder();
		assertTrue(finder.isNumberLengthValid(2, 1));
	}
	
	@Test
	public void shouldReturnTrueWhenInputIs99Given() {
		PalindromicNumberFinder finder = new PalindromicNumberFinder();
		assertFalse(finder.isNumberLengthValid(99, 1));
	}
	
	@Test
	public void shouldReturn10WhenInputIs2() {
		PalindromicNumberFinder finder = new PalindromicNumberFinder();
		assertEquals(10, finder.getFirstNumberOfGivenLength(2));
	}
	
	@Test
	public void shouldReturn1WhenInputIs1() {
		PalindromicNumberFinder finder = new PalindromicNumberFinder();
		assertEquals(1, finder.getFirstNumberOfGivenLength(1));
	}
	
	@Test
	public void shouldReturn99WhenInputIs2() {
		PalindromicNumberFinder finder = new PalindromicNumberFinder();
		assertEquals(99, finder.getLastNumberOfGivenLength(2));
	}
	
	@Test
	public void shouldReturn9WhenInputIs1() {
		PalindromicNumberFinder finder = new PalindromicNumberFinder();
		assertEquals(9, finder.getLastNumberOfGivenLength(1));
	}
	
	

}

