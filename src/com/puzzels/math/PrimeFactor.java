package com.puzzels.math;
import java.util.ArrayList;


public class PrimeFactor {
	//static ArrayList<Integer> data = new ArrayList<Integer>();
	public int[] getPrimeFactor(long inputNumber) {
		// TODO Auto-generated method stub
		ArrayList<Integer> data = new ArrayList<Integer>();
		data = this.getPrimeFactorHelper(inputNumber, data);
		int[] arrayToBeReturned = new int[data.size()];
		for(int j = 0 ; j < data.size(); j++){
			Integer arrayElement = (Integer)data.get(j);
			arrayToBeReturned[j] = arrayElement.intValue();
			System.out.println(arrayElement.intValue());
		}
		return arrayToBeReturned;
	}
	
	private ArrayList<Integer> getPrimeFactorHelper(long inputNumber, ArrayList<Integer> data){
		int index = 2;
		while(index <= (inputNumber)){
			//System.out.println("Index :: "+index+"  inputNumber  "+inputNumber+"  "+(inputNumber % index));
			if(inputNumber  % index == 0){
				data.add(index);
				this.getPrimeFactorHelper(inputNumber / index, data);
				break;
			}
			index++;
		}
		return data;
	}
	

}
