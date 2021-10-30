package com.maxdrob.company.Lesson4.AllTasksFromLesson4;

import java.util.Scanner;

public class L4T2 {
    public static void main(String[] args){
        Scanner console = new Scanner (System.in);
        String n = console.next();
        PalindromIliNet(n);
    }

    public static void PalindromIliNet(String n){
        String reverse = "";
        for ( int i = n.length() - 1; i >= 0; i-- ) {
            reverse = reverse + n.charAt(i);
            System.out.println("re:"+reverse);
        }
        if (n.equals(reverse))
            System.out.println("введенное слово - палиндром");
        else
            System.out.println("это не палиндром, возвращайся в школу!");
    }
}

