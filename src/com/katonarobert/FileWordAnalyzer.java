package com.katonarobert;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class FileWordAnalyzer {

    FilePartReader filePartReader;
    String filePath;

    public FileWordAnalyzer(FilePartReader filePartReader, String filePath) {
        this.filePartReader = filePartReader;
        this.filePath = filePath;
    }

    public ArrayList wordsByABC(){
        ArrayList arrayListFromString = new ArrayList();
        String stringToArrayList = filePartReader.readLines(filePath,1,2);
        try {
            StringReader reader = new StringReader(stringToArrayList);
            BufferedReader br = new BufferedReader(reader);
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            while ((line = br.readLine()) != null) {
                    arrayListFromString.add(line);

            }return arrayListFromString;
        } catch (IOException e) {
            e.printStackTrace();
            return  new ArrayList(){};
        }
    }

    //public ArrayList wordsContainingSubString(String subString){}

    //public ArrayList wordsArePalindrome(){}

}
