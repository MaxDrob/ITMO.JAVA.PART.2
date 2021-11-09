package com.maxdrob.company.Lesson8Task2ParkingLotDraft;


public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword();
}

public class Admin extends Account {
    public bool addParkingFloor(ParkingFloor floor);
    public bool addParkingSpot(String floorName, ParkingSpot spot);
    public bool addParkingDisplayBoard(String floorName, ParkingDisplayBoard displayBoard);
    public bool addCustomerInfoPanel(String floorName, CustomerInfoPanel infoPanel);

    public bool addEntrancePanel(EntrancePanel entrancePanel);
    public bool addExitPanel(ExitPanel exitPanel);
}

public class ParkingAttendant extends Account {
    public bool processTicket(string TicketNumber);
}