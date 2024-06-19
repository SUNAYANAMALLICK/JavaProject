package core.inheritance.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Method specific to Dog class
    }
}
