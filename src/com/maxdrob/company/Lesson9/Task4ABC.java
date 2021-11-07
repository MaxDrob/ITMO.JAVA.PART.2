package com.maxdrob.company.Lesson9;

import java.util.Arrays;

public class Task4ABC
{
    public static void main(String[] args)
    {
        String[] letters = new String[26];
        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            letters[ch - 'a'] = String.valueOf(ch);
        }
        System.out.println(Arrays.toString(letters));
    }
}

