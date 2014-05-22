
public class StringCalc {
	
	private int numberLimit = 1000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringCalc().add("//;\n1;2");
	}
	
	public int add(String numbers){
		String startWithString = "//";
		int totalValue = 0;

		if(numbers == null || numbers.equals("")){
			totalValue =  0;
		}else{
			String[] numberArray = null;
			String delimiter = this.getDelIfInput(numbers, startWithString);
			if(delimiter != null){
				numberArray = this.getStringWithoutInputDel(numbers, delimiter, startWithString).split(delimiter);
			}
			else
				numberArray = numbers.split(",");
			
			if(numberArray != null){
				for(String nElement : numberArray){
					if(nElement.indexOf('\n') != -1){
						String[] subElements = nElement.split("\\n");
						for(String subEle : subElements)
							totalValue = this.add(totalValue, Integer.parseInt(subEle));
					}else{
						totalValue = this.add(totalValue, Integer.parseInt(nElement));
					}
					
				}
			}
		}
		return totalValue;	
	}
	
	private int add(int totalValue, int numberTobeAdded){
		if(this.isWithinLimit(numberTobeAdded)){
			totalValue += numberTobeAdded;
		}else{
			
		}
		return totalValue;
	}
	
	private String getDelIfInput(String numbers, String startWithString){
		
		String del = null;
		if(numbers.startsWith(startWithString)){
			del = numbers.substring(numbers.indexOf(startWithString)+startWithString.length(), numbers.indexOf("\n"));
		}else{
			del = null;
		}
		return del;
	}
	
	private String getStringWithoutInputDel(String numbers, String del, String startWithString){
		String s = numbers.substring(numbers.indexOf(del)+del.length()+"\n".length(), numbers.length());
		System.out.println(s);
		return s;
	}
	
	private boolean isWithinLimit(int number){
		return number < this.getLimit();
	}
	
	private int getLimit(){
		return numberLimit;
	}
}
