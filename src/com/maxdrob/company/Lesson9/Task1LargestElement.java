package com.maxdrob.company.Lesson9;

public class Task1LargestElement
{
    public static void main(String[] args)
    {
        int[][] data ={ {9,2,15,7,11},{68,132,16,89,5} };


        int large = data[0][0];

        for(int i =0 ; i < data.length ; i++)
        {
            for(int j =0 ; j < data[i].length ; j++)
            {
                if(large < data[i][j])
                {
                    large= data[i][j]; // наибольший элемент

                }
            }
        }

        System.out.println("Largest Element :" + large);
    }
}
