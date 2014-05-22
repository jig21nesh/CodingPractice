
public class Primordial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primordial p = new Primordial();
		System.out.println(p.getPrimordialNumber("111221"));
	}
	public String getPrimordialNumber(String numberString){
		StringBuffer data = new StringBuffer();
		for(int index = 0; index < numberString.length(); ++index){
			data.append(this.generateResultDataFromDescription(numberString.charAt(index), numberString.charAt(index+1)));
			index++;
		}
		if(data.toString().length() % 2 == 0 && !data.toString().equals(numberString)){
			//System.out.println(data.toString());
			return this.getPrimordialNumber(data.toString());
		}
		return data.toString();
		
	}
	private String generateResultDataFromDescription(char description, char numberWhichHasBeenDescribed){
		StringBuffer resultString = new StringBuffer();
		for(int index = 0; index < Character.getNumericValue(description); ++index)
			resultString.append(numberWhichHasBeenDescribed);
		
		return resultString.toString();
	}
}
