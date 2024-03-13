package core.interfaces.part1;

public interface Shape {
    void draw(); // Abstract method

    void remove(); // Abstract Method
    default void resize() { //default methods
        System.out.println("Resizing the shape");
    } // default method
    static void color(){ //static methods
        System.out.println("Color is red. ");
    }
}
