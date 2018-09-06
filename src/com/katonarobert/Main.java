package com.katonarobert;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FilePartReader fpr = new FilePartReader();
        String exampleString = fpr.read("/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/example.txt");
        String exampleStringFromLineToLine = fpr.readLines("/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/example.txt", 0,7);
        //System.out.println(exampleStringFromLineToLine);
        FileWordAnalyzer fwa = new FileWordAnalyzer(fpr,"/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/example.txt");
        ArrayList<String> exampleArrayList = fwa.wordsByABC();
    }
}
