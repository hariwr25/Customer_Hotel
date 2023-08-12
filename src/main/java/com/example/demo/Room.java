package com.example.demo;

public class Room {

    private int roomNumber;
    private boolean occupied;
    private double roomRate;

    public Room(int roomNumber, double roomRate) {
        this.roomNumber = roomNumber;
        this.roomRate = roomRate;
        this.occupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public double calculateRoomCharges() {
        // Define your room charge calculation logic here
        return roomRate;
    }
}