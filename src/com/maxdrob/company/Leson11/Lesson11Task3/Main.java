package com.maxdrob.company.Leson11.Lesson11Task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        PrintWriter pw = new PrintWriter("C:\\Users\\max33\\Desktop\\text3.txt");
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\max33\\Desktop\\text1.txt"));

        String line = br.readLine();


        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        br = new BufferedReader(new FileReader("C:\\Users\\max33\\Desktop\\text2.txt"));

        line = br.readLine();

        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }

        pw.flush();

        br.close();
        pw.close();

        System.out.println("Файлы 1 и 2 записаны в файл 3");
    }
}
