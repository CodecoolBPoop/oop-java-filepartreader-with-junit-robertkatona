package com.katonarobert;

import java.io.*;
import java.lang.String;

public class FilePartReader {

    private static String filePath = "/Users/katonarobert/IdeaProjects/oop-java-filepartreader-with-junit-robertkatona/src/example.txt";
    private int fromLine = 0;
    private int toLine = 0;

    public FilePartReader() {
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public static String getFilePath() {
        return filePath;
    }

    public int getFromLine() {
        return fromLine;
    }

    public int getToLine() {
        return toLine;
    }

    public static String setup(String filePath, Integer fromLine, Integer toLine) {
        if (toLine < fromLine || fromLine < 1) {
            throw new IllegalArgumentException("Fromline's value is equal or smaller than toline's value");
        } else {
            return readLines(fromLine, toLine);
        }
    }

    public static String read() {
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();
            String result = stringBuffer.toString();
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }


        /*

        ### Another Solution
        String result = "";
        try {
            Scanner input = new Scanner(new File(filePath));
            while (input.hasNextLine()) {
                result += (input.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            return null;
        }

        return result;


        ### Another Solution ###

        String result = "";
        File file = new File(filePath);
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            while (dis.available() != 0) result += (dis.readLine() + "\n");

            fis.close();
            bis.close();
            dis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
        }
    */
    }

    public static String readLines(int fromLine, int toLine) {
        String currentString = read();
        String result;
        try {
            StringReader reader = new StringReader(currentString);
            BufferedReader br = new BufferedReader(reader);
            String line;
            int linuNumberCounter = 1;
            StringBuffer stringBuffer = new StringBuffer();
            while ((line = br.readLine()) != null) {
                if (linuNumberCounter >= fromLine && linuNumberCounter <= toLine) {
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                    linuNumberCounter ++;
                }
            }
            result = stringBuffer.toString();
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

