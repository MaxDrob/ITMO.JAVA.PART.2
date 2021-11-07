package com.maxdrob.company.Lesson9;

public class Task2IsSquareOrNot {
    public static void main(String[] args) {


        int[][] a = {
                {1,2,1,2},
                {1,1,1},
                {1,2,2,1}
        };


        int flag = 0;
        for (int j=0;j<a.length;j++) {

            if (a.length != a[j].length){
                System.out.println("Увы и ах, не квадратный!");
                flag = 1;
                break;
            }

        }
        if (flag == 0){
            System.out.println("Весьма квадратный");
        }
    }
}
