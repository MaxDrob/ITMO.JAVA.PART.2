package com.maxdrob.company.Lesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        // Задание 1 - показать нечетные числа
        // showOddDigits


        // Задание 2 - Вывести числа, которые делятся на 3,5, или оба числа
        //  DivideBy3or5orBoth


        // Задание 3 - вывод суммы двух чисел и возврат true в случае, если сумма равна  третьему числу
        // SumOfTwo


        // Задание 4 - Ввод трех чисел, возврат true если второе число больше первого числа, а третье число больше второго числа
        // BiggerDigit

        // Задание 5
        // TestArray1

        // Задание 6
        // TestArray2

    }

    // Задание 1 - Вывод нечетных чисел до 1 до 99 на консоль
    public static void showOddDigits() {

        System.out.println("Вывод нечетных чисел");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    // Задание 2

    public static void DivideBy3or5orBoth() {
        String na3 = "";
        String na5 = "";
        String na3and5 = "";
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                na3and5 += i + " ";
            } else if (i % 3 == 0) {
                na3 += i + " ";
            } else if (i % 5 == 0) {
                na5 += i + " ";
            }
        }
        System.out.println("Числа которые делятся на 3:   " + na3);
        System.out.println("Которые делятся на 5:  " + na5);
        System.out.println("Которые делятся и на 3, и на 5:  " + na3and5);
        System.out.println();
    }


    // Задание 3

    public static boolean SumOfTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();

        if (a + b == c) {
            return true;
        } else return false;
    }

    // Ex. 4
    public static boolean BiggerDigit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("первое число : ");
        int a = scanner.nextInt();
        System.out.print("второе число: ");
        int b = scanner.nextInt();
        System.out.print("третье число: ");
        int c = scanner.nextInt();

        if (c > a && c > b) {
            return true;
        } else return false;
    }

    // Задача 5 - честно признаюсь - не совсем понял условие и искал похожее решение на просторах интернета, надеюсь это подойдет:
    public static void ArrayTask1(int[] array) {
        int size = 8;
        int[] testarray = new int[size];
        for (int i = 0; i < testarray.length; i++) {
            testarray[i] = ((int) (Math.random() * 2) + 2);
            System.out.print(testarray[i] + " ");
        }
        {
            System.out.println();
            System.out.println("true or false: " +
                    ((testarray[0] == 3) && ((testarray[testarray.length - 1]) == 3)));

        }


    }

    // Задание 6 - проверка, что массив содержит число 1 или 3
    public static boolean Array2(int[] array) {
        int[] Array2 = {3, 2, 3, 4};
        for (int i = 0; i < Array2.length; i++) {
            if (Array2[i] == 1 || Array2[i] == 3) {
                return true;
            }
        }
        return false;
    }
}


