package core.encapsulation;

// Vehicle class - Parent class
public class Vehicle {
    // Encapsulated fields
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Encapsulated methods
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
