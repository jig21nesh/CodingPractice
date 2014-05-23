package com.puzzels.math;

public class SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getSquareForGivenNumber(int number){
		return number * number;
	}
	
	public int getDifferent(int start, int end){
		int normalSum = 0;
		int squareSum = 0;
		for(int index = start; index <= end; ++index){
			normalSum += index;
			squareSum += this.getSquareForGivenNumber(index);
		}
		return Math.abs(this.getSquareForGivenNumber(normalSum) - squareSum);
	}

}
