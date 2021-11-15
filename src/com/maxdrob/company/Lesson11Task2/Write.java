package com.maxdrob.company.Lesson11Task2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write {

    private String path_to_file;
    private boolean append = false;

    public Write (String path) {
        path_to_file = path;
    }

    public Write (String path, boolean value) {
        path_to_file = path;
        append = value;
    }

    public void FileWrite (String text) throws IOException {
        FileWriter write_to_file = new FileWriter(path_to_file, append);
        PrintWriter print = new PrintWriter(write_to_file);

        print.printf("%s" + "%n", text);

        print.close();
    }

    public void fileWrite(String s) {
    }
}