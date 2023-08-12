package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String ktpNumber;
    private String name;
    private String address;
    private Room room;
    private String checkInTime;
    private String checkOutTime;
    private List<FoodOrder> foodOrders; 
    public Customer(String ktpNumber, String name, String address) {
        this.ktpNumber = ktpNumber;
        this.name = name;
        this.address = address;
        this.foodOrders = new ArrayList<>();
    }

    public void checkIn(Room room, String checkInTime) {
        this.room = room;
        this.checkInTime = checkInTime;
        room.setOccupied(true);
    }

    public void checkOut(String checkOutTime) {
        this.checkOutTime = checkOutTime;
        room.setOccupied(false);
    }

    public void orderFood(String itemName, double amount) {
        FoodOrder foodOrder = new FoodOrder(itemName, amount);
        foodOrders.add(foodOrder);
    }

    public double calculateTotalBill() {
        double foodTotal = foodOrders.stream().mapToDouble(FoodOrder::getAmount).sum();
        return foodTotal + room.calculateRoomCharges();
    }

    public String getInfo() {
        StringBuilder foodOrderInfo = new StringBuilder();
        for (FoodOrder order : foodOrders) {
            foodOrderInfo.append(order.toString()).append("\n");
        }

        String info = "KTP Number: " + ktpNumber +
                      "\nName: " + name +
                      "\nAddress: " + address +
                      "\nRoom Number: " + room.getRoomNumber() +
                      "\nCheck-In Time: " + checkInTime +
                      "\nCheck-Out Time: " + checkOutTime +
                      "\nFood Orders:\n" + foodOrderInfo.toString() +
                      "Total Bill: " + calculateTotalBill();
        return info;
    }

    public void orderFood(Object itemName, double amount) {
    }
}

class FoodOrder {
    private String itemName;
    private double amount;

    public FoodOrder(String itemName, double amount) {
        this.itemName = itemName;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }   

    @Override
    public String toString() {
        return "Item: " + itemName + ", Amount: " + amount;
    }
}