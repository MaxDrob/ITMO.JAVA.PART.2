package com.maxdrob.company.Lesson9;

import java.util.*;

public class Task3LargestLineMatrix {
    public static void main(String[] args){
        int[][] a = new int[8][8];
        int min = Integer.MAX_VALUE,
                max = Integer.MIN_VALUE,
                lmax = -1,
                s = 0;

        Random r = new Random();

        for(int i = 0; i < 8; i++){
            System.out.println();
            for(int j = 0; j < 8; j++){
                a[i][j] = r.nextInt(100);
                s += a[i][j];
                System.out.print(a[i][j] + " ");
            }
            if(min > s){
                min = s;

            }
            if(max < s){
                max = s;
                lmax = i;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Самая длинная строка " + (lmax + 1));
    }

}