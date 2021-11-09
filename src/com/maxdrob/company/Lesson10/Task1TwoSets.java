package com.maxdrob.company.Lesson10;

import java.util.HashSet;
import java.util.Set;

// Тут я пошел от обратного с вашего позволения - данный код выводит как раз дубликат - то есть three


class Main {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("раз");
        set.add("два");
        set.add("десять!");

        Set<String> set2 = new HashSet<>();
        set2.add("пять");
        set2.add("десять!");

        set.retainAll(set2);

        System.out.println(set);

    }
}