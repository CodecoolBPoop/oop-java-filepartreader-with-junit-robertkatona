package com.katonarobert;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("The application is   running");
        FilePartReader fpr = new FilePartReader();
        System.out.println(fpr.setup(fpr.getFilePath(), fpr.getFromLine(), fpr.getToLine()));
        //System.out.println(exampleString);
        //System.out.println(exampleStringFromLineToLine);

        FileWordAnalyzer fwa = new FileWordAnalyzer(fpr,"/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/example.txt");
        ArrayList<String> exampleArrayList = fwa.wordsByABC();
        //System.out.println(exampleArrayList);
        ArrayList<String> exampleSubString = fwa.wordsContainingSubString("abcd");
        //System.out.println(exampleString);
        ArrayList<String> examplePalindrome = fwa.wordsArePalindrome();
        //System.out.println(examplePalindrome);

    }
}
