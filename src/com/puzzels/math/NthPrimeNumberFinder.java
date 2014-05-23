package com.puzzels.math;

public class NthPrimeNumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NthPrimeNumberFinder obj = new NthPrimeNumberFinder();
		System.out.println(obj.getNthPrimeNumber(6));
	}

	public int getNthPrimeNumber(int nthPrimeNumber) {
		// TODO Auto-generated method stub
		int index = 0;
		int primeNumber = 1;
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
	private int getPrimeNumber(int number){
		int index = number;
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
