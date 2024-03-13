package core.interfaces.part2;

import core.encapsulation.Vehicle;

// Car class implementing the Acceleratable interface
public class Car extends Vehicle implements Acceleratable {
    public Car(String brand, int year) {
        super(brand, year);
    }
    // Constructor and other methods

    @Override
    public void accelerate() {
        System.out.println("Accelerating the car.");
    }
}
