package core.abstractclass;

// Implementing an interface
public class Bird extends Animal implements Movable, LegsSpecification {
    public Bird(String name) {
        super(name);
    }

    // Concrete implementation of makeSound method
    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }

    // Implementation of move method from Movable interface
    @Override
    public void move() {
        System.out.println("Flying...");
    }

    @Override
    public void noOfLegs() {
        System.out.println("Two Legs...");

    }
}
