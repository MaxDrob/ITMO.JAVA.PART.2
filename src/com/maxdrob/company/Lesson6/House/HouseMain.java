package com.maxdrob.company.Lesson6.House;

public class HouseMain {
    public static void main(String[] args) {

        House house = new House(10, 1845, "Asylum");
        System.out.println(house);
        System.out.println("Since erected " +
                house.YearsPassed() + " years");

        House SecondHouse = new House();
        System.out.println(SecondHouse);
        System.out.println("Since erected " +
                SecondHouse.YearsPassed() + " year");
    }
}

