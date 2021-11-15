package com.maxdrob.company.Lesson11Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileData {
    private String pathToFile;

    public FileData(String path) {
        pathToFile = path;
    }

    public String[] OpenAndRead() throws IOException {
        FileReader x = new FileReader(pathToFile);
        BufferedReader varRead = new BufferedReader(x);

        int num = numStrings();
        String[] lines = new String[num];

        int i;
        for (i = 0; i < num; i++) {
            lines[i] = varRead.readLine();

        }
        varRead.close();
        return lines;

    }

    int numStrings() throws IOException {

        FileReader text = new FileReader(pathToFile);
        BufferedReader y = new BufferedReader(text);

        String one;
        int num = 0;

        while ((one = y.readLine()) != null) {
            num++;
        }
        y.close();

        return num;
    }
}