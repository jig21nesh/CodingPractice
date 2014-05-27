package com.puzzels.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpecialPythagoreanTripletTests {

	@Test
	public void shouldReturn25WhenGiven5() {
		SpecialPythagoreanTriplet object = new SpecialPythagoreanTriplet();
		int input = 5;
		int expected = 25;
		
		assertEquals(expected, object.getSquare(input));
	}
	
	@Test
	public void shouldReturn16WhenGiven4() {
		SpecialPythagoreanTriplet object = new SpecialPythagoreanTriplet();
		int input = 4;
		int expected = 16;
		
		assertEquals(expected, object.getSquare(input));
	}
	
	@Test
	public void shoudlReturn345WhenTheLimitIs10ForGivenABCNumber(){
		SpecialPythagoreanTriplet object = new SpecialPythagoreanTriplet();
		int inputLimit = 1000; //ABC is less than 10
		int[] exptected = {3,4,5};
		assertArrayEquals(exptected, object.findABC(inputLimit));
	}

}
