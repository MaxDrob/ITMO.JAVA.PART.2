package com.maxdrob.company.Lesson12.Lesson12Task4;

public class Sales
{
    public static void main(String[] args)
    {
        Store store    = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
