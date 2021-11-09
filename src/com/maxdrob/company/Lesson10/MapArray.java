package com.maxdrob.company.Lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapArray {
    public static void main(String[] args) {
        Integer[] sampleArray = RandomArray(100000);
        Map<Integer, Integer> map = arrayToMap(sampleArray);
        System.out.println(map);

    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {

        Map<K, Integer> map = new HashMap<>();
        for (K k : ks) {
            map.compute(k, (oldKey, newValue) -> newValue == null ? 1 : newValue + 1);
        }

        return map;
    }

    public static Integer[] RandomArray(int size) {
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}