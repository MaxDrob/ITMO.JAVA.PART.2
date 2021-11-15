package com.maxdrob.company.Lesson11.Lesson11Task2;

import java.io.IOException;

public class Main {


    public class ReadFile {

        public static void main(String[] args) throws IOException {

            String new_path = "D:/test.txt";

            try {
                FileData new_file = new FileData(new_path);
                String[] aryStrings = new_file.OpenAndRead();

                int i;
                for (i = 0; i < aryStrings.length; i++) {
                    System.out.println(aryStrings[i]);
                }
            } catch (IOException a) {
                System.out.println(a.getMessage());
            }


            Write line = new Write(new_path, true);
            line.fileWrite("Added text: ");

            System.out.println("Text has been re-written!");
        }

    }

}
