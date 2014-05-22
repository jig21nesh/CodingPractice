import static org.junit.Assert.assertEquals;


public class FractionPro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FractionPro f = new FractionPro();
		//System.out.println(f.getNandDNumbers("1/2"));
		
		
		FractionPro f = new FractionPro();
		try{
			System.out.println(f.sumFractionNumber("3\n1\n2/3\n4,5/6"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public int getNumerator(String fractionNumber) throws Exception{
		int numeratorValue = -1;
		try{
			if(fractionNumber.indexOf("/") != -1){
				numeratorValue = Integer.parseInt(fractionNumber.split("/")[0]);
			}else{
				numeratorValue = Integer.parseInt(fractionNumber);
			}
		}catch(Exception e){
			throw e;
		}
		
		return numeratorValue;
	}
	
	public int getDenominator(String fractionNumber) throws Exception{
		int denominatorValue = -1;
		try{
			if(fractionNumber.indexOf("/") != -1){
				denominatorValue = Integer.parseInt(fractionNumber.split("/")[1]);
			}else{
				denominatorValue  = 1;
			}
		}catch(Exception e){
			throw e;
		}
		
		return denominatorValue;
	}
	
	
	public boolean doesFractionNumberHasInteger(String fractionNumber){
		boolean doesItHaveInt = false;
		if(fractionNumber.indexOf(",") != -1)
			doesItHaveInt = true;
		
		return doesItHaveInt;
	}
	
	
	public String getIntFromFractionNumber(String fractionNumber) throws Exception{
		String returnValue = null;
		if(fractionNumber.indexOf(",") != -1){
			returnValue = fractionNumber.split(",")[0];
		}else{
			throw new Exception("No Integer Found");
		}
		return returnValue;
	}
	
	public String getFractionPartFromFractionNumber(String fractionNumber) throws Exception{
		String returnValue = null;
		if(fractionNumber.indexOf(",") != -1){
			returnValue = fractionNumber.split(",")[1];
		}else{
			throw new Exception("No Integer Found");
		}
		return returnValue;
	}
	
	public String sumFractionNumber(String data) throws Exception{
		String result = null;
		String[] arrayOfNumbers = data.split("\n");
		int totalNumberToExpect = Integer.parseInt(arrayOfNumbers[0]);
		for(int index = 1; index <= totalNumberToExpect; ++index){
			System.out.println("Index ::"+index+"  "+arrayOfNumbers[index]);
			if(result == null){
				result = this.addTwoNumbers(convertIntoFractionNumber(arrayOfNumbers[index]), convertIntoFractionNumber(arrayOfNumbers[++index]));
			}else{
				result = this.addTwoNumbers(convertIntoFractionNumber(result), convertIntoFractionNumber(arrayOfNumbers[index]));
			}
		}
		result  = this.processTheFinalIntegerValues(this.getNumerator(result), this.getDenominator(result));
		return result;
	}
	
	private String convertIntoFractionNumber(String partiallyFractionNumber) throws Exception{
		if(this.doesFractionNumberHasInteger(partiallyFractionNumber)){
			System.out.println(" convertIntoFractionNumber  "+this.getIntFromFractionNumber(partiallyFractionNumber)+"  partiallyFractionNumber "+partiallyFractionNumber);
			return this.addTwoNumbers(this.getIntFromFractionNumber(partiallyFractionNumber),this.getFractionPartFromFractionNumber(partiallyFractionNumber));
		}else{
			return partiallyFractionNumber;
		}
	}
	
	
	private String addTwoNumbers(String totalValue, String numberToBeAdded) throws Exception{
		System.out.println("totalValue  "+totalValue);
		System.out.println("numberToBeAdded "+numberToBeAdded);
		StringBuffer result = new StringBuffer();
		int resultNumerator = (this.getNumerator(totalValue) * this.getDenominator(numberToBeAdded)) + this.getNumerator(numberToBeAdded) * this.getDenominator(totalValue);
		int resultDenominator = this.getDenominator(totalValue) * this.getDenominator(numberToBeAdded);
		result.append(resultNumerator).append("/").append(resultDenominator);
		return result.toString();
	}
	
	private String processTheFinalIntegerValues(int n, int d){
		System.out.println("N  ::"+n+"  D :: "+d+"  n/d "+(n/d) +" n%d "+(n%d));
		StringBuffer resultValue = new StringBuffer();
		if(n == d){
			resultValue.append(n/d);
		}else if(n > d){
			resultValue.append(n/d).append(",").append(n%d).append("/").append(d);
		}else{
			resultValue.append(n).append("/").append(d);
		}
		return resultValue.toString();
	}
	
	public int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }
}
