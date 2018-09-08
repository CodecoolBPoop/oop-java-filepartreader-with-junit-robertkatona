package com.katonarobert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilePartReaderTest {

    @Test
    void setup() {
        FilePartReader filePartReader = new FilePartReader("/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/example.txt");
        assertTrue(filePartReader.getFromLine() > 0);
        assertTrue(filePartReader.getToLine() >= 1);
    }

    @Test
    void read() {
        String toCheck = "ab\nba\neeeeeeefdfs\n\n\naddadda\nadda\nbab\ndddabcdeererere\nkekekek\na\nhhfghgfjg\nabcdabcd\n\nffffghgabcdjg\nggdfhgfghjgh\n";
        FilePartReader testFilePartReader1 = new FilePartReader("/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/example.txt");
        assertEquals(testFilePartReader1.read(), toCheck);
    }

    @Test
    void readLines() {
        String toCehck = "ab\n" + "ba\n" + "eeeeeeefdfs\n" + "\n" + "\n" + "addadda\n";
        FilePartReader testFilePartReader2 = new FilePartReader("/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/example.txt");
        assertEquals(testFilePartReader2.readLines(1,6), toCehck);
    }
}