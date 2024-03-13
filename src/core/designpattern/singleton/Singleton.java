package core.designpattern.singleton;

public class Singleton {
    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {
    }

    // Public static method to access the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and properties of the Singleton class
}
