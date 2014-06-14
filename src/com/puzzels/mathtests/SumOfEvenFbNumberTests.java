package com.puzzels.mathtests;

import static org.junit.Assert.*;

import com.puzzels.math.SumOfEvenFbNumber;
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
	
	
	@Test
	public void getSumOfFBTermsWhenHighestValueTermIs5() {
		SumOfEvenFbNumber object = new SumOfEvenFbNumber();
		assertEquals(2, object.sumOfEvenFBTerms(5));
	}
	
	@Test
	public void getSumOfFBTermsWhenHighestValueTermIs10() {
		SumOfEvenFbNumber object = new SumOfEvenFbNumber();
		assertEquals(10, object.sumOfEvenFBTerms(10));
	}
	//4,000,000
	
	@Test
	public void getSumOfFBTermsWhenHighestValueTermIs4000000() {
		SumOfEvenFbNumber object = new SumOfEvenFbNumber();
		assertEquals(10, object.sumOfEvenFBTerms(4000000));
	}
}
