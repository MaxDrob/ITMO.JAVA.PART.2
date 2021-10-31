package com.maxdrob.company.Lesson6.Plane;

public class Plane {
    private Wing wing;
    private String name;

    public Plane(String name, int weightWing) {
        Wing wing = new Wing((int) weightWing);
        this.wing = wing;
        this.name = name;
    }
    public void print(){
        System.out.println("Type of aircraft : " + name);
        wing.printWing();
    }

    private class Wing{
        int weight;
        public Wing(int weight) {
            this.weight = weight;
        }
        void printWing(){
            System.out.println("Wing weights " + weight + " metric tons");
        }

    }
}
