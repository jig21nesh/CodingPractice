package com.puzzels.math;

import java.util.ArrayList;

/**
 * Created by Jignesh on 14/06/2014.
 */
public class Problem21AmecableNumbers {

    public static void main(String a[]){
        Problem21AmecableNumbers object = new Problem21AmecableNumbers();
        object.printSumOfAllAmicableNumbers(10000);
    }

    private void printSumOfAllAmicableNumbers(int limit){
        int sumTotal = 0;
        ArrayList finalList = new ArrayList();
        for(int a = 1; a < limit ; ++a){
            for(int b = a ; b < limit ; ++b){
                int da = this.findSumOfAllDivisors(this.findDivisors(a));
                int db = this.findSumOfAllDivisors(this.findDivisors(b));
                if(da == b && db == a && a != b){
                    if(finalList.contains(a) || finalList.contains(b)){
                        System.out.println("Already counted :: "+a+"   "+b);
                    }else{
                        finalList.add(a);
                        finalList.add(b);
                        System.out.println(" A :: "+a+"  B ::: "+b);
                        sumTotal += (a+b);
                    }

                }else{
                    //System.out.println("DA  "+da+"   DB  "+db+" A :: "+a+"  B ::: "+b);
                }
            }
        }
        System.out.println("Total is ::: "+sumTotal);
    }

    private ArrayList findDivisors(int number){
        ArrayList<Integer> data = new ArrayList();
        if(number < 2){
            data.add(number);
        }else {
            for(int index = 1 ; index <= (number / 2); ++index){
                int possibleDivisor = number % index;
                if(possibleDivisor == 0){
                    data.add(index);
                }
            }
        }
        return data;
    }

    private int findSumOfAllDivisors(ArrayList<Integer> data){
        int sumTotal = 0;
        for(Integer intData : data){
            sumTotal += intData.intValue();
        }
        return sumTotal;
    }
}
