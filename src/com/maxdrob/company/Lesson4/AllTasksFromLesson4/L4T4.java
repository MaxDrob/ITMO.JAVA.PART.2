package com.maxdrob.company.Lesson4.AllTasksFromLesson4;

public class L4T4 {
    public static void main(String[] args) {

        String a = "TestTestThisIsATest";
        String b = "Test";
        int times = 0;
        for (int i = 0; i <= a.length() - b.length(); i++) {
            String substring = a.substring(i, i + b.length());
            if (substring.equals(b)) {
                times = times + 1;
            }
        }
        System.out.println(times);
    }
}
