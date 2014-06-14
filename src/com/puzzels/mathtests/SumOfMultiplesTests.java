package com.puzzels.mathtests;

import static org.junit.Assert.*;

import com.puzzels.math.SumOfMultiples;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

public class SumOfMultiplesTests {

	@Test
	public void shouldReturnFalseWhenTheInputis3AndTheNumberOf7(){
		SumOfMultiples t = new SumOfMultiples();
		assertFalse(t.isMultipleOf(3,7));
	}
	
	@Test
	public void shouldReturnTrueWhenTheInputis3AndTheNumberOf6(){
		SumOfMultiples t = new SumOfMultiples();
		assertTrue(t.isMultipleOf(3,6));
	}
	
	@Test
	public void shouldReturnFalseWhenTheInputis5AndTheNumberOf6(){
		SumOfMultiples t = new SumOfMultiples();
		assertFalse(t.isMultipleOf(5,6));
	}
	
	@Test
	public void shouldReturnTrueWhenTheInputis5AndTheNumberOf10(){
		SumOfMultiples t = new SumOfMultiples();
		assertTrue(t.isMultipleOf(5,10));
	}
	
	@Test
	public void shouldReturn3ElementsWhenTheLimitIs10AndNeedToFindMultipleOf3(){
		int[] expectedValue = {3,6,9};
		int[] multipleOf = {3};
		int limit = 10;
		SumOfMultiples t = new SumOfMultiples();
		assertArrayEquals(expectedValue, t.getMultipleOf(multipleOf, limit));
	}
	
	@Test
	public void shouldReturn1ElementsWhenTheLimitIs10AndNeedToFindMultipleOf5(){
		int[] expectedValue = {5};
		int[] multipleOf = {5};
		int limit = 10;
		SumOfMultiples t = new SumOfMultiples();
		assertArrayEquals(expectedValue, t.getMultipleOf(multipleOf, limit));
	}
	
	@Test
	public void shouldReturn4ElementsWhenTheLimitIs10AndNeedToFindMultipleOf3And5(){
		int[] expectedValue = {3,5,6,9};
		int[] multipleOf = {3,5};
		int limit = 10;
		SumOfMultiples t = new SumOfMultiples();
		assertArrayEquals(expectedValue, t.getMultipleOf(multipleOf, limit));
	}
	
	@Test
	public void shouldReturn23WhenTheMultipleOf3And5AndTheLimitIs10Given(){
		int expectedValue = 23;
		int[] multipleOf = {3,5};
		int limit = 10;
		SumOfMultiples t = new SumOfMultiples();
		try{
			assertEquals(expectedValue, t.getSum(t.getMultipleOf(multipleOf, limit)));
		}catch(Exception e){
			
		}
		
	}
	
	@Test(expected = Exception.class)
	public void shouldThrowAnException() throws Exception{
		int expectedValue = 23;
		SumOfMultiples t = new SumOfMultiples();
		assertEquals(expectedValue, t.getSum(null));
		
	}
	
	
	@Test
	public void shouldReturn233168WhenTheMultipleOf3And5AndTheLimitIs10Given(){
		int expectedValue = 233168;
		int[] multipleOf = {3,5};
		int limit = 1000;
		SumOfMultiples t = new SumOfMultiples();
		try{
			assertEquals(expectedValue, t.getSum(t.getMultipleOf(multipleOf, limit)));
		}catch(Exception e){
			
		}
		
	}
	

}
