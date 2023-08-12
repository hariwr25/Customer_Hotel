package com.example.demo;

public class Hotel {
     public static void main(String[] args) {
        Room room101 = new Room(101, 100.0);
        Room room102 = new Room(102, 120.0);

        Customer customer1 = new Customer("123456789", "Joko", "Bantul,Jogja");
        customer1.checkIn(room101, "2023-08-12 14:00");
        customer1.orderFood("Burger", 15.0);
        customer1.checkOut("2023-08-14 12:00");

        Customer customer2 = new Customer("987654321", "Sarinem", "Surabaya");
        customer2.checkIn(room102, "2023-08-13 15:00");
        customer2.orderFood("Pizza", 70);
        customer2.checkOut("2023-08-15 11:00");

        System.out.println("Customer 1 Info:\n" + customer1.getInfo());
        System.out.println("\nCustomer 2 Info:\n" + customer2.getInfo());
    }
}