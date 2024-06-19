package core.classandobjects;

// Defining a class
public class Car {
    // Instance variables
    String model;
    int year;

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car("Toyota Camry", 2020);
        Car car2 = new Car("Honda Civic", 2019);

        // Calling method on objects
        car1.displayInfo();
        car2.displayInfo();
    }
}
