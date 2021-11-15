package com.maxdrob.company.Lesson12.Lesson12Task2;

public class Store
{
    private int counter = 0;
    public synchronized void get()
    {
        while (counter < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        counter--;
        System.out.println("Кто-то купил товар, ура");
        System.out.println(
                "\tостаток в закромах : " + counter);
        notify();
    }
    public synchronized void put() {
        while (counter >= 3) {
            try {
                wait();
            }catch (InterruptedException e) {}
        }
        counter++;
        System.out.println("пришла новая поставка");
        System.out.println(
                "\tостаток в закромах : " + counter);
        notify();
    }
}
