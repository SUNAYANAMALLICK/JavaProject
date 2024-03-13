package core.designpattern.factory;

public class ShapeFactory {
    // Factory method to create instances of Shape subclasses
    public static Shape createShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
