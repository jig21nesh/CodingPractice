package com.puzzels.math;

public class PalindromicNumberFinder {
	
	public static void main(String a[]){
		PalindromicNumberFinder object = new PalindromicNumberFinder();
		//object.tempMethod();
		System.out.println(object.getPalindromicNumberFinder(3));
	}
	
	
	
	public int getPalindromicNumberFinder(int lengthOfNumbersFromWhichItGeneratedPalindromicNumber) {
		// TODO Auto-generated method stub
		int startingNumber = this.getFirstNumberOfGivenLength(lengthOfNumbersFromWhichItGeneratedPalindromicNumber);
		int lastNumber = this.getLastNumberOfGivenLength(lengthOfNumbersFromWhichItGeneratedPalindromicNumber);
		int possibleNumber = 0;
		int previouslyGeneratedNumber = possibleNumber;
		boolean isFound = false;
		for(int outerIndex = lastNumber; outerIndex >= startingNumber; outerIndex--){
			for(int innertIndex = lastNumber; innertIndex >= startingNumber; innertIndex--){
				possibleNumber = outerIndex * innertIndex;
				if((isPalindromicNumber(possibleNumber))){
					isFound = true;
					break;
				}else{
					isFound = false;
					continue;
				}
			}
			if(previouslyGeneratedNumber < possibleNumber && isFound){
				previouslyGeneratedNumber = possibleNumber;
				continue;
			}else{
				if(isFound)
					break;
				else
					continue;
			}
		}
		return previouslyGeneratedNumber;
	}
	
	public boolean isPalindromicNumber(int number){
		boolean isValid = false;
		String numberString = String.valueOf(number);
		for(int index = 0, reverseIndex = numberString.length()-1; index < numberString.length() || reverseIndex >= 0; ++index, --reverseIndex){
			if(numberString.charAt(index) == numberString.charAt(reverseIndex)){
				isValid = true;
				continue;
			}else{
				isValid = false;
				break;
			}
		}
		return isValid;
	}
	
	public boolean isNumberLengthValid(int inputNumber, int lengthOfNumber){
		boolean isValid = false;
		if(String.valueOf(inputNumber).length() == lengthOfNumber){
			isValid = true;
		}else{
			isValid = false;
		}
		return isValid;
	}
	
	public int getFirstNumberOfGivenLength(int lengthOfNumber){
		int neededNumber = 0;
		while(true){
			neededNumber++;
			if(isNumberLengthValid(neededNumber, lengthOfNumber)){
				break;
			}else{
				continue;
			}
		}
		return neededNumber;
	}
	
	public int getLastNumberOfGivenLength(int lengthOfNumber){
		int neededNumber = this.getFirstNumberOfGivenLength(lengthOfNumber);
		while(true){
			neededNumber++;
			if(isNumberLengthValid(neededNumber, lengthOfNumber)){
				continue;
			}else{
				break;
			}
		}
		return neededNumber-1;
	}

}
