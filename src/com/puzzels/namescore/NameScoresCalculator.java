package com.puzzels.namescore;

import javafx.collections.transformation.SortedList;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by Jignesh on 12/09/2014.
 */
public class NameScoresCalculator {

    ArrayList<String> sortedList;

    public NameScoresCalculator(){
        sortedList = new ArrayList<String>();
    }

    public static void main(String a[]){
        NameScoresCalculator nameScoresCalculator = new NameScoresCalculator();
        nameScoresCalculator.getSortedListFromFile();
        nameScoresCalculator.calculateAndPrintTheFinalScore();
    }

    private void calculateAndPrintTheFinalScore(){
        BigInteger finalScore = BigInteger.ZERO;
        for(int index = 0; index < sortedList.size() ; index ++ ){
            finalScore = finalScore.add(BigInteger.valueOf(this.getNameScore(sortedList.get(index), index+1)));
        }
        System.out.println(finalScore.toString());
    }

    private int getNameScore(String name, int nameIndex){
        int score = 0;

        for(int index = 1 ; index < name.length()-1; index++){
            score += ((int)name.charAt(index)-64);
        }
        return score * nameIndex;
    }

    private void getSortedListFromFile(){
        FileReaderClass fileReaderClass = new FileReaderClass();
        sortedList = fileReaderClass.readFile(sortedList);
    }


    private void printNames(){
        for(String s : sortedList){
            System.out.println("Name :::: "+s);
        }
    }
}
