package com.maxdrob.company.Lesson10.Lesson10GameMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        String[] gamers = {"Paul", "Ringo", "John", "George"};
        Map<User, Integer> gamersPoints = new HashMap<User, Integer>();
        for (int i = 0; i < gamers.length; i++) {
            gamersPoints.put(new User(gamers[i]),
                    ((int) (Math.random() * 100) + 1));
        }
        for (Map.Entry<User, Integer> item : gamersPoints.entrySet()) {
            System.out.println(item.getKey().getName() + " - " + item.getValue());
        }
        Scanner scanner = new Scanner(System.in);
        String findName = scanner.next();

        if (gamersPoints.containsKey(new User(findName))) {
            int markFind = gamersPoints.get(new User(findName));
            System.out.print(findName + " got this amount of points " + markFind);
        } else {
            System.out.print("Person " + findName + " is not The Beatles member! ");
        }
    }
}
