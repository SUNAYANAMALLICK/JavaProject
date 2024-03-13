package core.inheritance.example;

import core.encapsulation.Vehicle;

// Car class - Subclass of Vehicle
public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Call the superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Method specific to Car
    public void drive() {
        System.out.println("Driving the car.");
    }
}
