package com.puzzels.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfEvenFbNumberTests {

	
	@Test
	public void getZeroElmentOfFB() {
		SumOfEvenFbNumber object = new SumOfEvenFbNumber();
		
		int numberOfElements = 0;
		int[] expectedElements = {};
		
		assertArrayEquals(expectedElements, object.getFbElements(numberOfElements));
	}
	
	
	@Test
	public void getFirstElmentOfFB() {
		SumOfEvenFbNumber object = new SumOfEvenFbNumber();
		
		int numberOfElements = 1;
		int[] expectedElements = {1};
		
		assertArrayEquals(expectedElements, object.getFbElements(numberOfElements));
	}
	
	@Test
	public void getFirstTwoElmentOfFB() {
		SumOfEvenFbNumber object = new SumOfEvenFbNumber();
		
		int numberOfElements = 2;
		int[] expectedElements = {1,2};
		
		assertArrayEquals(expectedElements, object.getFbElements(numberOfElements));
	}
	
	@Test
	public void getFirstThreeElmentOfFB() {
		SumOfEvenFbNumber object = new SumOfEvenFbNumber();
		
		int numberOfElements = 3;
		int[] expectedElements = {1,2,3};
		
		assertArrayEquals(expectedElements, object.getFbElements(numberOfElements));
	}

}
