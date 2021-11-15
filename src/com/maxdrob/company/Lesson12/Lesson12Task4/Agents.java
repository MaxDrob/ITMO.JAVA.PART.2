package com.maxdrob.company.Lesson12.Lesson12Task4;

class Producer implements Runnable
{
    Store store;
    Producer(Store store) {
        this.store=store;
    }
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}

class Consumer implements Runnable
{
    Store store;
    Consumer(Store store) {
        this.store=store;
    }
    @Override
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}