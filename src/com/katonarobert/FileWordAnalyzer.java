package com.katonarobert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;

public class FileWordAnalyzer {

    FilePartReader filePartReader;
    String filePath;

    public FileWordAnalyzer(FilePartReader filePartReader, String filePath) {
        this.filePartReader = filePartReader;
        this.filePath = filePath;
    }

    public ArrayList wordsByABC() {
        ArrayList arrayListFromString = new ArrayList();
        String stringToArrayList = filePartReader.readLines(1,13);
        try {
            StringReader reader = new StringReader(stringToArrayList);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals("")) {
                    continue;
                }
                arrayListFromString.add(line);

            }
            Collections.sort(arrayListFromString);
            return arrayListFromString;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList(){};
        }
    }

    public ArrayList wordsContainingSubString(String subString){
        ArrayList arrayListContainingSubString = new ArrayList();
        String stringToArrayList = filePartReader.readLines(1,13);
        CharSequence seq = subString;
        try {
            StringReader reader = new StringReader(stringToArrayList);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(seq)) {
                    arrayListContainingSubString.add(line);
                }

            }
            Collections.sort(arrayListContainingSubString);
            return arrayListContainingSubString;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList(){};
        }
    }

    public ArrayList wordsArePalindrome(){
        ArrayList arrayListWordsArePalindrome = new ArrayList();
        String stringToArrayList = filePartReader.readLines(1,13);
        try {
            StringReader reader = new StringReader(stringToArrayList);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals(new StringBuffer().append(line).reverse().toString()) && line.length() > 1) {
                    arrayListWordsArePalindrome.add(line);
                }

            }
            Collections.sort(arrayListWordsArePalindrome);
            return arrayListWordsArePalindrome;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList(){};
        }

    }

}
