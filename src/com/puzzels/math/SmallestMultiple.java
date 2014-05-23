package com.puzzels.math;

public class SmallestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SmallestMultiple().getSmallestMultipleForGivenRange(1, 20));
	}

	public int getSmallestMultipleForGivenRange(int start, int end) {
		// TODO Auto-generated method stub
		int number = 0;
		boolean isFound = false;
		while(true){
			number++;
			for(int index = start ; index <= end ; ++index){
				if((number % index) == 0){
					isFound = true;
					continue;
				}else{
					isFound = false;
					break;
				}
			}
			if(!isFound){
				continue;
			}else{
				break;
			}
		}
		System.out.println(number);
		return number;
	}

}
