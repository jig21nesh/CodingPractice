package com.puzzels.math;
import static org.junit.Assert.*;

import org.junit.Test;


public class PrimeFactorTest {

	
	@Test
	public void testPrimeNumberForFirstNumber(){
		PrimeFactor factor = new PrimeFactor();
		int a[] = {2};
		assertArrayEquals(a, factor.getPrimeFactor(2));
	}
	
	@Test
	public void testPrimeNumberFor12(){
		PrimeFactor factor = new PrimeFactor();
		int a[] = {2,2,3};
		assertArrayEquals(a, factor.getPrimeFactor(12));
	}
	
	@Test
	public void testPrimeNumberFor8(){
		PrimeFactor factor = new PrimeFactor();
		int a[] = {2,2,2};
		assertArrayEquals(a, factor.getPrimeFactor(8));
	}
	
	@Test
	public void testPrimeNumberFor9(){
		PrimeFactor factor = new PrimeFactor();
		int a[] = {3,3};
		
		assertArrayEquals(a, factor.getPrimeFactor(9));
	}
	
	@Test
	public void testPrimeNumberFor15(){
		PrimeFactor factor = new PrimeFactor();
		int a[] = {3,5};
		
		assertArrayEquals(a, factor.getPrimeFactor(15));
	}
	
	
	@Test
	public void testPrimeNumberFor97(){
		PrimeFactor factor = new PrimeFactor();
		int a[] = {2,13};
		assertArrayEquals(a, factor.getPrimeFactor(26));
	}
	
	@Test
	public void testPrimeNumberFor13195(){
		PrimeFactor factor = new PrimeFactor();
		int a[] = {5,7, 13, 29};
		assertArrayEquals(a, factor.getPrimeFactor(13195));
	}
	
	@Test
	public void testPrimeNumberFor600851475143(){
		PrimeFactor factor = new PrimeFactor();
		long input = 600851475143L;
		int a[] = {71,
				839,
				1471,
				6857};
		assertArrayEquals(a, factor.getPrimeFactor(input));
	}
}
