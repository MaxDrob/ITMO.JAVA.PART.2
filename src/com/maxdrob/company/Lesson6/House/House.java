package com.maxdrob.company.Lesson6.House;

import java.time.LocalDate;

public class House {
    private int countStoreys;
    private int yearBuild;
    private String name;

    public House(int countStoreys, int yearBuild, String name) {

        this.countStoreys = countStoreys;
        this.yearBuild = yearBuild;
        this.name = name;
    }
    public House() {
        this(0,0,"Demolished in the name of God almighty");
    }
    public void demolishedHouse(int countStoreys, int yearBuild, String name) {

        this.countStoreys = countStoreys;
        this.yearBuild = yearBuild;
        this.name = name;
    }

    public int YearsPassed() {
        // yrs since the building was built
        LocalDate current_date = LocalDate.now();
        return current_date.getYear() - yearBuild;
    }

    @Override
    public String toString() {
        // Print data
        return "Building " + name + "{" +
                "Since erected: " + yearBuild +
                ", Storeys " + countStoreys + '}';
    }
    public void print(){

        System.out.println(this);
    }



}

