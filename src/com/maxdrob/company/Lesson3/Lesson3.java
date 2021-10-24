package com.maxdrob.company.Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {


        // Задание 1

        int ar[] = {2, 5, 3, 6};
        System.out.println(ArraySorted(ar));

        // Задание 2
        System.out.println("Получившийся массив: " + Arrays.toString(UsersArray()));

        // Задание 3
        SwapValues(new int[] {1,2,3,4,5});
        System.out.println("Итоговый массив: " + Arrays.toString(SwapValues(ar)));

        // Задание 4
        int[] array = {7, 9, 10, 5, 4, 22, 56, 22, 12, 11, 11, 3};
        System.out.println(uniqueCount(array));

        // Задание 5
        // fibonacciNumber


        // Задание 6 вынесено в отдельный класс

    }
// Задание 1
    public static String ArraySorted(int[] array) {
        int i;
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return "Попробуйте снова";
            }
        }
        return "Да";
    }

    // Задание 2

    public static int[] UsersArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длинну массива");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Задание 3
    public static int[] SwapValues(int[] array) {
    int firstElement = array[0];
    int lastElement = array[array.length - 1];
    array[0] = lastElement;
    array[array.length - 1] = firstElement;
        return array;

    }

    // Задание 4
    static int uniqueCount(int[] array) {
        int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
        }
        return result = countUnique - count;
    }

    // Задание 5
    public static void fibonacciNumber(int value) {
        System.out.print("Введите кол-во чисел  Фиббоначи : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }

        for (int i = 0; i < n; ++i) {
            System.out.println(f[i]);
        }

    }

    // Задача 6 вынесена в отдельный класс



}
