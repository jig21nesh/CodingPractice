package com.puzzels.math;

import java.util.ArrayList;

public class SumOfMultiples {

	public boolean isMultipleOf(int multipleOf, int number) {
		// TODO Auto-generated method stub
		boolean isValid = false;
		if((number % multipleOf) == 0){
			isValid = true;
		}else
			isValid = false;
		return isValid;
	}
	
	private int[] convertToPrimitive(ArrayList<Integer> data){
		int[] returnValues = new int[data.size()];
		for(int index = 0; index < data.size(); ++index){
			returnValues[index] = Integer.valueOf(data.get(index));
		}
		return returnValues; 
	}
	
	public int[] getMultipleOf(int[] multipleOf, int limit){
		ArrayList<Integer> data = new  ArrayList<Integer>();
		for(int index = 1; index < limit ; ++index){
			for(int multipleOfIndex = 0; multipleOfIndex < multipleOf.length; ++multipleOfIndex){
				if(this.isMultipleOf(multipleOf[multipleOfIndex], index)){
					data.add(index);
					break;
				}else{
					continue;
				}
			}
		}
		return this.convertToPrimitive(data);
	}
	
	
	public int getSum(int[] data) throws Exception{
		int sum=0;
		if(data != null){
			for(int index = 0; index < data.length ; ++index){
				sum += data[index];
			}
		}else{
			throw new Exception("Invalid argument");
		}
		return sum;
	}
}
