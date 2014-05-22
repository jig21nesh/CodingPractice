package com.puzzels.math;

public class SumOfEvenFbNumber {

	public int[] getFbElements(int howManyElements) {
		// TODO Auto-generated method stub
		int returnFBElements[] = new int[howManyElements];
		if(howManyElements <= 2){
			returnFBElements = this.initiliaze(returnFBElements,howManyElements);
		}else{
			returnFBElements = this.initiliaze(returnFBElements,2);
			int index = 2;
			int term = 0;
			while(index < howManyElements){
				term = returnFBElements[index - 1] + returnFBElements[index - 2];
				returnFBElements[index] = term;
				index++;
			}
		}
		
		return returnFBElements;
	}
	
	private int[] initiliaze(int[] data, int numberOfElements){
		for(int index = 1; index<=numberOfElements;++index){
			data[index-1] = index;
		}
		return data;
	}
}
