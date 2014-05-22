import java.util.ArrayList;


public class DivisorProg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisorProg p = new DivisorProg();
		System.out.println(p.getQuiteGoodNumbers(2,100, 2));
		System.out.println(p.getQuiteGoodNumbers(2,100, 0));
		System.out.println(p.getQuiteGoodNumbers(1000,9999, 3));
	}
	
	public int getQuiteGoodNumbers(int startValue, int endValue, int badnessFactor){
		int totalQuiteNumbers = 0;
		for(int index = startValue ; index < endValue; index++){
			String d = this.generateDivisor(index);
			int diff = this.getSumOfAllDivisor(d)-index;
			if(diff < 0) diff *= -1;
			//System.out.println("INDEX ::"+index+"  Data "+d+"  Diff "+diff);
			if(diff <= badnessFactor){
				System.out.println("Quite Number :: "+index);
				totalQuiteNumbers++;
			}
		}
		
		return totalQuiteNumbers;
	}
	
	private int getSumOfAllDivisor(String data){
		int total = 0;
		String[] intArray = data.split(",");
		for(String d : intArray)
			total += Integer.parseInt(d);
		
		return total;
	}
	
	private String generateDivisor(int n, int startValue, StringBuffer data){
		for(int i = startValue; i < n; ++i){
			if(n % i == 0){
				data.append(i).append(",");
				generateDivisor(n, i+1, data);
				break;
			}else
				continue;
		}
		return data.toString();
	}
	public String generateDivisor(int n){
		return this.generateDivisor(n, 1, new StringBuffer());
	}
}
