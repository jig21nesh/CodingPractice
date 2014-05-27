package com.puzzels.math;

public class NthPrimeNumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthPrimeNumberFinder obj = new NthPrimeNumberFinder();
		//System.out.println(obj.getNthPrimeNumber(6));
		System.out.println(obj.getSumOfNthPrimeNumber(2000000));
	}
	
	
	public long getSumOfNthPrimeNumber(int primeNumberLessThanThisNumber){
		long sum = 0;
		long index = 1;
		while(true){
			long primeNumber = this.getNthPrimeNumber(index);
			//System.out.println("  primeNumber  "+primeNumber+" Sum "+sum+"  index  "+index);
			if(primeNumber < primeNumberLessThanThisNumber){
				sum += primeNumber;
				index++;
				continue;
			}else{
				break;
			}
		}
		System.out.println("Sum is "+sum);
		return sum;
	}
	
	public long getNthPrimeNumber(long nthPrimeNumber) {
		// TODO Auto-generated method stub
		long index = 0;
		long primeNumber = 1;
		while(true){
			index++;
			primeNumber = this.getPrimeNumber(primeNumber);
			if(index == nthPrimeNumber){
				break;
			}else{
				continue;
			}
		}
		return primeNumber;
	}
	private long getPrimeNumber(long number){
		long index = number;
		boolean isModuleZero = false;
		while(true){
			index++;
			int innerIndex = 2;
			while(innerIndex < index){
				if(index % innerIndex == 0){
					isModuleZero = true;
					break;
				}else{
					isModuleZero = false;
					innerIndex++;
					continue;
				}
			}
			if(isModuleZero){
				continue;
			}else{
				break;
			}
		}
		return index;
	}

}
