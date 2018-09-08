package com.katonarobert;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

import static org.junit.jupiter.api.Assertions.*;

class FileWordAnalyzerTest {

    @Test
    void wordsByABC() {
        List<String> expected1 = new ArrayList<>(asList("aaaaaa", "acápaetteapáca", "bbbabcdbbb", "cccccc", "dddabcdddd", "kekekek"));
        FilePartReader filePartReader = new FilePartReader("/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/test.txt");
        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(filePartReader, "/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/test.txt");
        assertEquals(fileWordAnalyzer.wordsByABC(), expected1);
    }

    @Test
    void wordsContainingSubString() {
        List<String> expected2 = new ArrayList<>(asList("bbbabcdbbb", "dddabcdddd"));
        FilePartReader filePartReader1 = new FilePartReader("/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/test.txt");
        FileWordAnalyzer fileWordAnalyzer1 = new FileWordAnalyzer(filePartReader1, "/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/test.txt");
        assertEquals(fileWordAnalyzer1.wordsContainingSubString("abcd"), expected2);
    }

    @Test
    void wordsArePalindrome() {
        List<String> expected3 = new ArrayList<>(asList("aaaaaa", "acápaetteapáca", "cccccc", "kekekek"));
        FilePartReader filePartReader2 = new FilePartReader("/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/test.txt");
        FileWordAnalyzer fileWordAnalyzer2 = new FileWordAnalyzer(filePartReader2, "/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/test.txt");
        assertEquals(fileWordAnalyzer2.wordsArePalindrome(), expected3);

    }
}