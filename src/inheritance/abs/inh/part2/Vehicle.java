package inheritance.abs.inh.part2;

public interface Vehicle {
    void start(); // abstract and public
    void stop();
    int id = 0; // public static final
    default void defaultMethod() {

    }

}
