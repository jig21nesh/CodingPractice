package com.puzzels.namescore;

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Jignesh on 12/09/2014.
 */
public class FileReaderClass {

    private static final String FILE_PATH = "D:\\Development\\GitRepo\\CodingPractice\\src\\com\\puzzels\\n" +
            "amescore\\p022_names.txt";


    public FileReaderClass(){

    }

    public ArrayList<String> readFile(ArrayList<String> sortedList){
        File file = null;
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;
       try{

           System.out.println("Class Path :: "+this.getClass().getResource("").getPath());
            file = new File(FILE_PATH);
            fileInputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = null;
            while((line = bufferedReader.readLine()) != null){
                if(line.indexOf(',') != -1){
                    sortedList.addAll(Arrays.asList(this.token(line)));
                }else{
                    sortedList.add(line);
                }

            }
       }catch(Exception exception){
            exception.printStackTrace();
       }finally{
            if(fileInputStream != null){
                try{
                    fileInputStream.close();
                }catch(Exception exception){

                }
            }
       }

        Collections.sort(sortedList);

        return sortedList;
    }

    private String[] token(String formattedString){
        return formattedString.split(",");
    }

}
