package com.maxdrob.company.Lesson12.Lesson12Task2;

public class ThreadsTask2 {

    public static void main(String[] args) {
        getThreadState();
    }

    public static void getThreadState() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " is " + getState());
            }
        };
        // Во время запуска
        System.out.println(thread.getName() + " is " + thread.getState());
        thread.start();

        // После запуска
        try {
            thread.join();
        } catch (InterruptedException ex) {
            ex.getStackTrace();
        }
        // После выполнения
        System.out.println(thread.getName() + " is " + thread.getState());
    }
}