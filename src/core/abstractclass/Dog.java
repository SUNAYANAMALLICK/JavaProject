package core.abstractclass;

// Implementing an abstract class
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Concrete implementation of makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
