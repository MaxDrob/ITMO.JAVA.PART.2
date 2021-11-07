package com.maxdrob.company.Lesson8Task2CallCenter;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static java.lang.Integer.parseInt;

public class Main {

    static BlockingQueue<Call> respondentQueue = new ArrayBlockingQueue<>(20);
    static BlockingQueue<Call> directorQueue = new ArrayBlockingQueue<>(20);

    static List<Manager> managers = Arrays.asList(new Manager("Manager - 1"), new Manager("Manager - 2"));

    public static void main(String[] args) throws Exception {
        new Main().operate();
    }

    void operate() throws InterruptedException {
        Arrays.asList(new Respondent("Менеджер - 1"), new Respondent("Менеджер - 2"));
        Arrays.asList(new Director("Управляющий"));

        System.out.println("Значение, определяющее проложительность вызова и кому он будет адресован: 0,25.");
        System.out.println("Первое значение представляет уровен отвечающего (менеджер 1,2, Управляющий), второе значение выводит продолжительность вызова.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if ("q".equals(s)) {
                break;
            }
            String[] split = s.split(",");
            Call call = new Call(parseInt(split[0]), parseInt(split[1]));
            dispatchCall(call);
        }
        scanner.close();
        System.exit(0);
    }

    private void dispatchCall(Call call) throws InterruptedException {
        respondentQueue.put(call);
    }
}

class Call {

    static int idCounter = 0;

    int id;
    int durationInSeconds;
    int level;

    public Call(int level, int durationInSeconds) {
        this.level = level;
        this.durationInSeconds = durationInSeconds;
        this.id = idCounter++;
    }

    @Override
    public String toString() {
        return "Звонок {" + "id=" + id + ", продолжительность =" + durationInSeconds + ",уровень l=" + level + '}';
    }
}

class Respondent {
    String name;

    public Respondent(String name) {
        this.name = name;
        new Thread(() -> {
            while (true) {
                try {
                    Call call = Main.respondentQueue.take();
                    if (call.level == 0) {
                        System.out.println(name + " handling call: " + call);
                        Thread.sleep(call.durationInSeconds * 1000);
                    } else {
                        boolean managerHandled = false;
                        for (Manager manager : Main.managers) {
                            if (!manager.isBusy) {
                                manager.acceptCall(call);
                                managerHandled = true;
                                break;
                            }
                        }
                        if (!managerHandled) {
                            Main.directorQueue.put(call);
                        }
                    }
                } catch (InterruptedException ignored) {}
            }
        }).start();
    }
}

class Manager {
    String name;
    volatile boolean isBusy = false;

    public Manager(String name) {
        this.name = name;
    }

    void acceptCall(Call call) {
        new Thread(() -> {
            try {
                isBusy = true;
                if (call.level == 1) {
                    System.out.println(name + " принимает звонок: " + call);
                    Thread.sleep(call.durationInSeconds * 1000);
                } else {
                    Main.directorQueue.put(call);
                }
                isBusy = false;
            } catch (InterruptedException ignored) {}
        }).start();
    }
}

class Director {
    String name;

    public Director(String name) {
        this.name = name;
        new Thread(() -> {
            while (true) {
                try {
                    Call call = Main.directorQueue.take();
                    System.out.println(name + " handling call: " + call);
                    Thread.sleep(call.durationInSeconds * 1000 / 4); // Управляющий быстрее всех обрабатывает звонки
                } catch (InterruptedException ignored) {}
            }
        }).start();
    }
}
