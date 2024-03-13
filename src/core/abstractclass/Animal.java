package core.abstractclass;

// Using an abstract class
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method for making a sound
    public abstract void makeSound();

    // Concrete method for displaying the animal's name
    public void displayName() {
        System.out.println("Animal name: " + name);
    }
}
