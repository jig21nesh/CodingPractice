package com.puzzels.math;

import java.util.ArrayList;

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
	
	private ArrayList<Integer> initiliaze(ArrayList<Integer> data, int numberOfElements){
		for(int index = 1; index<=numberOfElements;++index){
			data.add(index-1, index);
		}
		return data;
	}
	
	private int addInitialValues(int sumValue, ArrayList<Integer> fbTerms){
		for(int index = 0; index < 2; ++index){
			if(Integer.valueOf(fbTerms.get(index)) % 2 == 0){
				sumValue += Integer.valueOf(fbTerms.get(index));
			}
		}
		return sumValue;
	}
	
	public int sumOfEvenFBTerms(int termMaxValue){
		ArrayList<Integer> fbTerms = new ArrayList<Integer>();
		
		int termIndex = 2;
		int nextTerm = 0;
		int sumValue = 0;
		
		fbTerms = this.initiliaze(fbTerms, 2);
		
		while(true){
			nextTerm = fbTerms.get(termIndex-1) + fbTerms.get(termIndex-2);
			System.out.println("Next Term  "+nextTerm+"  Sum Value "+sumValue);
			if(nextTerm > termMaxValue){
				break;
			}else{
				fbTerms.add(termIndex, nextTerm);
				if(nextTerm % 2 == 0)
					sumValue += nextTerm;
			}
			termIndex++;
		}
		sumValue = this.addInitialValues(sumValue, fbTerms);
		return sumValue;
	}
}
