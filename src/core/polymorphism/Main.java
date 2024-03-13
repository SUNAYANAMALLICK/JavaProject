package core.polymorphism;

import core.encapsulation.Vehicle;
import core.inheritance.example.Bicycle;
import core.inheritance.example.Car;

public class Main {
    public static void main(String[] args) {
        // Polymorphism
        Vehicle vehicle1 = new Car("Toyota", 2020, 4);
        Vehicle vehicle2 = new Bicycle("Giant", 2019, 21);

        // Calling common methods
        vehicle1.displayInfo();
        vehicle2.displayInfo();

        // Specific methods
        ((Car) vehicle1).drive(); // Casting to access specific methods
        ((Bicycle) vehicle2).ride(); // Casting to access specific methods
    }
}

