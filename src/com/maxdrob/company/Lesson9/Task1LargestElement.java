package com.maxdrob.company.Lesson9;

public class Task1LargestElement
{
    public static void main(String[] args) throws Exception {
        int[][] sampleArray = { { 2, 8, 3, -1 }, { 7, 2, -2, 4 } };
        int Largest = LargestElement(sampleArray);
        System.out.println(Largest);

    }

    public static int LargestElement(int[][] array) throws Exception {
        int Largest = 0;
        for (int[] ints : array) {
            try {
                for (int j = 1; j < ints.length; j++) {
                    if (ints[j] > ints[j - 1] && ints[j] > Largest) {
                        Largest = ints[j];
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Largest Element :" );
        return Largest;
    }

}
