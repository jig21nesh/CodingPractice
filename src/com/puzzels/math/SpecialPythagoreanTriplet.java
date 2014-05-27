package com.puzzels.math;

public class SpecialPythagoreanTriplet {

	public int getSquare(int input) {
		// TODO Auto-generated method stub
		return input * input;
	}

	public int[] findABC(int inputLimit) {
		// TODO Auto-generated method stub
		int c = 0;
		int data[] = new int[3];
		for(int a = 1;a <= inputLimit / 3 ; ++a){
			//System.out.println("Here "+a);
			for(int b = 1;b <= inputLimit / 2 ; ++b){
				c = inputLimit - a - b;
				//System.out.println("c2 "+this.getSquare(c)+" a2 "+(this.getSquare(a)+" b2 "+this.getSquare(b)));
				if(this.getSquare(c) == (this.getSquare(a)+this.getSquare(b))){
					System.out.println("A "+a+"  B "+b+"  C "+c);
					System.out.println("c2 "+this.getSquare(c)+" a2 "+(this.getSquare(a)+" b2 "+this.getSquare(b)));
					data[0] = a;
					data[1] = b;
					data[2] = c;
				}else{
					//System.out.println(c+" "+a + "  "+b);
				}
			}
		}
		
		return data;
	}
	
	

}
