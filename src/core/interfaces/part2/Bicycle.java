package core.interfaces.part2;

import core.encapsulation.Vehicle;

// Bicycle class implementing the Acceleratable interface
public class Bicycle extends Vehicle implements Acceleratable {
    public Bicycle(String brand, int year) {
        super(brand, year);
    }
    // Constructor and other methods

    @Override
    public void accelerate() {
        System.out.println("Accelerating the bicycle.");
    }
}
