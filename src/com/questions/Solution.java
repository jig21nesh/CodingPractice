package com.questions;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by Jiggy on 11/04/2016.
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //solution.doPlusMiusTask();
        solution.staircase();
    }

    private String getPaddedString(int lengthOfPadding, int totalHeight){
        StringBuilder sb = new StringBuilder();
        for(int index = 0; index < lengthOfPadding; ++index){
            sb.append(" ");
        }
        for(int index = 0; index < (totalHeight-lengthOfPadding); ++index){
            sb.append("#");
        }
        return  sb.toString();
    }

    public void staircase(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Hashtable<Integer, String> data = new Hashtable<Integer, String>();
        for(int index = 0; index <=n ; ++index){
            data.put(index, this.getPaddedString(n-index, n));
        }
        for(int index = 1 ; index <=n ; ++index){
            System.out.println(data.get(index));
        }
    }

    public void doPlusMiusTask(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for(int number : arr){
            if(number > 0){
                positives += 1;
            }else if(number < 0){
                negatives += 1;
            }else{
                zeros += 1;
            }
        }
        System.out.println((float)positives / n);
        System.out.println((float)negatives / n);
        System.out.println((float)zeros / n);
    }
}
