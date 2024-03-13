package core.inheritance.example;

import core.encapsulation.Vehicle;

// Bicycle class - Subclass of Vehicle
public class Bicycle extends Vehicle {
    private int numberOfGears;

    // Constructor
    public Bicycle(String brand, int year, int numberOfGears) {
        super(brand, year); // Call the superclass constructor
        this.numberOfGears = numberOfGears;
    }

    // Method specific to Bicycle
    public void ride() {
        System.out.println("Riding the bicycle.");
    }
}
