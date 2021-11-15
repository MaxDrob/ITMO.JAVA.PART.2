package com.maxdrob.company.Leson11.Lesson11Task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream fileIn =
                new FileInputStream(
                        "C:\\Users\\max33\\Desktop\\pngITMO.png");
        FileOutputStream fileOut =
                new FileOutputStream(
                        "C:\\Users\\max33\\Desktop\\pngITMO2.png");

        while (fileIn.available() > 0) {
            int oneByte = fileIn.read();
            fileOut.write(oneByte);
        }
        fileIn.close();
        fileOut.close();
    }
}
